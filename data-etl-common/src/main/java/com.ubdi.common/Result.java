package com.ubdi.common;

import java.io.Serializable;

/**
 * 接口返回值
 *
 * @param <T>
 * @author
 */
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    protected int code;
    protected String message;
    protected T data;

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result(int code) {
        this.code = code;
    }

    public Result(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static <E> Result<E> success() {
        return new Result(200);
    }

    public static <E> Result<E> success(String message) {
        return new Result(200, message);
    }

    public static <E> Result<E> success(E data) {
        return new Result(200, data);
    }

    public static <E> Result success(String message, E data) {
        return new Result(200, message, data);
    }

    public static <E> Result<E> error(E data) {
        return new Result(400, data);
    }

    public static <E> Result<E> error(String message, E data) {
        return new Result(400, message, data);
    }

    public static <E> Result<E> error(String message) {
        return new Result(400, message);
    }

    public static <E> Result<E> error(int code, String message) {
        return new Result(code, message);
    }

    public Result() {
    }
}
