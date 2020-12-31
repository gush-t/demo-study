package com.example.consumer.mapper;

import com.example.consumer.entity.MessageTest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageTestMapper {

    List<MessageTest>  findAll();
}
