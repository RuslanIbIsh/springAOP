package com.iri.aopdemo.aspect;


import com.iri.aopdemo.entity.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/*@Aspect
@Component*/
public class GetMethodSignatureDemo {

   /* @Before("com.iri.aopdemo.aspect.AllPointcutExpressions.allPackageMethodsNotGetSet()")
    public void getSignature(JoinPoint joinPoint) {

        MethodSignature methodSignature =
                (MethodSignature) joinPoint.getSignature();


        System.out.println(methodSignature);


        Object[] args = joinPoint.getArgs();

        for (Object arg : args) {
            System.out.println(arg);

            if (arg instanceof Account) {

                Account account = (Account) arg;
                System.out.println(account.getName());
                System.out.println( account.getLevel());
            }


        }




    }
*/

}
