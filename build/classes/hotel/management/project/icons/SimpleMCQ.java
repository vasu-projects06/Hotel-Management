
package simplemcq;

import javax.swing.*;
import java.awt.*;

public class SimpleMCQ extends JFrame{

    SimpleMCQ()
    {
        setBounds(100, 100, 1200, 500);
        getContentPane().setBackground(Color.GREEN);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SimpleMCQ();
    }
    
}
