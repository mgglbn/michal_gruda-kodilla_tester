package com.kodilla.parametrized_tests;

import java.util.Locale;

public class StringManipulator {
    public String reverseWithLowerCase(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString().toLowerCase();
    }

    public int getStringLengthWithoutSpaces(String input) {
        String string = input.replaceAll(" ","");
        return string.length();
    }

    public int countNumberOfCommas(String input){
        return input.length() - input.replaceAll(",","").length();
    }
}