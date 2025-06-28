//34) WAP to check whether entered number is perfect or not
package controlstatement;

import java.util.Scanner;

public class P34 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

        System.out.print("Factor of " + n + " are: ");

        int i = 1,sumf=0;
        while (i <= n-1) {
            if (n % i == 0) {
                sumf=sumf+i;
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        if(sumf==n)
            System.out.print(n + " is a perfect number ");
        else
            System.out.print(n + " is not a perfect number");

    }

}
