package com.stussy.stussyclone20220930yujin;

import com.stussy.stussyclone20220930yujin.dto.RegisterReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AccountController {

    @GetMapping("/account/login")  // 내가 원하는 이름 ..?
    public String login(){
        return "account/login";
    }

    @GetMapping("/account/register")
    public String register(){
        return "account/register"; //뷰에 줄 파일이름이다.. 앞에 / 필요없음.??

    }
}
