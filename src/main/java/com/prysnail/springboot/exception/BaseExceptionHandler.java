package com.prysnail.springboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理类
 * @author prysnail
 * @date 2019/12/19 15:44
 */
@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = BaseException.class)
    public Result handBaseException(BaseException e){
        Result result = new Result();
        result.setSuccess(Boolean.FALSE);
        result.setCode(100);
        result.setMessage(e.getMessage());
        return result;
    }
}
