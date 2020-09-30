package org.z_v.vhr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.z_v.vhr.model.RespBean;

/**
 * @ClassName: LoginController
 * @Description: TODO
 * @author: Z_V
 * @date: 2020年09月30日 15:51
 */
@RestController
public class LoginController {
    @GetMapping("/login")
    public RespBean login(){
        return RespBean.error("尚未登录，请登录！");
    }
}
