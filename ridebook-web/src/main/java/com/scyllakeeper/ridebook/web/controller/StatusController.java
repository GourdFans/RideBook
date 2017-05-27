package com.scyllakeeper.ridebook.web.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhuozi on 17/5/21.
 */
@Controller
@RequestMapping("")
public class StatusController {
    Logger logger = LoggerFactory.getLogger(StatusController.class);

    @ResponseBody
    @RequestMapping(value = "/status")
    public String status(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 1001);
        jsonObject.put("message", "success");
        logger.debug(jsonObject.toJSONString());
        logger.info(jsonObject.toJSONString());
        logger.warn(jsonObject.toJSONString());
        logger.error(jsonObject.toJSONString());
        return jsonObject.toJSONString();
    }
}
