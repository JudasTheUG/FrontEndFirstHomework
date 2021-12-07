package com.ugurgelec.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Locale trlocale= Locale.forLanguageTag("tr-TR");

        String originalValue , reverseValue ;
        boolean continueOrNot= true;
        Scanner enteredValue = new Scanner(System.in);
        System.out.println("Here is some PALINDROME examples \n Al kazık çak karaya kayarak kaç kızakla \n Do geese see God \n kütük \n bob");
        while (continueOrNot)
        {
                reverseValue = "";

                System.out.println("Enter a word or sentence to check if it is a palindrome");
                originalValue = enteredValue.nextLine().toUpperCase(trlocale);

                for (int i = originalValue.length() - 1; i >= 0; i--) {
                    reverseValue += originalValue.charAt(i);
                }
                originalValue = originalValue.replace(" ", "").trim();
                reverseValue = reverseValue.replace(" ", "").trim();
                if (originalValue.equals(reverseValue)) {
                    System.out.println("Word or sentence you entered is ... \n ... wait for it ... \n  a PALINDROME!!!");
                } else {
                    System.out.println("Word or sentence you entered is ... \n ... wait for it ... \n NOT a PALINDROME!!!");
                }

                System.out.println("Do you want to continue?\n 0 for NO \n 1 for Yes");
                continueOrNot= !enteredValue.nextLine().equals("0");

        }
    }
}
