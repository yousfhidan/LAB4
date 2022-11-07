import java.awt.Graphics2D;
import java.awt.*;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class RectangeComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(100, 100, 70, 70);
        g2.draw(box);
        g2.setColor(Color.MAGENTA);
        g2.fill(box);


        box.translate(50, 50);
        g2.draw(box);
        g2.setColor(Color.pink);
        g2.fill(box);


    }}

