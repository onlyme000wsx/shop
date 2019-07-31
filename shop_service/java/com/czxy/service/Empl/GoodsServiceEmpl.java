package com.czxy.service.Empl;

import com.czxy.dao.GoodsMapper;
import com.czxy.domain.Goods;
import com.czxy.service.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author libin
 * @Version v 1.0
 * @Date 2019/7/30
 */
@Service
@Transactional
public class GoodsServiceEmpl implements GoodsService {

    @Resource
    private GoodsMapper GoodsMapper;

    @Override
    public List<Goods> findAllG() {
        List<Goods> bydate = GoodsMapper.findBydate();
        return bydate;
    }

    @Override
    public List<Goods> findbycid(String cid) {
        return GoodsMapper.findBycid(cid);
    }
}
