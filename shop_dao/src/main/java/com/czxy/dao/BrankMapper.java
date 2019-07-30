package com.czxy.dao;

import com.czxy.domain.Brank;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface BrankMapper extends Mapper<Brank> {
    @Select("select * from `tbl_brank`")
    public List<Brank> findAll();
}
