import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 {


    private JButton verSaldoButton;
    private JButton retiroButton;
    protected JButton depositoButton;
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
        verSaldoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(verSaldoButton);
                frame.dispose();

                JFrame frame4 = new JFrame("Saldo");
                frame4.setContentPane(new saldo().PSaldo);
                frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame4.setVisible(true);
                frame4.setSize(420,300);
                frame4.setLocationRelativeTo(null);
            }
        });
        retiroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(retiroButton);
                frame.dispose();

                JFrame frame5 = new JFrame("Retiro");
                frame5.setContentPane(new retiro().PRetiro);
                frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame5.setVisible(true);
                frame5.setSize(420,300);
                frame5.setLocationRelativeTo(null);
            }
        });
    }
}
