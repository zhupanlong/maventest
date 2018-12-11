package com.chatRobot.service.impl;

import com.chatRobot.dao.UserMapper;
import com.chatRobot.model.User;
import com.chatRobot.service.IService;
import com.chatRobot.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService{

    @Resource
    private UserMapper userDao;

    public User selectByPrimaryKey(String id) {
        return this.userDao.selectByPrimaryKey(id);
    }

}
