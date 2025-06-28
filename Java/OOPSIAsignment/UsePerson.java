//16) Create a class Person with properties (name and age) with following features.
//Default age of person should be 18.
//A person object can be initialized with name and age.
//Method to display name and age of person.
package OOPSIAsignment;

class Person{
    private String name;
    private int age=18;

    public Person(String name,int age){

        this.name=name;
        this.age=age;

    }
    public Person(String name){

        this.name=name;
//        this.age=18;
    }
    public void showDisplay(){
        System.out.println("Person name is : "+this.name);
        System.out.println("Person age is : "+this.age);
    }

}

public class UsePerson {
    public static void main(String[] args) {
        Person p1 = new Person("Jaypal",50);
        Person p2 = new Person("Ravin",53);
        Person p3 = new Person("Lalit");
        Person p4 = new Person("Lalit");


        p1.showDisplay();
        p2.showDisplay();
        p3.showDisplay();
        p4.showDisplay();
    }
}
