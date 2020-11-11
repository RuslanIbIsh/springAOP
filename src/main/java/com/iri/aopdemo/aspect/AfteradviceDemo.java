package com.iri.aopdemo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/*@Aspect
@Component*/
public class AfteradviceDemo {

  /*  @After("execution(* com.iri.aopdemo.dao.AccountDAO.findAccounts(..))")
    public void afterFindAccount(
            JoinPoint joinPoint
    ) {
        System.out.println(joinPoint.getSignature().toShortString());
        System.out.println("========> after advice");
    }*/
}
