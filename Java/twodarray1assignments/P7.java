package twodarray1assignments;

public class P7 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("sorting of each rows of above Matrix arr in descending order is :");
        int temp;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++)
            {
                for (int k=c+1;k<arr[r].length;k++)
                {
                    if (arr[r][c] < arr[r][k]) {
                        temp = arr[r][k];
                        arr[r][k]=arr[r][c];
                        arr[r][c]=temp;
                    }
                }
            }
        }
        for (int []arr1:arr) {
            for (int element : arr1)
                System.out.print(element + " ");
            System.out.println();
        }

        int[][] brr = new int[][]{
                {5, 25, 15},
                {46, 25, 30},
                {35, 60, 45}
        };

        System.out.println("\nsorting of each rows of above Matrix brr in ascending order is :");
        int remp;
        for (int r = 0; r < brr.length; r++) {
            for (int c = 0; c < brr[r].length; c++)
            {
                for (int k=c+1;k<brr[r].length;k++)
                {
                    if (brr[r][c] > brr[r][k]) {
                        remp = brr[r][k];
                        brr[r][k]=brr[r][c];
                        brr[r][c]=remp;
                    }
                }
            }
        }
        for (int []arr1:brr) {
            for (int element : arr1)
                System.out.print(element + " ");
            System.out.println();
        }

        int[][] crr = new int[][]{
                {5, 25, 15},
                {46, 25, 30},
                {35, 60, 45}
        };

        System.out.println("\nsorting of each rows of above Matrix crr in ascending order is :");
        int zemp;
        for (int r = 0; r < brr.length; r++) {
            for (int c = 0; c < brr[r].length-1; c++)
            {
                    if (brr[r][c] > brr[r][c+1]) {
                        zemp = brr[r][c+1];
                        brr[r][c+1]=brr[r][c];
                        brr[r][c]=zemp;
                }
            }
        }
        for (int []arr1:brr) {
            for (int element : arr1)
                System.out.print(element + " ");
            System.out.println();
        }






    }
}
