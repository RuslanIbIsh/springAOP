package com.iri.aopdemo;


import com.iri.aopdemo.configuration.DemoConfig;
import com.iri.aopdemo.dao.AccountDAO;
import com.iri.aopdemo.dao.MembershipDAO;
import com.iri.aopdemo.entity.Account;
import com.iri.aopdemo.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.logging.Logger;

public class MainDemoApp {


    private static Logger myLogger =
            Logger.getLogger(MainDemoApp.class.getName());

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);





/*
        // get the bean from spring container

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        // call the business method
        Account account = context.getBean("account", Account.class);*/

        TrafficFortuneService trafficFortuneService =
                context.getBean("trafficFortuneService", TrafficFortuneService.class);



        System.out.println("---- in main method----");

        boolean tripWire = true;

        try {
            String fortune = trafficFortuneService.getFortune(tripWire);
            myLogger.info(fortune);
        } catch (Exception e) {
            e.printStackTrace();
        }



       //  System.out.println(fortune);



        myLogger.info("Finished");




    /*    List<Account> accounts = null;

        try {

            boolean tripwire = true;

            accounts = accountDAO.findAccounts(tripwire);



        } catch (Exception e) {
            System.out.println("catch block in main method");
        }

        System.out.println("-----accounts in main ___ " +  accounts);
*/




    /*    accountDAO.addAccount(account, true);
        accountDAO.doWork();
        accountDAO.getName();
        accountDAO.setName("code");
        accountDAO.getServiceCode();
        accountDAO.setServiceCode("code");*/

     //   System.out.println("\n next class and his methods \n");

     /*   membershipDAO.addSillyMember();
        membershipDAO.goToSleep();*/

        // close the context
        context.close();


    }

}
