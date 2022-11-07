import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

public class MyDraw extends JComponent {
    public void pC(Graphics g) {
        Rectangle r = new Rectangle(100, 100, 100, 100);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        g2.fill(r);

        Ellipse2D.Double face = new Ellipse2D.Double(100, 100, 100, 100);

        g2.setColor(Color.yellow);
        g2.fill(face);
        Ellipse2D.Double eye1 = new Ellipse2D.Double(120, 120, 25, 25);
g2.setColor(Color.black);
g2.fill(eye1);
Ellipse2D.Double eye2=new Ellipse2D.Double(150,120,25,25);
g2.fill(eye2);
        Line2D.Double mouth=new Line2D.Double(50,50,100,50);
        g2.fill(mouth);


    }
}