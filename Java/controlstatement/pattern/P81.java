//    *
//   ***
//  *****
// *******
//*********
// *******
// *****
//  ***
//   *
package controlstatement.pattern;

// public class P81 {
//     public static void main(String[] args) {
//         for (int i=1;i<=5;i++)
//         {
//             for (int j=1;j<=5-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         System.out.print(" ");
//         for (int i=4;i>=1;i--)
//         {
//             for (int j=1;j<=4-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }



/*
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
 */
// class Smap2 {
//     public static void main(String ar[]) {
// 		int n=6;
// 		int k=1;
// 		  for(int i=1;i<=9;i++){
// 			int sum=i<6?n--:n++;
//              for(int l=1;l<n;l++){
//                 System.out.print(" ");
// 			 }
// 			      int total=i<6?++k:--k;
// 				  for(int j=1;j<total;j++){
					  
// 					 System.out.print(" *");  
// 				  }
// 			  System.out.println("");
// 		}
// 	 }
// 	}
public class P81 {

    public static void main(String[] args) {
        int k=0;
       for(int i=0; i<=10; i++){
        if(i<=5)
          k++;
        else 
          k--;
        for(int m=5; m>=k; m--)
        {
          System.out.print(" ");
        }  
        for(int j=1; j<=k; j++)
        {
          System.out.print("* ");
        }
         System.out.println(); 
    }
  }
}
