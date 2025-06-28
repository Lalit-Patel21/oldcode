package arrayex.assignment;

import java.util.Scanner;

public class As10 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = kb.nextInt();

        int[] arr;
        arr = new int[n];
        System.out.print("Enter the Array elements: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = kb.nextInt();

        }
        for (int i : arr)
        {
            if(i%2==0)
                System.out.print(i+" ");
        }
        for (int i:arr)
            {
                if(i%2==1)
                    System.out.print(i+" ");
            }
    }
}
