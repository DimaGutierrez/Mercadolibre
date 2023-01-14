import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
  
    private JMenuBar mb;
    private JMenu menuOpciones,menuCalcular,menuAcercaDe,menuColorFondo;
    private JMenuItem miCalculo,miAmarillo,miBlanco,miGris,miElCreador,miSalir,miNuevo;
    private JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,labelAPaterno,labelAMaterno,
                   labelDepartamento,labelAntiguedad,labelResultado,labelfooter;
    private JTextField txtNombreTrabajador,txtAPaternoTrabajador,txtAMaternoTrabajador;
    private JComboBox comboDepartamento,comboAntiguedad;
    private JScrollPane scrollpane1; 
    private JTextArea textarea1;
    String nombreAdministrador = "";

    public Principal() {
      setLayout(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("Pantalla principal");
      getContentPane().setBackground(new Color(255,241,89));
      setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
      Bienvenida ventanaBienvenida = new Bienvenida();
      nombreAdministrador = ventanaBienvenida.texto;

      mb = new JMenuBar();
      mb.setBackground(new Color(255,241,89));
      setJMenuBar(mb);

      menuOpciones = new JMenu("Opciones");
      menuOpciones.setBackground(new Color(255,241,89));
      menuOpciones.setFont(new Font("Andale Mono", 1, 14));
      menuOpciones.setForeground(new Color(0, 47, 109));
      mb.add(menuOpciones);

      menuCalcular = new JMenu("Calcular");
      menuCalcular.setBackground(new Color(255,241,89));
      menuCalcular.setFont(new Font("Andale Mono", 1, 14));
      menuCalcular.setForeground(new Color(0, 47, 109));
      mb.add(menuCalcular);

      menuAcercaDe = new JMenu("Acerca de");
      menuAcercaDe.setBackground(new Color(255,241,89));
      menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
      menuAcercaDe.setForeground(new Color(0, 47, 109));
      mb.add(menuAcercaDe);

      menuColorFondo = new JMenu("Color de fondo");
      menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
      menuColorFondo.setForeground(new Color(0, 47, 109));
      menuOpciones.add(menuColorFondo);

      miCalculo = new JMenuItem("Vacaciones");
      miCalculo.setFont(new Font("Andale Mono", 1, 14));
      miCalculo.setForeground(new Color(0, 47, 109));
      menuCalcular.add(miCalculo);
      miCalculo.addActionListener(this);

      miAmarillo = new JMenuItem("Amarillo");
      miAmarillo.setFont(new Font("Andale Mono", 1, 14));
      miAmarillo.setForeground(new Color(0, 47, 109));
      menuColorFondo.add(miAmarillo);
      miAmarillo.addActionListener(this);

      miBlanco = new JMenuItem("Blanco");
      miBlanco.setFont(new Font("Andale Mono", 1, 14));
      miBlanco.setForeground(new Color(0, 47, 109));
      menuColorFondo.add(miBlanco);
      miBlanco.addActionListener(this);

      miGris = new JMenuItem("Gris");
      miGris.setFont(new Font("Andale Mono", 1, 14));
      miGris.setForeground(new Color(0, 47, 109));
      menuColorFondo.add(miGris);
      miGris.addActionListener(this);

      miNuevo = new JMenuItem("Nuevo");
      miNuevo.setFont(new Font("Andale Mono", 1, 14));
      miNuevo.setForeground(new Color(0, 47, 109));
      menuOpciones.add(miNuevo);
      miNuevo.addActionListener(this);

      miElCreador = new JMenuItem("El creador");
      miElCreador.setFont(new Font("Andale Mono", 1, 14));
      miElCreador.setForeground(new Color(0, 47, 109));
      menuAcercaDe.add(miElCreador);
      miElCreador.addActionListener(this);

      miSalir = new JMenuItem("Salir");
      miSalir.setFont(new Font("Andale Mono", 1, 14));
      miSalir.setForeground(new Color(0, 47, 109));
      menuOpciones.add(miSalir);
      miSalir.addActionListener(this);

      ImageIcon imagen = new ImageIcon("images/logo-mercado.png");
      labelLogo = new JLabel(imagen);  
      labelLogo.setBounds(5,5,250,100);
      add(labelLogo);

      labelBienvenido = new JLabel("Bienvenido " + nombreAdministrador);  
      labelBienvenido.setBounds(280,30,300,50);
      labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
      labelBienvenido.setForeground(new Color(0, 47, 109));
      add(labelBienvenido);

      labelTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
      labelTitle.setBounds(45,140,900,25);
      labelTitle.setFont(new Font("Andale Mono", 0, 24));
      labelTitle.setForeground(new Color(0, 47, 109));
      add(labelTitle);

      labelNombre = new JLabel("Nombre completo:");
      labelNombre.setBounds(25,188,180,25);
      labelNombre.setFont(new Font("Andale Mono", 1, 12));
      labelNombre.setForeground(new Color(0, 47, 109));
      add(labelNombre);

      txtNombreTrabajador = new JTextField();
      txtNombreTrabajador.setBounds(25,213,150,25);
      txtNombreTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
      txtNombreTrabajador.setForeground(new java.awt.Color(0, 47, 109));
      add(txtNombreTrabajador);

      labelAPaterno = new JLabel("Apellido Paterno:");
      labelAPaterno.setBounds(25,248,180,25);
      labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
      labelAPaterno.setForeground(new Color(0, 47, 109));
      add(labelAPaterno);

      txtAPaternoTrabajador = new JTextField();
      txtAPaternoTrabajador.setBounds(25,273,150,25);
      txtAPaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
      txtAPaternoTrabajador.setForeground(new java.awt.Color(0, 47, 109));
      add(txtAPaternoTrabajador);

      labelAMaterno = new JLabel("Apellido Materno:");
      labelAMaterno.setBounds(25,308,180,25);
      labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
      labelAMaterno.setForeground(new Color(0, 47, 109));
      add(labelAMaterno);

      txtAMaternoTrabajador = new JTextField();
      txtAMaternoTrabajador.setBounds(25,334,150,25);
      txtAMaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
      txtAMaternoTrabajador.setForeground(new java.awt.Color(0, 47, 109));
      add(txtAMaternoTrabajador);

      labelDepartamento = new JLabel("Selecciona el Departamento:");
      labelDepartamento.setBounds(220,188,180,25);
      labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
      labelDepartamento.setForeground(new Color(0, 47, 109));
      add(labelDepartamento);

      comboDepartamento = new JComboBox();
      comboDepartamento.setBounds(220,213,220,25);
      comboDepartamento.setBackground(new java.awt.Color(224, 224, 224));
      comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
      comboDepartamento.setForeground(new java.awt.Color(0, 47, 109));
      add(comboDepartamento);
      comboDepartamento.addItem("");
      comboDepartamento.addItem("Atención al Cliente");
      comboDepartamento.addItem("Departamento de Logística");
      comboDepartamento.addItem("Departamento de Gerencia");

      labelAntiguedad = new JLabel("Selecciona la Antigüedad:");
      labelAntiguedad.setBounds(220,248,180,25);
      labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
      labelAntiguedad.setForeground(new Color(0, 47, 109));
      add(labelAntiguedad);

      comboAntiguedad = new JComboBox();
      comboAntiguedad.setBounds(220,273,220,25);
      comboAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
      comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
      comboAntiguedad.setForeground(new java.awt.Color(0, 47, 109));
      add(comboAntiguedad);
      comboAntiguedad.addItem("");
      comboAntiguedad.addItem("1 año de servicio");
      comboAntiguedad.addItem("2 a 6 años de servicio");
      comboAntiguedad.addItem("7 años o más de servicio");

      labelResultado = new JLabel("Resultado del Cálculo:");
      labelResultado.setBounds(220,307,180,25);
      labelResultado.setFont(new Font("Andale Mono", 1, 12));
      labelResultado.setForeground(new Color(0, 47, 109));
      add(labelResultado);

      textarea1 = new JTextArea();
      textarea1.setEditable(false);
      textarea1.setBackground(new Color(224, 224, 224));
      textarea1.setFont(new Font("Andale Mono", 1, 11));
      textarea1.setForeground(new Color(0, 47, 109));
      textarea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
      scrollpane1 = new JScrollPane(textarea1);
      scrollpane1.setBounds(220,333,385,90);
      add(scrollpane1); 

      labelfooter = new JLabel("©2023 Mercadolibre | Todos los derechos reservados");
      labelfooter.setBounds(135,445,500,30);
      labelfooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
      labelfooter.setForeground(new java.awt.Color(0, 47, 109));
      add(labelfooter);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miCalculo) {

	    String nombreTrabajador = txtNombreTrabajador.getText();
	    String AP = txtAPaternoTrabajador.getText();
	    String AM = txtAMaternoTrabajador.getText();
	    String Departamento = comboDepartamento.getSelectedItem().toString();
	    String Antiguedad = comboAntiguedad.getSelectedItem().toString();

            if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") ||
               Departamento.equals("") || Antiguedad.equals("")){
               
                JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos.");

            } else {

                if(Departamento.equals("Atención al Cliente")){

                                if(Antiguedad.equals("1 año de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien trabaja en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 6 días de vacaciones.");
				}
				if(Antiguedad.equals("2 a 6 años de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien trabaja en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 14 días de vacaciones.");
				}
				if(Antiguedad.equals("7 años o más de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien trabaja en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 20 días de vacaciones.");
				}
                     
                }
	        if(Departamento.equals("Departamento de Logística")){

				if(Antiguedad.equals("1 año de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien trabaja en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 7 días de vacaciones.");
				}
				if(Antiguedad.equals("2 a 6 años de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien trabaja en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 15 días de vacaciones.");
				}
				if(Antiguedad.equals("7 años o más de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien trabaja en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 22 días de vacaciones.");
				}
	    	}
	    	if(Departamento.equals("Departamento de Gerencia")){

				if(Antiguedad.equals("1 año de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien trabaja en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 10 días de vacaciones.");
				}
				if(Antiguedad.equals("2 a 6 años de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien trabaja en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 20 días de vacaciones.");
				}
				if(Antiguedad.equals("7 años o más de servicio")){
					textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien trabaja en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 30 días de vacaciones.");
				}
	    		}
            }

        }
        if (e.getSource() == miAmarillo){
            getContentPane().setBackground(new Color(255,241,89));
        }
        if (e.getSource() == miBlanco){
            getContentPane().setBackground(new Color(255,255,255));
        }
	if (e.getSource() == miGris){
            getContentPane().setBackground(new Color(236,236,236));
        }
        if (e.getSource() == miNuevo){	

	    txtNombreTrabajador.setText("");
	    txtAPaternoTrabajador.setText("");
	    txtAMaternoTrabajador.setText("");
            comboDepartamento.setSelectedIndex(0);
	    comboAntiguedad.setSelectedIndex(0);
	    textarea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");	 
   
        }
	if (e.getSource() == miSalir){

   	    Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setBounds(0,0,350,450);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);

	}
        if (e.getSource() == miElCreador){

            JOptionPane.showMessageDialog(null,"Desarrollado por Diego Ramiro Gutierrez\n"+
                                               "       https://github.com/DimaGutierrez");
        }
    }

    public static void main(String args[]) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    } 
}