class Testchar
{
  public static void main(String args[])
  {
    char ch;
    ch=args[0].charAt(0); 
     
   int Ascii=ch;
     
   
   if(Ascii>=65 && Ascii<=90 || Ascii<=97 && Ascii<=122)
    System.out.println("It is a alphabate");

   else 
    System.out.println("It is not a alphabate");
 }
}
