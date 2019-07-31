package com.czxy.domain;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author libin
 * @Version v 1.0
 * @Date 2019/7/30
 * /`bid` VARCHAR(50) NOT NULL,   #品牌id
 *   `bname` VARCHAR(50) NOT NULL , #品牌名称
 */
@Table(name = "tbl_brank")
// 品牌表
public class Brank {
    @Id
    private String bid;//#品牌id
    private  String bname;//#品牌名称

    public Brank() {
    }

    public Brank(String bid, String bname) {
        this.bid = bid;
        this.bname = bname;
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

    @Override
    public String toString() {
        return "Brank{" +
                "bid='" + bid + '\'' +
                ", bname='" + bname + '\'' +
                '}';
    }
}
