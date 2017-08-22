package com.lenovo.ai.admin.serviceImpl;

import com.lenovo.ai.admin.entity.User;
import com.lenovo.ai.admin.mapper.UserMapper;
import com.lenovo.ai.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectUser() {
        return userMapper.selectUser();
    }
}
