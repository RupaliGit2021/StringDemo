package org.example;

/*
reverse a string while preserving the position of the words
 */
import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence = ");
        String str=scanner.nextLine();
        getReverseButPreservePosition(str);

       // twice text     eciwt txet
    }

    private static void getReverseButPreservePosition(String str) {
        //split sentence using space
        String[] str1=str.split(" ");
        //count array size of splitted sentence
        int sz=str1.length;

        for(int i=0;i<sz;i++)
        {
            //position wise words length
            int size=str1[i].length();
            // words store in character array
            char[] chr=str1[i].toCharArray();
            for(int j= (chr.length-1);j>=0;j--)
            {
                System.out.print(chr[j]);
            }
            System.out.print(" ");

        }

    }
}
