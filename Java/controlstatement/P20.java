//20) 0	7	14	21	28	35	…..
package controlstatement;

import java.util.Scanner;

public class P20 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Up to how Many term you want to sum :");
        int n = kb.nextInt();

        int i = 1;
        int sum=0;
        while (i <= n ) {

            System.out.print(sum+" ");
            sum=sum+7;
            i++;
        }
        System.out.print("........ n terms");
    }
}
