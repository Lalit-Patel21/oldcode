package arrayex.assignment;

import java.util.Scanner;

public class As6 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        int sum=0,prod=1;
        System.out.println("Enter the Array arr elements: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = kb.nextInt();
            sum+=arr[i];
            prod*=arr[i];
        }
        System.out.println("sum of the all Array elements is :"+sum);
        System.out.println("product of the all the Array elements is :"+prod);
    }
}
