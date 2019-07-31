package com.czxy.controller;

import com.czxy.service.GoodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author
 * @Version v 1.0
 * @Date 2019/7/30
 */
@RestController
@RequestMapping("/good")
public class GoodController {
    @Resource
    private GoodService goodService;
}
