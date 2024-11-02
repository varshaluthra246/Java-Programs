import javax.swing.*;  
public class FirstSwingExample {  
public static void main(String[] args) { 
JFrame f=new JFrame("First");//creating instance of JFrame  
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

JButton b=new JButton("Submit");//creating instance of JButton  
b.setBounds(130,100,200, 80);//x axis, y axis, width, height  
          
f.add(b);//adding button in JFrame  
          
f.setSize(400,400);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}  