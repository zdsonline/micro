package com.zds.entity;

import javax.persistence.*;

@Entity
@Table(name = "tag_article")
public class TagArticle {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "tid")
    private long tid;
    @Column(name = "aid")
    private long aid;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }


    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }

}
