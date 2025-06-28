package assignment2;

import java.util.Scanner;

public class As2reverse {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int num,temp,rev=0;
        System.out.print("Enter a number:");
        num=kb.nextInt();
        temp=num;
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;

    }
        System.out.println("Reversed of " +temp+" is : " + rev);
}
}
