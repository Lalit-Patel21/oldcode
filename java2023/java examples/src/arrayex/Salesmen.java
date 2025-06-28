package arrayex;
import java.util.*;

public class Salesmen {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println(" How many sales men ?");
        int salesmen = kb.nextInt();
        int[][] arr = new int[salesmen][];
        for (int i = 0 ; i < arr.length; i++)
        {
            System.out.println("How many sales done by sales men " + (i + 1));
            arr[i] = new int[kb.nextInt()];
            System.out.println("Enter sales  values of " + (i + 1) + ": ");
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = kb.nextInt();
            }
        }
            for (int i = 0 ; i < arr.length; i++)
            {
                int sum=0;
                int j;
                for ( j = 0; j < arr[i].length; j++)
                {
                    sum = sum + arr[i][j];
                }
                System.out.println(" average sale of sales men "+(i+1)+" is "+ (float)sum/j);
            }
        }
    }


      /*  Scanner kb = new Scanner(System.in);
        System.out.print(" How many sales men ? :");
        int  n = kb.nextInt();
        int[][] arr = new int[n][];
        //double []avg = new double[0];
        for (int i = 0 ; i < arr.length; i++)
        {
            System.out.print("How many sales done by sales men " + (i + 1)+" :");
             int m= kb.nextInt();
             arr[i] = new int[m];

             int sum = 0;
            System.out.print("Enter sales  values : ");

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = kb.nextInt();

                sum = sum + arr[i][j];
                }
               // avg = new double[n];
                double avg = (float)sum /m;
            System.out.println("average sale of sales men "+(i+1)+" is "+ avg);

        }

    }
}*/

