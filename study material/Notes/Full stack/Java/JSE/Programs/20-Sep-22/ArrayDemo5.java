package sachin;

import java.util.Scanner;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int n;
        int[] arr;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter size of array");
        n = kb.nextInt();
        arr = new int[n];
        System.out.println("Enter " + n + " nos");
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println("Enter no t0 search:");
        int k = kb.nextInt();
        boolean found = false;
        for (int x : arr) {
            if (x == k) {
                System.out.println("Element found");
                found = true;
                break;
            }
        }
        if (found == false)
            System.out.println("Element not found");

    }
}
