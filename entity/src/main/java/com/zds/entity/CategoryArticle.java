package com.zds.entity;

import javax.persistence.*;

@Entity
@Table(name = "category_article")
public class CategoryArticle {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "cid")
    private long cid;
    @Column(name = "aid")
    private long aid;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }


    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }

}
