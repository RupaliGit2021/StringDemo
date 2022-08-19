package org.example;

import java.util.Arrays;
import java.util.Scanner;

/*
 print Repeated occurring character in the given string
 */
public class RepeatedChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String= ");
        String str=scanner.nextLine();
        getRepeatedChar(str);

    }     //asddff

    private static void getRepeatedChar(String str)
    {
        char[] chr = str.trim().toCharArray();
        Arrays.sort(chr);
        int i, j;
        int count = 0;
        for (i = 0; i < chr.length; i++)
        {

            for (j = i + 1; j < chr.length; j++)      //caanffmmsd     aacdffmmn
            {
                if (chr[i] == chr[j])
                {
                    count++;
                    i=j;
                }
                else
                    continue;
            }
             if (count > 0 && chr[i]!=' ')
             {
                    System.out.print(chr[i]);

             }

        }


     }

    }
