import javax.swing.*;
import java.awt.*;

public class draw_name extends JComponent {
    public void paintComponent(Graphics g) {
       Graphics2D g2=(Graphics2D)g;

        Rectangle op=new Rectangle();
        g2.setColor(Color.CYAN);
        g2.fillRect(50,50,100,100);
g2.setColor(Color.BLACK);
g2.drawString("My name is:yousif",50,100);
    }

}
