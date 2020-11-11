package com.iri.aopdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAdviceDemo {


      @Around("execution(* com.iri.aopdemo.service.TrafficFortuneService.getFortune(..))")
      public Object afterGetFortune(
              ProceedingJoinPoint proceedingJoinPoint
      ) throws Throwable {


          try {
              Object result = proceedingJoinPoint.proceed();

              return result;
          } catch (Exception e) {

              // log exception
              System.out.println("we have exception here ");

              throw e;
          }








          /*Object result = null;

          try {

              result = proceedingJoinPoint.proceed();


          } catch (Exception e) {
               // log the exception



              System.out.println("======> interception Exception in @Around advice");

              // give user a customer

              result = "Move along ";
          }

          return result;
*/

       /*   long beging = System.currentTimeMillis();

          Object result = proceedingJoinPoint.proceed();

          long end = System.currentTimeMillis();

          long duration = end - beging;

          System.out.println("=======>  duration Around advice " + duration /1000 + "sec");

          return result;*/
      }



}
