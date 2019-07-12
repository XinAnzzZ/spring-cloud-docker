package com.yuhangma.demo.web.core.controller;

import com.yuhangma.demo.service01.client.clint.Service01ApiClient;
import com.yuhangma.demo.web.common.data.ResultJson;
import com.yuhangma.demo.web.common.util.LocalHostUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * @author Moore
 * @since 2019-07-03
 */
@RestController
@RequestMapping(value = "web", produces = APPLICATION_JSON_UTF8_VALUE)
public class WebController {

    private static final String SERVER_NAME = "service-web";

    private Service01ApiClient service01ApiClient;

    @Autowired
    public WebController(Service01ApiClient service01ApiClient) {
        this.service01ApiClient = service01ApiClient;
    }

    @GetMapping("index")
    public ResultJson<ResultJson<ResultJson>> index() {
        String msg = String.format("I'm %s, my IP is %s, I have invoked service-01-api and the response is data",
                SERVER_NAME,
                LocalHostUtils.getIp());
        return ResultJson.ok(msg, service01ApiClient.hello());
    }
}
