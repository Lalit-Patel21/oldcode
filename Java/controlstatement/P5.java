//Programs | Class Room Assignment-5
//5) WAP to find out the factorial of a number.
package controlstatement;

import java.util.Scanner;

public class P5 {
    public static void main(String []args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

        System.out.println("Factorial of "+n+" are: ");

        int fact=1;
        while(n!=0){
             fact=fact*n--;
        }
        System.out.print(fact);
    }
}



