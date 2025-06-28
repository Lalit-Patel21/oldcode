
package Testing;


public class MySQLDriverTest {
    public static void main(String[] args) {
        try {
            // Attempt to load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver registered successfully.");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        }
    }
}
