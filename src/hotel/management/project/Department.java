
package hotel.management.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class Department extends JFrame implements ActionListener{
      
      JTable table;
      JButton b1;

      Department(){
         
            super("Taj Hotel");

             getContentPane().setBackground(Color.WHITE);
             setLayout(null);
 
             ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/back1.jpg"));
             JLabel l5 = new JLabel(i1);
             l5.setBounds(0, 0, 900, 500);
             add(l5);
        
             
               
             table = new JTable();
             table.setBounds(0, 60, 900, 200);
             l5.add(table);

             try{
                   Conn c = new Conn();
                   ResultSet rs = c.s.executeQuery("select * from department");
                   table.setModel(DbUtils.resultSetToTableModel(rs));
                } 
             catch (Exception e){
                  e.printStackTrace(); 
               }
               
             JLabel l1 = new JLabel("Sno");
             l1.setFont(new Font("Tahoma",Font.BOLD, 14));
             l1.setBounds(80, 30, 40, 30);
             l5.add(l1);

             JLabel l2 = new JLabel("Department");
             l2.setFont(new Font("Tahoma", Font.BOLD, 14));
             l2.setBounds(380, 30, 120, 30);
             l5.add(l2);

             JLabel l3 = new JLabel("Budget");
             l3.setFont(new Font("Tahoma", Font.BOLD, 14));
             l3.setBounds(680, 30, 60, 30);
            l5.add(l3);


             b1 = new JButton("Back");
             b1.setBounds(380, 400, 100, 25);
             b1.setBackground(Color.BLACK);
             b1.setForeground(Color.WHITE);
             b1.addActionListener(this);
             l5.add(b1);



               setBounds(180, 150, 900,500);
               setVisible(true);

}

  public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Reception();

}



  public static void main(String[] args){

     new Department();

}
}
