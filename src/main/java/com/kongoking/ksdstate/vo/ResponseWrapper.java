package com.kongoking.ksdstate.vo;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.transform.Result;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 统一结果返回封装类
 * @author luonianxin
 * @Date 2021/5/2
 */
@Data
@Accessors(chain = true)
public class ResponseWrapper implements Serializable {

    private static final long serialVersionUID = -152959732824576212L;

    private Boolean success;
    private Integer code;
    private String message;
    private Map<String,Object> data = new HashMap<String,Object>();
    private ResponseWrapper(){}

    public static ResponseWrapper ok(){
        ResponseWrapper responseWrapper = new ResponseWrapper();
        responseWrapper.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
        responseWrapper.setCode(ResultCodeEnum.SUCCESS.getCode());
        responseWrapper.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return responseWrapper;
    }

    public  ResponseWrapper data(String dataKey,Object data){
        this.getData().put(dataKey,data);
        return this;
    }

    public static ResponseWrapper error(){
        ResponseWrapper r = new ResponseWrapper();
        r.setSuccess(ResultCodeEnum.UNKNOWN_REASON.getSuccess());
        r.setCode(ResultCodeEnum.UNKNOWN_REASON.getCode());
        r.setMessage(ResultCodeEnum.UNKNOWN_REASON.getMessage());
        return r;
    }

    public ResponseWrapper code(Integer code){
        this.code = code;
        return this;
    }

    public ResponseWrapper message(String message){
        this.message = message;
        return this;
    }
}

