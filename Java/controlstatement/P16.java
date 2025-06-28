//16) …... -6	-3	0	3	6	9	……. n terms
package controlstatement;

import java.util.Scanner;

public class P16 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("How Many term you want to print :");
        int n = kb.nextInt();
//        int i=n/2,term;
//        while(i>=0)
//        {
//            term=i*(-3);
//            System.out.print(term+" ");
//            i--;
//        }
//        int j=1,termp;
//        while(j<=n/2)
//        {
//            termp=j*3;
//            System.out.print(" "+termp);
//            j++;
//        }

        int i=-n;
        while(i<=n)
        {
            if(i%3==0)
            {
                System.out.print(" "+(i));
            }
            i++;
        }
        System.out.print("........ n terms");
        }
    }

