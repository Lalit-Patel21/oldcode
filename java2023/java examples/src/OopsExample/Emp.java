package OopsExample;

public class Emp {
    private int age;
    private String name;
    private double salary;
    public Emp(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    public void show(){
        System.out.println("age="+age+",name="+name+",salary="+salary);
    }
}
