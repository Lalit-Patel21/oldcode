package FileHandling;

import java.io.File;
//import java.io.*;

public class FileHandEx2 {
    public static void main(String[] args) {

//                File myfile=new File("D:/Assignments/Test Papers/mp");
                File myfile=new File("D:\\Gurjar\\File\\File Ex1.txt");

                System.out.println(myfile.getName()+" is present ?"+myfile.exists());
                System.out.println(myfile.getName()+" is of "+myfile.length()+ " bytes ");
                System.out.println(myfile.getName()+" is deleted ?"+myfile.delete());
                System.out.println(myfile.getName()+" is present ?"+myfile.exists());
            }
        }

