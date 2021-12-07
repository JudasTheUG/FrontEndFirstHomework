package com.ugurgelec.example;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        String originalValue, reverseValue = "";
        Scanner enteredValue = new Scanner(System.in);
        System.out.println("Enter a word or sentence to check if it is a palindrome");
        originalValue = enteredValue.nextLine();
        for ( int i = originalValue.length() - 1; i >= 0; i-- )
            reverseValue = reverseValue + originalValue.charAt(i);
        if (originalValue.equals(reverseValue))
            System.out.println("Word or sentence you entered is ... \n wait for it ... \n a PALINDROME");
        else
            System.out.println("Word or sentence you entered is ... \n wait for it ... \n NOT a PALINDROME");
    }
}
