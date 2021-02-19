package com.example.datasource.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.datasource.entity.Worker;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface WorkerMapper extends BaseMapper<Worker> {

}
