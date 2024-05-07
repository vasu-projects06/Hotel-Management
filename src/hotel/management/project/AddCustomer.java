
package hotel.management.project;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Date;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.regex.*;







public class AddCustomer extends JFrame implements ActionListener{
    
    JComboBox c1, c2;
    JRadioButton r1, r2;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
    Choice croom;
    JLabel check;
    JButton b1, b2, b3;
   

      AddCustomer(){
          
          super("Taj Hotel");

          getContentPane().setBackground(Color.WHITE);
          setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/cust.jpg"));
        Image i2 = i1.getImage().getScaledInstance(880, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 880, 550);
        add(l1);
        
        

        JLabel title = new JLabel("New Customer Form");
        title.setFont(new Font("Tahoma", Font.BOLD, 26));
        title.setBounds(320, 10, 290, 30);
        l1.add(title);


        JLabel id = new JLabel("ID");
        id.setFont(new Font("Tahoma", Font.BOLD, 15));
        id.setForeground(Color.RED);
        id.setBounds(40, 75, 80, 20);
        l1.add(id);

        String options[] = {"Aadhar Card", "Passport"};
        c1 = new JComboBox(options);
        c1.setBounds(205, 75, 200, 20);
        c1.setBackground(Color.WHITE);
        l1.add(c1);

        JLabel number = new JLabel("Number");
        number.setFont(new Font("Tahoma", Font.BOLD, 15));
        number.setForeground(Color.RED);
        number.setBounds(510, 75, 80, 20);
        l1.add(number);

        t1 = new JTextField();
        t1.setBounds(650, 75, 200, 20);
        l1.add(t1);

        JLabel numbererror = new JLabel();
        numbererror.setFont(new Font("Tahoma", Font.PLAIN, 12));
        numbererror.setForeground(Color.RED);
        numbererror.setBounds(645, 95, 200, 12);
        l1.add(numbererror);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Tahoma", Font.BOLD, 15));
        name.setForeground(Color.RED);
        name.setBounds(40, 125, 80, 20);
        l1.add(name);

        t2 = new JTextField();
        t2.setBounds(205, 125, 200, 20);
        l1.add(t2);

         JLabel nameerror = new JLabel();
        nameerror.setFont(new Font("Tahoma", Font.PLAIN, 12));
        nameerror.setForeground(Color.RED);
        nameerror.setBounds(205, 145, 200, 12);
        l1.add(nameerror);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Tahoma", Font.BOLD, 15));
        gender.setForeground(Color.RED);
        gender.setBounds(510, 125, 80, 20);
        l1.add(gender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Newspwper", Font.BOLD, 14));
        r1.setBounds(665, 125, 70, 18);
        r1.setBackground(Color.WHITE);
        l1.add(r1);
         
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Newspwper", Font.BOLD, 14));
        r2.setBounds(755, 125, 90, 18);
        r2.setBackground(Color.WHITE);
        l1.add(r2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel country = new JLabel("Country");
        country.setFont(new Font("Tahoma", Font.BOLD, 15));
        country.setForeground(Color.RED);
        country.setBounds(40, 175, 80, 20);
        l1.add(country);

        String str[] = {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh",
                        "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi",
                        "Côte d'Ivoire", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo (Congo-Brazzaville)",
                        "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czechia (Czech Republic)", "Democratic Republic of the Congo", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador",
                        "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini (fmr. \"Swaziland\")", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Germany", "Ghana",
                        "Greece", "Grenada", "Guatemala", "Guinea", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Holy See", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq",
                        "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya",
                        "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia",
                        "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar (formerly Burma)", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger",
                        "Nigeria", "North Korea", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Palestine State", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland",
                        "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe",
                        "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Korea", "South Sudan",
                        "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia",
                        "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States of America", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela",
                        "Vietnam", "Yemen", "Zambia", "Zimbabwe"};
        c2 = new JComboBox(str);
        c2.setBounds(205, 175, 200, 20);
        c2.setBackground(Color.WHITE);
        l1.add(c2);
    
        JLabel address = new JLabel("Address");
        address.setFont(new Font("Tahoma", Font.BOLD, 15));
        address.setForeground(Color.RED);
        address.setBounds(510, 175, 80, 20);
        l1.add(address);

        t3 = new JTextField();
        t3.setBounds(650, 175, 200, 20);
        l1.add(t3);

        JLabel roomtype = new JLabel("RoomType");
        roomtype.setFont(new Font("Tahoma", Font.BOLD, 15));
        roomtype.setForeground(Color.RED);
        roomtype.setBounds(510, 225, 80, 20);
        l1.add(roomtype);

        t9 = new JTextField();
        t9.setBounds(650, 225, 200, 20);
        l1.add(t9);  
  
        JLabel bedtype = new JLabel("BedType");
        bedtype.setFont(new Font("Tahoma", Font.BOLD, 15));
        bedtype.setForeground(Color.RED);
        bedtype.setBounds(510, 275, 80, 20);
        l1.add(bedtype);

        t8 = new JTextField();
        t8.setBounds(650, 275, 200, 20);
        l1.add(t8);

        JLabel phone  = new JLabel("Phone Number");
        phone.setFont(new Font("Tahoma", Font.BOLD, 15));
        phone.setForeground(Color.RED);
        phone.setBounds(40, 225, 130, 20);
        l1.add(phone);

        t4 = new JTextField();
        t4.setBounds(205, 225, 200, 20);
        l1.add(t4);

        JLabel phoneerror  = new JLabel();
        phoneerror.setFont(new Font("Tahoma", Font.PLAIN, 12));
        phoneerror.setForeground(Color.RED);
        phoneerror.setBounds(205, 245, 200, 12);
        l1.add(phoneerror);

        JLabel room  = new JLabel("Allocated Room No.");
        room.setFont(new Font("Tahoma", Font.BOLD, 15));
        room.setForeground(Color.RED);
        room.setBounds(40, 275, 160, 20);
        l1.add(room);
 
        croom = new Choice();
        try{
          Conn conn = new Conn();
          String query = "select * from room where available = 'Available'"; 
          ResultSet rs = conn.s.executeQuery(query);
          while(rs.next()){
               croom.add((rs.getString("roomno")));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        croom.setBounds(205, 275, 200, 20);
        l1.add(croom);
 
        JLabel time  = new JLabel("Check-In Time");
        time.setFont(new Font("Tahoma", Font.BOLD, 15));
        time.setForeground(Color.RED);
        time.setBounds(40, 325, 160, 20);
        l1.add(time);

         Date date = new Date();

        check  = new JLabel("" + date);
        check.setFont(new Font("Tahoma", Font.BOLD, 15));
        check.setForeground(Color.BLACK);
        check.setBounds(205, 325, 280, 20);
        l1.add(check);

        JLabel price  = new JLabel("Price per day");
        price.setFont(new Font("Tahoma", Font.BOLD, 15));
        price.setForeground(Color.RED);
        price.setBounds(40, 375, 160, 20);
        l1.add(price);
 
        t7 = new JTextField();
        t7.setBounds(205, 375, 200, 20);
        l1.add(t7);


        JLabel email = new JLabel("Email");
        email.setFont(new Font("Tahoma", Font.BOLD, 15));
        email.setForeground(Color.RED);
        email.setBounds(510, 325, 80, 20);
        l1.add(email);

        t5 = new JTextField();
        t5.setBounds(650, 325, 200, 20);
        l1.add(t5);

        JLabel emailerror = new JLabel();
        emailerror.setFont(new Font("Tahoma", Font.PLAIN, 12));
        emailerror.setForeground(Color.RED);
        emailerror.setBounds(650, 345, 200, 12);
        l1.add(emailerror);

        JLabel deposit  = new JLabel("Deposit");
        deposit.setFont(new Font("Tahoma", Font.BOLD, 15));
        deposit.setForeground(Color.RED);
        deposit.setBounds(510, 375, 160, 20);
        l1.add(deposit);

        t6 = new JTextField();
        t6.setBounds(650, 375, 200, 20);
        l1.add(t6);

        JLabel depositerror  = new JLabel();
        depositerror.setFont(new Font("Tahoma", Font.PLAIN, 12));
        depositerror.setForeground(Color.RED);
        depositerror.setBounds(675, 395, 200, 12);
        l1.add(depositerror);
        

        JLabel days  = new JLabel("No of Days Stay");
        days.setFont(new Font("Tahoma", Font.BOLD, 15));
        days.setForeground(Color.RED);
        days.setBounds(510, 425, 160, 20);
        l1.add(days);

        t10 = new JTextField();
        t10.setBounds(650, 425, 200, 20);
        l1.add(t10);

        JLabel dayserror  = new JLabel();
        dayserror.setFont(new Font("Tahoma", Font.PLAIN, 12));
        dayserror.setForeground(Color.RED);
        dayserror.setBounds(650, 445, 200, 12);
        l1.add(dayserror);

        b1 = new JButton("Add");
        b1.setBounds(130, 480, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l1.add(b1);
        b1.setEnabled(false);
       
        
        b2 = new JButton("Cancel");
        b2.setBounds(310, 480, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l1.add(b2);

        b3 = new JButton("Check");
        b3.setBounds(260, 410, 80, 25);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l1.add(b3);


          t4.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = t4.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'){
                 if(l<10){
                        t4.setEditable(true);
                        phoneerror.setText("");
                    }else{
                             
                         t4.setEditable(false);
                           phoneerror.setText("* Please enter the 10 digit number");
                          }
            } else {

                    if(ke.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                         t4.setEditable(true);
                           }else{
                                t4.setEditable(false);
                                phoneerror.setText("* Enter only numeric digits(0-9)");
                            
            }
         }
}
      });

        t1.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = t1.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                 if(l<12){
                        t1.setEditable(true);
                        numbererror.setText("* Please enter the 12 digit number");
                    }else{
                         t1.setEditable(false);
                           numbererror.setText("* Please enter the 12 digit number");
                          }
            } else {

                    if(ke.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                         t1.setEditable(true);
                           }else{
                                t1.setEditable(false);
                                numbererror.setText("* Enter only numeric digits(0-9)");
                                }
            }
         }
      });

            t6.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = t6.getText();
            int l = value.length();
         
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'){
                 if(l<6){
                     
                        t6.setEditable(true);
                        depositerror.setText("* minimum RS 1500");
                           
                    }else{
                             
                         t6.setEditable(false);
                           depositerror.setText("* Please enter the valid number");
                          }
            } else {

                    if(ke.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                         t6.setEditable(true);
                           }else{
                                t6.setEditable(false);
                                depositerror.setText("* Enter only numeric digits(0-9)");
                            
            }
         }
}
      });

        t10.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = t10.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                 if(l<3){
                        t10.setEditable(true);
                        dayserror.setText("");
                    }else{
                         t10.setEditable(false);
                           dayserror.setText("* Please enter the valid number");
                          }
            } else {

                    if(ke.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                         t10.setEditable(true);
                           }else{
                                t10.setEditable(false);
                                dayserror.setText("* Enter only numeric digits(0-9)");
                                }
            }
         }
      });
          

      


       t5.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
           // String emailpattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
            String value = t5.getText();
            int l = value.length();
            if (ke.getKeyChar() >= 'a' && ke.getKeyChar()<= 'z' || ke.getKeyChar() >= 'A' && ke.getKeyChar()<= 'Z' || ke.getKeyChar() >= '0' && ke.getKeyChar()<= '9' || ke.getKeyChar() >= '@' && ke.getKeyChar()<= '_' || ke.getKeyChar()<= '.'){
                 if(l<38){
                        t5.setEditable(true);
                        
                        emailerror.setText("* at the end of id, put @gmail.com");
                    }else{
                         t5.setEditable(false);
                           emailerror.setText("* Please enter the valid number");
                          }
            } else {

                    if(ke.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                         t5.setEditable(true);
                           }else{
                                t5.setEditable(false);
                                emailerror.setText("* Please enter the valid number");
                                }
            }
         }
      });    


           t2.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = t2.getText();
            int l = value.length();
            if (ke.getKeyChar() >= 'A' && ke.getKeyChar() <= 'Z'){
                 if(l<35){
                        t2.setEditable(true);
                        nameerror.setText("");
                    }else{
                             
                         t2.setEditable(false);
                           nameerror.setText("");
                          }
            } else {

                    if(ke.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode()==KeyEvent.VK_SPACE  || ke.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                         t2.setEditable(true);
                           }else{
                                t2.setEditable(false);
                                nameerror.setText("* Please Enter Capital Letters only");
                            
            }
         }
}
      });
           
         
      
                      
               setBounds(210, 140, 880, 590);
          setVisible(true);
        
    }


  
    public void actionPerformed(ActionEvent ae){
          
         
        if(ae.getSource() == b1) {
            String id = (String) c1.getSelectedItem();
            String number = t1.getText();
            String name = t2.getText();
            String gender = null;
            if(r1.isSelected()){
            gender = "Male"; 
            }else if(r2.isSelected()){
            gender = "Female"; 
            }
              
            String country = (String) c2.getSelectedItem();

            String address = t3.getText();
            String roomtype =  t9.getText();
            String bedtype = t8.getText();
            String phone = t4.getText();
            String room= croom.getSelectedItem();
            String time = check.getText();
            String deposit = t6.getText();
            String days = t10.getText();
            String email = t5.getText();
            String price = t7.getText();

            try{
                 String query = "insert into customer values('"+id+"', '"+number+"', '"+name+"', '"+gender+"', '"+country+"', '"+address+"', '"+phone+"', '"+roomtype+"', '"+room+"', '"+bedtype+"', '"+time+"', '"+email+"', '"+price+"', '"+deposit+"', '"+days+"')";
                 String query2 = "update room set available = 'Occupied' where roomno = '"+room+"'";
                 
                Conn conn = new Conn();
                conn.s.executeUpdate(query);
                conn.s.executeUpdate(query2);

               JOptionPane.showMessageDialog(null, "New Customer Added Successfully");

               setVisible(false);
               new Reception();    
      
          } catch (Exception e) {
                 e.printStackTrace();
          }
}
                    
        else if(ae.getSource() == b3) {
           //   b1.addKeyListener(new KeyAdapter() {
            // public void b1keyReleased(java.awt.event.KeyEvent ke){
              if(t1.getText().length()>0  && t2.getText().length()>0 && t3.getText().length()>0 && t4.getText().length()>0 && t5.getText().length()>0  && t6.getText().length()>0 && t7.getText().length()>0 && t8.getText().length()>0 && t9.getText().length()>0 && t10.getText().length()>0 && r1.isSelected() || r2.isSelected()){ 
                           b1.setEnabled(true);
                         }else{
                            b1.setEnabled(false);
                           }
 //   }
//}); 

     
            String room = croom.getSelectedItem();
              String query = "Select * from room where roomno = '"+room+"'";
              try{
              Conn conn = new Conn();
              ResultSet rs = conn.s.executeQuery(query);
               while(rs.next()){
                    t7.setText(rs.getString("price"));
                    t8.setText(rs.getString("type"));
                    t9.setText(rs.getString("roomtype"));
                    }
                 }catch(Exception e){
                    e.printStackTrace();
            }
                    
                 
            }else if(ae.getSource() == b2){
               setVisible(false);
               new Reception();    
     
          
         }
           }  
    

 public static void main(String[] args) {
    
     new AddCustomer();
}
}
