
package Testing;

//import java.util.Base64;
import org.apache.commons.validator.routines.EmailValidator;

public class Demo1 {
    public static void main(String []args){
//        
//        String pwd = "admin";
//        Base64.Encoder en = Base64.getEncoder();
//        String encryptedPwd = en.encodeToString(pwd.getBytes());
//        System.out.println("Original pwd:"+pwd);
//        System.out.println("Encrypted pwd:"+encryptedPwd);
//        
//        Base64.Decoder dec = Base64.getDecoder();
//        byte[]arr = dec.decode(encryptedPwd.getBytes());
//        String decPwd = new String(arr);
//         System.out.println("Decrypted pwd:"+decPwd);
 
       EmailValidator validator = EmailValidator.getInstance();
       String emailid1 = "gurjarlalitpatel21@gmail.com";
       System.out.println("email:"+emailid1+" valid:"+validator.isValid(emailid1));
       String emailid2 = "lalitpatel21gmail.com";
        System.out.println("email:"+emailid2+" valid:"+validator.isValid(emailid2));
       
    }
    
}
