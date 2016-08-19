package com.bayqatraining.java;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by idorovskikh on 8/17/16.
 */
class StringExamples {

    StringExamples(){
        stringBuilder();
//        typeAhead();
        convertingToString();
        compateStrings();
        parsingString();
    }

    private void stringBuilder(){
        String protocol = "http://";
        String domain = "bayqatraining.com";

        String url = protocol + domain;
        System.out.println(url);


        StringBuilder coolURL =  new StringBuilder()
            .append("http://")
            .append("bayqatraining.com");

        System.out.println(coolURL);


    }

//    perfect example for autocomplete test automation
    private void typeAhead(){
        String searchTerm = "Los Angeles";

        char[] autocomplete = searchTerm.toCharArray();
        for(char character : autocomplete) {
            System.out.println(character);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void convertingToString(){
        int intValue = 40;
        String fromInt = Integer.toString((intValue));
        System.out.println(fromInt);

        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

//        Java 7 and above

//        if you want to get currency for diff country
        Locale locale = new Locale("de", "GR");

        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);

        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        String currency = currencyInstance.format(longValue);
        System.out.println(currency);
    }


    private void compateStrings(){
        String string1 = "San ";
        String string2 = "Francisco";

        String actual = string1 + string2;

        String expected = "San Francisco";
        if (actual.equals(expected)) {
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }

    private  void parsingString(){
        String domain = "www.bayqatraining.com";

        System.out.println("Lenght of domain is " + domain.length());

        int position = domain.indexOf("com");
        System.out.println("Position of substring " + position);

        String sub = domain.substring(position);
        System.out.println(sub);

        String newDomain = domain.replace("com", "us");
        System.out.println(newDomain);
    }
}
