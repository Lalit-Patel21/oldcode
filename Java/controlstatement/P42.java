//42) WAP to find out HCF of a number
package controlstatement;

import java.util.Scanner;

public class P42 {
    public static void main(String []args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

        System.out.print("Enter a number : ");
        int m = kb.nextInt();

        boolean temp = true;

        int i = 2;

        while(temp)
        {
            if((n%i==0) && (m%i==0))
            {
                System.out.println("Hcf of "+n+ " and "+m+ " are : "+i);
                temp=false;
//                    break;
            }
            i++;
        }

    }
        }


