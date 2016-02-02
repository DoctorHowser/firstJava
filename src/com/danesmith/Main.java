package com.danesmith;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5;
        float myFloatValue = 5f/3f;
        double  myDoubleValue = 5d/3d;

        System.out.println("Int value : " + myIntValue);
        System.out.println("Float value : " + myFloatValue);
        System.out.println("Double value : " + myDoubleValue);


        double pounds = 5d;
        double kilos = pounds * 0.45359237;
        System.out.println(kilos);

        char myChar = '@';
        char unicode = '\u00D0';
        System.out.println(unicode);

        boolean myBoolean = true;
        char armenian = '\u0531';
        System.out.println(armenian);
    }
}
