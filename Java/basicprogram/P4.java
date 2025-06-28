<<<<<<< HEAD
//Q.4 Write a program to sort the array
package arrayassignments1;

import java.util.Scanner;

public class P4 {
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

      for (int i = 0; i < arr.length; i++)
      {
          for (int j=i+1;j<arr.length;j++)
          {
              if (arr[i]>arr[j])
              {
                  int temp;
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
          }
      }
      System.out.println("\n"+size+" Element of array after sorting in ascending order are : ");
      for (int i:arr)
          System.out.print(i+" ");



        for (int i = 0; i < arr.length; i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]<arr[j])
                {
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("\n"+size+" Element of array after sorting in descending order are : ");
        for (int i:arr)
            System.out.print(i+" ");
    }
}
=======
//4. Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m.
package basicprogram;
public class P4 {

        public static void main(String []args) {
            int pLen = 300, pBr = 150,phs=6;
            System.out.println("Cost of tiling of a rectangle plot :"+(pLen*pBr)/(100*phs)+"$");

        }
    }

>>>>>>> 099ca2a (basic program)
