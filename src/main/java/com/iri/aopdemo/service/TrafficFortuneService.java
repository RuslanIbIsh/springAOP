package com.iri.aopdemo.service;


import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class TrafficFortuneService {



    public String getFortune(boolean tripWire) {

        if (tripWire == true) {
            throw new RuntimeException("Major accident");
        }

/*


        try {

            TimeUnit.SECONDS.sleep(5);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/


        return "Expert heavy traffic this morning";


    }


}
