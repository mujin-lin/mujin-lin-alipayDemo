package com.mujin.normal.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/alipay")
@Controller
@Slf4j
public class AlipatController {
    /**
     * 查看状态
     * @return
     */
    @RequestMapping("/ping")
    public String ping(){
        log.info("进入ping的方法");
        return "index";
    }
}
