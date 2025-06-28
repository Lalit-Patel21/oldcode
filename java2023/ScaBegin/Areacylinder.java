class Areacylinder
{
  public static void main(String args[])
  {
    int radius=Integer.parseInt(args[0]);
    
   int height=Integer.parseInt(args[1]);
    
   double area;
    
   area=2*Math.PI*radius*(height+radius);
   
    System.out.println("area is " + area);
}
   
   
}
