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

    // 받아오는 String message가 dto 에 있는 메세지가 오는건
    // 런타임 중에 생기는 오류를 가져오는 예외라서 그런가요?


}
