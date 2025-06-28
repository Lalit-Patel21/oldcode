package arrayex.assignment;

import java.util.Scanner;

public class As2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = kb.nextInt();

        int[] arr;
        arr = new int[n];
        System.out.print("Enter the Array elements: ");
        int max = 0, min ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }
          max = min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
                max=arr[i];

            if (arr[i]< min)
             min = arr[i];
       }
        System.out.println("The maximum value of given array is :"+max);
        System.out.print("The minimum value of given array is :"+min);
    }
}

