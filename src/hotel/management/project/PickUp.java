package hotel.management.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class PickUp extends JFrame implements ActionListener{
      
      JTable table;
      JButton b1, b2;
      Choice croom;
      
      JCheckBox available;
      

      PickUp(){
         
            super("Taj Hotel");

             getContentPane().setBackground(Color.WHITE);
             setLayout(null);

             table = new JTable();
             table.setBounds(10, 190, 1050, 240);
             add(table);

             try{
                   Conn c = new Conn();
                   ResultSet rs = c.s.executeQuery("select * from driver");
                   table.setModel(DbUtils.resultSetToTableModel(rs));
                } 
             catch (Exception e){
                  e.printStackTrace(); 
               }

             JLabel text = new JLabel("PickUp Service");
             text.setFont(new Font("Tahoma",Font.PLAIN, 23));
             text.setForeground(Color.MAGENTA);
             text.setBounds(440, 10, 200, 30);
             add(text);
             
             JLabel type = new JLabel("Type of Car");
             type.setFont(new Font("Tahoma", Font.PLAIN, 14));
             type.setForeground(Color.BLACK);
             type.setBounds(70, 90, 100, 27);
             add(type);

             croom = new Choice();
             try{
             Conn conn = new Conn();
             String query = "select * from driver"; 
             ResultSet rs = conn.s.executeQuery(query);
             while(rs.next()){
               croom.add((rs.getString("company")));
            }
             }catch(Exception e){
            e.printStackTrace();
          }
             croom.setBounds(200, 90, 150, 27);
             add(croom);
       

             available = new JCheckBox("Only Display Available");
             available.setBounds(700, 90, 150, 27);
             available.setBackground(Color.WHITE);
             add(available);
               
             JLabel l1 = new JLabel("Name");
             l1.setFont(new Font("Tahoma",Font.BOLD, 14));
             l1.setBounds(40, 160, 100, 20);
             add(l1);
             

             JLabel l2 = new JLabel("Age");
             l2.setFont(new Font("Tahoma", Font.BOLD, 14));
             l2.setBounds(200, 160, 100, 20);
             add(l2);

             JLabel l3 = new JLabel("Gender");
             l3.setFont(new Font("Tahoma", Font.BOLD, 14));
             l3.setBounds(350, 160, 100, 20);
             add(l3);

             JLabel l4 = new JLabel("Company");
             l4.setFont(new Font("Tahoma", Font.BOLD, 14));
             l4.setBounds(490, 160, 90, 20);
             add(l4);

             JLabel l5 = new JLabel("Model");
             l5.setFont(new Font("Tahoma", Font.BOLD, 14));
             l5.setBounds(640, 160, 110, 20);
             add(l5);

             JLabel l6 = new JLabel("Available");
             l6.setFont(new Font("Tahoma", Font.BOLD, 14));
             l6.setBounds(790, 160, 110, 20);
             add(l6);

             JLabel l7 = new JLabel("Location");
             l7.setFont(new Font("Tahoma", Font.BOLD, 14));
             l7.setBounds(920, 160, 110, 20);
             add(l7);

             b1 = new JButton("Check");
             b1.setBounds(370, 500, 120, 35);
             b1.setBackground(Color.BLACK);
             b1.setForeground(Color.WHITE);
             b1.addActionListener(this);
             add(b1);

             b2 = new JButton("Back");
             b2.setBounds(560, 500, 120, 35);
             b2.setBackground(Color.BLACK);
             b2.setForeground(Color.WHITE);
             b2.addActionListener(this);
             add(b2);



               setBounds(170, 140, 1050,580);
               setVisible(true);

}

  public void actionPerformed(ActionEvent ae){
     if(ae.getSource() == b1){
          try{
              String query1 = "select * from driver where company = '"+croom.getSelectedItem()+"'";
              String query2 = "select * from driver where available = 'Available' AND company = '"+croom.getSelectedItem()+"'";
          
              Conn conn = new Conn();
              ResultSet rs;
             if(available.isSelected()){
                  rs = conn.s.executeQuery(query2);
                 }else{
                  rs = conn.s.executeQuery(query1);
                  }
                  table.setModel(DbUtils.resultSetToTableModel(rs));
               }catch(Exception e){
                  e.printStackTrace();
                  }
          }else{

        this.setVisible(false);
        new Reception();

           }
}


  public static void main(String[] args){

     new PickUp();

}
}
