package com.czxy.dao;

import com.czxy.domain.Classify;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ClassifyMapper extends Mapper<Classify> {

    @Select("select * from `tbl_classify`")
    public List<Classify> findAll();
}
