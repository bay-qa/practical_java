package com.bayqatraining.java;

import java.util.*;

/**
 * Created by idorovskikh on 8/22/16.
 */
class DataCollections {
    String[]  months = {"January", "February", "March", "April" ,"May", "June", "July", "August", "September", "October", "November", "December" };
    static List<String> list = new ArrayList<>();
    static Map<String, String> map = new HashMap<>();

    DataCollections() {

        basicArraryIteration(months);
        initArrayList();
        initHashMap();
        itirateArrayList();
        itirateHashMap();
    }


    static void basicArraryIteration( String[] months) {

        System.out.println(months[0]);
        for (int i = 0; i < months.length ; i++) {
            System.out.println(months[i ]);
        }

    }

    static void initArrayList() {
        list.add("California");
        list.add("Oregon");
        list.add("Washington");
        System.out.println(list);
//        read
        System.out.println(list.get(1));
//        remove
        list.remove(0);
        System.out.println(list);
    }

    static void initHashMap(){
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");

        System.out.println(map);

        map.put("New York", "Albany");

//        order is nor guaranteed
        System.out.println(map);

        String capital = map.get("Oregon");
        System.out.println(capital);

        map.remove("California");
        System.out.println(map);
    }


    static void itirateArrayList(){
        for (String item:list) {
            System.out.println(item);
        }
    }

    static void itirateHashMap(){
        Set<String> keys = map.keySet();

        for (String key:keys) {
            System.out.println("The capitol of " + key + " is " + map.get(key));
        }
    }


}
