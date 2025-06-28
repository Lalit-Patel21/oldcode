import java.sql.*;
class MyJdbcApp1
{
	public static void main(String [] args)
	{
		try
             {
                     Class.forName("oracle.jdbc.OracleDriver");
                     System.out.println("Driver loaded successfully!");
                     Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//SachinKapoor:1521/orcl","advjavabatch5","mystudents");
                     System.out.println("Connection opened to the DB successfully!");
                     Statement st=conn.createStatement();
                     ResultSet rs=st.executeQuery("Select ename,salary from emp");
                     while(rs.next())
                     {
                         String name=rs.getString(1);
                         int income=rs.getInt(2);
                         System.out.println(name+"\t"+income);
                     }
                     conn.close();
                     System.out.println("Connection closed successfully!");
               }
               catch(ClassNotFoundException cnf)
                {
                    System.out.println("Cannot load the driver class:"+cnf.getMessage());
                }
               catch(SQLException sqlex)
                {
                    System.out.println("Problem in DB:"+sqlex.getMessage());
                }
       }
}