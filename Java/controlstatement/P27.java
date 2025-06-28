//27) *	#	*	#	*	#	*	#	*	…….
package controlstatement;

import java.util.Scanner;

public class P27 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Up to how Many term you want to sum :");
        int n = kb.nextInt();

        int i = 1;
        while (i <= n) {
            if (i % 2 == 1) {
                System.out.print("*  ");
            }else{
                System.out.print("#  ");
            }
            i++;
        }
        System.out.print("........ n terms");
    }
}
