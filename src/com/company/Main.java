package com.company;

import java.util.HashMap;

public class Main {

    public static void pagerDecoder(String phoneNumber) {
        HashMap<Character, Character> numberMap = new HashMap<>();
        numberMap.put('0', '5' );
        numberMap.put('1', '9' );
        numberMap.put('2', '8' );
        numberMap.put('3', '7' );
        numberMap.put('4', '6' );
        numberMap.put('5', '0' );
        numberMap.put('6', '4' );
        numberMap.put('7', '3' );
        numberMap.put('8', '2' );
        numberMap.put('9', '1' );


        //create array out of the input of phone number
        char[] receiveNumber = new char[7];

        //loop through hashmap to see if a key matches each part of the phone number
        // and add value to receive number array
        for (int i = 0; i < phoneNumber.length(); i++) {
            char key = phoneNumber.charAt(i);
            if (numberMap.containsKey(key)) {
                receiveNumber[i] = numberMap.get(key);
            }
        }

        System.out.println(receiveNumber);

    }

    public static void main(String[] args) {

        pagerDecoder("7143432");


    }
}
