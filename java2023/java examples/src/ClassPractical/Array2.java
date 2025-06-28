package ClassPractical;

public class Array2 {
    public static void main(String[] args) {


        int [] arr1 = new int[]{1,2,3};
        int [] arr2= new int []{4,5,6,7};

        int n= arr1.length+arr2.length;
        int [] arr3= new int [n];

        int k=0;

        for(int i=0;i<arr1.length;i++)
        {
            arr3[i]=arr1[i];
            k++;
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr3[k]=arr2[i];
            k++;
        }
        System.out.println("Merge values are :");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
       }
    }
}


