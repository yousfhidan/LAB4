import javax.swing.*;
import java.awt.*;

public class B {
    public static void main(String[] args) {
        JFrame f=new JFrame();
    f.setTitle("My frame");
f.setSize(500,500);
f.setVisible(true);
MyDraw d=new MyDraw();
f.add(d);
        f.setVisible(true);

       f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
        }
