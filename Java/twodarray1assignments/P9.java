package twodarray1assignments;

public class P9 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        System.out.println("arr:");
        for (int[] arr1 : arr) {
            for (int element : arr1)
                System.out.print(element + " ");
            System.out.println();
        }
        System.out.println("reverse of rows in arr:");
        for (int r = 0; r < arr.length ; r++) {
            for (int c = arr[r].length-1; c >=0 ; c--) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }

        int[][] brr = new int[][]{
                {5, 25, 15},
                {46, 25, 30},
                {35, 60, 45}
        };

        System.out.println("brr:");
        for (int[] arr1 : brr) {
            for (int element : arr1)
                System.out.print(element + " ");
            System.out.println();
        }

        System.out.println("reverse of rows in brr:");
        for (int r = brr.length-1; r >=0 ; r--) {
            for (int c = brr[r].length-1; c >=0 ; c--) {
                System.out.print(brr[r][c] + " ");
            }
            System.out.println();
        }
    }

    }
