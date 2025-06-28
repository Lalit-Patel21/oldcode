package FileHandling;

import java.io.*;

public class FileHandEx1 {

            public static void main(String []args)
            {

                File myfile=new File("D:\\Gurjar\\File\\Sca\\File Ex1.txt");

                if(myfile.exists())
                {
                    System.out.println(myfile.getName() +" is present");
                }
                else
                {
                    System.out.println("File not present");
                    System.exit(0);
                }
                if(myfile.isFile())
                {
                    System.out.println(myfile.getName()  +" is a file");
                    System.out.println("Size of the file is "+myfile.length());


                }
                else
                {
                    System.out.println(myfile.getName()  +" is a directory");

                }
                if(myfile.isHidden())
                {
                    System.out.println(myfile.getName()  +" is hidden");
                }
                else
                {
                    System.out.println(myfile.getName()  +" is not hidden");

                }
                if(myfile.canWrite())
                {
                    System.out.println(myfile.getName()  +" allows writing");
                }
                else
                {
                    System.out.println(myfile.getName()  +" does not allow writing");

                }
            }
        }


