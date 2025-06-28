
package projtopic.jdbc;
import java.sql.*;
import java.util.Scanner;

public class JdbcEx5 {
    public static void main(String[] args) {
        Connection conn=null;
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "abc");
            System.out.println("Connected successfully to the DB");
            
            
            Scanner kb=new Scanner(System.in);
            
            
            System.out.println("Enter movie name");
            String mname=kb.nextLine();
            
            System.out.println("Enter new rating:");
            int mrating=kb.nextInt();
            
            PreparedStatement ps=conn.prepareStatement("update allmovies set rating=? where mov_name=?");
            
            ps.setInt(1, mrating);
            ps.setString(2,mname);
            
            int ans=ps.executeUpdate();
            if(ans!=0)
                System.out.println(mname+" movie rating updated!");
            else
                System.out.println(mname+" movie not found!");
            
                     
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
