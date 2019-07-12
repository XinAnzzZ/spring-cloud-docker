package com.yuhangma.demo.web.common.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Moore
 * @since 2019-07-03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("unused")
public class ResultJson<T> {

    private Integer code = OK;

    private String msg = SUCCESS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public static final String SUCCESS = "success";

    public static final int OK = 200;

    public static <R> ResultJson<R> ok(R data) {
        return new ResultJson<>(OK, SUCCESS, data);
    }

    public static ResultJson ok() {
        return new ResultJson();
    }

    public static <R> ResultJson<R> ok(String msg, R data) {
        return new ResultJson<>(OK, msg, data);
    }

    public static ResultJson msg(String msg) {
        ResultJson resultJson = new ResultJson();
        resultJson.setMsg(msg);
        return resultJson;
    }
}
