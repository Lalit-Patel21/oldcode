
//package in.scalive.Gui.awt;
//
//import java.util.Random;
//
//
//public class Ex10 {
//    public static void main(String[] args) {
//        
//        Random rnd = new Random();
//        int n = rnd.nextInt(50);
//        System.out.println(" "+n);
//        int a=89;
//        String str;
//        str=String.valueOf(a);
//        System.out.println(str);
//                
//        
//    }
//    
//}
package in.scalive.Gui.awt;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class MyFrame7  extends Frame implements ActionListener{
    int count;
    Button b1,b2,b3;
    Random rnd;
    public MyFrame7(){
        setTitle("0");
        setBounds(200,200,400,400);
        b1=new Button("Change Color"); 
        b2=new Button("Click Me");
        b3=new Button("Quit");
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        add(b1);
        add(b2);
        add(b3);
       
        CloseFrame cf=new CloseFrame();
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
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
            ++count;
            setTitle(String.valueOf(count));
        }
        else 
            System.exit(0);
    }
}
public class Ex10 {
    public static void main(String[] args) {
        MyFrame7 mf=new MyFrame7();        
    }
    
}
