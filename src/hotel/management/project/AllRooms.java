
package hotel.management.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class AllRooms extends JFrame implements ActionListener{
      
      JTable table;
      JButton b1;

      AllRooms(){

             super("Taj Hotel");
         
             getContentPane().setBackground(Color.WHITE);
             setLayout(null);

             ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/all.jpg"));
             Image i2 = i1.getImage().getScaledInstance(570, 550, Image.SCALE_DEFAULT);
             ImageIcon i3 = new ImageIcon(i2);
             JLabel Image = new JLabel(i3);
             Image.setBounds(480, 0, 570, 550);
             add(Image);
               
             table = new JTable();
             table.setBounds(5, 40, 480, 450);
             add(table);

             try{
                   Conn c = new Conn();
                   ResultSet rs = c.s.executeQuery("select * from room");
                   table.setModel(DbUtils.resultSetToTableModel(rs));
                } 
             catch (Exception e){
                  e.printStackTrace(); 
               }
               
             JLabel l1 = new JLabel("roomno");
             l1.setFont(new Font("Tahoma",Font.BOLD, 14));
             l1.setBounds(10, 5, 60, 25);
             add(l1);
             l1.setFont(new Font("Tahoma",Font.BOLD, 14));

             JLabel l2 = new JLabel("available");
             l2.setFont(new Font("Tahoma", Font.BOLD, 14));
             l2.setBounds(90, 5, 80, 25);
             add(l2);

             JLabel l3 = new JLabel("status");
             l3.setFont(new Font("Tahoma", Font.BOLD, 14));
             l3.setBounds(180, 5, 60, 25);
             add(l3);

             JLabel l4 = new JLabel("price");
             l4.setFont(new Font("Tahoma", Font.BOLD, 14));
             l4.setBounds(270, 5, 60, 25);
             add(l4);

             JLabel l5 = new JLabel("type");
             l5.setFont(new Font("Tahoma", Font.BOLD, 14));
             l5.setBounds(340, 5, 60, 25);
             add(l5);

             JLabel l6 = new JLabel("roomtype");
             l6.setFont(new Font("Tahoma", Font.BOLD, 14));
             l6.setBounds(410, 5, 80, 25);
             add(l6);

            
             b1 = new JButton("Back");
             b1.setBounds(320, 500, 100, 25);
             b1.setBackground(Color.BLACK);
             b1.setForeground(Color.WHITE);
             b1.addActionListener(this);
             add(b1);



               setBounds(170, 150, 1050,580);
               setVisible(true);

}

  public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Reception();

}



  public static void main(String[] args){

     new AllRooms();

}
}
