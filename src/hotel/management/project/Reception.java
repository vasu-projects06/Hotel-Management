
package hotel.management.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Reception extends JFrame implements ActionListener{

   JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13; 

    Reception() {

       super("Taj Hotel");

       getContentPane().setBackground(Color.WHITE);
       setLayout(null);

       JPanel p1 = new JPanel();
       p1.setLayout(null);
       p1.setBackground(new Color(176, 152, 128));
       p1.setBounds(0, 0, 1400, 85);
       add(p1);

       ImageIcon i6 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/reception.png"));
       Image i7 = i6.getImage().getScaledInstance(80, 70, Image.SCALE_DEFAULT);
       ImageIcon i8 = new ImageIcon(i7);
       JLabel icon = new JLabel(i8);
       icon.setBounds(160, 5, 80, 70);
       p1.add(icon);
       
       JLabel l2 = new JLabel("Reception Details");
       l2.setBounds(320, 20, 700, 80);
       l2.setForeground(Color.WHITE);
       l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 70));
       p1.add(l2);

       b13 = new JButton("Rooms Sample Pics");
       b13.setBounds(280, 130, 220, 40);
       b13.setBackground(Color.BLACK);
       b13.setForeground(Color.WHITE);      
       b13.addActionListener(this);       
       add(b13);

       b1 = new JButton("New Customer Form / Check-In");
       b1.setBounds(280, 200, 220, 40);
       b1.setBackground(Color.BLACK);
       b1.setForeground(Color.WHITE);
       b1.addActionListener(this);   
       add(b1);

       b2 = new JButton("Rooms");
       b2.setBounds(280, 270, 220, 40);
       b2.setBackground(Color.BLACK);
       b2.setForeground(Color.WHITE);
       b2.addActionListener(this);         
       add(b2);
       
       b3 = new JButton("Department");
       b3.setBounds(280, 340, 220, 40);
       b3.setBackground(Color.BLACK);
       b3.setForeground(Color.WHITE);   
       b3.addActionListener(this);    
       add(b3);

       b4 = new JButton("All Employee");
       b4.setBounds(280, 410, 220, 40);
       b4.setBackground(Color.BLACK);
       b4.setForeground(Color.WHITE); 
       b4.addActionListener(this);       
       add(b4);

       b5 = new JButton("Customer Info");
       b5.setBounds(280, 480, 220, 40);
       b5.setBackground(Color.BLACK);
       b5.setForeground(Color.WHITE); 
       b5.addActionListener(this);     
       add(b5);

       b6 = new JButton("Manager Info");
       b6.setBounds(280, 550, 220, 40);
       b6.setBackground(Color.BLACK);
       b6.setForeground(Color.WHITE);
       b6.addActionListener(this);             
       add(b6);

       b7 = new JButton("Update Status");
       b7.setBounds(280, 620, 220, 40);
       b7.setBackground(Color.BLACK);
       b7.setForeground(Color.WHITE);    
       b7.addActionListener(this);         
       add(b7);

       b8 = new JButton("Update Room Status");
       b8.setBounds(530, 130, 220, 40);
       b8.setBackground(Color.BLACK);
       b8.setForeground(Color.WHITE); 
       b8.addActionListener(this);              
       add(b8);

       b9 = new JButton("Check out");
       b9.setBounds(530, 200, 220, 40);
       b9.setBackground(Color.BLACK);
       b9.setForeground(Color.WHITE);      
       b9.addActionListener(this);         
       add(b9);
      
       b10 = new JButton("Pickup Service");
       b10.setBounds(530, 270, 220, 40);
       b10.setBackground(Color.BLACK);
       b10.setForeground(Color.WHITE);   
       b10.addActionListener(this);              
   
       add(b10);

       b11 = new JButton("Search Room");
       b11.setBounds(530, 340, 220, 40);
       b11.setBackground(Color.BLACK);
       b11.setForeground(Color.WHITE); 
       b11.addActionListener(this);       
       add(b11);

       b12 = new JButton("Logout");
       b12.setBounds(530, 410, 220, 40);
       b12.setBackground(Color.BLACK);
       b12.setForeground(Color.WHITE);      
       b12.addActionListener(this);       
       add(b12);


       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/reception3.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1400, 766, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel Image = new JLabel(i3);
       Image.setBounds(0, 0, 1400, 766);
       add(Image);

       ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/design3.jpg"));
        JLabel l5 = new JLabel(i4);
        l5.setBounds(870, 180, 180, 60);
        Image.add(l5);

 

       setBounds(-10, 0, 1400, 766);
       setVisible(true);
}
 
  public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == b1){
          this.setVisible(false);
          new AddCustomer().setVisible(true);
        }else if(ae.getSource() == b2){
           this.setVisible(false);
           new AllRooms();
        }else if(ae.getSource() == b3){
           this.setVisible(false);
           new Department();
        }else if(ae.getSource() == b4){
            this.setVisible(false);
            new EmployeeInfo();
        }else if(ae.getSource() == b5){
            this.setVisible(false);
            new CustomerInfo();
        }else if(ae.getSource() == b6){
            this.setVisible(false);
            new ManagerInfo();
        }else if(ae.getSource() == b7){
            this.setVisible(false);
            new UpdateCheck();
        }
         else if(ae.getSource() == b11){
            this.setVisible(false);
            new SearchRoom();
        }else if(ae.getSource() == b8){
            this.setVisible(false);
            new UpdateRoom();
        }else if(ae.getSource() == b10){
            this.setVisible(false);
            new PickUp();
        }else if(ae.getSource() == b9){
            this.setVisible(false);
            new Checkout();
          }else if(ae.getSource() == b12){
            this.setVisible(false);
            System.exit(0);
           }else if(ae.getSource() == b13){
            this.setVisible(false);
            new Single();
           }

}
public static void main(String[] args) {
      new Reception();

}

    
}
