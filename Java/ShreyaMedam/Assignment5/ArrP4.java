//4 wap to print max and minimum value in given array

package ShreyaMedam.Assignment5;

import java.util.Scanner;

public class ArrP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the " + size + " elements in array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element for "+i+" index :");
            arr[i] = sc.nextInt();
        }
        int MIN=Integer.MAX_VALUE;
        int MAX=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
            if (arr[i]<MIN)
                MIN = arr[i];
            if (arr[i]>MAX)
                MAX = arr[i];
        }
        System.out.println("Maximum value of array is :"+MAX);
        System.out.println("Minimum value of array is :"+MIN);
    }
}
