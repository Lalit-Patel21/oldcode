//8) Create a class Student with two members : rollno and percentage.
//	Create default and parameterized constructors. Create method show() to 	display information.
//	Create another class CollegeStudent inherits Student class. Add a new membersemester to it.
//	Create default and parameterized constructors. Also override show() method.
//	Create another class SchoolStudent inherits Student class. Add a new member (eg 12 th ,10 th etc.)
//	to it. Create default and parameterized 	constructors. Also override show() method.
//	Create a class(say XYZ) with main method that carries out the operation of the project :
//has array to store objects of any class(Student or CollegeStudent, SchoolStudent).
//create two CollegeStudent and three SchoolStudent record objects and store them inside the array.
//display all record from the array.
//search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.
//count how many students are having A grade,if for A grade percentage >75.
package OOPSIIasignment;
class Student{
    private int rollNo;
    private double percentage;
    private static int countGrade = 0;

    public Student(){

    }
    public Student(int rollNo ,double percentage){
        this.rollNo=rollNo;
        this.percentage=percentage;
        if (percentage>75){
            countGrade++;
        }

    }
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public static int getCountGrade() {
        return countGrade;
    }
    public void show(){
       System.out.println("The Roll No of student is : "+this.getRollNo());
       System.out.println("The Percentage of student is : "+this.getPercentage());
    }
}
class CollegeStudent extends Student{
    private int semester;
    public CollegeStudent(){

    }
    public CollegeStudent(int rollNo,double percentage,int semester){
        super(rollNo,percentage);
        this.semester=semester;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    public void show(){
        System.out.println("The Roll No of student is : "+this.getRollNo());
        System.out.println("The semester of college student is : "+this.getSemester());
        System.out.println("The Percentage of student is : "+this.getPercentage());
    }
}
class SchoolStudent extends Student{
    private int className;
    public SchoolStudent(){

    }
    public SchoolStudent(int rollNo,double percentage,int className){
        super(rollNo,percentage);
        this.className=className;
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }
    public void show(){
        System.out.println("The Roll No of student is : "+this.getRollNo());
        System.out.println("The ClassName of School student is : "+this.getClassName());
        System.out.println("The Percentage of student is : "+this.getPercentage());

    }
}
public class UseAllStudent {
    public static void main(String[] args) {

        Student [] st = new Student[5];


        st[0] = new CollegeStudent(101,87.6,4);
        st[1] = new CollegeStudent(102,88,5);
        st[2] = new SchoolStudent(103,85.6,10);
        st[3] = new SchoolStudent(104,80.6,11);
        st[4] = new SchoolStudent(105,83.6,12);

        st[0].show();
        st[1].show();
        st[2].show();
        st[3].show();
        st[4].show();

        System.out.println("Student Grade-A :"+Student.getCountGrade());
    }
}
