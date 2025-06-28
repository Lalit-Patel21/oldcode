
package Testing;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

    class MyAuthenticator extends Authenticator{
    private String username,password;
    public MyAuthenticator(String username,String password){
        this.username=username;
        this.password=password;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        PasswordAuthentication pwdAuth=new PasswordAuthentication(this.username,this.password);        
        return pwdAuth;
    }

}

public class EmailSender{
    public static void main(String[] args) {
        final String username = "mrl21codeworld@gmail.com";
        final String password = "fmnr kyui txgt thiz";
        Properties prop = new Properties();
	prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        MyAuthenticator myAuth=new MyAuthenticator(username,password);        
        Session session = Session.getInstance(prop,myAuth);                

        try {

            Message message = new MimeMessage(session);
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("gurjarlalitpatel21@gmail.com,Lalitpatel111.da@gmail.com")
            );
            message.setSubject("Email Testing");
            message.setText("This is a mail from yumexpress porject. Happy hunger!!!");

            Transport.send(message);

            System.out.println("Mail Sent Successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
