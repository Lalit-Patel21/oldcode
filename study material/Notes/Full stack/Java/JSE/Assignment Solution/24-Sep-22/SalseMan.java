package arrayexample;

import java.util.Scanner;

public class SalseMan {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int sum=0;
        System.out.println("How many salesman? ");
        int salseMan=kb.nextInt();
        int arr[][]=new int [salseMan][];

        for(int i=0;i<salseMan;i++)
        {
            System.out.println("How many salse by Salseman "+(i+1)+"? ");
            arr[i]=new int[kb.nextInt()];
            System.out.println("Enter sale value of "+(i+1));
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=kb.nextInt();
            }
        }
        for(int i=0;i<salseMan;i++)
        {
            int j;
            for(j=0;j<arr[i].length;j++)
            {
                sum+=arr[i][j];
            }
            System.out.println("Average sale of salseman "+(i+1)+" : "+(float)sum/j);
        }
    }
}
