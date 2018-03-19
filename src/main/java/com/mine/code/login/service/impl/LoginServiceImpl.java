package com.mine.code.login.service.impl;

import com.mine.code.core.AbstractService;
import com.mine.code.login.service.LoginService;
import com.mine.code.login.view.AccountVo;
import com.mine.code.user.dao.UserMapper;
import com.mine.code.user.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/03/18.
 */
@Service
@Transactional
public class LoginServiceImpl extends AbstractService<User> implements LoginService {
    @Resource
    private UserMapper userMapper;

    @Override
    public boolean isExist(AccountVo accountInfo) {

        return false;
    }
}
