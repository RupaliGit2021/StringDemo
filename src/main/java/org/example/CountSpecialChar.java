package org.example;

import java.util.Scanner;

public class CountSpecialChar {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String ");
        String str = scanner.nextLine();
        getCountOfSpecialChar(str);


    }

    private static void getCountOfSpecialChar(String str) {
        // char [] chr= str.trim().toCharArray();
        int i;
        int count = 0;
        if (!str.isEmpty())
        {
            for (i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).matches("[A-Za-z0-9]"))
                // if((chr[i]>='a' && chr[i]<='z')||(chr[i]>='A' && chr[i]<='Z')|| (chr[i]>='0'&& chr[i]<='9'))
                {
                    continue;

                } else {
                    count++;
                }

            }
            System.out.println("Total special character in String = " + count);
        }
        else
            System.out.println("Empty String");
    }
}
