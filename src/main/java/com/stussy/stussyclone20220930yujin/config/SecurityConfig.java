package com.stussy.stussyclone20220930yujin.config;

import com.stussy.stussyclone20220930yujin.dto.CMRespDto;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
// 기존거 치우고 내가 만든 이거를 따라라..

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();
        http.httpBasic().disable();  // 첫 로그인 화면 안쓰겟다
        http.authorizeRequests() // 권한 관련 모든 요청이 들어오면
                .antMatchers("/account/mypage","/index")  // 지정한 요 주소로 요청이 들어오면
                .authenticated() //인증을 거쳐라
                .anyRequest() //다른 요청들은
                .permitAll() // 전부 허가해라 .. 그래서 css image 다 가져 올수 있는거다
                .and() // 그리고
                .formLogin() // 인증 요청이 들어오면
                .loginPage("/account/login")  // 이 페이지로 보내라  login gage Get 요청
                .loginProcessingUrl("/account/login") //로그인 service post 요청
                .defaultSuccessUrl("/index"); // 갈데가 없을때 보낸다?

    }
}
