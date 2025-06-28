package collectionex;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx3 {
    public static void main(String[] args) {
        ArrayList<Integer> numList=new ArrayList<>();
        Scanner kb=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.println("Enter no");
            int n=kb.nextInt();
            numList.add(n);
        }
        System.out.println("Enter number to search:");
        int num=kb.nextInt();
        if(numList.contains(num)){
            int pos=numList.indexOf(num);
            System.out.println("Number is present at index:"+pos);
        }else{
            System.out.println("Number is not present");
        }
    }
}
