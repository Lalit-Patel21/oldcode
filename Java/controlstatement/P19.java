//19) 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)
package controlstatement;

import java.util.Scanner;

public class P19 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Up to how Many term you want to sum :");
        int n = kb.nextInt();

        int i = 1;
        double sum=0;
        while (i <= n ) {

            sum=sum+1.0/i;
            System.out.print(sum);
            i++;
        }
        System.out.print(sum);

    }
}
