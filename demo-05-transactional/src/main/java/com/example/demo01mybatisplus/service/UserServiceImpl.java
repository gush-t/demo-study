package com.example.demo01mybatisplus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo01mybatisplus.entity.User;
import com.example.demo01mybatisplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public List<User> selectByIds(Collection<Integer> ids) {
        return userMapper.selectByIds(ids);
    }

    @Override
    public IPage<User> selectByCreatedTime(IPage<User> page, Date createdTime) {
        return userMapper.selectByCreatedTime(page,createdTime);
    }
}
