
package Testing;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class MySqlConnection {
//    private static final String URL = "jdbc:mysql://localhost:3306/academify"; // URL of the database
//    private static final String USER = "root"; // Database username
//    private static final String PASSWORD = "Lalit123"; // Database password
//    
//    static {
//        try {
//            // Register the MySQL driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException("Failed to load MySQL JDBC driver", e);
//        }
//    }
//    public static Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(URL, USER, PASSWORD);
//    }
//    public static void closeConnection(Connection connection) {
//        if (connection != null) {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//import java.sql.*;
//
//public class JdbcEx1 {
//    public static void main(String []args){
////        Connection conn=null;
//    try{
//        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//LALIT-PATEL:1521/xe", "system", "Lalit123");
//        System.out.println("connected successfully to the DB");
//        Statement st = conn.createStatement();
//        ResultSet rs = st.executeQuery("select * from allmovies");
//        while (rs.next()) {
//            int movId = rs.getInt(1);
//            String movName = rs.getString(2);
//            int movRating = rs.getInt(3);
//            System.out.println(movId + "\t" + movName + "\t" + movRating);
//
//        }
//        conn.close();
//        System.out.println("Disconnected with the DB");
//        }catch(SQLException ex ){
//       
//        System.out.println("DB Error:" + ex.getMessage());
//        }
//}
//}


         // Create a Statement object to execute queries
//            statement = connection.createStatement();
//            String query = "SELECT * FROM your_table_name"; // Replace with your actual table name
//
//            // Execute the query and obtain the ResultSet
//            resultSet = statement.executeQuery(query);
//
//            // Process the ResultSet
//            while (resultSet.next()) {
//                // Retrieve data from columns (assuming you have a column named 'column_name')
//                String data = resultSet.getString("column_name");
//                System.out.println("Data from column: " + data);
//            }

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnection{
    private static final String URL = "jdbc:mysql://localhost:3306/academify"; // Your database URL
    private static final String USER = "root"; // Your MySQL username
    private static final String PASSWORD = "Lalit123"; // Your MySQL password

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver registered successfully.");

            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database successfully.");


        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Connection or SQL error.");
            e.printStackTrace();
        } finally {
            // Close resources in the reverse order of their creation
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


