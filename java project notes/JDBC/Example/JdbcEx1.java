
package projtopic.jdbc;
import java.sql.*;

public class JdbcEx1 {
    public static void main(String[] args) {
        try{
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//SachinKapoor:1521/orcl", "system", "abc");
            System.out.println("Connected successfully to the DB");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("Select * from movies");
            while(rs.next()){
                int movId=rs.getInt(1);
                String movName=rs.getString(2);
                int movRating=rs.getInt(3);
                System.out.println(movId+"\t"+movName+"\t"+movRating);
            }
            conn.close();
            System.out.println("Disconnected with the DB");
            
            
        }catch(SQLException ex){
            System.out.println("DB Error:"+ex.getMessage());
        }
    }
    
}
