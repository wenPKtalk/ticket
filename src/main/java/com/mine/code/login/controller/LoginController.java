package com.mine.code.login.controller;

import com.mine.code.common.util.StringUtil;
import com.mine.code.core.Result;
import com.mine.code.core.ResultGenerator;
import com.mine.code.login.service.LoginService;
import com.mine.code.login.view.AccountVo;
import com.mine.code.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by CodeGenerator on 2018/03/18.
 * 登录入口
 */
@RestController
@RequestMapping("/")
public class LoginController {
    @Resource
    private UserService userService;

    @Resource
    private LoginService loginService;

    @PostMapping("/login")
    public Result login(AccountVo accountInfo, HttpServletRequest request, HttpServletResponse response) {
        loginService.isExist(accountInfo);
        return ResultGenerator.genSuccessResult();
    }


}
