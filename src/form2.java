import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 {


    private JButton verSaldoButton;
    private JButton retiroButton;
    private JButton depositoButton;
    private JButton salirButton;
    protected JPanel panel2;


    public form2() {
        depositoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(depositoButton);
                frame.dispose();

                JFrame frame3 = new JFrame("Cajero");
                frame3.setContentPane(new deposito().PDeposito);
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame3.setVisible(true);
                frame3.setSize(420,300);
                frame3.setLocationRelativeTo(null);
            }
        });
    }
}
