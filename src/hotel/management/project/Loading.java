
package hotel.management.project;

import javax.swing.*;
import java.awt.*;



public class Loading extends JFrame implements Runnable{
     
      Thread t;
      JProgressBar bar;  
      JLabel l5;
      String username;

      public void run(){

           try{
                  for(int i = 1; i<=101; i++){
                      int max = bar.getMaximum();    //100
                      int value = bar.getValue();

                        if(value<max){           //101<100
                           bar.setValue(bar.getValue() + 1);
                          } else{
                                setVisible(false);
                                 new Dashboard().setVisible(true);
                              }
                          Thread.sleep(110);                            
 
                     }
              }catch(Exception e){
                    e.printStackTrace();
                  }

         }
   
      Loading(String username){

          super("Taj Hotel");
    
           this.username = username;
           t = new Thread(this);

          setBounds(410, 170, 600, 400);
         getContentPane().setBackground(Color.WHITE);
          setLayout(null);

         
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/project/icons/cust2.jpg"));
        l5 = new JLabel(i4);
        l5.setBounds(0, 0, 600, 400);
        add(l5);


        JLabel text = new JLabel("Taj Hotel");
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Goudy Stout", Font.PLAIN, 35));
        text.setBounds(100, 20, 390, 40);
        l5.add(text);


        bar = new JProgressBar();
        bar.setBounds(95, 200, 390, 30);
        bar.setForeground(new Color(20, 148, 20));
        bar.setStringPainted(true);
        l5.add(bar);


        JLabel l1 = new JLabel("Loading in progress, please wait...");
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        l1.setBounds(310, 250, 270, 25);
        l5.add(l1);

        JLabel l2 = new JLabel("Welcome  " + username);
        l2.setForeground(Color.MAGENTA);
        l2.setFont(new Font("Harlow Solid Italic", Font.BOLD, 24));
        l2.setBounds(190, 100, 270, 40);
        l5.add(l2);
        
         

          setVisible(true);
       
         t.start();



   }


  public static void main (String[] args){
          new Loading("");


  }

}
