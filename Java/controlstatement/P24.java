//24) 0	4	16	36	64	….. 1 2 3 4 5 6 7 8
package controlstatement;

import java.util.Scanner;

public class P24 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Up to how Many term you want to sum :");
        int n = kb.nextInt();

        int i = 0, j = 1,k=1;
        while (j <= n) {
            if (i % 2 == 0) {
                System.out.print((i * i) + " ");
                j++;
            }
            i++;
        }
        System.out.print("........");
        while (k <= n) {
            System.out.print((k) + " ");
            k++;
        }

    }
}
