package assignment2;

import java.util.Scanner;

public class As5Hcf {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter first number:");
        int num1 = kb.nextInt();

        System.out.print("Enter Second number:");
        int num2 = kb.nextInt();

        int gcd=1;

        for(int i=1;i<= num1&&i<=num2;i++ )
        {
            if(num1%i==0 && num2 % i==0)
                gcd = i;

        }
        System.out.println("Gcd="+gcd);

    }
}
