package com.stussy.stussyclone20220930yujin.api;

import com.stussy.stussyclone20220930yujin.aop.annotation.LogAspect;
import com.stussy.stussyclone20220930yujin.dto.CMRespDto;
import com.stussy.stussyclone20220930yujin.dto.RegisterReqDto;
import com.stussy.stussyclone20220930yujin.dto.validation.ValidationSequence;
import com.stussy.stussyclone20220930yujin.exception.CustomValidationException;
import com.stussy.stussyclone20220930yujin.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/api/account")
@RestController
@RequiredArgsConstructor
public class AccountApi {

    private final AccountService accountService;

    @LogAspect
    @PostMapping("/register")  // ReqMapping 주소가 앞에 붙는다.
    public ResponseEntity<?> register(@Validated(ValidationSequence.class)
                                          @RequestBody RegisterReqDto registerReqDto, BindingResult bindingResult)throws Exception {

        accountService.register(registerReqDto);

        return ResponseEntity.created(null).body(new CMRespDto<>("회원가입성공", registerReqDto));
    }

}
