
package projtopic.jdbc;
import java.sql.*;
import java.util.Scanner;

public class JdbcEx3 {
    public static void main(String[] args) {
        Connection conn=null;
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "abc");
            System.out.println("Connected successfully to the DB");
            Statement st=conn.createStatement();
            
            Scanner kb=new Scanner(System.in);
            System.out.println("Enter movie id:");
            int id=kb.nextInt();
            
            System.out.println("Enter movie name");
            kb.nextLine();// for clearing the buffer
            String mname=kb.nextLine();
            
            System.out.println("Enter movie rating:");
            int mrating=kb.nextInt();
            
            
            
            
            int ans=st.executeUpdate("insert into allmovies values("+id+",'"+mname+"',"+mrating+")");
            System.out.println("Rows affected:"+ans);
                     
        }catch(SQLException ex){
            System.out.println("DB Error:"+ex.getMessage());
        }
        finally{
             try{
                 if(conn!=null){
             conn.close();
            System.out.println("Disconnected with the DB");
                 }
             }catch(SQLException ex){
                 System.out.println("Error in closing the connection:"+ex.getMessage());
             }
        }
    }
    
}
