package inhdemo;

public class UseManager {
    public static void main(String[] args) {
        Manager boss=new Manager();
        boss.setData("Ashish",50000.0);
        boss.setBonus(25000.0);
        System.out.println("Manager's name:"+boss.getName());
        System.out.println("Manager's income:"+boss.getTotalIncome());

    }
}
