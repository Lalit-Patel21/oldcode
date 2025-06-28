package ClassPractical;

import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of the first array:");
        int size1 = s.nextInt();

        int[] arr1;
        arr1 = new int[size1];

        System.out.println("Enter the " + arr1.length + " element of the array : ");
        for (int i = 0; i < arr1.length; i++)
        {
            arr1[i] = s.nextInt();
        }

        System.out.print("Enter size of the second the array:");
        int size2 = s.nextInt();

        int[] arr2;
        arr2 = new int[size2];
        System.out.println("Enter the " + arr2.length + " element of the array : ");
        for (int i = 0; i < arr2.length; i++)
        {
            arr2[i] = s.nextInt();
        }

        int n = arr1.length + arr2.length;

        int[] arr = new int[n];


        for (int i = 0; i < arr1.length; i++)
        {

            arr[i] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++)
        {

            arr[i + arr1.length] = arr2[i];
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        for (int i : arr) {

            System.out.println(" " + arr[i]);

        }

    }
}

