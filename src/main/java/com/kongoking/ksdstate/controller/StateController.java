package com.kongoking.ksdstate.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kongoking.ksdstate.dto.StateDetailDTO;
import com.kongoking.ksdstate.entity.State;
import com.kongoking.ksdstate.entity.StateDetail;
import com.kongoking.ksdstate.service.StateDetailService;
import com.kongoking.ksdstate.service.StateService;
import com.kongoking.ksdstate.vo.ResponseWrapper;
import com.kongoking.ksdstate.vo.StateVo;
import lombok.val;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 状态统计控制层
 *
 * @author luonianxin
 * @Date 2021/5/2
 */
@Controller
public class StateController {

    @Resource
   private StateService stateService;

   @Resource
   private StateDetailService stateDetailService;



    @GetMapping("/state/{id}")
    public String findStates(@PathVariable("id") Integer stateId, ModelMap modelMap){

        // 1.根据ｉｄ查询state
        State state = stateService.getById(stateId);
        if(state != null){
        // 2.如果存在，那就进入明细页面
            modelMap.put("stateId",stateId);
            return "state/detail";
        }
        // 3.如果不存在那么就进入错误页面
        return "/error";
    }

    /**
     * @Description:　根据ｉｄ查询统计明细
     * @Date: 2021/5/9 下午9:52
     * @Author: 　　luonianxin
     * @Email 1423364324@qq.com
     * @Param: stateId
     * @return com.kongoking.ksdstate.vo.ResponseWrapper
     */
    @GetMapping("/state/detail")
    @ResponseBody
    public ResponseWrapper getStateDetails(@RequestParam("stateId") Integer stateId){
        if(StringUtils.isEmpty(stateId)){
            return ResponseWrapper.error().code(503).message("未找到统计项");
        }
        // 1.根据ｉｄ查询统计对象
        State state = stateService.getById(stateId);
        if(state == null){
            return ResponseWrapper.error().code(503).message("未找到统计项");
        }
        // 2.根据stateid查询统计对象明细
        QueryWrapper<StateDetail> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("stateid",stateId);
        List<StateDetail> listDetail = stateDetailService.list(queryWrapper);
        // 3.组装ｖｏ对象
        StateVo stateVo = new StateVo();
        BeanUtils.copyProperties(state,stateVo);
        stateVo.setStateDetailList(listDetail);
        // 4.将统一结果返回
        return ResponseWrapper.ok().data("stateVo",stateVo);
    }

    /**
     * @Description:　根据ｉｄ查询统计明细
     * @Date: 2021/5/9 下午9:52
     * @Author: 　　luonianxin
     * @Email 1423364324@qq.com
     * @Param: stateId
     * @return com.kongoking.ksdstate.vo.ResponseWrapper
     */
    @PostMapping("/state/detailByPost")
    @ResponseBody
    public ResponseWrapper getStateDetailsByPostRequest(@RequestBody StateDetailDTO stateDetailDTO){
        if(StringUtils.isEmpty(stateDetailDTO.getStateId())){
            return ResponseWrapper.error().code(503).message("未找到统计项");
        }
        // 1.根据ｉｄ查询统计对象
        State state = stateService.getById(stateDetailDTO.getStateId());
        if(state == null){
            return ResponseWrapper.error().code(503).message("未找到统计项");
        }
        // 2.根据stateid查询统计对象明细
        QueryWrapper<StateDetail> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("stateid",stateDetailDTO.getStateId());
        List<StateDetail> listDetail = stateDetailService.list(queryWrapper);
        // 3.组装ｖｏ对象
        StateVo stateVo = new StateVo();
        BeanUtils.copyProperties(state,stateVo);
        stateVo.setStateDetailList(listDetail);
        // 4.将统一结果返回
        return ResponseWrapper.ok().data("stateVo",stateVo);
    }

}

