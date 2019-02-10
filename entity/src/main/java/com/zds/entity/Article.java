package com.zds.entity;

import javax.persistence.*;

@Entity
@Table(name = "article")
public class Article {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "create_time")
    private java.sql.Timestamp createTime;
    @Column(name = "modify_time")
    private java.sql.Timestamp modifyTime;
    @Column(name = "allow_conmment")
    private long allowConmment;
    @Column(name = "author_id")
    private String authorId;
    @Column(name = "status")
    private long status;
    @Column(name = "clicks")
    private long clicks;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public java.sql.Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(java.sql.Timestamp createTime) {
        this.createTime = createTime;
    }


    public java.sql.Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(java.sql.Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }


    public long getAllowConmment() {
        return allowConmment;
    }

    public void setAllowConmment(long allowConmment) {
        this.allowConmment = allowConmment;
    }


    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }


    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }


    public long getClicks() {
        return clicks;
    }

    public void setClicks(long clicks) {
        this.clicks = clicks;
    }

}
