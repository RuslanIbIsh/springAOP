package com.iri.aopdemo.aspect;


import com.iri.aopdemo.entity.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

/*@Aspect
@Component*/
public class AfterReturningDemo {

/*
    @AfterReturning(
            pointcut = "execution(* com.iri.aopdemo.dao.AccountDAO.findAccounts())",
returning = "result"
    )
    public void afterReturningFindAccountAdvice(
            JoinPoint joinPoint,
            List<Account> result

    ) {

        System.out.println(joinPoint.getSignature().toShortString());

        System.out.println("=====>Executing @AfterReturning ");

        if(!result.isEmpty()){

            Account account = result.get(0);
            account.setName("Duffy Duck");

            convertAccountNamesToUpperCase(result);

        }

        System.out.println("result---------" + result);

    }

    private void convertAccountNamesToUpperCase(List<Account> result) {
        for (Account account : result) {
            String theUpperName = account.getName().toUpperCase();

        account.setName(theUpperName);

        }
    }*/

}
