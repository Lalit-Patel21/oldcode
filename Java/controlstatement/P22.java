//22) 1	8	27	64	125	…..
package controlstatement;

import java.util.Scanner;

public class P22 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Up to how Many term you want to sum :");
        int n = kb.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print((i * i * i) + " ");
            i++;
        }
        System.out.print("........ n terms");
    }
}
