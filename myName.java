import javax.swing.*;

public class myName {
    public static void main(String[] args) {

            JFrame frame=new JFrame();
            frame.setSize(500,400);
            frame.setTitle("draws");
            frame.setVisible(true);
            draw_name you=new draw_name();
            frame.add(you);

            frame.setVisible(true);
            frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));

    }

}
