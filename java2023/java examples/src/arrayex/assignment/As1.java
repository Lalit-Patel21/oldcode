package arrayex.assignment;
import java.util.*;

public class As1 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = kb.nextInt();

        int[] arr;
        arr = new int[n];
        System.out.print("Enter the Array elements: ");
        int sum=0;
        for (int i = 0; i < arr.length; i++)
        {
           arr[i]=kb.nextInt();
           sum=sum+arr[i];
        }
        System.out.print("The sum of the given array :"+sum);
    }
}

