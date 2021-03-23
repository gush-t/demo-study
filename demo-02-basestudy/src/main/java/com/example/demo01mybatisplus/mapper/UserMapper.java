package com.example.demo01mybatisplus.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo01mybatisplus.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * BaseMapper中已经包含了基本的CRUD
     */
    default User selectByUsername(@Param("username") String username){
        return selectOne(new QueryWrapper<User>().eq("username",username));
    }
    List<User>  selectByIds(@Param("ids") Collection<Integer> ids);

    default IPage<User> selectByCreatedTime(IPage<User> page,
                                           @Param("createdTime")Date createdTime){
        return selectPage(page,new QueryWrapper<User>().gt("created_time", createdTime));
    }

}
