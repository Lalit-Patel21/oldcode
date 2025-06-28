
package in.scalive.Gui.awt;

import java.awt.Color;
import java.awt.Frame;
import java.util.Date;
  
class myFrame extends Frame{
    
    public myFrame(String title){
        
        super(title);
        setBounds(50,50, 400,300);
        setBackground(Color.red);
        setVisible(true);       
    }
}
  
public class Ex4 {
    public static void main(String[] args) {
        
        Date d=new Date();
         myFrame mf = new myFrame(d.toString());       
    }
    
}

