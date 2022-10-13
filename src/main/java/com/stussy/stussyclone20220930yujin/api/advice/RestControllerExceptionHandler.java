package com.stussy.stussyclone20220930yujin.api.advice;

import com.stussy.stussyclone20220930yujin.dto.CMRespDto;
import com.stussy.stussyclone20220930yujin.exception.CustomInternalServerErrorException;
import com.stussy.stussyclone20220930yujin.exception.CustomValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RestControllerAdvice
public class RestControllerExceptionHandler {


    @ExceptionHandler(CustomValidationException.class)
    public ResponseEntity<?> validationErrorException(CustomValidationException e) {

        return ResponseEntity.badRequest().body(new CMRespDto<>(e.getMessage(),e.getErrorMap()));
    // api : 위 형식대로 받으면 json 형식으로 받아 올수 있다. { 안에 msg : ----  ,data : --- 형식 안깨진다. }
        //badRequest() OR ok()
    }
    @ExceptionHandler(CustomInternalServerErrorException.class)
    public ResponseEntity<?> internalServerErrorException(CustomInternalServerErrorException e) {

        return ResponseEntity.internalServerError().body(new CMRespDto<>(e.getMessage(), null));


    }
}
