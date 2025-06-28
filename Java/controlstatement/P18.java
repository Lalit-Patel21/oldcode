//18) 1	 2	2	4	8	32	…… n terms
package controlstatement;

import java.util.Scanner;

public class P18 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("How Many term you want to print :");
        int n = kb.nextInt();

        int i = 1;
        long a=1,b=2,mul;

        System.out.print(a+" "+b);

        while (i<n-1) {
            mul = a * b;
            System.out.print(" " + (mul));
            a=b;
            b=mul;
            i++;
        }
        System.out.print("........ n terms");
    }
}
