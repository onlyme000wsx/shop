package com.czxy.domain;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author
 * @Version v 1.0
 * @Date 2019/7/30
 */
/*CREATE TABLE `tbl_goods` (  #商品
`gid` VARCHAR(50) NOT NULL,   #商品id
`gname` VARCHAR(50) NOT NULL ,  #商品名称
`gintroduce` VARCHAR(50) NOT NULL ,#介绍 备注
`gimg` VARCHAR(50) NOT NULL ,#图片
`gnewprice` VARCHAR(50) NOT NULL ,#现价格
`goldprice` VARCHAR(50) NOT NULL ,#原价格
`gtime` DATE NOT NULL ,#上架时间
`gsum` INT NOT NULL ,#销售数量纪录
`cid` VARCHAR(50) NOT NULL ,#类别
`bid` VARCHAR(50) NOT NULL ,#品牌
PRIMARY KEY (`gid`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 ;*/
@Table(name = "tbl_goods")
public class Goods {
    @Id
     private String gid;//` VARCHAR(50) NOT NULL,   #商品id
     private String gname;//` VARCHAR(50) NOT NULL ,  #商品名称
     private String gintroduce;//` VARCHAR(50) NOT NULL ,#介绍 备注
     private String gimg;//` VARCHAR(50) NOT NULL ,#图片
     private Double gnewprice;//` VARCHAR(50) NOT NULL ,#现价格
     private Double goldprice;//` VARCHAR(50) NOT NULL ,#原价格
     private Date gtime;//` DATE NOT NULL ,#上架时间
     private Integer gsum;//` INT NOT NULL ,#销售数量纪录
     private String cid;//` VARCHAR(50) NOT NULL ,#类别
     private String bid;//` VARCHAR(50) NOT NULL ,#品牌


    private Brank brank;//品牌
    private Classify classify;//分类


    @Override
    public String toString() {
        return "Goods{" +
                "gid='" + gid + '\'' +
                ", gname='" + gname + '\'' +
                ", gintroduce='" + gintroduce + '\'' +
                ", gimg='" + gimg + '\'' +
                ", gnewprice=" + gnewprice +
                ", goldprice=" + goldprice +
                ", gtime=" + gtime +
                ", gsum=" + gsum +
                ", cid='" + cid + '\'' +
                ", bid='" + bid + '\'' +
                ", brank=" + brank +
                ", classify=" + classify +
                '}';
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGintroduce() {
        return gintroduce;
    }

    public void setGintroduce(String gintroduce) {
        this.gintroduce = gintroduce;
    }

    public String getGimg() {
        return gimg;
    }

    public void setGimg(String gimg) {
        this.gimg = gimg;
    }

    public Double getGnewprice() {
        return gnewprice;
    }

    public void setGnewprice(Double gnewprice) {
        this.gnewprice = gnewprice;
    }

    public Double getGoldprice() {
        return goldprice;
    }

    public void setGoldprice(Double goldprice) {
        this.goldprice = goldprice;
    }

    public Date getGtime() {
        return gtime;
    }

    public void setGtime(Date gtime) {
        this.gtime = gtime;
    }

    public Integer getGsum() {
        return gsum;
    }

    public void setGsum(Integer gsum) {
        this.gsum = gsum;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public Brank getBrank() {
        return brank;
    }

    public void setBrank(Brank brank) {
        this.brank = brank;
    }

    public Classify getClassify() {
        return classify;
    }

    public void setClassify(Classify classify) {
        this.classify = classify;
    }

    public Goods() {

    }

    public Goods(String gid, String gname, String gintroduce, String gimg, Double gnewprice, Double goldprice, Date gtime, Integer gsum, String cid, String bid, Brank brank, Classify classify) {

        this.gid = gid;
        this.gname = gname;
        this.gintroduce = gintroduce;
        this.gimg = gimg;
        this.gnewprice = gnewprice;
        this.goldprice = goldprice;
        this.gtime = gtime;
        this.gsum = gsum;
        this.cid = cid;
        this.bid = bid;
        this.brank = brank;
        this.classify = classify;
    }
}
