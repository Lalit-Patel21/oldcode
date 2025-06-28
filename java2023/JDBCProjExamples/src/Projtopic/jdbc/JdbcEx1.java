package Projtopic.jdbc;

import java.sql.*;

public class JdbcEx1 {
    public static void main(String []args){
//        Connection conn=null;
    try{
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//LALIT-PATEL:1521/xe", "system", "Lalit123");
        System.out.println("connected successfully to the DB");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from allmovies");
        while (rs.next()) {
            int movId = rs.getInt(1);
            String movName = rs.getString(2);
            int movRating = rs.getInt(3);
            System.out.println(movId + "\t" + movName + "\t" + movRating);

        }
        conn.close();
        System.out.println("Disconnected with the DB");
        }catch(SQLException ex ){
       
        System.out.println("DB Error:" + ex.getMessage());
        }
}

}
