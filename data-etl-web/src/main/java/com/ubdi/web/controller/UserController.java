package com.ubdi.web.controller;

import com.ubdi.common.Result;
import com.ubdi.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public Result login() {
        log.debug("");
        return Result.success("login success...");
    }


    /**
     * 注销登录
     *
     * @param request request
     * @return
     */
    @RequestMapping(value = "/logout")
    public Result logout(HttpServletRequest request) {
        return Result.success("注销成功", true);
    }

}
