//22. Write a Java program to check whether a number is divisible by 5 and 11 or not.
package csassignment2;

import java.util.Scanner;

public class P37 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number :");
        int n = kb.nextInt();

        if(n%5==0 && n%11==0)
        {
            System.out.println(n+" the number is divisible by 5 and 11 ");
        }
        else
        {
            System.out.println(n+" the number is not divisible by 5 and 11");
        }
    }
}
