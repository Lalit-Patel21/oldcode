package accountex;

public class Account {
    private int acctId;
    private String custName;
    private double bal;
    public Account(int id,String name,double amt){
        acctId=id;
        custName=name;
        bal=amt;
    }
    public void showAccount(){
        System.out.println("account id:"+acctId);
        System.out.println("name:"+custName);
        System.out.println("balance:"+bal);
        System.out.println("==============================");
    }
}
