package com.czxy.service.impl;

import com.czxy.dao.GoodsMapper;
import com.czxy.service.GoodService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author
 * @Version v 1.0
 * @Date 2019/7/30
 */
@Service
@Transactional
public class GoodServiceImpl implements GoodService {

    @Resource
    private GoodsMapper goodsMapper;
}
