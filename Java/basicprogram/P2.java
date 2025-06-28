<<<<<<< HEAD
//Q.2 Find minimum and maximum element in array
package arrayassignments1;
=======
//2. The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter.
package basicprogram;
>>>>>>> 099ca2a (basic program)

import java.util.Scanner;

public class P2 {
<<<<<<< HEAD
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

        System.out.print(size+" Element of array are : ");
        for (int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i]+" ");
                if (arr[i]<MIN)
                    MIN = arr[i];
                if (arr[i]>MAX)
                    MAX = arr[i];
            }
            System.out.println("\nMaximum value of array is :"+MAX);
            System.out.println("Minimum value of array is :"+MIN);
        }
=======
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Area of a rectangle is : ");
        int area = kb.nextInt();

        System.out.print("Enter breadth of a rectangle is : ");
        int br = kb.nextInt();

        System.out.println("its length are "+(area/br));
        System.out.println("its  perimeter are "+2*((area/br)+br));
    }
>>>>>>> 099ca2a (basic program)
}
