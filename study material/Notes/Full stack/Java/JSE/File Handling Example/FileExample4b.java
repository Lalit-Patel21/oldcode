/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilecodes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author samsung1
 */
public class FileExample4b {
    public static void main(String args[]) 
{
    PrintWriter pw=null;
    try
    {
    	pw=new PrintWriter("D:/person.txt");
    	Scanner kb=new Scanner(System.in);
    	for(int i=1;i<=2;i++)
    	{
    		System.out.println("Enter name and phone");
    		String name=kb.next();
    		long phone=kb.nextLong();
    		pw.print(name+" ");
    		pw.println(phone);
    	
    	}
    	
    	
    
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
