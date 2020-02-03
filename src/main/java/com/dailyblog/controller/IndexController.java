package com.dailyblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //允许这个类接收前端请求
public class IndexController {

    @GetMapping("/")
    public String index(){ return "index"; }
}
