//28) 1	2	3	4	 Hello	6	7	8	9	Hello	11	12 ….
package controlstatement;

import java.util.Scanner;

public class P28 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Up to how Many term you want to sum :");
        int n = kb.nextInt();

        int i = 1;
        while (i <= n) {
            if (i % 5 == 0) {
                System.out.print("Hello ");
            }
            else{
                System.out.print(i +" ");
            }
            i++;
        }
        System.out.print("........ n terms");
    }
}
