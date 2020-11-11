package com.iri.aopdemo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/*@Aspect
@Component*/

public class AfterThrowingDemo {

 /*   @AfterThrowing(
            pointcut = "execution(* com.iri.aopdemo.dao.AccountDAO.findAccounts(..))",
            throwing = "exception"

    )
    public void afterThrowingfindAccount(
            JoinPoint joinPoint,
            Throwable exception
    ) {

        System.out.println("=========> afterThrowing Exeption ");

    }*/
}
