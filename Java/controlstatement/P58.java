//58) WAP to convert decimal number into binary number without using array
package controlstatement;

import java.util.Scanner;

public class P58 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a Decimal number : ");
        int n = kb.nextInt();

        System.out.println("Binary number of "+n+" are :");
        while(n!=0) {
        System.out.print(n%2);
        n = n / 2;

       }
    }
}
