package hotel.management.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
import javax.swing.JOptionPane;

public class AddDriver extends JFrame implements ActionListener{
    
    JTextField t1, t2, t3, t4, t5;
    JComboBox c1, c2;
    JButton b1, b2;
    AddDriver(){
        super("Taj Hotel");

        
        JLabel title = new JLabel("Add Driver");
        title.setFont(new Font("Tahoma", Font.BOLD, 24));
        title.setBounds(265, 10, 150, 30);
        add(title);
        
        JLabel name = new JLabel("Name");
        name.setFont(new Font("Tahoma", Font.BOLD, 18));
        name.setForeground(Color.RED);
        name.setBounds(220, 80, 120, 27);
        add(name);

        t1 = new JTextField();
        t1.setBounds(390, 80, 120, 27);
        add(t1);

        JLabel nameerror = new JLabel();
        nameerror.setFont(new Font("Tahoma", Font.PLAIN, 12));
        nameerror.setForeground(Color.RED);
        nameerror.setBounds(520, 80, 200, 12);
        add(nameerror);

        
        JLabel age = new JLabel("Age");
        age.setFont(new Font("Tahoma", Font.BOLD, 18));
        age.setForeground(Color.RED);
        age.setBounds(220, 120, 120, 27);
        add(age);
        
        t2 = new JTextField();
        t2.setBounds(390, 120, 120, 27);
        add(t2);
  
        JLabel ageerror = new JLabel();
        ageerror.setFont(new Font("Tahoma", Font.PLAIN, 12));
        ageerror.setForeground(Color.RED);
        ageerror.setBounds(520, 120, 200, 12);
        add(ageerror);
        
        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Tahoma", Font.BOLD, 18));
        gender.setForeground(Color.RED);
        gender.setBounds(220, 160, 120, 27);
        add(gender);
        
        c1 = new JComboBox(new String[] { "Male", "Female" });
        c1.setBounds(390, 160, 120, 27);
        c1.setBackground(Color.WHITE);
        add(c1);
        
        JLabel car = new JLabel("Car Company");
        car.setFont(new Font("Tahoma", Font.BOLD, 18));
        car.setForeground(Color.RED);
        car.setBounds(220, 200, 120, 27);
        add(car);
        
        t3 = new JTextField();
        t3.setBounds(390, 200, 120, 27);
        add(t3);
        
        
        JLabel model = new JLabel("Car Model");
        model.setFont(new Font("Tahoma", Font.BOLD, 18));
        model.setForeground(Color.RED);
        model.setBounds(220, 240, 120, 27);
        add(model);
        
        t4 = new JTextField();
        t4.setBounds(390, 240, 120, 27);
        add(t4);
        
        JLabel available = new JLabel("Available");
        available.setFont(new Font("Tahoma", Font.BOLD, 18));
        available.setForeground(Color.RED);
        available.setBounds(220, 280, 120, 27);
        add(available);
        
        
        c2 = new JComboBox(new String[] { "Available", "Busy" });
        c2.setBounds(390, 280, 120, 27);
        c2.setBackground(Color.WHITE);
        add(c2);

        JLabel location = new JLabel("Location");
        location.setFont(new Font("Tahoma", Font.BOLD, 18));
        location.setForeground(Color.RED);
        location.setBounds(220, 320, 120, 27);
        add(location);

        t5 = new JTextField();
        t5.setBounds(390, 320, 120, 27);
        add(t5);

        
        b1 = new JButton("Add Driver");
        b1.setBounds(230, 380, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Cancel");
        b2.setBounds(370, 380, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/driver2.png"));
        JLabel l5 = new JLabel(i1);
        l5.setBounds(0, 0, 720, 475);
        add(l5);
        
        
      t1.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
          
            String value = t1.getText();
            int l = value.length();
            if (ke.getKeyChar() >= 'A' && ke.getKeyChar()<= 'Z'){
                 if(l<38){
                        t1.setEditable(true);
                        
                        nameerror.setText("");
                    }else{
                         t1.setEditable(false);
                           nameerror.setText("* Enter the Capital Letters only");
                          }
            } else {

                    if(ke.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                         t1.setEditable(true);
                           }else{
                                t1.setEditable(false);
                                nameerror.setText("* Enter the Capital Letters only");
                                }
            }
         }
      });    
       
        t2.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = t2.getText();
            int l = value.length();
         
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'){
                 if(l<3){
                     
                        t2.setEditable(true);
                        ageerror.setText("");
                           
                    }else{
                             
                         t2.setEditable(false);
                           ageerror.setText("* Please enter the valid number");
                          }
            } else {

                    if(ke.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                         t2.setEditable(true);
                           }else{
                                t2.setEditable(false);
                                ageerror.setText("* Enter only numeric digits(0-9)");
                            
            }
         }
}
      });
                 

              b1.addKeyListener(new KeyAdapter() {
              public void b1KeyReleased(KeyEvent ke) {
          if(t1.getText().length()>0 && t2.getText().length()>0 && t3.getText().length()>0 && t4.getText().length()>0 && t5.getText().length()>0){
                 b1.setEnabled(true);
           }else{
                 b1.setEnabled(false);
                 }
}
});
             setBounds(340, 150, 740, 475);
                 setLayout(null);
                   setVisible(true);
        
    
    }
    
    public void actionPerformed(ActionEvent ae){


            if(ae.getSource() == b1){
            String name = t1.getText();
            String age = t2.getText();
            String gender = (String)c1.getSelectedItem();
            String company = t3.getText();
            String model = t4.getText();
            String available = (String)c2.getSelectedItem();
            String location = t5.getText();
            
            Conn c = new Conn();
            try{
                String str = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+model+"','"+available+"','"+location+"')";
                c.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null, "New Driver Added Successfully");
                this.setVisible(false);
            }catch(Exception e){
                
            }
            
            
        }else if(ae.getSource() == b2){
           this.setVisible(false); 
    }
    }
    
    public static void main(String[] args){
        
     

                new AddDriver().setVisible(true);     

}
}

    

