package hotel.management.project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HotelManagementProject extends JFrame implements ActionListener{


    HotelManagementProject(){


        super("Taj Hotel");
        setBounds(-10, 0, 1400, 766);
 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/hotel5.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1400, 766, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(0, 0, 1400, 766);
        add(Image);
        
        
       
        
        JLabel l2 = new JLabel("Hotel Management System");
        l2.setBounds(20, 470, 800, 80);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("serif", Font.PLAIN, 70));
        Image.add(l2);
        
        JButton b1 = new JButton("Next");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(1150, 630, 120, 40);
        b1.addActionListener(this);
        Image.add(b1);
        
         setLayout(null);
        setVisible(true);
        
        while(true){
            l2.setVisible(false);
            try{
                Thread.sleep(600);
                
            }catch(Exception e){
              
            }
            l2.setVisible(true);
            try{
            Thread.sleep(800);
        }
            catch(Exception e){
                
            }
        
        } 
    }
    
   public void actionPerformed(ActionEvent ae){
 new Login().setVisible(true);
 
 }
 public static void main(String[] args) {

 new HotelManagementProject();
 }
 
}
 