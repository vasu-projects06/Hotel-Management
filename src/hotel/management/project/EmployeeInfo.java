
package hotel.management.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class EmployeeInfo extends JFrame implements ActionListener{
      
      JTable table;
      JButton b1;

      EmployeeInfo(){
         
             super("Taj Hotel");

             

             getContentPane().setBackground(Color.WHITE);
             setLayout(null);
               
             table = new JTable();
             table.setBounds(5, 40, 1150, 380);
             add(table);

             try{
                   Conn c = new Conn();
                   ResultSet rs = c.s.executeQuery("select * from employee");
                   table.setModel(DbUtils.resultSetToTableModel(rs));
                } 
             catch (Exception e){
                  e.printStackTrace(); 
               }
               
             JLabel l1 = new JLabel("Name");
             l1.setFont(new Font("Tahoma",Font.BOLD, 14));
             l1.setBounds(30, 10, 80, 20);
             add(l1);
             l1.setFont(new Font("Tahoma",Font.BOLD, 14));

             JLabel l2 = new JLabel("Age");
             l2.setFont(new Font("Tahoma", Font.BOLD, 14));
             l2.setBounds(185, 10, 80, 20);
             add(l2);

             JLabel l3 = new JLabel("Gender");
             l3.setFont(new Font("Tahoma", Font.BOLD, 14));
             l3.setBounds(320, 10, 100, 20);
             add(l3);

             JLabel l4 = new JLabel("Job");
             l4.setFont(new Font("Tahoma", Font.BOLD, 14));
             l4.setBounds(470, 10, 60, 20);
             add(l4);

             JLabel l5 = new JLabel("Salary");
             l5.setFont(new Font("Tahoma", Font.BOLD, 14));
             l5.setBounds(620, 10, 100, 20);
             add(l5);

             JLabel l6 = new JLabel("Phone");
             l6.setFont(new Font("Tahoma", Font.BOLD, 14));
             l6.setBounds(750, 10, 100, 20);
             add(l6);

             JLabel l7 = new JLabel("Aadhar");
             l7.setFont(new Font("Tahoma", Font.BOLD, 14));
             l7.setBounds(900, 10, 100, 20);
             add(l7);
 
             JLabel l8 = new JLabel("Email");
             l8.setFont(new Font("Tahoma", Font.BOLD, 14));
             l8.setBounds(1040, 10, 100, 20);
             add(l8);

             b1 = new JButton("Back");
             b1.setBounds(500, 460, 120, 35);
             b1.setBackground(Color.BLACK);
             b1.setForeground(Color.WHITE);
             b1.addActionListener(this);
             add(b1);



               setBounds(100, 150, 1150,580);
               setVisible(true);

}

  public void actionPerformed(ActionEvent ae){
       
        this.setVisible(false);
        new Reception();

}



  public static void main(String[] args){

     new EmployeeInfo();

}
}
