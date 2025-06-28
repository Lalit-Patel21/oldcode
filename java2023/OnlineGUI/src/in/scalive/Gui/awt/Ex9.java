
package in.scalive.Gui.awt;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class MyFrame6  extends Frame implements ActionListener{
    Button b1,b2;
    Random rnd;
    public MyFrame6(){
        setTitle("Lalit's Frame");
        setBounds(200,200,400,400);
        b1=new Button("Change Color"); 
        b2=new Button("Quit");
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        add(b1);
        add(b2);
       
        CloseFrame cf=new CloseFrame();
        b1.addActionListener(this);
        b2.addActionListener(this);
         rnd = new Random();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b1){
           int red = rnd.nextInt(256);
           int green = rnd.nextInt(256);
           int blue = rnd.nextInt(256);
          Color c = new Color(red,green,blue);
          setBackground(c);
         
        }
        else 
            System.exit(0);
    }
}
public class Ex9 {
    public static void main(String[] args) {
        MyFrame6 mf=new MyFrame6();        
    }
    
}




