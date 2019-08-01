package com.czxy.dao;


import com.czxy.domain.Classify;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author libin
 * @Version v 1.0
 * @Date 2019/7/30
 */
@org.apache.ibatis.annotations.Mapper
public interface ClassifyMapper extends Mapper<Classify> {

    @Select("select * from tbl_classify where cid=#{cid}")
    public Classify findbycid(@Param("cid") String cid);
}
