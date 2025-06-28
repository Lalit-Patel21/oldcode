package sachin;

import java.util.Scanner;

public class TowDArrayDemo {
    public static void main(String[] args) {
        int [][]arr;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter wo and col size:");
        int r=kb.nextInt();
        int c=kb.nextInt();
        arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("Enter value:");
                arr[i][j]=kb.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
                sum=sum+arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum is "+sum);
        System.out.println("Avg is "+(float)sum/(r*c));
    }
}
