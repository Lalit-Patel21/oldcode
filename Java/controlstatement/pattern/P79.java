package controlstatement.pattern;

public class P79 {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (j == i || j == 1 )
                    System.out.print(j);
                else
                    System.out.print(" ");

            }
            System.out.println();
        }


        for (int i = 4; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                if (j == i || j == 1 )
                    System.out.print(j);
                else
                    System.out.print(" ");

            }
            System.out.println();
        }

        }

    }
