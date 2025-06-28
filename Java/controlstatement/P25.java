//25) 1	27	125	343	…………
package controlstatement;

import java.util.Scanner;

public class P25 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Up to how Many term you want to sum :");
        int n = kb.nextInt();

        int i = 0, j = 1;
        while (j <= n) {
            if (i % 2 == 1) {
                System.out.print((i * i * i) + " ");
                j++;
            }
            i++;
        }
        System.out.print("........ n terms");
    }
}
