package arrayex;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n,i;

        System.out.print("Enter array size : ");
        n = kb.nextInt();
        int [] arr;
        arr=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter an no.");
            arr[i]=kb.nextInt();

        }
        int sum=0;
        for (i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            sum=sum+arr[i];

        }
        System.out.println("sum is "+ sum );
        System.out.println("avg is :" +(float)sum/n);
    }
}
