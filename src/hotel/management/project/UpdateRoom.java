package hotel.management.project;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;



public class UpdateRoom extends JFrame implements ActionListener{

    Choice ch;     
    JTextField t1, t2, t3, t4, t5; 
    JButton b1, b2, b3;
     UpdateRoom(){

          super("Taj Hotel");

         getContentPane().setBackground(Color.WHITE);
         setLayout(null);

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/updateroom2.jpg"));
         Image i2 = i1.getImage().getScaledInstance(320, 300, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel Image = new JLabel(i3);
         Image.setBounds(370, 40, 320, 300);
         add(Image);


         JLabel text = new JLabel("Update Room Status");
         text.setFont(new Font("Tahoma",Font.PLAIN, 23));
         text.setForeground(Color.BLUE);
         text.setBounds(130, 10, 220, 30);
         add(text);

         JLabel l1 = new JLabel("Room Number");
         l1.setBounds(50, 80, 90, 25);
         l1.setFont(new Font("Tahoma",Font.PLAIN, 14));
         add(l1);


        ch = new Choice();
        ch.setBounds(210, 80, 150, 25);
        add(ch);

        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("Select* from room");
            while(rs.next()){
                   ch.add(rs.getString("roomno"));
              }
        }catch(Exception ae){
             ae.printStackTrace();
        }

         JLabel l2 = new JLabel("Available");
         l2.setBounds(50, 130, 70, 25);
         l2.setFont(new Font("Tahoma",Font.PLAIN, 14));
         add(l2);

         t1 = new JTextField();
         t1.setBounds(210, 130, 150, 25);
         add(t1);

         JLabel l3 = new JLabel("Cleaning Status");
         l3.setBounds(50, 180, 120, 25);
         l3.setFont(new Font("Tahoma",Font.PLAIN, 14));
         add(l3);

         t2 = new JTextField();
         t2.setBounds(210, 180, 150, 25);
         add(t2);

         JLabel l4 = new JLabel("Price");
         l4.setBounds(50, 230, 70, 25);
         l4.setFont(new Font("Tahoma",Font.PLAIN, 14));
         add(l4);

         t3 = new JTextField();
         t3.setBounds(210, 230, 150, 25);
         add(t3);

         JLabel l5 = new JLabel("Bed Type");
         l5.setBounds(50, 280, 80, 25);
         l5.setFont(new Font("Tahoma",Font.PLAIN, 14));
         add(l5);

         t4 = new JTextField();
         t4.setBounds(210, 280, 150, 25);
         add(t4);

         JLabel l6 = new JLabel("Room Type");
         l6.setBounds(50, 330, 100, 25);
         l6.setFont(new Font("Tahoma",Font.PLAIN, 14));
         add(l6);

         t5 = new JTextField();
         t5.setBounds(210, 330, 150, 25);
         add(t5);

         setBounds(280, 170, 740, 500);
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
              String query = "Select * from room where roomno = '"+l1+"'";
              try{
              Conn conn = new Conn();
              ResultSet rs = conn.s.executeQuery(query);
               while(rs.next()){
                    t1.setText(rs.getString("available"));
                    t2.setText(rs.getString("status"));
                    t3.setText(rs.getString("price"));
                    t4.setText(rs.getString("type"));
                    t5.setText(rs.getString("roomtype"));           
                    }

               }catch(Exception e){
                    e.printStackTrace();
           }

         }else if(ae.getSource() == b2){
              String roomno = ch.getSelectedItem();
              String available = t1.getText();
              String status = t2.getText();
              String price = t3.getText();
              String type = t4.getText();
              String roomtype = t5.getText();
  
                try{
                   Conn conn = new Conn();
                   conn.s.executeUpdate("update room set available = '"+available+"', status = '"+status+"', price = '"+price+"', type = '"+type+"', roomtype = '"+roomtype+"' where roomno = '"+roomno+"'");
 
                   JOptionPane.showMessageDialog(null, "Room Updated Successfully");
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
          new UpdateRoom();

    }
 
    
}
