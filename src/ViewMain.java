import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.Image;

public class ViewMain extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel etiquetaCaudal, etiquetaPa, etiquetaFactorK, logo;
    private JTextField caudal, pascales, factorK;
    private JButton calcular;

    public ViewMain() {

        setSize(400, 420); // TamaÃ±o de la calculadora
        setLocationRelativeTo(null); // Con "null" hacemos que la calculadora aparezca en el centro de la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Si clicamos en la "x" la calculadora se cierra.
        setResizable(false); // Impedimos poder redimensionar la calculadora.
        setTitle("CALCULADORA FACTOR K"); // Titulo de la calculadora.
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/icon.png")); // Icono calculadora.
        setLayout(null); // Desactivamos la colocoacion de los componentes automaticamente.
        inicializar(); // Funcion que contiene los componentes de la calculadora.
        setVisible(true);
    }

    public void inicializar() {

        getContentPane().setBackground(new Color( 255, 255, 255));

        Image logo1 = new ImageIcon("src/logoSys.jfif").getImage();
        logo = new JLabel(new ImageIcon(logo1.getScaledInstance(305, 175, Image.SCALE_SMOOTH)));
        logo.setBounds(30,10, 305, 85);
        add(logo);

        etiquetaCaudal = new JLabel("Caudal: ");
        etiquetaCaudal.setBounds(80, 120, 105, 30);
        add(etiquetaCaudal);

        etiquetaPa = new JLabel("Pa: ");
        etiquetaPa.setBounds(80, 160, 105, 30);
        add(etiquetaPa);

        etiquetaFactorK = new JLabel("FactorK: ");
        etiquetaFactorK.setBounds(80, 300, 105, 30);
        add(etiquetaFactorK);

        caudal = new JTextField();
        caudal.setBounds(180, 120, 120, 30);
        caudal.requestFocus();
        add(caudal);

        pascales = new JTextField();
        pascales.setBounds(180, 160, 120, 30);
        add(pascales);

        Font fuente = new Font("Arial", Font.BOLD, 18);
        factorK = new JTextField();
        factorK.setBounds(180, 300, 120, 30);
        factorK.setFont(fuente);
        factorK.setBorder(null);
        add(factorK);

        calcular = new JButton();
        calcular.setBounds(100, 230, 180, 45);
        calcular.setText("CALCULAR");
        add(calcular);
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public JLabel getEtiquetaCaudal() {
        return etiquetaCaudal;
    }

    public void setEtiquetaCaudal(JLabel etiquetaCaudal) {
        this.etiquetaCaudal = etiquetaCaudal;
    }

    public JLabel getEtiquetaPa() {
        return etiquetaPa;
    }

    public void setEtiquetaPa(JLabel etiquetaPa) {
        this.etiquetaPa = etiquetaPa;
    }

    public JLabel getEtiquetaFactorK() {
        return etiquetaFactorK;
    }

    public void setEtiquetaFactorK(JLabel etiquetaFactorK) {
        this.etiquetaFactorK = etiquetaFactorK;
    }

    public JLabel getLogo() {
        return logo;
    }

    public void setLogo(JLabel logo) {
        this.logo = logo;
    }

    public JTextField getCaudal() {
        return caudal;
    }

    public void setCaudal(JTextField caudal) {
        this.caudal = caudal;
    }

    public JTextField getPascales() {
        return pascales;
    }

    public void setPascales(JTextField pascales) {
        this.pascales = pascales;
    }

    public JTextField getFactorK() {
        return factorK;
    }

    public void setFactorK(JTextField factorK) {
        this.factorK = factorK;
    }

    public JButton getCalcular() {
        return calcular;
    }

    public void setCalcular(JButton calcular) {
        this.calcular = calcular;
    }

    public void evento(Eventos eventos) {
        calcular.addActionListener(eventos);
        pascales.addKeyListener(eventos);
        caudal.addKeyListener(eventos);
    } 
}
