package com.bayqatraining.java;

import java.math.BigDecimal;

/**
 * Created by idorovskikh on 8/18/16.
 */

public class Variables {

    private static boolean booleanDefault;

    public void commonPrimitives(){
        int numberOfStudents = 5;
        double exchangeRateUSD = .96;
        float f = 1.445454545f;
        long l = 1000000000000L;

        System.out.println("My integer is  "  + numberOfStudents);
        System.out.println("My double is  "  + exchangeRateUSD);
        System.out.println("My float is  "  + f);
        System.out.println("My long is  "  + l);
    }

    public void checkForIntegerBounds( int b) {

        if (b < Integer.MAX_VALUE) {
            b++;
        }

        System.out.println("Integer " + b);
    }

    //    very important for accounting testing
    public void currencySum() {
        double fee = .012;
        double total = fee + fee + fee;
        System.out.println("Total money " + total );


        String feeStringValue = Double.toString(fee);
        System.out.println("String value " + feeStringValue);

        BigDecimal bigValue = new BigDecimal(feeStringValue);
        BigDecimal sum = bigValue.add(bigValue).add(bigValue);

        System.out.println(sum);
    }

    public void mathematicalOperations(){
        int value1 = 56;
        int value2 = 42;

//        TODO: divide value1/value2 and store result in double variable
//        TODO: find a remainder

        double resultOfDivision = (double) value1 / value2;
        System.out.println("Division " + resultOfDivision);

        double remainder = (double) value1 % value2;
        System.out.println("Remainder " + remainder);

    }

    public void booleanExamples(){
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(booleanDefault);

        boolean b3 = !b1;
        System.out.println(b3);

        String strBoolean = "true";
        boolean parsedBoolean = Boolean.parseBoolean(strBoolean);
        System.out.println(parsedBoolean);

    }
}
