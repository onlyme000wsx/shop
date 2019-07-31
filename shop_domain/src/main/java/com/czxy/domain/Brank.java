package com.czxy.domain;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author
 * @Version v 1.0
 * @Date 2019/7/30
 */
@Table(name = "tbl_brank")
public class Brank {//#品牌
    @Id
     private  String bid;//` VARCHAR(50) NOT NULL,   #品牌id
     private  String bname;//` VARCHAR(50) NOT NULL , #品牌名称

    @Override
    public String toString() {
        return "Brank{" +
                "bid='" + bid + '\'' +
                ", bname='" + bname + '\'' +
                '}';
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Brank() {

    }

    public Brank(String bid, String bname) {

        this.bid = bid;
        this.bname = bname;
    }
}
