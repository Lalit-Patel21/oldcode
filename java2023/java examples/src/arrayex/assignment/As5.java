package arrayex.assignment;
import java.util.Scanner;
public class As5 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int[] arr;
        arr = new int[10];
        System.out.print("Enter the Array arr elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println("Elements of Array  brr is :");
        int[] brr;
        brr = new int[10];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            brr[i] = arr[j];
            System.out.print(" " + brr[i]);
        }
    }
}
