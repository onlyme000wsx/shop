package com.czxy.Controller;


import com.czxy.domain.Classify;
import com.czxy.domain.Goods;
import com.czxy.service.BrankService;
import com.czxy.service.ClassfyService;
import com.czxy.service.GoodsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author libin
 * @Version v 1.0
 * @Date 2019/7/30
 */
@RestController
@RequestMapping("/shop")
public class Mycontroller {

    @Resource
    private ClassfyService classfyService;

    @Resource
    private BrankService brankService;

    @Resource
    private GoodsService goodsService;

    @PostMapping("/findallC")
    public ResponseEntity<List<Classify>>findAllClassfy(){
        try {
            List<Classify> all = classfyService.findAll();
            return ResponseEntity.ok(all);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/findallG")
    public ResponseEntity<List<Goods>>findAllGoods(){
        try {
            List<Goods> all = goodsService.findAllG();
            return ResponseEntity.ok(all);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/findbycid/{cid}")
    public ResponseEntity<List<Goods>>findBycid(@PathVariable String cid){
        List<Goods> findbycid = null;
        try {
            findbycid = goodsService.findbycid(cid);
            return ResponseEntity.ok(findbycid);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
