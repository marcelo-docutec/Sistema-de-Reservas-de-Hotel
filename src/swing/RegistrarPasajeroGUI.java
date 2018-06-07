package swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RegistrarPasajeroGUI extends JFrame implements ActionListener{

    private JPanel jPanel;
    private JButton btnSalir;
    private JLabel jlabelNombre;
    private JLabel jlabelAapellido;
    private JLabel jlabelNombreUsuario;
    private JLabel jlabelContrasena;
    private JLabel jlabelDni;
    private JLabel jlabelTelefono;
    private JLabel jlabelNacionalidad;
    private JTextField textFieldNombre;
    private JTextField textFieldApellido;
    private JTextField textFieldNombreUsuario;
    private JPasswordField jpasswordFieldContrasenia;
    private JTextField textFieldDni;
    private JTextField textFieldTelefono;
    private JTextField textFieldNacionalidad;
    private JCheckBox jcheckBox;
    private JButton btnRegistrarse;


    /**
     * Constructor que llama al constructor por defecto de la clase padre JFrame
     * llamada a los metodos configurar ventana e inicializar componentes.
     */
    public RegistrarPasajeroGUI() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    /**
     * Este metodo se encarga de configurar la ventana principal
     * @param
     */
    private void configurarVentana() {
        this.setTitle("Formulario de Registro");                   // colocamos titulo a la ventana
        this.setSize(800, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    /**
     * Este metodo se encarga de inicializar los componentes
     * es decir crear paneles, instanciar JLabels, crear botones, etc
     * @param
     */
    private void inicializarComponentes() {
        // creamos los componentes
        setIconImage(getIconImage());
        jPanel = new JPanel();
        jPanel.setBounds(0,0,800,600);
        jPanel.setLayout(null);

        btnSalir = new javax.swing.JButton();
        btnSalir.setBounds(700,20,80,25);
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                btnSalirActionPerformed(evt);
            }
        });

        btnRegistrarse = new javax.swing.JButton();
        btnRegistrarse.setBounds(30,500,200,40);
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                btnRegistrarseActionPerformed(evt);
            }
        });

        jlabelNombre = new javax.swing.JLabel("Nombre");
        jlabelNombre.setBounds(30,40,170,25);

        jlabelAapellido = new javax.swing.JLabel("Apellido");
        jlabelAapellido.setBounds(30,80,170,25);

        jlabelNombreUsuario = new javax.swing.JLabel("Nombre de usuario");
        jlabelNombreUsuario.setBounds(30,120,170,25);

        jlabelContrasena = new javax.swing.JLabel("Contrasena");
        jlabelContrasena.setBounds(30,160,170,25);

        jlabelDni = new javax.swing.JLabel("Numero de dni");
        jlabelDni.setBounds(30,200,170,25);

        jlabelTelefono = new javax.swing.JLabel("Telefono");
        jlabelTelefono.setBounds(30,240,170,25);

        jlabelNacionalidad = new javax.swing.JLabel("Nacionalidad");
        jlabelNacionalidad.setBounds(30,280,170,25);

        jcheckBox = new javax.swing.JCheckBox();
        jcheckBox.setBounds(30,460,200,25);
        jcheckBox.setText("Acepto todos los terminos ");

        textFieldNombre = new javax.swing.JTextField();
        textFieldNombre.setBounds(160,40,170,30);

        textFieldApellido = new javax.swing.JTextField();
        textFieldApellido.setBounds(160,80,170,30);

        textFieldNombreUsuario = new javax.swing.JTextField();
        textFieldNombreUsuario.setBounds(160,120,170,30);

        jpasswordFieldContrasenia = new javax.swing.JPasswordField();
        jpasswordFieldContrasenia.setBounds(160,160,170,30);

        textFieldDni = new javax.swing.JTextField();
        textFieldDni.setBounds(160,200,170,30);

        textFieldTelefono = new javax.swing.JTextField();
        textFieldTelefono.setBounds(160,240,170,30);

        textFieldNacionalidad = new javax.swing.JTextField();
        textFieldNacionalidad.setBounds(160,280,170,30);

        this.add(jPanel);
        jPanel.add(textFieldNombre);
        jPanel.add(textFieldApellido);
        jPanel.add(textFieldNombreUsuario);
        jPanel.add(jpasswordFieldContrasenia);
        jPanel.add(textFieldDni);
        jPanel.add(textFieldTelefono);
        jPanel.add(textFieldNacionalidad);

        jPanel.add(btnSalir);
        jPanel.add(btnRegistrarse);

        jPanel.add(jlabelNombre);
        jPanel.add(jlabelAapellido);
        jPanel.add(jlabelNombreUsuario);
        jPanel.add(jlabelContrasena);
        jPanel.add(jlabelDni);
        jPanel.add(jlabelTelefono);
        jPanel.add(jlabelNacionalidad);
        jPanel.add(jcheckBox);


    }

    /**
     * Este metodo se encarga de devolver un objeto de tipo Image
     * Lo utilizamos para setear un icono a la ventana del jframe actual
     * @param
     */
    @Override
    public Image getIconImage() {
        Image miImagen;
        miImagen = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("resources/userIcon.png"));

        return miImagen; //devuelve una imagen
    }

    /**
     * Este metodo es un metodo abstracto que esta sobreescrito de la implementacion de la
     * interfaz ActionListener
     * @param
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //String nombre = textFieldUsername.getText();                                 // obtenemos el contenido de la caja de texto
        JOptionPane.showMessageDialog(this, "probando actionPErformed");    // mostramos un mensaje (frame, mensaje)
    }

    /**
     * En este metodo se ejecutara al presionar el boton btnSalir
     * @param
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt){
        JOptionPane.showMessageDialog(null,"Has salido");
        dispose();
    }

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt){
        JOptionPane.showMessageDialog(null,"Registrarse");
        RegistrarPasajeroGUI regPasajeroGUI = new RegistrarPasajeroGUI();
        regPasajeroGUI.setVisible(true);
        dispose();
    }


    /**
     * Main method, utiliza la interfaz Runnable para que podamos ejecutar
     * varios hilos a la vez y el programa no tenga que esperar el fin de la ejecucion de cada hilo
     * En el metodo run se le da una visibilidad de true
     * @param args
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

}
