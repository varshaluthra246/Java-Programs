import javax.swing.*;  
class LabelExample  
{  
public static void main(String args[])  
    {  
    JFrame f= new JFrame("LABEL DESIGN"); 
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
    JLabel l1,l2;  
    l1=new JLabel("WELCOME");  
    l1.setBounds(50,50, 100,30);  
    l2=new JLabel("STUDENT OF GURUKUL.");  
    l2.setBounds(50,100, 100,300);  
    f.add(l1); f.add(l2);  
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);  
    }  
    } 