package ClassPractical;

import java.util.Scanner;

public class LargestNum{

    public static int LargestElement(int []arr) {
        int largest = -1;
        for (int i :arr) {
            if (largest < i) {
                largest = i;
            }
        }
        return largest;
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

            int largest = LargestElement(arr);
            System.out.println("greatest number is :" + largest);

        }
    }
