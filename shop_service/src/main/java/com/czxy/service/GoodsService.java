package com.czxy.service;

import com.czxy.domain.Goods;

import java.util.List;

/**
 * @Author libin
 * @Version v 1.0
 * @Date 2019/7/30
 */
public interface GoodsService {

    public List<Goods>findAllG();

    public List<Goods>findbycid(String cid);


    public Goods shoppingBygid(String gid);
}
