package org.example;
/*
Anagram another string form from one string
 */
import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string1 = ");
        String str1= scanner.next();
        System.out.println("Enter String2 =");
        String str2=scanner.next();
        isAnagram(str1,str2);
    }

    private static void isAnagram(String str1, String str2)
    {
        int count=0;
        char[] chr1=str1.toCharArray();
        char[] chr2=str2.toCharArray();
        Arrays.sort(chr1);
        Arrays.sort(chr2);
       int size1= chr1.length;
       int size2=chr2.length;
       if(size1==size2)
       {
           for (int i = 0; i < chr1.length; i++) {
               if (chr1[i] == chr2[i]) {
                   count++;
               }

           }
           if (count == size1) {
               System.out.println("String is Anagram");
           }
       }
           else
               System.out.println("Not an Anagram");
       }
       }



