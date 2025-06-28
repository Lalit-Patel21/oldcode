//8.Write a program to find the sum and product of all elements of an array.

package ShreyaMedam.Assignment6;

public class ArrP3 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 18, 4, 6, 9, 17};
        int sum=0,prod=1;
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
            sum=sum+arr[i];
            prod=prod*arr[i];

        }
        System.out.println("\n " +
                "the sum of "+arr.length + " element of the array is " + sum);
        System.out.println("the sum of "+arr.length + " element of the array is " + prod);
    }
}
