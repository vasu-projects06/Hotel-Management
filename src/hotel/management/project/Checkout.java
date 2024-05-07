
package hotel.management.project;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.util.Date;



public class Checkout extends JFrame implements ActionListener{

    Choice ch;     
    JLabel lb1, lb2, lb3,lb4, lb5, lb6, lb7, lb8;
    JButton b1, b2, b3, b4, b5;
   
     Checkout(){
 
            super("Taj Hotel");

            getContentPane().setBackground(Color.WHITE);
             setLayout(null);



             ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/t1.jpg"));
             Image i2 = i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
             ImageIcon i3 = new ImageIcon(i2);
             JLabel t1 = new JLabel(i3);
             t1.setBounds(380, 75, 30, 30);
             add(t1);

             
             

             JLabel text = new JLabel("Checkout");
             text.setFont(new Font("Tahoma",Font.PLAIN, 25));
             text.setForeground(Color.MAGENTA);
             text.setBounds(170, 10, 130, 30);
             add(text);

              JLabel l1 = new JLabel("ID");
              l1.setBounds(40, 80, 30, 25);
              l1.setFont(new Font("Tahoma",Font.PLAIN, 14));
              add(l1);


              ch = new Choice();
              ch.setBounds(230, 80, 150, 25);
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

                 JLabel l2 = new JLabel("Room NO");
                 l2.setBounds(40, 120, 60, 25);
                 l2.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(l2);

                 lb1 = new JLabel();
                 lb1.setBounds(230, 120, 150, 25);
                 lb1.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(lb1);

                 JLabel l3 = new JLabel("Check-IN-Time");
                 l3.setBounds(40, 160, 120, 25);
                 l3.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(l3);

                 lb2 = new JLabel();
                 lb2.setBounds(230, 160, 150, 25);
                 lb2.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(lb2);
                 
                 
                 JLabel l4 = new JLabel("Check-Out-Time");
                 l4.setBounds(40, 200, 120, 25);
                 l4.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(l4);

                 Date date = new Date();
                 lb3 = new JLabel("" + date);
                 lb3.setBounds(230, 200, 210, 25);
                 lb3.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(lb3);


                 JLabel l5 = new JLabel("Price per Day");
                 l5.setBounds(40, 240, 120, 25);
                 l5.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(l5);

                 lb4 = new JLabel();
                 lb4.setBounds(230, 240, 150, 25);
                 lb4.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(lb4);

                 JLabel l6 = new JLabel("Amount Paid");
                 l6.setBounds(40, 280, 100, 25);
                 l6.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(l6);

                 lb5 = new JLabel();
                 lb5.setBounds(230, 280, 150, 25);
                 lb5.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(lb5);

                 JLabel l7 = new JLabel("Number of Days Stay");
                 l7.setBounds(40, 320, 140, 25);
                 l7.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(l7);

                 lb6 = new JLabel();
                 lb6.setBounds(230, 320, 150, 25);
                 lb6.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(lb6);

                 JLabel l8 = new JLabel("Total Amount");
                 l8.setBounds(40, 360, 100, 25);
                 l8.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(l8);

                 lb7 = new JLabel();
                 lb7.setBounds(230, 360, 750, 25);
                 lb7.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(lb7);

                 JLabel l9 = new JLabel("Pending Amount");
                 l9.setBounds(40, 400, 120, 25);
                 l9.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(l9);

                 lb8 = new JLabel();
                 lb8.setBounds(230, 400, 150, 25);
                 lb8.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(lb8);

                 
                 b1 = new JButton("Check");
                 b1.setBounds(100, 450, 110, 30);
                 b1.setBackground(Color.BLACK);
                 b1.setForeground(Color.WHITE);
                 b1.addActionListener(this);
                 add(b1);

                 b2 = new JButton("Generate Bill");
                 b2.setBounds(260, 450, 110, 30);
                 b2.setBackground(Color.BLACK);
                 b2.setForeground(Color.WHITE);
                 b2.addActionListener(this);
                 add(b2);

                 b3 = new JButton("Add");
                 b3.setBounds(40, 490, 110, 30);
                 b3.setBackground(Color.BLACK);
                 b3.setForeground(Color.WHITE);
                 b3.addActionListener(this);
                 add(b3);

                 b4 = new JButton("CheckOut");
                 b4.setBounds(180, 490, 110, 30);
                 b4.setBackground(Color.BLACK);
                 b4.setForeground(Color.WHITE);
                 b4.addActionListener(this);
                 add(b4);

                 b5 = new JButton("Back");
                 b5.setBounds(320, 490, 110, 30);
                 b5.setBackground(Color.BLACK);
                 b5.setForeground(Color.WHITE);
                 b5.addActionListener(this);
                 add(b5);

                

                 ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/out.jpg"));
                 Image i5 = i4.getImage().getScaledInstance(480, 360, Image.SCALE_DEFAULT);
                 ImageIcon i6 = new ImageIcon(i5);
                 JLabel image = new JLabel(i6);
                 image.setBounds(480, 65, 480, 360);
                 add(image);


                 setBounds(180, 150, 1050, 570);
                  setVisible(true);
         

         }

