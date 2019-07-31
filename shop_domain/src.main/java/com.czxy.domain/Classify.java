package com.czxy.domain;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author libin
 * @Version v 1.0
 * @Date 2019/7/30
 *  `cid` VARCHAR(50) NOT NULL,   #分类id
 *   `cname` VARCHAR(50) NOT NULL ,  #分类名称
 */
@Table(name = "tbl_classify")
// 分类表
public class Classify {

    @Id
    private String cid;//分类id
    private  String cname;//分类名称

    public Classify() {
    }

    public Classify(String cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String  toString() {
        return "Classify{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }
}
