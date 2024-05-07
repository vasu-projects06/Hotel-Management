
package hotel.management.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Single extends JFrame implements ActionListener{
    
    JButton b1, b2;

    Single(){

         super("Taj Hotel");
  
        getContentPane().setBackground(Color.WHITE);
         setLayout(null);



        JLabel l1 = new JLabel("Single Bed Rooms");
        l1.setFont(new Font("Tahoma",Font.BOLD, 32));
        l1.setForeground(new Color(105, 0, 205));
        l1.setBounds(170, 0, 320, 60);
        add(l1);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/simple.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(370, 70, 300, 180);
        add(icon);
       
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/sin_lux.jpg"));
        Image i5 = i4.getImage().getScaledInstance(300, 180, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel img = new JLabel(i6);
        img.setBounds(370, 280, 300, 180);
        add(img);
       
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/rate2.png"));
        Image i8 = i7.getImage().getScaledInstance(100, 60, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel lb = new JLabel(i9);
        lb.setBounds(120, 390, 100, 60);
        add(lb);
 
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/rupee2.jpg"));
        Image i11 = i10.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel pic = new JLabel(i12);
        pic.setBounds(220, 160, 70, 60);
        add(pic);
       
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/rate4.jpg"));
        Image i14 = i13.getImage().getScaledInstance(100, 60, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel pic1 = new JLabel(i15);
        pic1.setBounds(120, 160, 100, 60);
        add(pic1);

        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/rupee2.jpg"));
        Image i17 = i16.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        JLabel pic2 = new JLabel(i18);
        pic2.setBounds(220, 390, 70, 60);
        add(pic2);

        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/name.png"));
        Image i20 = i19.getImage().getScaledInstance(180, 80, Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
        JLabel pic3 = new JLabel(i21);
        pic3.setBounds(40, 50, 190, 90);
        add(pic3);

        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/lux2c.jpg"));
        Image i23 = i22.getImage().getScaledInstance(180, 80, Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        JLabel pic4 = new JLabel(i24);
        pic4.setBounds(40, 290, 190, 60);
        add(pic4);


        b1 = new JButton("Next");
        b1.setBounds(100, 480, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Back");
        b2.setBounds(220, 480, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
       

    
         setBounds(300, 155, 700, 560);
         setVisible(true);


     }

 public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == b1){
           new Double();
           this.setVisible(false);
           

       }else{
         this.setVisible(false);
         new Reception();
      }

}


public static void main(String args[]){

    new Single();
}
}