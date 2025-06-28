<<<<<<< HEAD
//Q.3 Write a program to reverse the array.
package arrayassignments1;

import java.util.Scanner;

public class P3 {
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
=======
//3. How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm?
package basicprogram;

public class P3 {
    public static void main(String []args) {
    double tLen = 13, tBr = 7, side = 520;
    System.out.println("Number of tiles is needed are :"+(side*side)/(tLen*tBr));

}
>>>>>>> 099ca2a (basic program)
}
