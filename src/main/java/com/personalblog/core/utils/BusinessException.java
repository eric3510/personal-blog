package com.personalblog.core.utils;

/**
 * @author 王强 wangqiang@hushijie.com.cn
 * @version 创建时间：2017/08/01 13:50
 * BusinessException
 **/
public final class BusinessException extends RuntimeException{

    private static final long serialVersionUID = 1721891525581654383L;

    private Integer code;

    private Object data;

    public BusinessException(){
        super();
    }

    public BusinessException(Exception ex){
        super(ex.getMessage());
        if(ex instanceof BusinessException){
            this.code = ((BusinessException) ex).getRet();
            this.data = ((BusinessException) ex).getData();
        }
    }

    public BusinessException(Exception ex, String msg){
        super(msg);
        if(ex instanceof BusinessException){
            this.code = ((BusinessException) ex).getRet();
            this.data = ((BusinessException) ex).getData();
        }
    }

    public BusinessException(String msg){
        super(msg);
    }

    public BusinessException(String msg, int code, Object data){
        super(msg);
        this.code = code;
        this.data = data;
    }

    public String getTip(){
        return super.getMessage();
    }

    public int getRet(){
        return this.code;
    }

    public void setRet(int code){
        this.code = code;
    }

    public Object getData(){
        return data;
    }

    public void setData(Object data){
        this.data = data;
    }
}