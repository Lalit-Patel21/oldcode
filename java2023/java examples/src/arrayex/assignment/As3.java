package arrayex.assignment;

import java.util.Scanner;

public class As3 {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int[] arr;
        arr = new int[10];
        int flag = 0;
        System.out.print("Enter the Array elements: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = kb.nextInt();
        }
        System.out.print("Enter a number to search :");
        int n = kb.nextInt();

        for (int x:arr)
        {
            if (x == n)
                flag++;
        }
        if(flag==0)
            System.out.println("element not present in array ");
        else
            System.out.println("element present in array ");
    }
}