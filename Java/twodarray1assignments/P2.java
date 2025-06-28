package twodarray1assignments;

public class P2 {
    public static void main(String[] args) {
        int [][]arr = new int[][]{
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        int [][]brr = new int[][]{
                {5,10,15},
                {20,25,30},
                {35,40,45}
        };


        int sumArr = 0;
        for (int []arr1:arr){
            for (int element:arr1) {
                System.out.print(element + " ");
                sumArr=sumArr+element;
            }
            System.out.println();

        }
        System.out.println("sum of all elements of arr is :"+sumArr);


        int sumBrr =0;
        for (int []arr1:brr) {
            for (int element : arr1) {
                System.out.print(element + " ");
                sumBrr=sumBrr+element;
            }
            System.out.println();
        }
        System.out.println("sum of all elements of brr is :"+sumBrr);

        }

    }
