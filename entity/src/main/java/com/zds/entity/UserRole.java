package com.zds.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class UserRole {

    @Id
    @Column(name = "uid")
    private String uid;
    @Column(name = "rid")
    private long rid;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }


    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

}
