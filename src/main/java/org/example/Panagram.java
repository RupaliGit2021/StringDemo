package org.example;

import java.util.Scanner;
/*
   Panagram all the character in the string are Alphabet only ignore caps and lower case
 */
public class Panagram{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter String = ");
       String str= scanner.next();
       isPanagram(str);

    }

    private static void isPanagram(String str)
    {
        int count=0;
        str.toLowerCase();
        char[] chr=str.toCharArray();
        for(int i=0;i<chr.length;i++)
        {

            if((chr[i]>='a')&&(chr[i]<='z'))
            {
               count++;
            }
        }
        if(count==chr.length)
        {
           System.out.println("String is Panagram");
        }
        else
            System.out.println("Not a Panagram");

    }
}
