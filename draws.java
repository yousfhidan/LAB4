import javax.swing.*;

public class draws  {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(400,400);
        frame.setTitle("draws");
        frame.setVisible(true);


       RectangeComponent b=new RectangeComponent();
       frame.add(b);

        frame.setVisible(true);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
    }

}
