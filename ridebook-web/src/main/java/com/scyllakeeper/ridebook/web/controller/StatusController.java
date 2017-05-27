package com.scyllakeeper.ridebook.web.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhuozi on 17/5/21.
 */
@Controller
@RequestMapping("")
public class StatusController {

    @ResponseBody
    @RequestMapping(value = "/status")
    public JSONObject status(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 1001);
        jsonObject.put("message", "success");
        return jsonObject;
    }
}
