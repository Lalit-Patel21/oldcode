//41) WAP to find out LCM of two number
package controlstatement;

import java.util.Scanner;

public class P41 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int n = kb.nextInt();

        System.out.print("Enter second number : ");
        int m = kb.nextInt();

        boolean temp=true;

        if(n>=m)
        {
            int i=m;
            while(temp)
            {
                if((i%n==0) && (i%m==0))
                {
                    System.out.println("Lcm of "+n+ " and "+m+ " are : "+i);
                    temp=false;
//                    break;
                }
                i++;
            }
        }
        else{
            int i=m;
            while(temp)
            {
                if((i%n==0) && (i%m==0))
                {
                    System.out.println("Lcm of "+n+ " and "+m+ " are : "+i);
                    temp=false;
//                    break;
                }
                i++;
            }
        }
     }
    }
