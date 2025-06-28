//5 wap to find and print even numbers in given array
package ShreyaMedam.Assignment5;

import java.util.Scanner;

public class ArrP5 {
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

        System.out.print(size+" Element of array are : ");
        for (int i:arr)
            System.out.print(i+" ");
        System.out.print("\nEven Number in given array are :");
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]%2==0)
                System.out.print(arr[i]+" ");
        }
    }

}
