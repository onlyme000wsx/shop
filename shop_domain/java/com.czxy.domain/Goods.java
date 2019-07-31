package com.czxy.domain;

import javax.persistence.Id;
import java.util.Date;

/**
 * @Author libin
 * @Version v 1.0
 * @Date 2019/7/30
 * `gid` VARCHAR(50) NOT NULL,   #商品id
 *   `gname` VARCHAR(50) NOT NULL ,  #商品名称
 *   `gintroduce` VARCHAR(50) NOT NULL ,#介绍 备注
 *   `gimg` VARCHAR(50) NOT NULL ,#图片
 *   `gnewprice` double NOT NULL ,#现价格
 *   `goldprice` double NOT NULL ,#原价格
 *   `gtime` DATE NOT NULL ,#上架时间
 *   `gsum` INT NOT NULL ,#销售数量纪录
 *   `cid` VARCHAR(50) NOT NULL ,#类别
 *   `bid` VARCHAR(50) NOT NULL ,#品牌
 *   PRIMARY KEY (`gid`)
 */
public class Goods {
    @Id
    private String gid;
  private  String gname;
  private  String gintroduce;
  private   String gimg;
  private  Double gnewprice;
  private  Double goldprice;
  private Date gtime;
  private  Integer gsum;
  private  String cid;
  private  String bid;
  private  Classfy classfy;

    public Goods() {
    }

    public Goods(String gid, String gname, String gintroduce, String gimg, Double gnewprice, Double goldprice, Date gtime, Integer gsum, String cid, String bid, Classfy classfy) {
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
        this.classfy = classfy;
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

    public Classfy getClassfy() {
        return classfy;
    }

    public void setClassfy(Classfy classfy) {
        this.classfy = classfy;
    }

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
                ", classfy=" + classfy +
                '}';
    }
}
