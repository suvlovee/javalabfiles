import javax.swing.*;

public class Welcome extends JFrame {
    private JLabel lbl;

    Welcome(){
        setTitle("Welcome");

        lbl = new JLabel("Welcome to Java Programming");
        add (lbl);

        setSize(900,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Welcome();
    }
}
