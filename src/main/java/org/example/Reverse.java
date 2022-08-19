package org.example;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string =");
        String str=scanner.next();
        getReverseString(str);
    }

    private static void getReverseString(String str) {
        int size=str.trim().length();
        char [] chr=str.toCharArray();
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(chr[i]);
        }

    }
}
