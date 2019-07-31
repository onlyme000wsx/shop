package com.czxy.domain;

/**
 * @Author libin
 * @Version v 1.0
 * @Date 2019/7/31
 */
public class ShoppingCartItem {
    private  String SctId;// 购物车项id
    private  Goods goods;// 商品
    private  Double subtotal; // 商品小计
    private  Integer number;// 数量
    public ShoppingCartItem() {
    }

    public ShoppingCartItem(String sctId, Goods goods, Double subtotal, Integer number) {
        SctId = sctId;
        this.goods = goods;
        this.subtotal = subtotal;
        this.number = number;
    }

    public String getSctId() {
        return SctId;
    }

    public void setSctId(String sctId) {
        SctId = sctId;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ShoppingCartItem{" +
                "SctId='" + SctId + '\'' +
                ", goods=" + goods +
                ", subtotal=" + subtotal +
                ", number=" + number +
                '}';
    }
}
