package com.ntm.generator.util;

import lombok.Data;


/**
 * @ClassName BaseRespose
 * @Author Tian
 * @Date 2020/9/1 9:12
 * @Description
 * @Version 1.0
 */
@Data
public class BaseResponse {

    private Integer code;
    private String msg;
    private Object data;
    private boolean flag;

    public BaseResponse() {
    }

    public void ok(Object data) {
        this.code = AppConstant.OK;
        this.msg = null;
        this.flag = AppConstant.succes;
        this.data = data;
    }

    public void fail(String msg,Object data){
        this.data = data;
        this.flag = AppConstant.fail;
        this.msg = msg;
        this.code = AppConstant.FAIL;
    }
}
