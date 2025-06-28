class Insurance
{
  public static void main(String [] args)
{
  int age;
  age=Integer.parseInt(args[0]);

  String gender;
  gender=args[1];

  String status;
  status=args[2];

  if(status.equalsIgnoreCase("married"))
    System.out.println("Insurance Given");

  else if(gender.equalsIgnoreCase("male") && age>30)
   System.out.println("Insurance Given");

  else if(gender.equalsIgnoreCase("female") && age>25)
   System.out.println("Insurance Given");
 
else

   System.out.println("Insurance not Given");
}
}