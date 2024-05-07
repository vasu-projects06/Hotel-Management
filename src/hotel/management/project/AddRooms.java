package hotel.management.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddRooms extends JFrame implements ActionListener{
    
    JTextField t1, t2;
    JComboBox c1, c2, c3, c4;
    JButton b1, b2;
    AddRooms(){

        super("Taj Hotel");
        
        JLabel title = new JLabel("Add Rooms");
        title.setFont(new Font("Tahoma", Font.BOLD, 24));
        title.setBounds(270, 10, 150, 30);
        add(title);
        
     
        JLabel roomno = new JLabel("Room Number");
        roomno.setFont(new Font("Tahoma", Font.BOLD, 14));
        roomno.setForeground(Color.RED);
        roomno.setBounds(220, 80, 120, 27);
        add(roomno);
        
        t1 = new JTextField();
        t1.setBounds(390, 80, 120, 27);
        add(t1);

        JLabel roomnoerror = new JLabel();
        roomnoerror.setFont(new Font("Tahoma", Font.PLAIN, 12));
        roomnoerror.setForeground(Color.RED);
        roomnoerror.setBounds(520, 80, 200, 12);
        add(roomnoerror);
        
        JLabel available = new JLabel("Available");
        available.setFont(new Font("Tahoma", Font.BOLD, 14));
        available.setForeground(Color.RED);
        available.setBounds(220, 120, 120, 27);
        add(available);
        
        c1 = new JComboBox(new String[] { "Available", "Occupied" });
        c1.setBounds(390, 120, 120, 27);
        c1.setBackground(Color.WHITE);
        add(c1);
        

        JLabel status = new JLabel("Cleaning Status");
        status.setFont(new Font("Tahoma", Font.BOLD, 14));
        status.setForeground(Color.RED);
        status.setBounds(220, 160, 120, 27);
        add(status);
        
        
        c2 = new JComboBox(new String[] { "Cleaned", "Dirty" });
        c2.setBounds(390, 160, 120, 27);
        c2.setBackground(Color.WHITE);
        add(c2);


        JLabel price = new JLabel("Price");
        price.setFont(new Font("Tahoma", Font.BOLD, 14));
        price.setForeground(Color.RED);
        price.setBounds(220, 200, 120, 27);
        add(price);
        
        t2 = new JTextField();
        t2.setBounds(390, 200, 120, 27);
        add(t2);
 
        JLabel priceerror = new JLabel();
        priceerror.setFont(new Font("Tahoma", Font.PLAIN, 12));
        priceerror.setForeground(Color.RED);
        priceerror.setBounds(520, 200, 200, 12);
        add(priceerror);       
        
         
        JLabel type = new JLabel("Bed Type");
        type.setFont(new Font("Tahoma", Font.BOLD, 14));
        type.setForeground(Color.RED);
        type.setBounds(220, 240, 120, 27);
        add(type);
        
        c3 = new JComboBox(new String[] { "Single Bed", "Double Bed" });
        c3.setBounds(390, 240, 120, 27);
        c3.setBackground(Color.WHITE);

        add(c3);

        JLabel roomtype = new JLabel("RoomType");
        roomtype.setFont(new Font("Tahoma", Font.BOLD, 14));
        roomtype.setForeground(Color.RED);
        roomtype.setBounds(220, 280, 120, 27);
        add(roomtype);

        String one[] = {"Simple & AC Room", "Luxary & AC Room"};
        c4 = new JComboBox(one);
        c4.setBounds(390, 280, 120, 27);
        c4.setBackground(Color.WHITE);
        add(c4);

        
        b1 = new JButton("Add Rooms");
        b1.setBounds(230, 350, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Cancel");
        b2.setBounds(370, 350, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/room4 (1).jpg"));
        JLabel l5 = new JLabel(i1);
        l5.setBounds(0, 0, 720, 475);
        add(l5);

         t1.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = t1.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() >= 'A' && ke.getKeyChar() <= 'Z' || ke.getKeyChar() >= 'a' && ke.getKeyChar() <= 'z' || ke.getKeyChar() >= '-' && ke.getKeyChar() <= '/') {
                 if(l<5){
                        t1.setEditable(true);
                        roomnoerror.setText("");
                    }else{
                         t1.setEditable(false);
                           roomnoerror.setText("* Please enter the valid number");
                          }
            } else {

                    if(ke.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                         t1.setEditable(true);
                           }else{
                                t1.setEditable(false);
                                roomnoerror.setText("* Enter only numeric digits(0-9) and letters");
                                }
            }
         }
      });
             t2.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = t2.getText();
            int l = value.length();
         
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'){
                 if(l<6){
                     
                        t2.setEditable(true);
                        priceerror.setText("* minimum RS 3500");
                           
                    }else{
                             
                         t2.setEditable(false);
                           priceerror.setText("* Please enter the valid number");
                          }
            } else {

                    if(ke.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                         t2.setEditable(true);
                           }else{
                                t2.setEditable(false);
                                priceerror.setText("* Enter only numeric digits(0-9)");
                            
            }
         }
}
      });
        
        
        
        setBounds(340, 150, 740, 475);
        setLayout(null);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String roomno = t1.getText();
            String available = (String)c1.getSelectedItem();
            String status = (String)c2.getSelectedItem();
            String price = t2.getText();
            String type = (String)c3.getSelectedItem();
            String roomtype = (String)c4.getSelectedItem();

            Conn c = new Conn();
            try{
                String str = "insert into Room values('"+roomno+"','"+available+"','"+status+"','"+price+"','"+type+"','"+roomtype+"')";

                c.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null, "New Room Added Successfully");
                this.setVisible(false);
            }catch(Exception e){
                
            }
            
            
        }else if(ae.getSource() == b2){
           this.setVisible(false); 
    }
    }
    
    public static void main(String[] args){
        
        new AddRooms().setVisible(true);     
}
}

    

