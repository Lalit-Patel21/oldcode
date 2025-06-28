//Programs | Class Room Assignment-5
// 6) WAP to find out the factors of a number.
package controlstatement;

import java.util.Scanner;

public class P6 {
    public static void main(String []args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = kb.nextInt();

        System.out.print("Factor of "+n+" are: ");

        int i=1;
        while(i<=n){
            if(n%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}



