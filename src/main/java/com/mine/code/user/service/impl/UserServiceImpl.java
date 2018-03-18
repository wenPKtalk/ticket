package com.mine.code.user.service.impl;

import com.mine.code.user.dao.UserMapper;
import com.mine.code.user.model.User;
import com.mine.code.user.service.UserService;
import com.mine.code.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/03/18.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
