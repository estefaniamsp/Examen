import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class retiro {
    private JLabel Cantidad;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton a7Button;
    private JButton a0Button;
    private JButton ENTERButton;
    protected JPanel PRetiro;
    private JButton BORRARButton;
    private JButton MENUButton;
    private JButton button1;
    private JButton button2;

    public retiro(double dinero) {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cantidad.setText(Cantidad.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cantidad.setText(Cantidad.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cantidad.setText(Cantidad.getText() + a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cantidad.setText(Cantidad.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cantidad.setText(Cantidad.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cantidad.setText(Cantidad.getText() + a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cantidad.setText(Cantidad.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cantidad.setText(Cantidad.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cantidad.setText(Cantidad.getText() + a9Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cantidad.setText(Cantidad.getText() + a0Button.getText());
            }
        });
        BORRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if (Cantidad.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(Cantidad.getText());
                    strB.deleteCharAt(Cantidad.getText().length() -1);
                    backspace= String.valueOf(strB);
                    Cantidad.setText(backspace);
                }

            }
        });
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PRetiro);
                frame.dispose();

                JFrame frame3 = new JFrame("Cajero");
                frame3.setContentPane(new form2().panel2);
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame3.setUndecorated(true);
                frame3.setVisible(true);
                frame3.setSize(420,300);
                frame3.setLocationRelativeTo(null);
            }
        });
        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double retiro = Double.parseDouble(Cantidad.getText());

                if (retiro % 10 == 0) {


                    if (retiro > form2.dinero) {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                    } else {
                        form2.dinero -= retiro;
                        JOptionPane.showMessageDialog(null, "Retiro Exitoso");
                        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PRetiro);
                        frame.dispose();
                        JFrame frame3 = new JFrame();
                        frame3.setContentPane(new form2().panel2);
                        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame3.setUndecorated(true);
                        frame3.setVisible(true);
                        frame3.setSize(420,300);
                        frame3.setLocationRelativeTo(null);
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "Por favor ten en cuenta que el valor minimo de retiro es $10 y solo se puede retirar cantidades en multiplos de 10.\n Asegurate de ingresar un monto valido antes de continuar. \nGRACIAS!!");
                    Cantidad.setText("");
                }

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!Cantidad.getText().contains(".")){
                    Cantidad.setText(Cantidad.getText()+button1.getText());
                }
            }
        });
    }
}

