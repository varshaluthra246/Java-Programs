import javax.swing.*;  
class TextFieldExample  
{  
public static void main(String args[])  
    {  
    JFrame f= new JFrame("TextField Example");  
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTextField t1,t2;  
    t1=new JTextField("Welcome to GURUKUL.");  
    t1.setBounds(50,100, 200,30);  
    t2=new JTextField("Swing Tutorial");  
    t2.setBounds(50,150, 200,30);  
    f.add(t1); f.add(t2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
    }  
    }  