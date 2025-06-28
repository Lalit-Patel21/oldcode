
package Projtopic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class JdbcEx7 {
    
    public static void main(String[] args) {
        try{
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//LALIT-PATEL:1521/xe", "system", "Lalit123");
            System.out.println("Connected successfully to the DB");
            
            PreparedStatement ps=conn.prepareStatement("insert into employees values(?,?,?,?,?)");
            Scanner kb=new Scanner(System.in);
            
            System.out.println("Enter emp id:");
            int id=kb.nextInt();
            
            System.out.println("Enter emp name:");
            kb.nextLine();
            String name=kb.nextLine();
            
            System.out.println("Enter emp sal:");
            double sal=kb.nextDouble();
            
            System.out.println("Enter job:");
            String job=kb.next();
            
            System.out.println("Enter hiredate(dd/mm/yyyy):");
            String hdateStr=kb.next();
            
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date d1=sdf.parse(hdateStr);
            
            long ms=d1.getTime();
            java.sql.Date d2=new java.sql.Date(ms);
            
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setDouble(3,sal);
            ps.setString(4,job);
            ps.setDate(5, d2);
            
            int result=ps.executeUpdate();
            System.out.println("Rec inserted:"+result);
            
            System.out.println("Disconnected with the DB");
            
            
        }catch(SQLException ex){
            System.out.println("DB Error:"+ex.getMessage());
        }
        catch(ParseException ex){
            System.out.println("Date conv Error:"+ex.getMessage());
        }
    }
    
}

   
