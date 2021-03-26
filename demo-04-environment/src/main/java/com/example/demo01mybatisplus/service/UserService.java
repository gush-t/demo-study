package com.example.demo01mybatisplus.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo01mybatisplus.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface UserService {


    User selectByUsername(@Param("username") String username);
    List<User> selectByIds(@Param("ids") Collection<Integer> ids);

    IPage<User> selectByCreatedTime(IPage<User> page,
                                            @Param("createdTime") Date createdTime);
}
