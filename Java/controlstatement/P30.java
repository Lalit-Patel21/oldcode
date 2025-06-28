//30) 1+11+111+1111+11111+….
package controlstatement;

import java.util.Scanner;

public class P30 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Up to how Many term you want to sum :");
        int n = kb.nextInt();

        int i = 1,j=1,sum=0;
        while (i<= n) {

            sum=sum+j;
            System.out.print(j+"+");
            j=j*10+1;
            i++;
        }
        System.out.print("........ "+n+"th terms");
        System.out.print(" = "+sum);

    }
}
