package assignment2;

import java.util.Scanner;

public class As1
{
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int baseN,power;
        System.out.print("Enter the base number:");
        baseN=kb.nextInt();
        System.out.print("Enter the power:");
        power=kb.nextInt();
        int result=1;
        for(int i = 1; i<=power; i++)

            result = result*baseN;

        System.out.println("Result:"+ result);
    }
}
