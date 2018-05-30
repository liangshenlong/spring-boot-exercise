package com.liangsl.java.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by liangsl on 2018/5/8
 */
@Component
@PropertySource(value = "classpath:application-mybatis.properties")
public class Properties {
    @Value("${sys.name}")
    private String sysName;
    @Value("${mybatis}")
    private String mybatis;

    public String getSysName() {
        return sysName+mybatis;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }
}
