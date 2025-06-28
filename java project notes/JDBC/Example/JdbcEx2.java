
package projtopic.jdbc;
import java.sql.*;

public class JdbcEx2 {
    public static void main(String[] args) {
        Connection conn=null;
        try{
           conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "abc");
            System.out.println("Connected successfully to the DB");
            Statement st=conn.createStatement();
            int ans=st.executeUpdate("insert into allmovies values(106,'Adipurush',2)");
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
