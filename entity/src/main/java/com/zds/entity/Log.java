package com.zds.entity;

import javax.persistence.*;

@Entity
@Table(name = "log")
public class Log {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "action")
    private String action;
    @Column(name = "create_time")
    private java.sql.Timestamp createTime;
    @Column(name = "ip")
    private String ip;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    public java.sql.Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(java.sql.Timestamp createTime) {
        this.createTime = createTime;
    }


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

}
