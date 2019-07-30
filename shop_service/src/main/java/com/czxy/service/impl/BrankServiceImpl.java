package com.czxy.service.impl;

import com.czxy.dao.BrankMapper;
import com.czxy.service.BrankService;
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
public class BrankServiceImpl implements BrankService {
    @Resource
    private BrankMapper brankMapper;
}
