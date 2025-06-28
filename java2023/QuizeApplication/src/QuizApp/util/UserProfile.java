/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizApp.util;

/**
 *
 * @author Smart computer
 */

public class UserProfile {

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        UserProfile.userName = userName;
    }

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        UserProfile.userId = userId;
    }

    public static String getEmailId() {
        return EmailId;
    }

    public static void setEmailId(String EmailId) {
        UserProfile.EmailId = EmailId;
    }
    
    private static String userName;
    private static int userId;
    private static String EmailId;
    private static String psw;

    public static String getPsw() {
        return psw;
    }

    public static void setPsw(String psw) {
        UserProfile.psw = psw;
    }
    
    
    
}
