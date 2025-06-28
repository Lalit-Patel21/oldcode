class Account
{
   private int acctId=101;
   private String custName="Amit";
   private double balance=50000.0;

   public void showAccount()
   {
     System.out.println("acctid:"+acctId);
     System.out.println("customer name:"+custName);
     System.out.println("balance:"+balance);
   }
}
class UseAccount
{
     public static void main(String[] args)
     {
            Account obj;
            obj=new Account();
            obj.showAccount();
     }
}
