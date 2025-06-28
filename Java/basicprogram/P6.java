<<<<<<< HEAD
//Q.5 Find occurance of an integer number in array.
package arrayassignments1;

import java.util.Scanner;

public class P6 {

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

        System.out.print("\nEnter the element to check the occurrence of an given integer number in array : ");
        int n= sc.nextInt();

        int count=0;

        for (int i = 0; i < arr.length; i++)
        {
                if (arr[i]==n)
                {
                    count++;
                }
        }
        System.out.println("\nThe "+n+" element occurrence at "+count+" times in the above array" );

    }
}

=======
//6. Write a program to print absolute vlaue of a number entered by user. E.g.-
//INPUT: 1        OUTPUT: 1
//INPUT: -1        OUTPUT: 1
package basicprogram;

public class P6 {
}
>>>>>>> 099ca2a (basic program)
