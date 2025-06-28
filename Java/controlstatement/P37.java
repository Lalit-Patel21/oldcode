//37) WAP to check whether entered number is palindrome or not
package controlstatement;

import java.util.Scanner;

public class P37 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

        int temp=n;

        System.out.print("Reverse number of " + n + " is : ");

        int count = 0, rev = 0;
        while (n != 0) {

            rev = rev * 10 + n % 10;
            n = n / 10;

        }
        System.out.println(rev);
        if(rev==temp)
        {
            System.out.println(temp+" is a palindrome number");
        }
        else {
            System.out.println(temp+" is not a palindrome number");
        }
    }
}
