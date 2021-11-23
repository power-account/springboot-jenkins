package com.example.jenkins.entity;

import lombok.Data;

/**
 * @description: RspModel
 * @author: 279000728@qq.com
 * @create: 2021-10-24 15:58
 **/
@Data
public class RspModel<T> {


    public static final String SUCCESS_CODE = "1";
    public static final String SUCCESS_MSG = "success";
    public static final int SUCCESS_STATUS = 200;
    public static final String FAILED_CODE = "0";
    public static final String FAILED_MSG = "No value present";

    private String message;

    private Integer status;

    private String code;

    private T data;


    public RspModel(String returnCode, String returnMsg) {
        this.code = returnCode;
        this.message = returnMsg;
    }

    public RspModel(String returnCode, String returnMsg, T data) {
        this.code = returnCode;
        this.message = returnMsg;
        this.data = data;
        this.status = SUCCESS_STATUS;
    }

    public RspModel(String returnCode, String returnMsg, int status) {
        this.code = returnCode;
        this.message = returnMsg;
        this.status = status;
    }

    public static RspModel error(String returnMsg) {
        return new RspModel(FAILED_CODE, returnMsg);
    }

    public static RspModel error() {
        RspModel rspModel = new RspModel(FAILED_CODE, FAILED_MSG);
        rspModel.setStatus(500);
        return rspModel;
    }

    public static RspModel success() {
        RspModel rsp = new RspModel(SUCCESS_CODE, SUCCESS_MSG);
        rsp.setStatus(SUCCESS_STATUS);
        return rsp;
    }

    public static RspModel success(String returnMsg) {
        RspModel rsp = new RspModel(SUCCESS_CODE, returnMsg);
        rsp.setStatus(SUCCESS_STATUS);
        return rsp;
    }

    public static <T> RspModel<T> success(String returnMsg, T data) {
        return new RspModel<>(SUCCESS_CODE, returnMsg, data);
    }

    public static <T> RspModel<T> success(T data) {
        return success(SUCCESS_MSG, data);
    }

    public static RspModel successSetStatus(String returnMsg, int status) {
        return new RspModel(SUCCESS_CODE, returnMsg, status);
    }
}
