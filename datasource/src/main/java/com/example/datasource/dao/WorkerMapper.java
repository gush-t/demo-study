package com.example.datasource.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.datasource.constant.DBConstant;
import com.example.datasource.entity.Worker;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@DS(DBConstant.DB_WORKER)
public interface WorkerMapper extends BaseMapper<Worker> {

}
