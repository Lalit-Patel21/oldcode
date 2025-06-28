package sachin;

import java.util.Scanner;

public class JaggedArrayDemo {
    public static void main(String[] args) {
        int [][]arr=new int[3][];
        Scanner kb=new Scanner(System.in);
        arr[0]=new int[4];
        arr[1]=new int[3];
        arr[2]=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter value:");
                arr[i][j]=kb.nextInt();
            }
        }
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
                sum=sum+arr[i][j];
                ++count;
            }
            System.out.println();
        }
        System.out.println("Sum is "+sum);
        System.out.println("Avg is "+(float)sum/count);
    }
}

