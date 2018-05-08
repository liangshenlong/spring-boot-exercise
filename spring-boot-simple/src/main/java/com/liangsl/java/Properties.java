package com.liangsl.java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by liangsl on 2018/5/8
 */
@Component
public class Properties {
    @Value("${sys.name}")
    private String sysName;

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }
}
