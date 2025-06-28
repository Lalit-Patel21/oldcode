//31) 9	99	999	9999	  99999 …….
package controlstatement;

import java.util.Scanner;

public class P31 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Up to how Many term you want to sum :");
        int n = kb.nextInt();

        int i = 1;
        long j = 10;
        while (i <= n) {

            System.out.print((j-1) + " ");
            j = j * 10 ;
            i++;
        }
        System.out.print("........ "+n+"th terms");
    }
}
