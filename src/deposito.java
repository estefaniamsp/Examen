import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deposito {
    private JLabel deposito;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton ENTERButton;
    private JButton MENUButton;
    protected JPanel PDeposito;

    public deposito() {


        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito.setText(labelC.getText() + a7Button.getText());
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

            }
