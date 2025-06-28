
package in.scalive.Gui.awt;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class MyFrame8  extends Frame implements ActionListener{
    int count;
    String str;
    Button b1,b2,b3,b4;
    Random rnd;
    public MyFrame8(){
        setTitle("0");
        setBounds(200,200,400,400);
        b1=new Button("Change Color"); 
        b2=new Button("Quit");
        b3=new Button("Increment");
        b4=new Button("Decrement");
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
        else if(e.getSource()==b2)
        {
            System.exit(0);
            
            
        }
//        else if(e.getSource()==b3) 
//        {
//            ++count;
//            setTitle(String.valueOf(count));
//        }
//        else 
//        {
//            count--;
//            setTitle(String.valueOf(count));
//            
//        }  
        else{
          count = (e.getSource()==b3) ? count+1:count-1;
          setTitle(String.valueOf(count));
            
        }
            
    }
}
public class Ex11 {
    public static void main(String[] args) {
        MyFrame8 mf=new MyFrame8();        
    }
    
}




