package com.acedata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vremouth on 2016/4/9.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
