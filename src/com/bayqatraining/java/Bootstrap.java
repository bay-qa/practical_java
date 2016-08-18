package com.bayqatraining.java;


public class Bootstrap {

    public static void main(String[] args) {

        String value = System.getenv("MY_ENV_VAR");
        System.out.println(value);


        switch (value) {
            case "Day1":
                Variables primitieves = new Variables();
                primitieves.commonPrimitives();
                primitieves.checkForIntegerBounds(2147483647);
                primitieves.currencySum();
                primitieves.mathematicalOperations();
                primitieves.booleanExamples();
                break;
            case "Day2":
                StringExamples newStrings = new StringExamples();
                newStrings.findString();
                break;

            default:
                throw new IllegalArgumentException("Invalid class of : " + value);
        }

    }


}