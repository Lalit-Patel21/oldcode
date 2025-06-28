/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilecodes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class Emp
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
	public void writeInFile()
	{
		try
		{
			DataOutputStream dout;
			dout=new DataOutputStream(new FileOutputStream("D:/emp.dat"));
			dout.writeInt(age);
			dout.writeUTF(name);
			dout.writeDouble(sal);
			dout.close();
		}
		catch(Exception ex)
		{
			System.out.println("Error in writing "+ex);
			System.exit(0);
		}
	}
	public void readFromFile()
	{
		try
		{
			DataInputStream din;
			din=new DataInputStream(new FileInputStream("D:/emp.dat"));
			age=din.readInt();
			name=din.readUTF();
			sal=din.readDouble();
			din.close();
		}
		catch(Exception ex)
		{
			System.out.println("Error in reading "+ex);
			System.exit(0);
		}
	}
    }

class FileExample5
{
	public static void main(String args[]) 
{
    Emp E=new Emp();
    E.get();
    E.writeInFile();
    
    Emp F=new Emp();
    F.readFromFile();
    F.show();
}
}

