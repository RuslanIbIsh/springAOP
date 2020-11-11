package com.iri.aopdemo.dao;


import com.iri.aopdemo.entity.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    private String name;
    private String  serviceCode;

    public List<Account> findAccounts(boolean tripWire) {

        if (tripWire == true) {

            throw new RuntimeException("No soup for you");
        }



        List<Account> myAccount = new ArrayList<>();

        Account account = new Account("Leo", "Vip");
        Account account1 = new Account("Madhu", "Gold");
        Account account2 = new Account("Luva", "Silver");

        myAccount.add(account);
        myAccount.add(account1);
        myAccount.add(account2);


        return myAccount;
    }



    public void addAccount(Account account, boolean vioFlag) {
        System.out.println(getClass() + ": doing AccountDAO");
    }

    public boolean doWork() {

        System.out.println("doWork()  ");

        return false;
    }


    public String getName() {

        System.out.println("getName");

        return name;
    }

    public void setName(String name) {

        System.out.println("setName");
        this.name = name;
    }

    public String getServiceCode() {

        System.out.println("getServiceCode");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {

        System.out.println("setServiceCode");
        this.serviceCode = serviceCode;
    }
}
