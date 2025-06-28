/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilecodes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author samsung1
 */
public class FileExample4 {
    public static void main(String args[]) 
{
    FileWriter fw=null;
    try
    {
    	fw=new FileWriter("d:\\myfile.txt");
    	Scanner kb=new Scanner(System.in);
    	System.out.println("What is your name ?");
    	String name=kb.nextLine();
    	System.out.println("What is your address ?");
    	String address=kb.nextLine();
    	fw.write(name);
        fw.write("\n");
		fw.write(address);

    }
    catch(IOException ex)
    {
    	System.out.println("Error while writing file");
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
