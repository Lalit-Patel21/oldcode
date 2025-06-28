//35) WAP to count number of digits
package controlstatement;

import java.util.Scanner;

public class P35 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

        System.out.print("total number of digits in " + n + " are: ");

        int count = 0;
        while (n != 0) {

            n = n / 10;
            count++;
        }
        System.out.print(count);
    }
}
