
package projtopic.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;


public class JdbcEx6 {
    public static void main(String[] args) {
        try{
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "abc");
            System.out.println("Connected successfully to the DB");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("Select ename,hiredate from employees");
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yy, EEE");
            while(rs.next()){
                String name=rs.getString(1);
                Date hdate=rs.getDate(2);
                String dateStr=sdf.format(hdate);
                System.out.println(name+"\t"+dateStr);
            }
            conn.close();
            System.out.println("Disconnected with the DB");
            
            
        }catch(SQLException ex){
            System.out.println("DB Error:"+ex.getMessage());
        }
    }
    
}
