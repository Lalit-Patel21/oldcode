package FileHandling;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

    class MyEmp implements Serializable
    {
        private int age;
        private String name;
        private double sal;

        public void get()
        {
            Scanner kb=new Scanner(System.in);
            System.out.println("enter age name and sal");
            age=kb.nextInt();
            name=kb.next();
            sal=kb.nextDouble();
        }
        public void show()
        {
            System.out.println(age);
            System.out.println(name);
            System.out.println(sal);
        }

    }

    public class  FileHandEx6 {
        public static void main(String[] args) {

            try
            {

                MyEmp E=new MyEmp();
                E.get();
                ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:/emp.txt"));
                oos.writeObject(E);
                oos.close();
                ObjectInputStream ios=new ObjectInputStream(new FileInputStream("d:/emp.txt"));
                MyEmp F= (MyEmp) ios.readObject();
                F.show();
                ios.close();
            }
            catch(Exception e){
                System.out.println("Exception in file I/O:"+e);

            }
        }
    }


