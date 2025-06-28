package FileHandling;

import java.io.File;
import java.util.Date;

public class FileHandEx2a {
        public static void main(String []args)
        {
            File myfile=new File("D:\\Gurjar\\File\\Sca\\File Ex1.txt");
            System.out.println("File was mod on "+myfile.lastModified());
            Date d=new Date(myfile.lastModified());
            System.out.println("The above time is "+d);
            Date t=new Date();
            System.out.println("Current date is :"+t);
        }
    }


