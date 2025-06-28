//40) WAP to count no. Of even and odd digits in a number
package controlstatement;

import java.util.Scanner;

public class P40 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

        int noevend=0,nooddd=0,temp,m=n;

        while (n!= 0)
        {
            temp=n % 10;
            if(temp%2==0)
                noevend++;
            else
                nooddd++;
            n = n / 10;
        }

        System.out.println(noevend+" even digit and "+  nooddd+" odd digit in number "+m);

    }
    }
