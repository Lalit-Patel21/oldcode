//13) WAP to print N natural numbers in reverse order
package controlstatement;

import java.util.Scanner;

public class P13 {
    public static void main(String []args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Value of N : ");
        int n = kb.nextInt();
        System.out.println(n + " Natural numbers in reverse order are given below: ");

        while(n!=0){
            System.out.print(n+" ");
            n--;
        }

    }

}
