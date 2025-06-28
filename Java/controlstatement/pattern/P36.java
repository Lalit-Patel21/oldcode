package controlstatement.pattern;

import java.util.Scanner;

public class P36 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number of rows : ");
        int rows = kb.nextInt();

        System.out.print("Enter a number of columns : ");
        int columns = kb.nextInt();


        for (int i = 5; i >= 1; i--)
        {
            int ch = 'A';
            for (int j = 1; j <= i; j++)
            {
                if(i==j || i==5 || j==1) {
                    System.out.print((char)(ch++));
                }
                else {
                    System.out.print(" ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
