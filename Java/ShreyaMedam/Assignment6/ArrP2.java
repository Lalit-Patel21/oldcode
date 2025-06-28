//7 wap to search a particular number in given array and print its position

package ShreyaMedam.Assignment6;

public class ArrP2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 8, 4, 6, 9, 17};
        int n = 17;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println(n + "element present at index" + (i + 1));
            }

        }
    }

}
