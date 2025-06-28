package twodarray1assignments;

public class P3 {
    public static void main(String[] args) {
        int [][]arr = new int[][]{
                {10,35,30},
                {40,55,60},
                {70,80,95}
        };

        int [][]brr = new int[][]{
                {5,10,15},
                {20,25,30},
                {35,40,45}
        };

        int sumEvenArr = 0,sumOddArr=0;
        for (int []arr1:arr){
            for (int element:arr1) {
                System.out.print(element + " ");
                if (element%2==0) {
                    sumEvenArr = sumEvenArr + element;
                }
                else {
                    sumOddArr=sumOddArr+element;
                }
            }
            System.out.println();

        }
        System.out.println("sum of all even elements of arr is :"+sumEvenArr);
        System.out.println("sum of all Odd elements of arr is :"+sumOddArr);

        int sumEvenBrr = 0,sumOddBrr=0;
        for (int []arr1:brr) {
            for (int element : arr1) {
                System.out.print(element + " ");
                if (element%2==0) {
                    sumEvenBrr = sumEvenBrr + element;
                }
                else {
                    sumOddBrr=sumOddBrr+element;
                }
            }
            System.out.println();
        }
        System.out.println("sum of all even elements of arr is :"+sumEvenBrr);
        System.out.println("sum of all Odd elements of arr is :"+sumOddBrr);


    }

}
