//2 wap to ask 5 names from user and check if particular name exists in array or not .
package ShreyaMedam.Assignment5;

import java.util.Scanner;

public class ArrP2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of Array: ");
            int size = sc.nextInt();

            String [] arr = new String[size];

            System.out.println("Enter the " + size + " String in array:");

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter the String for " + i + " index :");
                arr[i] = sc.next();
            }

            System.out.print(size+" Element of String array are : ");
            for(String str: arr){
                System.out.print(str+" ");
            }
            System.out.print("Enter the String which you want to search in array:");
            String str = sc.next();

            boolean flag=false;
            for(String s: arr){
                if (s.equalsIgnoreCase(str)){
                  flag=true;
                  break;
                }
            }
            if (flag){
                System.out.print(str+" Present in Array");
            }
            else {
                System.out.print(str+" is not Present in Array");
            }

            System.out.println("\narray " + size + " String in reverse order is given Below :");
            for (int i = arr.length - 1; i >= 0; i--)
                System.out.print(arr[i] + " ");
        }
    }

