package arrayex.assignment;

import java.util.Scanner;

public class As7 {
    public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    int[] arr;
    arr = new int[5];

    System.out.println("Enter the Array arr elements: ");
    for (int i = 0; i < arr.length; i++)
    {
        arr[i] = kb.nextInt();

    }
    int max=arr[0],min=arr[0];
    for(int n:arr)
    {
        if (n > max)
            max = n;
        if (n < min)
            min = n;
    }
    System.out.println("Largest elements of the all Array  is :"+max);
    System.out.println("smallest elements of the all Array  is ::"+min);
}
}


