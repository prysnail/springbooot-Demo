package com.prysnail.springboot.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * 结果类
 * @author prysnail
 * @date 2019/12/19 15:34
 */

@Getter
@Setter
public class Result {

    private Boolean success;

    private Integer code;

    private String message;

    public Result(){
        this.success = true;
        this.code = 200;
        this.message = "";
    }

    public Result(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
