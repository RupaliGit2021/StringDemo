package org.example;

import java.util.Scanner;
//sorting string alphabetically

public class SortString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter string = ");
        String str=scanner.next();
        getSorted(str);

    }

    private static void getSorted(String str)
    {
        char [] chr= str.trim().toLowerCase().toCharArray();
        char temp;
        int i,j;
        for(i=0;i<chr.length;i++)
        {
            for(j=i+1;j<chr.length;j++)
            {
                if(chr[i]>chr[j])
                {
                    temp=chr[i];
                    chr[i]=chr[j];
                    chr[j]=temp;
                }
            }

        }
        System.out.print(chr);
    }
}
