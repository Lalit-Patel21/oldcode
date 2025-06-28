
package Projtopic.jdbc;

import java.sql.*;

import java.util.Scanner;

public class JdbcEx5 {
    public static void main(String []args){
         
     Connection conn=null;
    try{
       conn = DriverManager.getConnection("jdbc:oracle:thin:@//LALIT-PATEL:1521/xe", "system", "Lalit123");
        System.out.println("connected successfully to the DB");
       
         Scanner kb = new Scanner(System.in);

         System.out.println("Enter movie Name:");
         String mname=kb.nextLine();
         
         System.out.println("Enter new Rating:");
         int mrating = kb.nextInt();
         
         PreparedStatement ps = conn.prepareStatement("update allmovies set rating =?where mov_name=?");
         
         ps.setInt(1,mrating);
         ps.setString(2,mname);
         
         int ans=ps.executeUpdate();
         if(ans!=0)
          System.out.println(mname+" movie rating update!");
         else
             System.out.println(mname+" movie not found!");
                
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

    

