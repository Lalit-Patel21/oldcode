
package in.scalive.Gui.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame5  extends Frame implements ActionListener{
    Button b1,b2,b3,b4;
    public MyFrame5(){
        setTitle("Sachin's Frame");
        setBounds(200,200,400,400);
        b1=new Button("Red"); 
        b2=new Button("Green"); 
        b3=new Button("Blue"); 
        b4=new Button("Quit"); 
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        CloseFrame cf=new CloseFrame();
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b1)
           setBackground(Color.red);
        else if(e.getSource()==b2)
           setBackground(Color.green);
        else if(e.getSource()==b3)
           setBackground(Color.blue);
        else
            System.exit(0);
            
    }
}
public class Ex8 {
    public static void main(String[] args) {
        MyFrame5 mf=new MyFrame5();        
    }
    
}


