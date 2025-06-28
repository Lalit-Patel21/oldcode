
import java.util.Scanner;

public class ArraySearch{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size=s.nextInt();
        int []arr;
        arr=new int[size];
        System.out.println("Enter the "+arr.length+" element of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("enter targeted value :");
        int tar=s.nextInt();
        int j;
        for( j=0;j<arr.length;j++)
        {
            if(arr[j]==tar){
             System.out.println("Element found at index "+(j+1));
             break;
            }
            
        }
        if(j==(arr.length))
            System.out.println("Element not found ");
    }
}
