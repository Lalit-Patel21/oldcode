package controlstatement.pattern;

import java.util.Scanner;

public class P14 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number of rows : ");
        int rows = kb.nextInt();

        System.out.print("Enter a number of columns : ");
        int columns = kb.nextInt();

        int count=0;
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(count++);
            }
            System.out.println();
        }
    }
}
