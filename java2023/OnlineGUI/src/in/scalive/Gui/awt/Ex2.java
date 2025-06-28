
package in.scalive.Gui.awt;

import java.awt.Frame;
import java.util.Date;

public class Ex2 {
    public static void main(String[] args) {
        
        Frame fr = new Frame();
        Date d=new Date();
        String str=d.toString();
        fr.setTitle(str);
//        fr.setTitle("Lalit's Frame");
        fr.setBounds(50,50, 400,300);  
        fr.setVisible(true);
        
    }
    
}
