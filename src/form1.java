import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    protected JPanel panel1;
    private JButton a9Button;
    private JButton a0Button;
    private JButton ENTER;
    private JLabel labelC;
    private JButton BORRARButton;
    private JPasswordField passwordField1;
    static JFrame frame2 = new JFrame("Transacciones");

    public form1() {


        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText() + a8Button.getText());

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText() + a9Button.getText());

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText() + a4Button.getText());

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText() + a5Button.getText());

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText() + a6Button.getText());

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText() + a1Button.getText());

            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText() + a2Button.getText());

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText() + a3Button.getText());

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText() + a0Button.getText());

            }
        });

        ENTER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contrasenia = labelC.getText();

                String password = "1221";

                if (contrasenia.equals(password)) {

                    JOptionPane.showMessageDialog(panel1, "Inicio de sesión exitoso");
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(ENTER);
                    frame.dispose();
                    // Abre la pantalla principal después de iniciar sesión
                    JFrame frame2 = new JFrame("Cajero");
                    frame2.setContentPane(new form2().panel2);
                    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame2.setVisible(true);
                    frame2.setSize(420, 300);
                    frame2.setLocationRelativeTo(null);

                }else {
                    JOptionPane.showMessageDialog(panel1, "Inicio de sesión fallido");
                    labelC.setText("");
                }
            }
        });


        BORRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if (labelC.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(labelC.getText());
                    strB.deleteCharAt(labelC.getText().length() -1);
                    backspace= String.valueOf(strB);
                    labelC.setText(backspace);
                }

            }
        });
    }
}
