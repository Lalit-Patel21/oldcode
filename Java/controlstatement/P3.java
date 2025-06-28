//Programs | Class Room Assignment-5
//3) WAP to find out the sum of N natural number.
package controlstatement;

import java.util.Scanner;

public class P3 {
    public static void main(String []args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Value of N : ");
        int n = kb.nextInt();
        int i = 1,sum=0;
        while(i<=n){
//            System.out.println(i);
            sum=sum+i;
            i++;
        }
        System.out.print("Sum of "+n+" Natural Number is : "+sum);


    }
}

