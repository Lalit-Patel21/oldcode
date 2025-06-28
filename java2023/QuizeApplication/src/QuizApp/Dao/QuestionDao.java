/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp.Dao;

import QuizApp.pojo.QuestionPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import quizapp.dbutil.DBConnection;

/**
 *
 * @author Smart computer
 */
public class QuestionDao {
    
    public static int getNewId()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select max(QUESTIONID) from questions");
        if (rs.next()) {
        int id = rs.getInt(1);
        if (!rs.wasNull()) {
            return id + 1;
        }
     }
        return 1;
    }
    public static boolean addQuestion(QuestionPojo question) throws SQLException {
         Connection conn = DBConnection.getConnection();

         String sql = "INSERT INTO Questions (questionId, question, option1, option2, option3, option4, answer, status) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            question.setQuestionId(getNewId());
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, question.getQuestionId());
            preparedStatement.setString(2, question.getQuestion());
            preparedStatement.setString(3, question.getOption1());
            preparedStatement.setString(4, question.getOption2());
            preparedStatement.setString(5, question.getOption3());
            preparedStatement.setString(6, question.getOption4());
            preparedStatement.setString(7, question.getAnswer());
            preparedStatement.setString(8, question.getStatus());

            return preparedStatement.executeUpdate()==1;
    }
    
    public static List<QuestionPojo> getAllQuestions(String status)throws SQLException{
        List<QuestionPojo> questions = new ArrayList<>();
        String sql = "SELECT * FROM Questions where STATUS=?";
           Connection connection=DBConnection.getConnection();
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setString(1, status);
           ResultSet resultSet=preparedStatement.executeQuery();

            while (resultSet.next()) {
                QuestionPojo question = new QuestionPojo();
                question.setQuestionId(resultSet.getInt("questionId"));
                question.setQuestion(resultSet.getString("question"));
                question.setOption1(resultSet.getString("option1"));
                question.setOption2(resultSet.getString("option2"));
                question.setOption3(resultSet.getString("option3"));
                question.setOption4(resultSet.getString("option4"));
                question.setAnswer(resultSet.getString("answer"));
                question.setStatus(resultSet.getString("status"));

                questions.add(question);
            }
        return questions;
    }
    public static boolean RemoveQuestions(int id, String status)throws SQLException{
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE questions SET STATUS = ? WHERE  QUESTIONID = ?");
        preparedStatement.setString(1,status);
        preparedStatement.setInt(2,id);
        return preparedStatement.executeUpdate()==1;
    }
}
