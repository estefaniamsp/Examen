import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class saldo {
    private JButton MENUButton;
    private JLabel saldo;
    public JPanel PSaldo;

    public saldo(double dinero) { //constructor que toma como parametro dinero
        saldo.setText(String.valueOf(form2.dinero));
        MENUButton.addActionListener(new ActionListener() { //boton para regresar al menu
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PSaldo); //se obtiene el objeto de JFrame
                //para cerrar la ventana actual
                frame.dispose();
                Color color1= new Color(220, 231, 236);
                JFrame frame3 = new JFrame("Cajero");// se crea un nuevo objeto
                frame3.setContentPane(new form2().panel2); //se establece el panel de contenido
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame3.getContentPane().setBackground(color1);
                frame3.setUndecorated(true);
                frame3.setVisible(true);
                frame3.setSize(420,300);
                frame3.setLocationRelativeTo(null);
            }
        });
    }
}
