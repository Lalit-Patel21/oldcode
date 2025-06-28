package collectionex;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
class Person{
    private String name;
    public Person(String name){
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
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
public class HashSetEx4 {
    public static void main(String[] args) {
        Set<Person> names=new HashSet<>();
        Person p1=new Person("Amit");
        Person p2=new Person("Sumit");
        Person p3=new Person("Amit");

        names.add(p1);
        names.add(p2);
        names.add(p3);
        System.out.println("Total items:"+names.size());
        System.out.println("===================");
        for(Person p:names){
            System.out.println(p);
        }
    }
}
