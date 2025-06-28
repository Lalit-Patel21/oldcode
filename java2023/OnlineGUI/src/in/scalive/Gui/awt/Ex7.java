
package in.scalive.Gui.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame4  extends Frame implements ActionListener{
    Button b1,b2;
    public MyFrame4(){
        setTitle("Sachin's Frame");
        setBounds(200,200,400,400);
         b1=new Button("Quit"); 
         b2=new Button("Change Color"); 
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        add(b1);
        add(b2);
        CloseFrame cf=new CloseFrame();
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
           System.exit(0);
        else
            setBackground(Color.yellow);
    }
}


public class Ex7 {
    public static void main(String[] args) {
        MyFrame4 mf=new MyFrame4();        
    }
    
}
