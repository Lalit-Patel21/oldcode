//Programs | Class Room Assignment-5
//2) WAP to print N natural number.
package controlstatement;

import java.util.Scanner;

public class P2 {
    public static void main(String []args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Value of N : ");
        int n = kb.nextInt();
        System.out.println("Natural Number Up to " + n + " are given below: ");
        int i = 1;
        while(n!=0 ){
            System.out.print(i+" ");
            i++;
            n--;
        }

    }
}

