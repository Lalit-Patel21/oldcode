/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp.Dao;

import QuizApp.pojo.ExpertPojo;
import QuizApp.pojo.StudentPojo;
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
public class StudentDao {
    public static int getNewId()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select max(STUDENTID) from students");
        if (rs.next()) {
        int id = rs.getInt(1);
        if (!rs.wasNull()) {
            return id + 1;
        }
     }
        return 101;
    }
    public static boolean addStudent(StudentPojo student) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        conn = DBConnection.getConnection();

            // Assuming you have a table named "Students" with columns (studentId, studentName, studentEmail, studentPassword)
        String sql = "INSERT INTO students (studentId, studentName, studentEmail, studentPassword) VALUES (?, ?, ?, ?)";
        pstmt = conn.prepareStatement(sql);
        student.setStudentId(getNewId());
        pstmt.setInt(1, student.getStudentId());
        pstmt.setString(2, student.getStudentName());
        pstmt.setString(3, student.getStudentEmail());
        pstmt.setString(4, student.getStudentPassword());
        return pstmt.executeUpdate()==1; 
    }
    public static StudentPojo validate(String emailId,String psw)throws SQLException{
        Connection conn=DBConnection.getConnection();
        StudentPojo student=null;
        PreparedStatement ps=conn.prepareStatement("Select * from students where STUDENTEMAIL=? and STUDENTPASSWORD=?");
        ps.setString(1,emailId);
        ps.setString(2,psw);
        //ps.setString(3,st);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            student=new StudentPojo();
            student.setStudentId(rs.getInt(1));
            student.setStudentName(rs.getString(2));
            student.setStudentEmail(rs.getString(3));
            student.setStudentPassword(psw);
        }
        return student;
    }
}
