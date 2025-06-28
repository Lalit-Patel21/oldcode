package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileHandEx3 {

        public static void main(String []args)
        {
            Reader fr=null;
            try
            {
                fr=new FileReader("D:\\Gurjar\\File\\Sca\\File Ex1.txt");
                int ch;
                int count=0;
                while((ch=fr.read())!=-1)
                {
                    System.out.print((char)ch);
                    ++count;
                }
                System.out.println("\nTotal characters read :"+count);
            }
            catch(FileNotFoundException fnf)
            {
                System.out.println("Cannot open the file:"+fnf.getMessage());
            }
            catch(IOException ex)
            {
                System.out.println("Error while reading file");
            }
            finally
            {
                if(fr!=null)
                {

                    try
                    {
                        fr.close();
                    }
                    catch(IOException ex)
                    {
                        System.out.println("Error while closing file");
                    }
                }
            }
        }
    }

