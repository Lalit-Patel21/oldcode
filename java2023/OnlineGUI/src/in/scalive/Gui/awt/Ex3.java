
package in.scalive.Gui.awt;

import java.awt.Color;
import java.awt.Frame;
import java.util.Date;
  
public class Ex3 {
    public static void main(String[] args) {
        
        Frame fr = new Frame();
        Date d=new Date();
        String str=d.toString();
        fr.setTitle(str);
//        fr.setTitle("Lalit's Frame");
        fr.setBounds(50,50, 400,300);
//        Color c1;
//        c1 = new Color(255,255,0);
//        fr.setBackground( new Color(255,255,0));//anonymous object
           
          fr.setBackground(Color.red);

        fr.setVisible(true);
        
    }
    
}

