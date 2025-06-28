//7) WAP to check whether entered number is prime or not.
package controlstatement;

import java.util.Scanner;

public class P7 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

        int i = 2;
        while (i <= n/2) {
            if (n%i==0) {
                System.out.print(n +" is not a Prime Number  ");
                break;
            }
            i++;
        }
        if(i==n/2+1)
            System.out.print(n +" is a Prime Number  ");
//        else
//            System.out.print(n +" is not a Prime Number  ");
    }
}
