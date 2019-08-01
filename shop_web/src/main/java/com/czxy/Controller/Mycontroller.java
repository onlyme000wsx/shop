package com.czxy.Controller;


import com.czxy.domain.Classify;
import com.czxy.domain.Goods;
import com.czxy.domain.ShoppingCart;
import com.czxy.domain.ShoppingCartItem;
import com.czxy.service.BrankService;
import com.czxy.service.ClassifyService;
import com.czxy.service.GoodsService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author libin
 * @Version v 1.0
 * @Date 2019/7/30
 */
@RestController
@RequestMapping("/shop")
public class Mycontroller {

    @Resource
    private ClassifyService classfyService;

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

    @PostMapping("/ShoppingCart/{gid}/{count}")
    public ResponseEntity<Void> ShoppingCart(@PathVariable("gid")String gid, @PathVariable("count") Integer count, HttpSession session){

        try {
            ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("shoppingCart");
            if (shoppingCart==null){
                shoppingCart=new ShoppingCart();
            }
            if (count==null){
                count=1;
            }
            Goods goods = goodsService.shoppingBygid(gid);
            shoppingCart.add(goods,count);
            session.setAttribute("shoppingCart",shoppingCart);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }


    }

    @PostMapping("/MyShoppingCart")
    public ResponseEntity<List<ShoppingCartItem>> shopping(HttpSession session){

        try {
            ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("shoppingCart");
            Map<String, ShoppingCartItem> map = shoppingCart.getMap();
            List<ShoppingCartItem>list=new ArrayList<>();

            for (String s : map.keySet()) {
                ShoppingCartItem shoppingCartItem = map.get(s);
                list.add(shoppingCartItem);
            }

            return ResponseEntity.ok(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

}
