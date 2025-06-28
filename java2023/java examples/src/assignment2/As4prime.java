package assignment2;

import java.util.Scanner;

public class As4prime {
    public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);
        int num,i,m;
        System.out.println("Enter the positive integer: ");
        num=kb.nextInt();
        m=(int)Math.sqrt(num);


        for(i=2 ; i<=m ; i++ )
        {
            if(num%i==0)
            {
                break;

            }
        }
        if(i==m+1)
            System.out.println(num+" is a prime number");
        else
            System.out.println(num+" is not a prime number ");

    }
}
