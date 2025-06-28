//16. W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit.
// For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’
// then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit.

package csassignment2;

import java.util.Scanner;

public class P31 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

//        System.out.println("If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius.)
//        System.out.println("If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit ");

        System.out.println(" enter today temperature  :");
        int temp = kb.nextInt();
        System.out.print("enter your choice in which unit you want to convert today temperature (f or c):");
        char choice = kb.next().charAt(0);

        switch (choice) {
            case 'c':
            case 'C':
                double C = (temp-32)*5/9.0;
                System.out.println(" today temperature in Celsius is  :"+C);
                break;

            case 'f':
            case 'F':
                double F = (9/5.0)*temp+32;
                System.out.println(" today temperature in Fahrenheit is  :"+F);
                break;

            default:
                System.out.println("Invalid Choice ");
        }
    }
}
