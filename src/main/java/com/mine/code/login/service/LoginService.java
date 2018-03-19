package com.mine.code.login.service;

import com.mine.code.core.Service;
import com.mine.code.login.view.AccountVo;
import com.mine.code.user.model.User;


/**
 * Created by CodeGenerator on 2018/03/18.
 */
public interface LoginService extends Service<User> {

    boolean isExist(AccountVo accountInfo);
}
