//1 wap to define an array of integer of size 6 .Take input from user and display it in reverse order
//2 wap to ask 5 names from user and check if particular name exists in array or not .
//3 wap to define an array of integer and assign value in program and print sum of all values
//4 wap to print max and minimum value in given array
//5 wap to find and print even numbers in given array
package ShreyaMedam.Assignment5;

import java.util.Scanner;

public class ArrP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the " + size + " elements in array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element for " + i + " index :");
            arr[i] = sc.nextInt();
        }

        System.out.print(size+" Element of array are : ");
        for (int i:arr)
            System.out.print(i+" ");

        System.out.println("\narray " + size + " element in reverse order is given Below :");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}
