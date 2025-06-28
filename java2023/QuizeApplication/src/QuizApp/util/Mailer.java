/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizApp.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

class MyAuthenticator extends Authenticator {

    private String username, password;

    public MyAuthenticator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        PasswordAuthentication pwdAuth = new PasswordAuthentication(this.username, this.password);
        return pwdAuth;
    }

}

public class Mailer {

    private static Properties prop;

    static {
        prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

    }

    /*public static void sendMail(Map<String, String> emailCredentials, StaffPojo staff) throws MessagingException {
        final String username = emailCredentials.get("emailId");
        final String password = emailCredentials.get("securityKey");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
        Message message = new MimeMessage(session);
        message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(staff.getEmailId())
        );
        String emailSubject = "Staff Details";

        String emailBody = "Dear " + staff.getStaffName() + ",\n"
                + "\n"
                + "I hope this email finds you well. I am writing to provide you with the necessary staff details as requested. Please find the information below:\n"
                + "\n"
                + "Staff ID: " + staff.getStaffId() + "\n"
                + "Company Name: " + OwnerProfile.getCompanyName() + "\n"
                + "Email ID: " + staff.getEmailId() + "\n"
                + "Staff password: " + PassEncryption.getDecryptedPass(staff.getPassword()) + "\n"
                + "\n"
                + "These details are crucial for internal record-keeping and ensuring efficient communication within the organization.\n"
                + "Best regards,\n"
                + "\n"
                + OwnerProfile.getOwnerName();

        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);
    }*/
    
    public static void sendMailToStudent(String name,String email,String psw) throws MessagingException {
        final String username = "yumxpress111@gmail.com"; //emailCredentials.get("emailId");
        final String password = "ampm jjrh bzns gnba";//emailCredentials.get("securityKey");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
        Message message = new MimeMessage(session);
        message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(email)
        );
        String motivationalQuote = "The journey of a thousand miles begins with a single step. Keep stepping forward, and success will follow.";

        String emailSubject = "Welcome to E-Learning - Your Coding Learning Plateform!";

        String emailBody="Dear " + name + ",\n\n"
                    + "Thank you for registering on our E-learning platform!\n\n"
                    + "Your login credentials are as follows:\n"
                    + "Email: " + email + "\n"
                    + "Password: " + psw + "\n\n"
                    + "Please keep this information secure.\n\n"
                    + "Here's a motivational quote for you:\n"
                    + "\"" + motivationalQuote + "\"\n\n"
                    + "Best regards,\nThe E-learning Platform Team";
                

        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);
    }
    
    public static void sendMailToExpert(String name,String email,String psw) throws MessagingException {
        final String username = "yumxpress111@gmail.com"; //emailCredentials.get("emailId");
        final String password = "ampm jjrh bzns gnba";//emailCredentials.get("securityKey");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
        Message message = new MimeMessage(session);
        message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(email)
        );
        //String motivationalQuote = "The journey of a thousand miles begins with a single step. Keep stepping forward, and success will follow.";

        String emailSubject = "Welcome to E-Learning - Your Coding Learning Plateform!";

        String emailBody="Respected Sir " + name + ",\n\n"
                    + "Thank you for registering on our E-learning platform!\n"
                    +" Our E-learning platform, where we are dedicated to providing quality education to our students.\n\n"
                    + "Your login credentials are as follows:\n"
                    + "Email: " + email + "\n"
                    + "Password: " + psw + "\n\n"
                    + "Please keep this information secure.\n\n"
                    + "Best regards,\nThe E-learning Platform Team";
                

        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);
      
    }
    
    public static void sendMailToStudentResult(int score) throws MessagingException {
        final String username = "yumxpress111@gmail.com"; //emailCredentials.get("emailId");
        final String password = "ampm jjrh bzns gnba";//emailCredentials.get("securityKey");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
        Message message = new MimeMessage(session);
        message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(UserProfile.getEmailId())
        );
        //String motivationalQuote = "The journey of a thousand miles begins with a single step. Keep stepping forward, and success will follow.";

        String emailSubject = "Welcome to E-Learning - Your Coding Learning Plateform!";

        String emailBody="Dear " + UserProfile.getUserName() + ",\n\n"
                    + "I hope this email finds you well.\n\n"
                    + "We are pleased to inform you of your result for the quiz on E-Learning Plateform \n\n"
                    + "Your Score: " + score + "\n"
                    + "Congratulations on your performance!\n\n"
                    + "Here's a breakdown of your results:\n"
                    + " - Correct Answers: "+score+"\n"
                    + " - Incorrect Answers: "+(15-score)+"\n"
                    + " - Total Questions: 15 \n\n"
                    + "Feel free to review your performance and reach out if you have any questions or concerns.\n\n"
                    + "Thank you for your dedication to your studies.\n\n"
                    + "Best regards, E-Learning Team";


        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);
    }
    
}


    