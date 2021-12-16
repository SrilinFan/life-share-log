package com.share.life.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 范晓林
 */
@RestController
public class UserInitialController {

    @GetMapping(value = "/test")
    public String test(){
        JSONObject object = new JSONObject();
        object.put("y", "x");
        return JSON.toJSONString(object);
    }
}
