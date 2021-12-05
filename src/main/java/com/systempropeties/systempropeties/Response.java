package com.systempropeties.systempropeties;

import lombok.Data;

@Data
public class Response<T> {
    private boolean success;
    private String message;
    private T data;
}
