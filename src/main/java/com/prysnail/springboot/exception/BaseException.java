package com.prysnail.springboot.exception;

/**
 * 基本异常类
 * @author prysnail
 * @date 2019/12/19 15:41
 */
public class BaseException extends Exception {

    public BaseException(String msg){
        super(msg);
    }
}
