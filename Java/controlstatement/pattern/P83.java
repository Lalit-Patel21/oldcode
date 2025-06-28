//*****
//*   *
//*   *
//*   *
//*   *
//*   *
//*   *
//*   *
//*   *
//*****
//
//
//
//**********
//**      **
//* *    * *
//*  *  *  *
//*   **   *
//*   **   *
//*  *  *  *
//* *    * *
//**      **
//**********
package controlstatement.pattern;

public class P83 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++)
        {
            for(int j=1;j<=5;j++) {
                if (j==5||j==1||i==1||i==10)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for (int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++) {
                if (j==10||j==1||i==1||i==10||i==j||i+j==11)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1)
                    System.out.print("_");
                else if (i == n)
                    System.out.print("-");
                else if (j == 1 || j == n)
                    System.out.print("|");
                else if (i == 3 && j == 3)
                    System.out.print("X");
                else if (i == j)
                    System.out.print("\\");
                else if (i + j == (n + 1))
                    System.out.print("/");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
