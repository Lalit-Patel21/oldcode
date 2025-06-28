
package empmgmt.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBConnection {

    private static Connection conn;
    static { 
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "myproject", "mystudents");
            JOptionPane.showMessageDialog(null, "connection opened Successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            
//          JOptionPane.showMessageDialog(null, "can not open the connection");
            JOptionPane.showMessageDialog(null, "Error in opening the connection","DB Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(0);  
        } 
    }
        public static Connection getConnection(){
            return conn;
        }
        public static void closeConnection(){
            try{
                conn.close();
            }catch (SQLException ex) {
            
//            JOptionPane.showMessageDialog(null, "can not close the connection");
             JOptionPane.showMessageDialog(null, "Error in closing the connection","DB Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            }
        }
    }    
