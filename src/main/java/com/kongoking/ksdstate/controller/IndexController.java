package com.kongoking.ksdstate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author luonianxin
 * @Description 首页控制器
 * @Date 2021/5/4
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}

