package com.liangsl.java.controller;
import com.liangsl.java.common.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GreetingController {
    @Autowired
    private Properties properties;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/greetingList")
    @ResponseBody
    public Map<String,Object> greetingList(){
        Map<String,Object> map = new HashMap<>();
        map.put("greeting","greetingList");
        return map;
    }

    @RequestMapping("/getSysName")
    @ResponseBody
    public String getSysName(){
        return properties.getSysName();
    }

}