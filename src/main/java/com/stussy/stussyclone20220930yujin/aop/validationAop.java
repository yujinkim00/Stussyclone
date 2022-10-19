package com.stussy.stussyclone20220930yujin.aop;


import com.stussy.stussyclone20220930yujin.exception.CustomValidationException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Aspect
@Component
public class validationAop {

//    @Pointcut("execution(* com.stussy.stussyclone20220930yujin..*Api.*(..))")
//    //*모든 메소드에 적용해라. get* get으로 시작하는 메소드 적용, set* set으로 시작 하는,  *.*는 모든 클래스
//    // *api.* api로 끝나는 클래스 모두
//    // 패키지 는 지우고 ..으로 하면 하위 모든 패키지 적용.
//    private void executionPointCut() {}
    @Pointcut("@annotation(com.stussy.stussyclone20220930yujin.aop.annotation.ValidAspect)")
    private void annotationPointCut() { }

        @Around("annotationPointCut()")
        public Object around(ProceedingJoinPoint joinPoint) throws Throwable {  // 예외 미루기..?

            Object[] args = joinPoint.getArgs();  // 원래 메소드에서 쓰던 매개변수 object[] 로 가져오기
            // 항상 내가 필요한게 그번호에 있는지 모르니깐 반복해서 맞으면 가져나오는거다.

            BeanPropertyBindingResult bindingResult = null;

            for(Object arg :args) {
           //     System.out.println(arg);
                if(arg.getClass() == BeanPropertyBindingResult.class) {
                   bindingResult = (BeanPropertyBindingResult) arg;// 다운캐스팅
                    break;
                }
            }


            if(bindingResult.hasErrors()) {
                Map<String, String> errorMap = new HashMap<String, String>();
                List<FieldError> fieldErrors = bindingResult.getFieldErrors();
               for(FieldError fieldError : fieldErrors) {
//                    System.out.println("필드명: " + fieldError.getField());
//                    System.out.println("에러 메세지: " + fieldError.getDefaultMessage());
//                    errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
                   // 로그 떄문에 필요 없음
                }

                throw new CustomValidationException("Validation Error", errorMap);
            }

        Object result = null;    // 후 실행 될 객체 joinPoint
        result = joinPoint.proceed();

        return result;
    }
}




