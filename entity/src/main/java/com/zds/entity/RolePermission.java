package com.zds.entity;

import javax.persistence.*;

@Entity
@Table(name = "role_permission")
public class RolePermission {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "rid")
    private long rid;
    @Column(name = "pid")
    private long pid;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }


    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

}
