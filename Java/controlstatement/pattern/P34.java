package controlstatement.pattern;

import java.util.Scanner;

public class P34 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number of rows : ");
        int rows = kb.nextInt();

        System.out.print("Enter a number of columns : ");
        int columns = kb.nextInt();

        char ch = 'E';
        for (int i = rows; i >= 1; i--)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
            ch--;
        }
        }
    }

