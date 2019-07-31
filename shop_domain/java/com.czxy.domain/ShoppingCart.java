package com.czxy.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author libin
 * @Version v 1.0
 * @Date 2019/7/31
 */
public class ShoppingCart {
    private Map<String,ShoppingCartItem>map=new HashMap<>();
    private  Double total;

    public ShoppingCart() {
    }

    public ShoppingCart(Map<String, ShoppingCartItem> map, Double total) {
        this.map = map;
        this.total = total;
    }

    public Map<String, ShoppingCartItem> getMap() {
        return map;
    }

    public void setMap(Map<String, ShoppingCartItem> map) {
        this.map = map;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "map=" + map +
                ", total=" + total +
                '}';
    }

    // 添加方法
     public void add(Goods goods,Integer count){
         ShoppingCartItem shoppingCartItem = map.get(goods.getGid());
         if (shoppingCartItem==null){
             shoppingCartItem=new ShoppingCartItem();
             shoppingCartItem.setGoods(goods);
             shoppingCartItem.setSctId(UUID.randomUUID().toString());
             shoppingCartItem.setNumber(count);
             shoppingCartItem.setSubtotal(count*goods.getGnewprice());
             map.put(goods.getGid(),shoppingCartItem);
         }else {
             shoppingCartItem.setNumber(shoppingCartItem.getNumber()+count);
              shoppingCartItem.setSubtotal(goods.getGnewprice()*shoppingCartItem.getNumber());
         }
     }
}
