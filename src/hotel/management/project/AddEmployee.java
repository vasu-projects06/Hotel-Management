
package hotel.management.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class AddEmployee extends JFrame implements ActionListener{
    
    JTextField t1, t2, t3, t4, t5, t6;
    JRadioButton r1, r2;
    JComboBox c1;
    JButton b1;
    
    
    AddEmployee(){
      
        super("Taj Hotel");

        JLabel name = new JLabel("NAME");
        name.setFont(new Font("Tahoma",Font.BOLD, 17));
        name.setForeground(Color.RED);
        name.setBounds(270, 70, 120, 30);
        add(name);
        
        
        t1 = new JTextField();
        t1.setBounds(405, 70, 150, 25);
        add(t1);
        
        JLabel nameerror = new JLabel();
        nameerror.setFont(new Font("Tahoma",Font.PLAIN, 12));
        nameerror.setForeground(Color.RED);
        nameerror.setBounds(570, 70, 200, 12);
        add(nameerror);
     
        JLabel age = new JLabel("AGE");
        age.setFont(new Font("Tahoma",Font.BOLD, 17));
        age.setForeground(Color.RED);
        age.setBounds(270, 120, 120, 30);
        add(age);
        
        t2 = new JTextField();
        t2.setBounds(405, 120, 150, 25);
        add(t2);

        JLabel ageerror = new JLabel();
        ageerror.setFont(new Font("Tahoma",Font.PLAIN, 12));
        ageerror.setForeground(Color.RED);
        ageerror.setBounds(570, 120, 200, 12);
        add(ageerror);
        
        JLabel gender = new JLabel("GENDER");
        gender.setFont(new Font("Tahoma",Font.BOLD, 17));
        gender.setForeground(Color.RED);
        gender.setBounds(270, 170, 120, 30);
        add(gender);
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.BOLD, 13));
        r1.setBounds(405, 170, 65, 22);
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.BOLD, 13));
        r2.setBounds(485, 170, 70, 22);
        r2.setBackground(Color.WHITE);
        add(r2);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        
        JLabel job = new JLabel("JOB");
        job.setFont(new Font("Tahoma",Font.BOLD, 17));
        job.setForeground(Color.RED);
        job.setBounds(270, 220, 120, 30);
        add(job);
        
        String str[] = {"Front Desk clerks","Forters","HouseKeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef","Guard"};
        c1 = new JComboBox(str);
        c1.setBounds(405, 220, 150, 25);
        c1.setBackground(Color.WHITE);
        add(c1);
        
        JLabel salary = new JLabel("SALARY");
        salary.setFont(new Font("Tahoma",Font.BOLD, 17));
        salary.setForeground(Color.RED);
        salary.setBounds(270, 270, 120, 30);
        add(salary);
        
        t3 = new JTextField();
        t3.setBounds(405, 270, 150, 25);
        add(t3);

        JLabel salaryerror = new JLabel();
        salaryerror.setFont(new Font("Tahoma",Font.PLAIN, 12));
        salaryerror.setForeground(Color.RED);
        salaryerror.setBounds(570, 270, 200, 12);
        add(salaryerror);
      
        JLabel phone = new JLabel("PHONE");
        phone.setFont(new Font("Tahoma",Font.BOLD, 17));
        phone.setForeground(Color.RED);
        phone.setBounds(270, 320, 120, 30);
        add(phone);
        
        t4 = new JTextField();
        t4.setBounds(405, 320, 150, 25);
        add(t4);

        JLabel phoneerror = new JLabel();
        phoneerror.setFont(new Font("Tahoma",Font.PLAIN, 12));
        phoneerror.setForeground(Color.RED);
        phoneerror.setBounds(570, 320, 200, 12);
        add(phoneerror);
        
        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setFont(new Font("Tahoma",Font.BOLD, 17));
        aadhar.setForeground(Color.RED);
        aadhar.setBounds(270, 370, 120, 30);
        add(aadhar);
        
        t5 = new JTextField();
        t5.setBounds(405, 370, 150, 25);
        add(t5);

        JLabel numbererror = new JLabel();
        numbererror.setFont(new Font("Tahoma",Font.PLAIN, 12));
        numbererror.setForeground(Color.RED);
        numbererror.setBounds(570, 370, 200, 12);
        add(numbererror);
        
        JLabel email = new JLabel("EMAIL");
        email.setFont(new Font("Tahoma",Font.BOLD, 17));
        email.setForeground(Color.RED);
        email.setBounds(270, 420, 120, 30);
        add(email);
        
        t6 = new JTextField();
        t6.setBounds(405, 420, 150, 25);
        add(t6);

        JLabel emailerror = new JLabel();
        emailerror.setFont(new Font("Tahoma",Font.PLAIN, 12));
        emailerror.setForeground(Color.RED);
        emailerror.setBounds(570, 420, 200, 12);
        add(emailerror);
        
        b1 = new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(590, 465, 110, 30);
        b1.addActionListener(this);
        add(b1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/emp2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(785, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 785, 650);
        add(l1);
        
        JLabel l2 = new JLabel("ADD EMPLOYEE DETAILS");
        l2.setForeground(Color.BLACK);
        l2.setBounds(250, 5, 340, 30);
        l2.setFont(new Font("Tahoma", Font.BOLD, 24));
        l1.add(l2);

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

        t5.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = t5.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                 if(l<12){
                        t5.setEditable(true);
                        numbererror.setText("* Please enter the 12 digit number");
                    }else{
                         t5.setEditable(false);
                           numbererror.setText("* Please enter the 12 digit number");
                          }
            } else {

                    if(ke.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                         t5.setEditable(true);
                           }else{
                                t5.setEditable(false);
                                numbererror.setText("* Enter only numeric digits(0-9)");
                                }
            }
         }
      });

            t3.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = t3.getText();
            int l = value.length();
         
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'){
                 if(l<6){
                     
                        t3.setEditable(true);
                        salaryerror.setText("* minimum RS 15,000");
                           
                    }else{
                             
                         t3.setEditable(false);
                           salaryerror.setText("* Please enter the valid number");
                          }
            } else {

                    if(ke.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                         t3.setEditable(true);
                           }else{
                                t3.setEditable(false);
                                salaryerror.setText("* Enter only numeric digits(0-9)");
                            
            }
         }
}
      });

        t2.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = t2.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
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
          

      


       t6.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
           // String emailpattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
            String value = t6.getText();
            int l = value.length();
            if (ke.getKeyChar() >= 'a' && ke.getKeyChar()<= 'z' || ke.getKeyChar() >= 'A' && ke.getKeyChar()<= 'Z' || ke.getKeyChar() >= '0' && ke.getKeyChar()<= '9' || ke.getKeyChar() >= '@' && ke.getKeyChar()<= '_' || ke.getKeyChar()<= '.'){
                 if(l<38){
                        t6.setEditable(true);
                        
                        emailerror.setText("* at the end of id, put @gmail.com");
                    }else{
                         t6.setEditable(false);
                           emailerror.setText("* Please enter the valid number");
                          }
            } else {

                    if(ke.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                         t6.setEditable(true);
                           }else{
                                t6.setEditable(false);
                                emailerror.setText("* Please enter the valid number");
                                }
            }
         }
      });    


           t1.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = t1.getText();
            int l = value.length();
            if (ke.getKeyChar() >= 'A' && ke.getKeyChar() <= 'Z'){
                 if(l<35){
                        t1.setEditable(true);
                        nameerror.setText("");
                    }else{
                             
                         t1.setEditable(false);
                           nameerror.setText("");
                          }
            } else {

                    if(ke.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode()==KeyEvent.VK_SPACE  || ke.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                         t1.setEditable(true);
                           }else{
                                t1.setEditable(false);
                                nameerror.setText("* Please Enter Capital Letters only");
                            
            }
         }
}
      });
           
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(275, 150, 785, 550);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String name = t1.getText();
        String age = t2.getText();
        String salary = t3.getText();
        String phone = t4.getText();
        String aadhar = t5.getText();
        String email = t6.getText();
        
        String gender = null;
        if(r1.isSelected()){
            gender = "Male"; 
        }else if(r2.isSelected()){
            gender = "Female"; 
        }
        
        String job = (String)c1.getSelectedItem();
        
        Conn c = new Conn();
        String str = "insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+aadhar+"','"+email+"')";
        
        try{
            c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "New Employee Added");
            this.setVisible(false);
            
        }catch(Exception e){
            
        }
    }
    
    public static void main(String args[]){
        new AddEmployee().setVisible(true);
    }
}
