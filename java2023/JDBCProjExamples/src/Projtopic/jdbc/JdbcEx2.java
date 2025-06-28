
package Projtopic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcEx2 {
     public static void main(String []args){
         
     Connection conn=null;
    try{
       conn = DriverManager.getConnection("jdbc:oracle:thin:@//LALIT-PATEL:1521/xe", "system", "Lalit123");
        System.out.println("connected successfully to the DB");
        Statement st = conn.createStatement();
//        ResultSet rs = st.executeQuery("select * from allmovies");
        int ans = st.executeUpdate("insert into allmovies values(106,'Adipurush',2)");
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
            
            System.out.println("Erroring closing the connection:" + ex.getMessage());
            
        }

    }
     }
}
    

