package com.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Test2 {
    public static void main(String[] args) {

        System.out.println(TradeCode.AUTO_REPAY.getDesc());

        AtomicInteger count =new AtomicInteger();
        count.addAndGet(1);


        System.out.println("EnumTest.FRI 的 value = " + EnumTest.SUN.isRest());

//        ThreadLocalRandom current = ThreadLocalRandom.current();
//        System.out.println(current.nextInt(100));
//
//        Map<String,Integer> map = new HashMap<>();
//        map.put("one",1);
//        map.put("two",1);
//        map.put("three",1);
//        map.put("four",1);
//        map.put("five",1);
//
//        System.out.println(LocalDateTime.now());
//        DateTimeFormatter.ofPattern("yyy-MM-dd");
//
//        for(Map.Entry<String,Integer> me:map.entrySet()){
//            System.out.println(me.getKey() + " --> " + me.getValue()) ;
//        }
//
//        map.forEach((key, value) -> {
//            System.out.println(key + ":" + value);
//        });



    }
}
