package twodarray1assignments;

public class P1 {
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


        for (int []arr1:arr){
            for (int element:arr1)
                System.out.print(element+" ");
            System.out.println();

        }
        System.out.println();


        for (int []arr1:arr){
            for (int element:arr1)
                System.out.print(element+" ");
            System.out.println();
        }
        System.out.println();

        int [][]addArr = new int[3][3];
        int [][]subArr = new int[3][3];

        for (int r = 0;r<arr.length;r++)
        {
            for (int c =0;c<arr[r].length;c++)
            {
                addArr[r][c]=arr[r][c]+brr[r][c];
                subArr[r][c]=arr[r][c]-brr[r][c];
            }
        }
        System.out.println();
        System.out.println("sum of two matrix are given below :");
        for (int []arr1:addArr) {
            for (int element : arr1)
                System.out.print(element + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Subtraction of two matrix are given below :");
        for (int []arr1:subArr) {
            for (int element : arr1)
                System.out.print(element + " ");
            System.out.println();
        }
        System.out.println();

//
//        int [][]multiArr = new int[3][3];
//
//        for (int r = 0;r<arr.length;r++)
//        {
//            for (int c =0;c<arr[r].length;c++)
//            {
//                multiArr[r][c]=arr[r][c]*brr[r][c]+arr[r][c+1]*brr[r+1][c];
//
//            }
//        }
//
//        System.out.println("Multiplication of two matrix are given below :");
//        for (int []arr1:multiArr) {
//            for (int element : arr1)
//                System.out.print(element + " ");
//            System.out.println();
//        }
    }
}
