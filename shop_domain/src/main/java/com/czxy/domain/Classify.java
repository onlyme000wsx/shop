package com.czxy.domain;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author
 * @Version v 1.0
 * @Date 2019/7/30
 */
@Table(name = "tbl_classify")
public class Classify {

  //  CREATE TABLE `tbl_classify` (  #分类
    @Id
      private  String cid;//` VARCHAR(50) NOT NULL,   #分类id
      private  String cname;//` VARCHAR(50) NOT NULL ,  #分类名称

    @Override
    public String toString() {
        return "Classify{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                '}';
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

    public Classify() {

    }

    public Classify(String cid, String cname) {

        this.cid = cid;
        this.cname = cname;
    }
}
