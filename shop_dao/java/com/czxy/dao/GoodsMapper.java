package com.czxy.dao;

import com.czxy.domain.Goods;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author libin
 * @Version v 1.0
 * @Date 2019/7/30
 */
@org.apache.ibatis.annotations.Mapper
public interface GoodsMapper extends Mapper<Goods> {

    @Select("select * from tbl_goods order by tbl_goods.gtime desc limit 0,4")
    @Results(id = "vb",value = {
            @Result(property = "classfy",one = @One(select = "com.czxy.dao.ClassfyMapper.findbycid"),column = "cid")
    })
    public List<Goods>findBydate();


    @Select("select * from tbl_goods where tbl_goods.cid=#{cid} ")
    @ResultMap("vb")
    public List<Goods>findBycid(@Param("cid") String cid);
}
