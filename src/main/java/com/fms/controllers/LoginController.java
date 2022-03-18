package com.fms.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class LoginController {

    @RequestMapping({"", "/", "/index"})
    public String getLoginPage() {
        log.debug("getting IndexPage");

        return "login/login";
    }
}
