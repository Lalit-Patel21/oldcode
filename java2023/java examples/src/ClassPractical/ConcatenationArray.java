package ClassPractical;

import java.util.Scanner;

public class ConcatenationArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = s.nextInt();
        int[] arr;
        arr = new int[size];
        System.out.print("Enter the " + arr.length + " element of the array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int n = arr.length;

        int[] brr = new int[n * 2];

        for (int i = 0; i < arr.length; i++) {

            brr[i] = brr[i + n] = arr[i];

        }

//        int k = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            brr[i] = arr[i];
//            k++;
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//
//            brr[k] = arr[i];
//            k++;
//        }
        for (int x : brr) {
            System.out.print(" "+x);

        }
    }
}

