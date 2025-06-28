mongodb+srv://lalitpatel21:Lalit21@testingmongodb.zcpqw.mongodb.net/?retryWrites=true&w=majority&appName=testingMongodb


// public class Pattern
// {

//   public static String sortString(String s1,String s2)
//   {
//     String ans="";
//     for(int i=0;i<s1.length();i++)
//     {
//       char ch1 = s1.charAt(i);
//       char ch2 = s2.charAt(i);
//       if(ch1<ch2)
//       {
//         ans=s1;
//         break;
//       }
//       if(ch1>ch2)
//       {
//         ans=s2;
//         break;
//       }
//     }
//     return ans;

//   }
//  public static void main(String [] args)
//  {
//    String []str = new String[]{"Ajeet","vishal", "Anil","Abhay"};

//    for(String ele : str)
//    {
//      System.out.print(ele +" ");
//    }
//    System.out.println();
//    for(int i=0;i<str.length;i++)
//    {
//     for(int j=i+1;j<str.length;j++)
//      {
//       str[i]=str[i].toUpperCase();
//       str[j]=str[j].toUpperCase();
//       String temp = sortString(str[i],str[j]);
//       if(temp.equals(str[j]))
//      {
//       str[j]=str[i];
//       str[i]=temp;
//      }
//     }
//    }

//    for(String ele : str)
//    {
//      System.out.print(ele +" ");
//    }
  
//   }
// }

// class Pattern{
//     public static void main(String[] args) {
//       int k = 20;
//         for(int i=1;i<=10;i++){
//          for(int j=1;j<=20;j++)
//           {
//               if(i>=j)
//                System.out.print("*");
//                else if(j>=k){
//             System.out.print("*");
//                }
//               else
//                System.out.print(" ");
//           }
//           System.out.println();
//           k--;
//         }

//     }
// }
