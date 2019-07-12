package com.yuhangma.demo.service01.api.controller;

import com.yuhangma.demo.service02.client.Service02ApiClient;
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
@RequestMapping(value = "/api", produces = APPLICATION_JSON_UTF8_VALUE)
public class Service01ApiController {

    private static final String SERVER_NAME = "service-01-api";

    private Service02ApiClient service02ApiClient;

    @Autowired
    public Service01ApiController(Service02ApiClient service02ApiClient) {
        this.service02ApiClient = service02ApiClient;
    }

    @GetMapping("/hello")
    public ResultJson<ResultJson> hello() {
        String msg = String.format("I'm %s, my IP is %s, I have Invoked service-02-api and the response is data",
                SERVER_NAME,
                LocalHostUtils.getIp());
        return ResultJson.ok(msg, service02ApiClient.getData());
    }

}
