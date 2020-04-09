package com.bingley.springbootdemo.bean;

/**
 * 描述：通用返回类型
 * @author Xiao Pengwei
 * @since  2019-03-27
 */
public class CommonResult {

    private String status;

    private Object result;

    private Object message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}

