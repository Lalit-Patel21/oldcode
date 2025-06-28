//26) 0	8	64	216	…………
package controlstatement;

import java.util.Scanner;

public class P26 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Up to how Many term you want to sum :");
        int n = kb.nextInt();

        int i = 0, j = 1;
        while (j <= n) {
            if (i % 2 == 0) {
                System.out.print((i * i * i) + " ");
                j++;
            }
            i++;
        }
        System.out.print("........ n terms");
    }
}
