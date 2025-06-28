package arrayex.assignment;
import java.util.Scanner;
public class As8 {
    public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);

    System.out.print("Enter the size of array : ");
    int n = kb.nextInt();

    int[] arr;
    arr = new int[n];
    System.out.print("Enter the Array elements: ");
    for (int i = 0; i < arr.length; i++)
    {
        arr[i]=kb.nextInt();
    }
    for (int i = 0; i < arr.length; i++)
    {
        for (int j = i+1; j < arr.length; j++)
        {
            if(arr[i]>arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
   }
        for (int s:arr)
        {
            System.out.print(s+" ");
        }
  }
}
