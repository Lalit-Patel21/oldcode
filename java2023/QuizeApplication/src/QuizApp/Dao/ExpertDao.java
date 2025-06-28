/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp.Dao;

import QuizApp.pojo.ExpertPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quizapp.dbutil.DBConnection;

/**
 *
 * @author Smart computer
 */
public class ExpertDao {
    
    public static int getNewId()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select max(expertId) from  experts");
        if (rs.next()) {
        int id = rs.getInt(1);
        if (!rs.wasNull()) {
            return id + 1;
        }
     }
        return 101;
    }
    public static boolean addExpert(ExpertPojo expert)throws SQLException{
        
            Connection connection=DBConnection.getConnection();
            expert.setExpertId(getNewId());
            String sql = "INSERT INTO experts (expertId, expertName, expertEmail, expertPassword) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, expert.getExpertId());
            preparedStatement.setString(2, expert.getExpertName());
            preparedStatement.setString(3, expert.getExpertEmail());
            preparedStatement.setString(4, expert.getExpertPassword());
            return  preparedStatement.executeUpdate()==1;
    }
    
    public static ExpertPojo validate(String emailId,String psw)throws SQLException{
        Connection conn=DBConnection.getConnection();
        ExpertPojo expert=null;
        PreparedStatement ps=conn.prepareStatement("Select * from experts where EXPERTEMAIL=? and EXPERTPASSWORD=?");
        ps.setString(1,emailId);
        ps.setString(2,psw);
        //ps.setString(3,st);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            expert=new ExpertPojo();
            expert.setExpertId(rs.getInt(1));
            expert.setExpertName(rs.getString(2));
            expert.setExpertEmail(rs.getString(3));
            expert.setExpertPassword(psw);
        }
        return expert;
    }
}
