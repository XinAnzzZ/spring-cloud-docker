package com.yuhangma.demo.service02.api.controller;

import com.yuhangma.demo.web.common.data.ResultJson;
import com.yuhangma.demo.web.common.util.LocalHostUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * @author Moore
 * @since 2019-07-04
 */
@RequestMapping(value = "/service02/api", produces = APPLICATION_JSON_UTF8_VALUE)
@RestController
public class Service02ApiController {

    private static final String SERVER_NAME = "service-02-api";

    @GetMapping("data")
    public ResultJson getData() {
        return ResultJson.msg(String.format("I'm %s, my IP is %s", SERVER_NAME, LocalHostUtils.getIp()));
    }
}
