package loginform;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{


    
     Container c;
    JLabel L1;
    JLabel L2;
    JTextField user;
    JPasswordField pass;
    JButton btn;
    MyFrame(){
        
        
        setTitle("Login Form");
        setBounds(200,150,400,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        
       new Container(); 
        
        JLabel L1 =new JLabel("Username");
        JLabel L2 =new JLabel(" Password");
        
        
        new Container(); 
        c = getContentPane();
        c.setLayout(null);
        
        L1.setBounds(30,40,250,50);
        L2.setBounds(30,100,250,50);
        
        c.add(L1);
        c.add(L2);
        
        user = new JTextField();
        user.setBounds(100, 50, 200, 30);
        c.add(user);
        user.setFont(new Font("Arial",Font.PLAIN,20));
       // Font Font = new Font ("arial",Font.BOLD,40);
       
        pass = new JPasswordField();
        pass.setBounds(100, 110, 200, 30);
        c.add(pass);
        pass.setFont(new Font("Arial",Font.PLAIN,20));
        pass.setEchoChar('*');
        
        btn = new JButton();
        btn .setBounds(120,170,150,40);
        c.add(btn);
        btn.setText("Click Me");
        btn.setForeground(Color.red);
        btn.setBackground(Color.GREEN);
        btn.setFont(new Font("Arial",Font.PLAIN,25));
        btn.addActionListener(this);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        System.out.println("Username : "+user.getText()); 
        System.out.println("Password : "+ pass.getText()); 
    }
    
    
}


public class LoginForm {
    public static void main(String[] args) {
     
        // TODO code application logic here
        MyFrame f = new MyFrame();
          

    }
    
}
