package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandEx4a {
    public static void main(String []args)
    {
        FileWriter fw=null;
        try
        {
            fw=new FileWriter("D:/person.txt");
            Scanner kb=new Scanner(System.in);

            for(int i=0;i<2;i++)
            {
                System.out.println("Enter name and phone");
                String name=kb.next();

                fw.write(name+" ");
                long phone=kb.nextLong();
                fw.write(String.valueOf(phone));

                fw.write("\n");
            }



        }

        catch(IOException ex)
        {
            System.err.println("Error while writing file");
        }
        finally
        {
            if(fw!=null)
            {

                try
                {
                    fw.close();
                    System.out.println("File saved successfully!");
                }
                catch(Exception ex)
                {
                    System.out.println("Error while closing file");
                }
            }
        }
    }
}
