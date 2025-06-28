package myfilecodes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileExample4c {
    public static void main(String[] args) {
        
    PrintWriter pw=null;
    try
    {
    	pw=new PrintWriter("D:/maths.txt");
    	pw.println(Math.PI);
    	
      
    }
    
catch(IOException ex)
    {
    	System.out.println("Error while writing file");
    }
    finally
    {
    	if(pw!=null)
    	{
    		
    		
    			pw.close();
    			System.out.println("File saved successfully!");
    		
    			
    	}
    }
}
}

