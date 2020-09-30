package org.z_v.vhr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @author: Z_V
 * @date: 2020年09月21日 1:43
 */
/*
 *Create ON 2020/9/21 1:43 BY Z_V
 * 33B6 测试4,5所做是否正确
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
