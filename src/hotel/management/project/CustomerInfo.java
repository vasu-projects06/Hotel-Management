
package hotel.management.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class CustomerInfo extends JFrame implements ActionListener{
      
      JTable table;
      JButton b1;

      CustomerInfo(){
           

             super("Taj Hotel");
         
             getContentPane().setBackground(Color.WHITE);
             setLayout(null);
               
             table = new JTable();
             table.setBounds(3, 40, 1390, 380);
             add(table);

             try{
                   Conn c = new Conn();
                   ResultSet rs = c.s.executeQuery("select * from customer");
                   table.setModel(DbUtils.resultSetToTableModel(rs));
                } 
             catch (Exception e){
                  e.printStackTrace(); 
               }
               
             JLabel l1 = new JLabel("ID");
             l1.setFont(new Font("Tahoma",Font.BOLD, 13));
             l1.setBounds(25, 10, 40, 20);
             add(l1);
             
             JLabel l2 = new JLabel("Number");
             l2.setFont(new Font("Tahoma", Font.BOLD, 13));
             l2.setBounds(110, 10, 80, 20);
             add(l2);

             JLabel l3 = new JLabel("Name");
             l3.setFont(new Font("Tahoma", Font.BOLD, 13));
             l3.setBounds(220, 10, 50, 20);
             add(l3);

             JLabel l4 = new JLabel("Gender");
             l4.setFont(new Font("Tahoma", Font.BOLD, 13));
             l4.setBounds(310, 10, 60, 20);
             add(l4);

             JLabel l5 = new JLabel("Country");
             l5.setFont(new Font("Tahoma", Font.BOLD, 13));
             l5.setBounds(400, 10, 80, 20);
             add(l5);

             JLabel l6 = new JLabel("Address");
             l6.setFont(new Font("Tahoma", Font.BOLD, 13));
             l6.setBounds(490, 10, 90, 20);
             add(l6);

             JLabel l7 = new JLabel("Phone No");
             l7.setFont(new Font("Tahoma", Font.BOLD, 13));
             l7.setBounds(580, 10, 100, 20);
             add(l7);
 
             JLabel l8 = new JLabel("Room Type");   
             l8.setFont(new Font("Tahoma", Font.BOLD, 13));
             l8.setBounds(670, 10, 100, 20);
             add(l8);

             JLabel l9 = new JLabel("Room No");
             l9.setFont(new Font("Tahoma", Font.BOLD, 13));
             l9.setBounds(770, 10, 100, 20);
             add(l9);

             JLabel l10 = new JLabel("Bed Type");
             l10.setFont(new Font("Tahoma", Font.BOLD, 13));
             l10.setBounds(850, 10, 100, 20);
             add(l10);

             JLabel l11 = new JLabel("CheckInTime");
             l11.setFont(new Font("Tahoma", Font.BOLD, 13));
             l11.setBounds(935, 10, 100, 20);
             add(l11);

             JLabel l12 = new JLabel("Email");
             l12.setFont(new Font("Tahoma", Font.BOLD, 13));
             l12.setBounds(1060, 10, 70, 20);
             add(l12);

             JLabel l13 = new JLabel("Price");
             l13.setFont(new Font("Tahoma", Font.BOLD, 13));
             l13.setBounds(1150, 10, 100, 20);
             add(l13);

             JLabel l14 = new JLabel("Deposit");
             l14.setFont(new Font("Tahoma", Font.BOLD, 13));
             l14.setBounds(1215, 10, 80, 20);
             add(l14);

             JLabel l15 = new JLabel("No of Days");
             l15.setFont(new Font("Tahoma", Font.BOLD, 13));
             l15.setBounds(1300, 10, 80, 20);
             add(l15);
  
         

             b1 = new JButton("Back");
             b1.setBounds(650, 460, 120, 35);
             b1.setBackground(Color.BLACK);
             b1.setForeground(Color.WHITE);
             b1.addActionListener(this);
             add(b1);



               setBounds(-10, 150, 1450, 580);
               setVisible(true);

}

  public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Reception();

}



  public static void main(String[] args){

     new CustomerInfo();

}
}
