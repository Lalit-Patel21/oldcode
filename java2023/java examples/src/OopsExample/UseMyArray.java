package OopsExample;

import java.util.Scanner;

public class UseMyArray {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size=s.nextInt();
        int []arr;
        arr=new int[size];
        System.out.println("Enter the "+arr.length+" element of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        MyArray obj=new MyArray();

        double [] ans=obj.calculate(arr);
        System.out.println("sum is "+ans[0]);
        System.out.println("Average is "+ans[1]);
    }

}
