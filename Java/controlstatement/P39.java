//39) WAP to check whether entered number is strong or not
package controlstatement;

import java.util.Scanner;

public class P39 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

        int m=n,temp,fact,str=0;

        while (m != 0) {

            temp=m % 10;
            fact=1;
            while(temp!=1)
            {
                fact=fact*temp--;
            }
            System.out.println("fact  : "+fact);
            str=str+fact;
            m = m / 10;
        }
        System.out.println(str+" check is a strong number or not?");

        if(n==str)
        {
            System.out.println(n+" is a strong number");
        }
        else {
            System.out.println(n+" is not a strong number");
        }
    }
    }
