package com.kongoking.ksdstate.vo;

import lombok.Getter;

/**
 * @author lnx
 */

@Getter
public enum ResultCodeEnum {
    /**
     *  成功
     */
    SUCCESS(true,20000,"成功"),
    /**
     * 未知错误
     */
    UNKNOWN_REASON(false,20001,"未知错误"),
    /**
     * sql语法错误
     */
    BAD_SQL_GRAMMAR(false,21001,"sql语法错误"),
    /**
     * json解析异常
     */
    JSON_PARSE_ERROR(false,21002,"json解析异常"),
    /**
     * 参数不正确
     */
    PARAM_ERROR(false,21003,"参数不正确");

    /**
     * 是否成功的标志
     */
    private Boolean success;
    /**
     * 返回代码
     */
    private Integer code;
    /**
     *  返回信息
     */
    private String message;

    private  ResultCodeEnum (Boolean success,Integer code,String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
