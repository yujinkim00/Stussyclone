package com.stussy.stussyclone20220930yujin.exception;

import lombok.Getter;

import java.util.Map;


@Getter
public class CustomValidationException extends RuntimeException{  // 내가 메세지 지정할 수 있다

    private Map<String, String > errorMap;

    public CustomValidationException(String message, Map<String, String > errorMap) {
        super(message);
        this.errorMap = errorMap;
    }

}
