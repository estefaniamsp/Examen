import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame {
    public Ventana() {
        Color color1= new Color(220, 231, 236);
        setTitle("Banco Politécnico - Cajero Automático");
        setSize(520, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(color1);
        setLocationRelativeTo(null);
        setUndecorated(true);

        // Mensaje principal
        JLabel labelMensaje = new JLabel("<html><center>Banco Politécnico<br>Bienvenido a la red de cajeros automáticos más grande del campus</center></html>");
        labelMensaje.setFont(new Font("Fire Code", Font.BOLD, 20));
        labelMensaje.setHorizontalAlignment(JLabel.CENTER);

        // Imagen desde una URL
        String urlImagen = "https://www.datafast.com.ec/images/logos/marcas-tarjetas.png";
        try {
            ImageIcon icono = new ImageIcon(new ImageIcon(new URL(urlImagen)).getImage().getScaledInstance(490, 90, java.awt.Image.SCALE_SMOOTH));
            JLabel labelImagen = new JLabel(icono);

            // Mensaje adicional
            JLabel labelAdicional = new JLabel("Ingrese su tarjeta para continuar");
            labelAdicional.setFont(new Font("Fire Code", Font.PLAIN, 16));
            labelAdicional.setHorizontalAlignment(JLabel.CENTER);

            // Ajustar el diseño
            setLayout(null);

            // Posiciones y tamaños de los componentes
            labelMensaje.setBounds(50, 20, 415, 80);
            labelImagen.setBounds(0, 100, 520, 135);
            labelAdicional.setBounds(50, 250, 400, 30);

            // Agregar componentes al JFrame
            add(labelMensaje);
            add(labelImagen);
            add(labelAdicional);

            setVisible(true);
            try {
                Thread.sleep(5000); // 3000 milisegundos = 3 segundos
                dispose();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


}