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
    private JPasswordField passwordField1;

    public form1() {


        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText()+a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText()+a8Button.getText());

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText()+a9Button.getText());

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText()+a4Button.getText());

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText()+a5Button.getText());

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText()+a6Button.getText());

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText()+a1Button.getText());

            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText()+a2Button.getText());

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText()+a3Button.getText());

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelC.setText(labelC.getText()+a0Button.getText());

            }
        });

        ENTER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contrasenia = labelC.getText();

                String password = "1221";

                if(contrasenia.equals(password)){
                    JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
                    // Abre la pantalla principal después de iniciar sesión
                    JFrame frame2 = new JFrame("Cajero");
                    frame2.setContentPane(new form2().panel2);
                    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame2.setVisible(true);
                    frame2.setSize(420,300);
                    frame2.setLocationRelativeTo(null);
                    frame.dispose();
                }
            }
        });


        int result = JOptionPane.showConfirmDialog(this, panel1, "Inicio de Sesión",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            String usuario = usuarioField.getText();
            String contrasena = new String(contrasenaField.getPassword());

            if (iniciarSesion(usuario, contrasena)) {
                JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
                // Abre la pantalla principal después de iniciar sesión
                new principal().setVisible(true);
                // Cierra la pantalla de inicio de sesión
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Inicio de sesión fallido");
            }
        }

    }


    private boolean iniciarSesion(String usuario, String contrasena) {
        // Lógica de inicio de sesión (puedes personalizarla según tus necesidades)
        // En este ejemplo, simplemente verificamos si el usuario y la contraseña son válidos
        return usuario.equals("admin") && contrasena.equals("admin123");
    }









    }
}
