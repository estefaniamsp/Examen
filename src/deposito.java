import javax.swing.*;
import java.awt.*;
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
    private JButton BORRARButton;
    private JButton button1;
    private JButton button2; //esta de decoracion para no hacer tan vacio el panel numerico

    public deposito(double dinero) {//contructor con parametro dinero de tipo double
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito.setText(deposito.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito.setText(deposito.getText() + a8Button.getText());

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito.setText(deposito.getText() + a9Button.getText());

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito.setText(deposito.getText() + a4Button.getText());

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito.setText(deposito.getText() + a5Button.getText());

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito.setText(deposito.getText() + a6Button.getText());

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito.setText(deposito.getText() + a1Button.getText());

            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito.setText(deposito.getText() + a2Button.getText());

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito.setText(deposito.getText() + a3Button.getText());

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposito.setText(deposito.getText() + a0Button.getText());

            }
        });

        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double deposito1 = Double.parseDouble(deposito.getText());
                //se convierte el deposito1 de string a double

                if(deposito1%10 == 0){
                    form2.dinero+=deposito1; //se suma el deposito1 al dinero (saldo)
                    Color color1= new Color(220, 231, 236);
                    JOptionPane.showMessageDialog(null,"Transacción Exitosa");
                    //se muestra un mensaje si la transaccion se ha realizado con exito
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PDeposito);//cierre de la ventana
                    frame.dispose();
                    JFrame frame3 = new JFrame();
                    frame3.setContentPane(new form2().panel2);
                    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame3.getContentPane().setBackground(color1);
                    frame3.setUndecorated(true);
                    frame3.setVisible(true);
                    frame3.setSize(420,300);
                    frame3.setLocationRelativeTo(null);

                }else{
                    JOptionPane.showMessageDialog(null, "Por favor ten en cuenta que el valor minimo de deposito es $10 y solo se puede depositar cantidades en multiplos de 10.\n Asegurate de ingresar un monto valido antes de continuar. \nGRACIAS!!");
                    deposito.setText("");//si no es un multiplo de 10 se muestra el mensaje
                }


            }
        });

        MENUButton.addActionListener(new ActionListener() { //regreso al menu
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PDeposito);
                frame.dispose();
                Color color1= new Color(220, 231, 236);
                JFrame frame3 = new JFrame("Cajero");
                frame3.setContentPane(new form2().panel2);
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame3.getContentPane().setBackground(color1);
                frame3.setUndecorated(true);
                frame3.setVisible(true);
                frame3.setSize(420,300);
                frame3.setLocationRelativeTo(null);
            }
        });
        BORRARButton.addActionListener(new ActionListener() { //para borrar algun digito en el panel numerico
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if (deposito.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(deposito.getText());
                    strB.deleteCharAt(deposito.getText().length() -1);
                    backspace= String.valueOf(strB);
                    deposito.setText(backspace);
                }
            }
        });
        button1.addActionListener(new ActionListener() { //para colocar punto
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!deposito.getText().contains(".")){
                    deposito.setText(deposito.getText()+button1.getText());
                }
            }
        });
    }

}