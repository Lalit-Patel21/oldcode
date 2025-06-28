class Seasonname
{
  public static void main(String args[])
  {
   

   

   
   switch(args[0])

   {
    
     case "Nov" : case "Dec" : case "Jan" : case "Feb" : 

              System.out.println("Winter");
               break;

     case "Mar" : case "Apr" : case "May" : case "Jun" :

              System.out.println("summer");
              break;

     case  "Jul" : case  "Aug"  : case  "Sep" :  case  "Oct":
             System.out.println("Rainy");
             break;


     default :
                  System.out.println("Wrong Month name" ); 
}
}
}
