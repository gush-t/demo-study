package com.example.demo01mybatisplus.user;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo01mybatisplus.entity.User;
import com.example.demo01mybatisplus.mapper.UserMapper;
import com.example.demo01mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    public void testInsert(){
        for (int i = 0; i < 30; i++) {
            User user = new User();
            user.setId(Math.abs(UUID.randomUUID().hashCode()));
            user.setUsername(UUID.randomUUID().toString());
            user.setPassword("goodStudy");
            user.setCreatedTime(new Date());
            user.setDeleted(0);
            userMapper.insert(user);
        }
    }

    @Test
    public void testSelect(){
        User user = userMapper.selectById(1);
        System.out.println(user.toString());
    }

    @Test
    public void testUpdate(){
        User user = userMapper.selectById(1);
        user.setUsername("Tom");
        userMapper.updateById(user);
    }


    public void testDelete(){
        userMapper.deleteById(7);
    }

    @Test
    public void testSelectByName(){
       User user = userService.selectByUsername("Tom");
        System.out.println(user.toString());
    }

    @Test
    public void  testSelectList(){
        List<User> users = userService.selectByIds(new ArrayList<>(Arrays.asList(1,1420932692,7,3099,2692)));
        users.stream().forEach(System.out::println);
    }

    @Test
    public void testPage(){
        IPage<User> page = new Page<>(2,20);
        LocalDate date = LocalDate.parse("20210301",DateTimeFormatter.ofPattern("yyyyMMdd"));
        page= userService.selectByCreatedTime(page,Date.from(date.atStartOfDay(ZoneOffset.ofHours(8)).toInstant()));
        System.out.println(page.getRecords().size());
        System.out.println("page: "+ page.getPages());
        System.out.println("total: "+ page.getTotal());
        System.out.println("size: "+ page.getCurrent());
        page.getRecords().stream().forEach(System.out::println);
    }

}
