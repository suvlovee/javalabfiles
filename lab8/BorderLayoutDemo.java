import java.awt.*;
import javax.swing.*;
public class BorderLayoutDemo extends JFrame{

    private BorderLayout layout;
    private JButton btn1,btn2,btn3,btn4,btn5;
    public BorderLayoutDemo() {

        layout = new BorderLayout();
        setLayout(layout);

        btn1 = new JButton("EAST");
        btn2 = new JButton("WEST");
        btn3 = new JButton("NORTH");
        btn4 = new JButton("SOUTH");
        btn5 = new JButton("CENTER");

        add(btn1, BorderLayout.EAST);
        add(btn2, BorderLayout.WEST);
        add(btn3, BorderLayout.NORTH);
        add(btn4, BorderLayout.SOUTH);
        add(btn5, BorderLayout.CENTER);

        setTitle("BorderLayout Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
    
}