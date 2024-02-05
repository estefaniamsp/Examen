import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class saldo {
    private JButton MENUButton;
    private JLabel saldo;
    public JPanel PSaldo;

    public saldo() {
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PSaldo);
                frame.dispose();

                JFrame frame3 = new JFrame("Cajero");
                frame3.setContentPane(new form2().panel2);
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame3.setVisible(true);
                frame3.setSize(420,300);
                frame3.setLocationRelativeTo(null);
            }
        });
    }
}
