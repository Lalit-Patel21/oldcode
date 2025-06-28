//23) 1	9	25	49	81	…..
package controlstatement;

import java.util.Scanner;
public class P23 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Up to how Many term you want to sum :");
        int n = kb.nextInt();

//        int i=1,j=1;
//        while (j<=n) {
//            if(i%2==1) {
//                System.out.print((i * i) + " ");
//                j++;
//            }
//            i++;
//        }

        int i =1;
        while (i<=n) {
            System.out.print((i * i) + " ");
            i=i+2;
        }
        System.out.print("........ n terms");

    }
}
