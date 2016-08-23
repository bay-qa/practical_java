package com.bayqatraining.java;

/**
 * Created by idorovskikh on 8/22/16.
 */
class MethodOverloading {
//  1.  Define all variables on class level
    String searchElement = "@main_search";
//    hex number
    int searchElementId = 0x7f0b0088;

    String s1 = "1";
    String s2 = "2";
    String s3 = "3";


    MethodOverloading(){

        System.out.println("Find element " + isDisplayed(searchElement));
        System.out.println("Find element " + isDisplayed(searchElementId));

        System.out.println("The answer is " + addValues(s1, s2));
        System.out.println("The answer for 3 values is " + addValues(s1, s2, s3));

    }

    static boolean isDisplayed(String element) {
        return (element.equals("@main_search") );
    }

    static boolean isDisplayed(int element) {
        return  (element == 2131427464);
    }

    static double addValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return  result;
    }

    static double addValues(String s1, String s2, String s3){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);
        double result = d1 + d2 + d3;
        return  result;
    }
}
