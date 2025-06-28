//17) 1 	2	 4	 7	 11	 16 	…… n terms
package controlstatement;

import java.util.Scanner;

public class P17 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("How Many term you want to print :");
        int n = kb.nextInt();

        int i=1,sum=1;
        while(i<=n)
        {
            System.out.print(" "+(sum));
            sum=sum+i;
            i++;
        }
        System.out.print("........ n terms");
    }
}
