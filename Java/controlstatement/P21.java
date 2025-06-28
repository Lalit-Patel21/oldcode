//21) 1,	4,	9,	16,	25	…..
package controlstatement;

import java.util.Scanner;

public class P21 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Up to how Many term you want to sum :");
        int n = kb.nextInt();

        int i = 1;
        while (i <= n) {

            System.out.print((i * i) + " ");
            i++;
        }
        System.out.print("........ n terms");
    }
}
