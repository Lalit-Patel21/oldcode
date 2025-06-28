//3 wap to define an array of integer and assign value in program and print sum of all values

package ShreyaMedam.Assignment5;

import java.util.Scanner;

public class ArrP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter the " + size + " element in array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element for " + i + " index :");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        System.out.print(size+" Element of array are : ");
        for(int i: arr){
            sum=sum+i;
            System.out.print(i+" ");
        }
            System.out.println("\nSum of "+size +" elements of array :"+sum);
    }
}
