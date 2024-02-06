import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 { //clase para el menu

    protected JPanel panel2;
    private JRadioButton depositoRadioButton; //botones de opciones
    private JRadioButton retiroRadioButton;
    private JRadioButton verSaldoRadioButton;
    private JRadioButton salirRadioButton;
    static double dinero = 0; //objeto estatico, almacena el saldo actual

    public form2() { //contructor con los componentes de radiobutton
        ButtonGroup buttonGroup = new ButtonGroup(); //se agrega los 4 botones en un solo grupo para
        //asegurar la eleccion de unicamente un boton
        buttonGroup.add(depositoRadioButton);
        buttonGroup.add(verSaldoRadioButton);
        buttonGroup.add(retiroRadioButton);
        buttonGroup.add(salirRadioButton);

        depositoRadioButton.addActionListener(new ActionListener() {//para el deposito del dinero
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(depositoRadioButton);
                frame.dispose();//cierre de pantalla actual al presionar el boton

                Color color1= new Color(220, 231, 236);// se define el color de fondo
                JFrame frame3 = new JFrame("Deposito");//se crea una nueva instancia
                frame3.setContentPane(new deposito(form2.dinero).PDeposito);//se establece el panel de contenido
                //en este caso de deposito
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cierre por completo de la ventana
                frame3.setUndecorated(true);// se establece que la ventana no tenga decoracion, en este caso
                //botones de maximizar, minimizar y cerrar
                frame3.getContentPane().setBackground(color1);//se establece al panel de contenido un fondo
                frame3.setVisible(true);//para que la ventana sea visible
                frame3.setSize(420,300);//tamaño de la pantalla
                frame3.setLocationRelativeTo(null);//para que la pantalla aparezca en medio y no en una esquina
            }
        });

        verSaldoRadioButton.addActionListener(new ActionListener() {// para visualizar el saldo
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
        retiroRadioButton.addActionListener(new ActionListener() { //para retirar dinero
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
        salirRadioButton.addActionListener(new ActionListener() { //para salir del menu y regresar al inicio
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color1= new Color(220, 231, 236);
                Main.frame.setContentPane(new form1().panel1); //contenido del marco principal, donde
                //se accede al panel1
                Main.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// cierre por completo de la ventana
                Main.frame.getContentPane().setBackground(color1);
                Main.frame.setUndecorated(true); // sin decoraciones
                Main.frame.setSize(420,300); //tamaño de la ventana
                Main.frame.setVisible(true);//visibilidad
                Main.frame.setLocationRelativeTo(null);//ventana en medio y no esquina
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panel2); //se obtiene el JFrame del
                //panel2 para el cierre de la ventana
                frame.dispose();
            }
        });

    }
}
