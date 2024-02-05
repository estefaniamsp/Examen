import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 {

    protected JPanel panel2;
    private JRadioButton depositoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton verSaldoRadioButton;
    private JRadioButton salirRadioButton;
    static double dinero = 100;

    public form2() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(depositoRadioButton);
        buttonGroup.add(verSaldoRadioButton);
        buttonGroup.add(retiroRadioButton);
        buttonGroup.add(salirRadioButton);

        depositoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(depositoRadioButton);
                frame.dispose();

                Color color1= new Color(142, 155, 160);
                JFrame frame3 = new JFrame("Deposito");
                frame3.setContentPane(new deposito(form2.dinero).PDeposito);
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame3.setUndecorated(true);
                frame3.getContentPane().setBackground(color1);
                frame3.setVisible(true);
                frame3.setSize(420,300);
                frame3.setLocationRelativeTo(null);
            }
        });

        verSaldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(verSaldoRadioButton);
                frame.dispose();
                Color color1= new Color(142, 155, 160);
                JFrame frame4 = new JFrame("Saldo");
                frame4.setContentPane(new saldo(form2.dinero).PSaldo);
                frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame4.setUndecorated(true);
                frame4.getContentPane().setBackground(color1);
                frame4.setVisible(true);
                frame4.setSize(420,300);
                frame4.setLocationRelativeTo(null);
            }
        });
        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(retiroRadioButton);
                frame.dispose();
                Color color1= new Color(142, 155, 160);
                JFrame frame5 = new JFrame("Retiro");
                frame5.setContentPane(new retiro(form2.dinero).PRetiro);
                frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame5.setUndecorated(true);
                frame5.getContentPane().setBackground(color1);
                frame5.setVisible(true);
                frame5.setSize(420,300);
                frame5.setLocationRelativeTo(null);
            }
        });
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.setContentPane(new form1().panel1);
                Main.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Main.frame.setUndecorated(true);
                Main.frame.setSize(420,300);
                Main.frame.setVisible(true);
                Main.frame.setLocationRelativeTo(null);
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panel2);
                frame.dispose();
            }
        });

    }
}
