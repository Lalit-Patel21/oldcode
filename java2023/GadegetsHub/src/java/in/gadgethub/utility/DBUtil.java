
package in.gadgethub.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBUtil {
    private static Connection conn;
    public static void openConnection(String dbUrl,String userName,String password){
         if(conn==null){
        try{
            conn=DriverManager.getConnection(dbUrl, userName, password);
            System.out.println("Connection opened!");
            }
        catch(SQLException ex){
            System.out.println("Error in opening connection");
            ex.printStackTrace();
            }
         }
        
    }
    public static void closeConnection(){
        if(conn!=null){
            try{
                conn.close();
                System.out.println("Connection closed!");
                    
            }catch(SQLException ex){
                System.out.println("Error in closing connection");
                ex.printStackTrace();
            }
        }        
    }
    public static Connection provideConnection(){
        return conn;
    }
    public static void closeResultSet(ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
           }catch (SQLException ex) {
                System.out.println("Error in closing ResultSet");
                ex.printStackTrace();
            }
        }
    }
    public static void closeStatement(Statement st){
        if(st!=null){
            try {
                st.close();
            } catch (SQLException ex) {
                System.out.println("Error in closing Statement");
                ex.printStackTrace();
            }
        }
    }
}
