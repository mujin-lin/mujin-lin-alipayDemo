package com.mujin.normal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/alipay")
@RestController
public class AlipatController {
    /**
     * 查看状态
     * @return
     */
    @GetMapping("/ping")
    public String ping(){
        return "ping";
    }
}
