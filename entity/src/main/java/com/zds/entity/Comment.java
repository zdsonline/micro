package com.zds.entity;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "content")
    private String content;
    @Column(name = "author_id")
    private String authorId;
    @Column(name = "post_time")
    private String postTime;
    @Column(name = "status")
    private long status;
    @Column(name = "aid")
    private long aid;
    @Column(name = "parent_id")
    private long parentId;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }


    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }


    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }


    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }


    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

}
