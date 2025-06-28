package sachin;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int n;
        int []arr;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array");
        n=kb.nextInt();
        arr=new int[n];
        System.out.println("Enter "+n+ " nos");
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+(float)sum/n);
    }
}
