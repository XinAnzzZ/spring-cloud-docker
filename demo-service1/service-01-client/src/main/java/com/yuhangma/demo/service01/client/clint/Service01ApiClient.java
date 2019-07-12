package com.yuhangma.demo.service01.client.clint;

import com.yuhangma.demo.web.common.data.ResultJson;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Moore
 * @since 2019-07-03
 */
@FeignClient(name = "service-01-api", path = "/api")
public interface Service01ApiClient {

    /**
     * hello
     *
     * @return hello
     */
    @GetMapping("/hello")
    ResultJson<ResultJson> hello();
}
