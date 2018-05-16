package com.liangsl.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by liangsl on 2018/5/9
 */
@RestController
public class SessionController {

    @RequestMapping("uuid")
    public Map<String, Object> uuid(HttpSession session){
        UUID uuid = (UUID) session.getAttribute("uuid");
        if(null == uuid){
            uuid = UUID.randomUUID();
        }
        session.setAttribute("uuid",uuid);
        Map<String,Object> ret = new HashMap<>();
        ret.put("uuid",uuid);
        ret.put("random",UUID.randomUUID());
        ret.put("sessionId",session.getId());
        return ret;
    }

}
