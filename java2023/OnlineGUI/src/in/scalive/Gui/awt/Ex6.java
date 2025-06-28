
package in.scalive.Gui.awt;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame3  extends Frame implements ActionListener{
    public MyFrame3(){
        setTitle("Lalit's Frame");
        setBounds(200,200,400,400);
        Button b1=new Button("Quit"); 
        Button b2=new Button("Change Color"); 
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        add(b1);
        add(b2);
        CloseFrame cf=new CloseFrame();
        b1.addActionListener(cf);
        b2.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.yellow);
    }
}
class CloseFrame implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    
}

public class Ex6 {
    public static void main(String[] args) {
        MyFrame3 mf=new MyFrame3();        
    }
    
}
