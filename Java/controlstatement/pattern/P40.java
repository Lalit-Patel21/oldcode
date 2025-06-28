//*
//**
//****
//*******
//***********

package controlstatement.pattern;

import java.util.Scanner;

public class P40 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

//        System.out.print("Enter a number of rows : ");
//        int rows = kb.nextInt();
//
//        System.out.print("Enter a number of columns : ");
//        int columns = kb.nextInt();

        int a=1;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 11; j++)
            {
                if (j <= a)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            a=a+i;
        }
    }
}
