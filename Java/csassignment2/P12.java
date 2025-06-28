//12.A 4 digit number is entered through keyboard.
// Write a program to print a new number with digits reversed as of orignal one. E.g.-
//INPUT : 1234        OUTPUT : 4321
//INPUT : 5982        OUTPUT : 2895
package csassignment2;

import java.util.Scanner;

public class P12 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter A 4-digit number : ");
        int n = kb.nextInt();

        int rev=0;

        while(n!=0){

            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.print("Reverse of a 4-digit number is  : "+rev);

    }
}
