
package hotel.management.project;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;



public class UpdateCheck extends JFrame implements ActionListener{

    Choice ch;     
    JTextField t1, t2, t3, t4, t5; 
    JButton b1, b2, b3;
     UpdateCheck(){

          super("Taj Hotel");

         getContentPane().setBackground(Color.WHITE);
         setLayout(null);

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/update.jpg"));
         Image i2 = i1.getImage().getScaledInstance(410, 500, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel Image = new JLabel(i3);
         Image.setBounds(410, 0, 400, 500);
         add(Image);


         JLabel text = new JLabel("Update Status");
         text.setFont(new Font("Tahoma",Font.PLAIN, 23));
         text.setForeground(Color.BLUE);
         text.setBounds(130, 10, 150, 30);
         add(text);

         JLabel l1 = new JLabel("ID");
         l1.setBounds(50, 80, 30, 25);
         l1.setFont(new Font("Tahoma",Font.PLAIN, 14));
         add(l1);


        ch = new Choice();
        ch.setBounds(210, 80, 150, 25);
        add(ch);

        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("Select* from customer");
            while(rs.next()){
                   ch.add(rs.getString("number"));
              }
        }catch(Exception ae){
             ae.printStackTrace();
        }

         JLabel l2 = new JLabel("Room No");
         l2.setBounds(50, 130, 60, 25);
         l2.setFont(new Font("Tahoma",Font.PLAIN, 14));
         add(l2);

         t1 = new JTextField();
         t1.setBounds(210, 130, 150, 25);
         add(t1);

         JLabel l3 = new JLabel("Name");
         l3.setBounds(50, 180, 70, 25);
         l3.setFont(new Font("Tahoma",Font.PLAIN, 14));
         add(l3);

         t2 = new JTextField();
         t2.setBounds(210, 180, 150, 25);
         add(t2);

         JLabel l4 = new JLabel("Check-In-Time");
         l4.setBounds(50, 230, 100, 25);
         l4.setFont(new Font("Tahoma",Font.PLAIN, 14));
         add(l4);

         t3 = new JTextField();
         t3.setBounds(210, 230, 150, 25);
         add(t3);

         JLabel l5 = new JLabel("Amount Paid");
         l5.setBounds(50, 280, 100, 25);
         l5.setFont(new Font("Tahoma",Font.PLAIN, 14));
         add(l5);

         t4 = new JTextField();
         t4.setBounds(210, 280, 150, 25);
         add(t4);

         JLabel l6 = new JLabel("No of Days");
         l6.setBounds(50, 330, 120, 25);
         l6.setFont(new Font("Tahoma",Font.PLAIN, 14));
         add(l6);

         t5 = new JTextField();
         t5.setBounds(210, 330, 150, 25);
         add(t5);

         setBounds(250, 170, 880, 500);
         setVisible(true);

         b1 = new JButton("Check");
         b1.setBounds(70, 400, 100, 25);
         b1.setBackground(Color.BLACK);
         b1.setForeground(Color.WHITE);
         b1.addActionListener(this);
         add(b1);

         b2 = new JButton("Update");
         b2.setBounds(190, 400, 100, 25);
         b2.setBackground(Color.BLACK);
         b2.setForeground(Color.WHITE);
         b2.addActionListener(this);
         add(b2);

         b3 = new JButton("Back");
         b3.setBounds(310, 400, 100, 25);
         b3.setBackground(Color.BLACK);
         b3.setForeground(Color.WHITE);
         b3.addActionListener(this);
         add(b3);
         
}

    public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == b1){ 
              String l1 = ch.getSelectedItem();
              String query = "Select * from customer where number = '"+l1+"'";
              try{
              Conn conn = new Conn();
              ResultSet rs = conn.s.executeQuery(query);
               while(rs.next()){
                    t1.setText(rs.getString("room"));
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("checkintime"));
                    t4.setText(rs.getString("deposit")); 
                    t5.setText(rs.getString("days"));                     
                    }

                   

               }catch(Exception e){
                    e.printStackTrace();
           }

         }else if(ae.getSource() == b2){
              String number = ch.getSelectedItem();
              String room = t1.getText();
              String name = t2.getText();
              String checkintime = t3.getText();
              String deposit = t4.getText();
              String days = t5.getText();
  
                try{
                   Conn conn = new Conn();
                   conn.s.executeUpdate("update customer set room = '"+room+"', name = '"+name+"', checkintime = '"+checkintime+"', deposit = '"+deposit+"', days = '"+days+"' where number = '"+number+"'");
 
                   JOptionPane.showMessageDialog(null, "Data Updated Successfully");
                     this.setVisible(false);
                         new Reception();
                }catch(Exception e){
                     e.printStackTrace();
                   }


         }else{
              this.setVisible(false);
               new Reception();

         }



    }
  
     public static void main(String[] args){
          new UpdateCheck();

    }
 
    
}
