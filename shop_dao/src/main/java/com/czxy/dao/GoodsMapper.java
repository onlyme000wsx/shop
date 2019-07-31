package com.czxy.dao;

import com.czxy.domain.Goods;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface GoodsMapper extends Mapper<Goods> {


    @Select("select * from `tbl_goods`")
    public List<Goods> findAll();
}
