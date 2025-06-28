package ClassPractical;

import java.util.Scanner;

public class SecondLargest {

    public static int secLargestElement ( int[] arr, int n)
    {
        int largest = -1;

        int secLargest = -1;

        for (int i = 0; i < n; i++) {
            if (largest < arr[i]) {
                secLargest = largest;
                largest = arr[i];
            }
//            else if(secLargest==arr[i])
//            {
//
//            }
            else if (secLargest<arr[i]&& secLargest!=arr[i]) {
                secLargest=arr[i];
            }

        }
        return secLargest;
    }
    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size = s.nextInt();
        int[] arr;
        arr = new int[size];
        System.out.println("Enter the " + arr.length + " element of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int SecLargest = secLargestElement(arr, size);

        System.out.println("Second largest number is :" + SecLargest);

    }
}

