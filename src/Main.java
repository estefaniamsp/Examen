import javax.swing.*;
import java.awt.*;

public class Main {
    static JFrame frame = new JFrame("Cajero");
    public static void main(String[] args) {
        Color color1= new Color(220, 231, 236);

        new Ventana();

        


        JFrame frame = new JFrame("Cajero");
        frame.setContentPane(new form1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.getContentPane().setBackground(color1);
        frame.setVisible(true);
        frame.setSize(420,300);
        frame.setLocationRelativeTo(null);

    }
}