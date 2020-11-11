package com.iri.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public boolean addSillyMember() {
        System.out.println(
    getClass() + " doing MembershipDAO"
        );
    return true;


    }

    public void goToSleep() {
        System.out.println("goToSleep");
    }



}
