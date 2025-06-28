/*  1    
    2    
    3    
    4    
123454321
    4    
    3    
    2    
    1 */

package controlstatement.pattern;

public class P88 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                if (k == 5)
//                    System.out.print(i);
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

        int i, j, k = 2, p = 2;
        for (i = 1; i <= 9; i++)
        {
            for (j = 1; j <= 9; j++)
            {
                if (j == 5 && i <= 4)
                    System.out.print(i);

                else if (i == 5 && j <= 5)
                    System.out.print(j);
                else if (i == 5 && j>5)
                {
                    System.out.print(j - k);
                    k = k + 2;
                } else if (i > 5 && j == 5) {
                    System.out.print(i - p);
                    p = p + 2;
                } else
                    System.err.print(" ");

            }
            System.out.println();

       }
    }
}

