package arrayex.assignment;
import java.util.Scanner;
public class As4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] arr;
        arr = new int[20];
        System.out.print("Enter the Array elements: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = kb.nextInt();
        }
        int pos = 0, neg = 0, zero = 0, ev = 0, odd = 0;
        for (int num : arr)
        {
            if (num > 0)
                pos++;
            else if (num < 0)
                neg++;
            else
                zero++;
            if (num % 2 == 0)
                ev++;
            else
                odd++;
        }

        System.out.println("positive numbers :" + pos);
        System.out.println("negative numbers :" + neg);
        System.out.println("zero numbers :" + zero);
        System.out.println("Even numbers :" + ev);
        System.out.println("Odd numbers :" + odd);
    }
}

        /*for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
                System.out.println("Positive number :"+arr[i]);
            else if(arr[i]<0)
                System.out.println("Negative number :"+arr[i]);
            else
                System.out.println("zero number :"+arr[i]);
            if(arr[i]%2==0)
                System.out.println("even number :"+arr[i]);
            else if(arr[i]%2==1)
                System.out.println("odd number :"+arr[i]);
        }*/


