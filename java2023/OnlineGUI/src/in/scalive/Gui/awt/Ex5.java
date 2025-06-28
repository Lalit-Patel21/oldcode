
package in.scalive.Gui.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

class myFrame2 extends Frame{
    
    Button b1,b2,b3;
    
    public myFrame2(String title){
        
        super(title);
        b1=new Button("change color");
        b2=new Button("click me");
        b3=new Button("close frame");
//      FlowLayout fl = new FlowLayout();
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(b3);
        setBounds(50,50, 500,500);
        setBackground(Color.red);
        setVisible(true);        
    }
}
  
public class Ex5 {
    public static void main(String[] args) {  
        myFrame2 mf2 = new myFrame2("Lalit's frame");
    }
    
}

