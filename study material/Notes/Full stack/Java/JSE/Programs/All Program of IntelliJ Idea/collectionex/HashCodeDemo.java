package collectionex;

import java.util.Objects;

class Pers{
    private String name;
    public Pers(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pers pers = (Pers) o;
        return Objects.equals(name, pers.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
public class HashCodeDemo {
    public static void main(String[] args) {
        String s1=new String("Amit");
        String s2=new String("Amit");
        System.out.println("s1's hashcode:"+s1.hashCode());
        System.out.println("s2's hashcode:"+s2.hashCode());
        Pers p1=new Pers("Amit");
        Pers p2=new Pers("Amit");
        System.out.println("p1's hashcode:"+p1.hashCode());
        System.out.println("p2's hashcode:"+p2.hashCode());
    }
}
