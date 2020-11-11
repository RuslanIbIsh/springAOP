package com.iri.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
// @Component
public class PointcutCombinationAspect {
/*

    @Pointcut("execution(* com.iri.aopdemo.dao.*.*(..))")
    private void forDaoPackage(){}

    @Pointcut("execution(* com.iri.aopdemo.dao.*.get*())")
    private void getMethods(){}

    @Pointcut("execution(* com.iri.aopdemo.dao.*.set*(..))")
    private void setMethods(){}

    @Pointcut("forDaoPackage() && !(getMethods() || setMethods())")
    private void forDaoPackageNoGetterSetter(){}

    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {
        System.out.println("=====> beforeAddAccountAdvice");
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void performApiAnalytics() {
        System.out.println("======> performApiAnalytics");
    }

*/



}
