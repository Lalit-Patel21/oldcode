
package emart.dao;

import emart.dbutil.DBConnection;
import emart.pojo.UserPojo;
import emart.pojo.UserProfile;
import java.sql.*;


public class UserDAO {
    public static boolean validateUser(UserPojo user) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps= conn.prepareStatement("select * from users where userid=(?) and password=(?) and usertype=(?)");
        ps.setString(1, user.getUserid());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUsertype());
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            String username = rs.getString(5);
            UserProfile.setUsername(username);
            return true;
        }
        return false;
    }
    public static boolean isUserPresent(String empid)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps= conn.prepareStatement("select 1 from users where empid=(?)");
        ps.setString(1,empid);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
}
