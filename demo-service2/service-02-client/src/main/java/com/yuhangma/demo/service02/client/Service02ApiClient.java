package com.yuhangma.demo.service02.client;

import com.yuhangma.demo.web.common.data.ResultJson;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Moore
 * @since 2019-07-04
 */
@FeignClient(value = "service-02-api", path = "service02/api")
public interface Service02ApiClient {

    /**
     * get data
     *
     * @return the json data
     */
    @GetMapping("data")
    ResultJson getData();
}
