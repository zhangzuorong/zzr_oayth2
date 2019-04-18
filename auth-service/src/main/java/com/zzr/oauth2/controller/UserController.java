package com.zzr.oauth2.controller;

import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * 开发公司：山东海豚数据技术有限公司
 * 版权：山东海豚数据技术有限公司
 * <p>
 * UserController
 *
 * @author zzr
 * @created Create Time: 2019/4/16
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping(value = "/current",method = RequestMethod.GET)
    public Principal getUser(Principal principal){
        return principal;
    }
}
