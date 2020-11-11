package com.iri.aopdemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class MyDemoLoggingAspect {

   // this is where we add all of our related advice for logging


    // let's start with an @Before advice

   // @Before("execution(public void addAccount())")
  //  @Before("execution(public void updateAccount())")

   // @Before("execution(public void addAccount())")

   // @Before("execution(public void com.iri.aopdemo.dao.AccountDAO.addAccount())")
   // @Before("execution(public void add*())")

  //  @Before("execution(* add*())")

   // @Before("execution(* add*(com.iri.aopdemo.entity.Account))")
    //@Before("execution(* add*(com.iri.aopdemo.entity.Account, ..))")
    //@Before("execution(* add*(..))")

/*

   @Before("execution(* com.iri.aopdemo.dao.*.*(..))")
    public void beforeAddAccountAdvice() {
       System.out.println("===== Executing @Before advice on addAccount()");
    }
*/




}
