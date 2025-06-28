
package Projtopic.jdbc;

import java.sql.*;

import java.util.Scanner;


public class JdbcEx4 {
    public static void main(String []args){
         
     Connection conn=null;
    try{
       conn = DriverManager.getConnection("jdbc:oracle:thin:@//LALIT-PATEL:1521/xe", "system", "Lalit123");
        System.out.println("connected successfully to the DB");
        
        Statement st = conn.createStatement();

         Scanner kb = new Scanner(System.in);
         System.out.println("Enter movie Id:");
         int id = kb.nextInt();
         
         System.out.println("Enter movie Name:");
         kb.nextLine(); //for clearing the buffer
         String mname=kb.nextLine();
         
         System.out.println("Enter movie Rating:");
         int mrating = kb.nextInt();
         
//        int ans = st.executeUpdate("insert into allmovies values("+id+",'"+mname+"',"+mrating+")");

         PreparedStatement ps = conn.prepareStatement("insert into allmovies values(?,?,?)");
         ps.setInt(1,id);
         ps.setString(2,mname);
         ps.setInt(3,mrating);
         
         int ans=ps.executeUpdate();
         System.out.println("Rows affected :"+ans);
       
       
    }catch(SQLException ex ){
       
     System.out.println("DB Error:" + ex.getMessage());
    }
    finally{
        try{
            if(conn!=null){
             conn.close();
            System.out.println("Disconnected with the DB");    
            }
        }catch(SQLException ex ){
            
            System.out.println("Error in closing the connection:" + ex.getMessage());
            
        }

    }
    

     }
    
}

    