    public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == b1){ 
              String l1 = ch.getSelectedItem();
              String query = "Select * from customer where number = '"+l1+"'";
              try{
              Conn conn = new Conn();
              ResultSet rs = conn.s.executeQuery(query);
               while(rs.next()){
                    lb1.setText(rs.getString("room"));
                    lb2.setText(rs.getString("checkintime"));
                    lb4.setText(rs.getString("price"));
                    lb5.setText(rs.getString("deposit"));
                    lb6.setText(rs.getString("days"));    
                    }
                      
                      ResultSet rs2 = conn.s.executeQuery("Select * from customer where number = '"+ch.getSelectedItem()+"'");
                   while(rs2.next()){
                         int price = Integer.parseInt(lb4.getText());
                         int days = Integer.parseInt(lb6.getText());
                         int deposit = Integer.parseInt(lb5.getText());
                        if(price * days > 0){
                             
                              int l8 = price * days;
                               lb7.setText(""+l8);

                              int l9 = l8 - deposit;
                              lb8.setText(""+l9);
                            
                        }else{
                            JOptionPane.showMessageDialog(null, "Please enter a valid No Of Days");
                            }


                         }
              
                           
               }catch(Exception e){
                    e.printStackTrace();
           }

         }else if(ae.getSource() == b2){
            
           
            new GenerateBill().setVisible(true);
           this.setVisible(false);

         }else if(ae.getSource() == b3){
          
            String CNumber = (String)ch.getSelectedItem();
            String CRoomno = lb1.getText();
            String Ccheckin = lb2.getText();
            String Ccheckout = lb3.getText();
            String CPrice = lb4.getText();
            String CPaid = lb5.getText();
            String CNoofday = lb6.getText();
            String CTotal = lb7.getText();
            String CPending = lb8.getText();

             String str = "insert into Able values('"+CNumber+"','"+CRoomno+"','"+Ccheckin+"','"+Ccheckout+"','"+CPrice+"','"+CPaid+"','"+CNoofday+"','"+CTotal+"','"+CPending+"')";
             String qry = "update Able set CNumber = '"+CNumber+"', CRoomno = '"+CRoomno+"', Ccheckin = '"+Ccheckin+"', Ccheckout = '"+Ccheckout+"', CPrice = '"+CPrice+"', CPaid = '"+CPaid+"', CNoofday = '"+CNoofday+"', CTotal = '"+CTotal+"', CPending = '"+CPending+"' where CNumber = '"+ch.getSelectedItem()+"'";

            try{
                
                 Conn c = new Conn();
                 c.s.executeUpdate(str);
                 c.s.executeUpdate(qry);
                
                JOptionPane.showMessageDialog(null, "New CheckOut data Added Successfully");
        
            }catch(Exception e){
                e.printStackTrace();
            }




           }else if(ae.getSource() == b4){
                      String query2 = "delete from customer where number = '"+ch.getSelectedItem()+"'";
                      String query3 = "update room set available = 'Available' where roomno = '"+lb1.getText()+"'";
                      String query4 = "delete from Able where CNumber = '"+ch.getSelectedItem()+"'";
                     try{
                             Conn conn = new Conn();
                             conn.s.executeUpdate(query2);
                             conn.s.executeUpdate(query3);
                             conn.s.executeUpdate(query4);

                           JOptionPane.showMessageDialog(null, "CheckOut done");
                             setVisible(false);
                             new Reception();

                        }catch(Exception e){
                             e.printStackTrace();
                            }





              }else{
                     setVisible(false);
                             new Reception();
                      }
}


 public static void main(String[] args){
          new Checkout();

    }
 
    
}
