package org.example;

import javax.swing.*;
import java.util.Scanner;
//count vowel and cosonant from string
public class CountVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String=");
        String str= scanner.next();
        getCount(str);
    }

    private static void getCount(String str) {
        if (!str.isEmpty())
        {
            char[] chr = str.trim().toLowerCase().toCharArray();
            int vowel = 0;
            int consonant = 0;
            for (int i = 0; i < chr.length; i++) {
                if (chr[i] == 'a' || chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o' || chr[i] == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
            System.out.println("In string total vowel : " + vowel + " and Consonants are : " + consonant);

        }
        else
        {
            System.out.println("String is empty");
        }
    }

}
