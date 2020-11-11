package com.iri.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
/*
@Aspect*/
public class AllPointcutExpressions {

/*
    @Pointcut("execution(* com.iri.aopdemo.dao.*.*(..))")
    public void allPackageMethods() {}


    @Pointcut("execution(* com.iri.aopdemo.dao.*.get*())")
    public void gettersPackage(){}

    @Pointcut("execution(* com.iri.aopdemo.dao.*.set*(..))")
    public void settersPackage(){}

    @Pointcut("allPackageMethods() && !(gettersPackage() || settersPackage())")
    public void allPackageMethodsNotGetSet(){}
*/


}
