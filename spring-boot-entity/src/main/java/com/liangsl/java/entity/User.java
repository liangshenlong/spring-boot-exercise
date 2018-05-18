package com.liangsl.java.entity;

import org.apache.commons.lang3.time.DateFormatUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by liangsl on 2018/5/18
 */
@Entity
public class User {
    @Id
    private String id;
    private String name;
    @Column(name = "create_time")
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateTimeStr(){
        return DateFormatUtils.format(getCreateTime(),"yyyy-MM-dd HH:mm:ss");
    }
}
