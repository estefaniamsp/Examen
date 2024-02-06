import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

public class form1 { //clase para el inicio de sesion
    private JButton a1Button; //componentes y botones
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
    private JPasswordField labelC;
    //private JLabel labelC;
    private JButton BORRARButton;
    private JButton CERRARButton;
    private JButton button1;
    static JFrame frame2 = new JFrame("Transacciones"); //objeto estatico

    public form1() { //constructor con los componentes


        a7Button.addActionListener(new ActionListener() { //se crea un panel numerico
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

                try{ //manejo de inicio de sesion
                    char[] contrasenia = labelC.getPassword(); //se obtiene la contraseña en el campo labelC

                    String password = "1221"; //dato quemado

                    if (Arrays.equals(contrasenia, password.toCharArray())) {// se compara el password ingresado con el dato quemado
                        Color color1= new Color(220, 231, 236);
                        JOptionPane.showMessageDialog(panel1, "Inicio de sesión exitoso");
                        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(ENTER);
                        frame.dispose();
                        // Abre la pantalla principal después de iniciar sesión
                        JFrame frame2 = new JFrame("Cajero");
                        frame2.setContentPane(new form2().panel2);
                        frame2.setUndecorated(true);
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame2.getContentPane().setBackground(color1);
                        frame2.setVisible(true);
                        frame2.setSize(420, 300);
                        frame2.setLocationRelativeTo(null);

                    }else {
                        JOptionPane.showMessageDialog(panel1, "Inicio de sesión fallido");
                        labelC.setText(""); //si las contraseñas no coinciden se muestra un mensaje de fallo y se
                        //volverá a pedir de nuevo la contraseña
                    }

                }catch(Exception ex){

                    JOptionPane.showMessageDialog(panel1, "Inicio de sesión fallido. Revise sus credenciales");
                    labelC.setText("");

                }

            }
        });

        BORRARButton.addActionListener(new ActionListener() { //elimina el ultimo caracter ingresado
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
        CERRARButton.addActionListener(new ActionListener() {//cierra la ventana actual cuando se presiona
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
