package com.stussy.stussyclone20220930yujin.aop;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.CodeSignature;
import org.springframework.stereotype.Component;

@Slf4j  //심플로그퍼사드? 이안에 로그포제이 라이브러리 포함
@Aspect
@Component
public class LogAop {

    @Pointcut("execution(* com.stussy.stussyclone20220930yujin.api.*Api.*(..))")
    private void Pointcut() {}

    @Pointcut("@annotation(com.stussy.stussyclone20220930yujin.aop.annotation.LogAspect)")
    private void annotationPointCut() {}

        @Around("annotationPointCut()")
        public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

            CodeSignature codeSignature = (CodeSignature) joinPoint.getSignature();

            String className = codeSignature.getDeclaringTypeName();
            String methodName = codeSignature.getName();
            String[] parameterNames = codeSignature.getParameterNames();
            Object[] args = joinPoint.getArgs();

            for(int i = 0; i < parameterNames.length; i++) {
                log.info("<<<< Parameter Info >>>> {}.{} >>> [{}: {}]",className,methodName,parameterNames[i],args[i]);
            }

            Object result = joinPoint.proceed();

            log.info("<<<< Return >>>> {}.{} >>> [{}]",className,methodName,result);

            return result;
        }
    }




