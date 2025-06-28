//1
//12
//123
//1234
//12345
//1234
//123
//12
//1
package controlstatement.pattern;

public class P77 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++)
            {
                System.out.print(j);
                if(j==5)
                {
                    System.out.println();
                    for (int k = j-1; k>=1 ; k--)
                    {
                        for (int l = 1; l<=k; l++)
                        {
                            System.out.print(l);
                        }
                        System.out.println();
                    }
                }

            }
            System.out.println();
        }

    }
}
