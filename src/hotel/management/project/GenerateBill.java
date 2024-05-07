
package hotel.management.project;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;



public class GenerateBill extends JFrame implements ActionListener{
    
     JButton check, print;
     JLabel l1, lb3;
     JTextArea area;
     Choice ch;

  GenerateBill(){

         
      
       super("Taj Hotel");
      
      setLayout(new BorderLayout());
 
       JPanel panel = new JPanel();
       JPanel panel2 = new JPanel();
       l1 = new JLabel("Generate Bill");

        ch = new Choice();
              
     

               try{
                   Conn c = new Conn();
                   ResultSet rs = c.s.executeQuery("Select * from customer");
                   while(rs.next()){
                        ch.add(rs.getString("number"));
                      }
                }catch(Exception ae){
                    ae.printStackTrace();
                   }  
          
        
                 

       area = new JTextArea(45, 15);
       area.setText("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =\n\n\t  Welcome in Billing Section\t\n\t      TAJ HOTEL ,India\t"
                                  + "\t\n\n= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
       area.setFont(new Font("Senserif",Font.ITALIC, 18));
       JScrollPane pane = new JScrollPane(area);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/bill.jpg"));
       Image i2 = i1.getImage().getScaledInstance(80,50, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel icon = new JLabel(i3);
       icon.setBounds(350, 45, 80, 50);
       area.add(icon);

       ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/hotelicon.jpg"));
       Image i5 = i4.getImage().getScaledInstance(80,70, Image.SCALE_DEFAULT);
       ImageIcon i6 = new ImageIcon(i5);
       JLabel icon1 = new JLabel(i6);
       icon1.setBounds(20, 15, 80, 70);
       area.add(icon1);

       ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/phone2.jpg"));
       Image i8 = i7.getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT);
       ImageIcon i9 = new ImageIcon(i8);
       JLabel icon2 = new JLabel(i9);
       icon2.setBounds(110, 65, 30, 30);
       area.add(icon2);

       check = new JButton("Generate Bill");
       check.addActionListener(this);
       check.setSize(50,50);

       print = new JButton("Print");
       print.addActionListener(this);

       JLabel l4 = new JLabel("Check-Out-Time:");
                 l4.setBounds(40, 200, 120, 25);
                 l4.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(l4);

                 java.util.Date date = new java.util.Date();
                 lb3 = new JLabel("" + date);
                 lb3.setBounds(230, 200, 210, 25);
                 lb3.setFont(new Font("Tahoma",Font.PLAIN, 14));
                 add(lb3);
     

       panel.add(l1);
       add(panel, "North");
       add(pane,"Center");
       panel.add(ch);
       add(panel2, "South");
       panel2.add(check);
       panel2.add(print);

        setBounds(400, 30, 530, 700);
        setVisible(true);
      
 
    }

    public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == check){ 
             
             
             try{
             
                   
             Conn c = new Conn();
             area.setText("\n\t        TAJ HOTEL\n\n\t            contactno - \n      +91-8984877733, +91-9089756433, +91-7685870087"
                                 + " \n\t Address - Delhi-110021, India\n=============================================");
             
                String number = ch.getSelectedItem();

             ResultSet rs2 = c.s.executeQuery("Select * from customer where number = '"+ch.getSelectedItem()+"'");
             

                 if(rs2.next()){
                     area.append("\n\n\n  Customer ID       :      " + rs2.getString("number"));
                     area.append("\n  Customer Name       : " + rs2.getString("name"));
                     area.append("\n  Gender         : " + rs2.getString("gender"));
                     area.append("\n  Country        : " + rs2.getString("country"));
                     area.append("\n  Address        : " + rs2.getString("address"));
                     area.append("\n  Phone Number   : " + rs2.getString("phone"));
                     area.append("\n  Room Type      : " + rs2.getString("roomtype"));
                     area.append("\n  Email          : " + rs2.getString("email"));
                     area.append("\n");
                     area.append("\n--------------------------------------------------------------------");
                     area.append("\n\n");
                     area.append("\n  Room Number      :     " + rs2.getString("room"));
                     area.append("\n  BedType          :     " + rs2.getString("bedtype"));
                     area.append("\n  Check-In-Time     :     " + rs2.getString("checkintime"));
                     area.append("\n  Price per day      :     " + rs2.getString("price"));
                     area.append("\n  Amount Paid       :     " + rs2.getString("deposit"));
                     area.append("\n  No of Days Stay    :     " + rs2.getString("days"));
                     

                   }
                       rs2 = c.s.executeQuery("Select * from Able where CNumber = '"+ch.getSelectedItem()+"'");
                          String CNumber = ch.getSelectedItem();
                        if(rs2.next()){
                  
                     
                     area.append("\n  Check-Out-Time  : " + rs2.getString("Ccheckout"));
                     area.append("\n\n\t\t   ----------------------------------------");
                     area.append("\n\t\t Total Amount      : " + rs2.getString("CTotal") +" Rs");
                     area.append("\n\t\t Amount Paid      :   -" +rs2.getString("CPaid") +" Rs");
                     area.append("\n\t\t                              ---------------");
                     area.append("\n\t\t Pending Amount : " + rs2.getString("CPending") +" Rs");
                     area.append("\n\n\n\n\n\t     Thanks For Visiting Taj Hotel       ");
                   
                   }


              }catch(Exception e){
                    e.printStackTrace();
                  }







       }else{
             try{
                  area.print();
            }catch(Exception e){
                 e.printStackTrace();
              }
          }

}

          
  public static void main(String[] args){
       new GenerateBill();
  }
}
