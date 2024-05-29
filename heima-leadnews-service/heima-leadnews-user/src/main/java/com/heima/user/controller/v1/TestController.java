package com.heima.user.controller.v1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Chase
 * @date: 2024-05-29
 * @description: TODO
 **/
@RefreshScope
@RequestMapping("/api/v1/test")
@RestController
public class TestController {

    @Value("${test.name}")
    private String name;

    @GetMapping("/config")
    public String config() {
        return name;
    }

}
