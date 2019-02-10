package com.zds.entity;

import javax.persistence.*;

@Entity
@Table(name = "permission")
public class Permission {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "url")
    private String url;
    @Column(name = "type")
    private long type;
    @Column(name = "parent_id")
    private long parentId;
    @Column(name = "code")
    private String code;
    @Column(name = "remark")
    private String remark;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }


    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
