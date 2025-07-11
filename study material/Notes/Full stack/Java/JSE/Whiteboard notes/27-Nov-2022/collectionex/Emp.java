package collectionex;

import java.util.ArrayList;
import java.util.Objects;

public class Emp {
    private int age;
    private String name;
    private double sal;

    public Emp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return age == emp.age && Double.compare(emp.sal, sal) == 0 && name.equals(emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, sal);
    }
}
class UseEmp{
    public static void main(String[] args) {

        ArrayList<Emp>empList=new ArrayList<>();
        Emp e1=new Emp(21,"Amit",45000.0);
        Emp e2=new Emp(29,"Ravi",35000.0);
        Emp e3=new Emp(19,"Anil",65000.0);
        Emp e4=new Emp(31,"Jay",15000.0);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        System.out.println(empList);
        Emp e5=new Emp(19,"Anil",65000.0);
        System.out.println(empList.remove(e5));
        System.out.println(empList);

    }
}
