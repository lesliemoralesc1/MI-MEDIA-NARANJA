
package Ventana;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import mi_media_naranja.Cliente;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/Anaranja.png")).getImage());
               
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        panelRegistro = new javax.swing.JPanel();
        panelDatosPersonalesyGenerales = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCiudad = new javax.swing.JLabel();
        lblDepartamento = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblHijos = new javax.swing.JLabel();
        lblNumeroTarjetaCredito = new javax.swing.JLabel();
        lblCodigoTarjeta = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        txtDepartamento = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNumeroTarjetaCredito = new javax.swing.JTextField();
        cmbEstadoCivil = new javax.swing.JComboBox<>();
        cmbSexo = new javax.swing.JComboBox<>();
        txtCodigoTarjeta = new javax.swing.JTextField();
        rbtnSi = new javax.swing.JRadioButton();
        rbtnNo = new javax.swing.JRadioButton();
        spnEdad = new javax.swing.JSpinner();
        txtPais = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        panelDescripcionPersonal = new javax.swing.JPanel();
        lblEstatura = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblNivelCultural = new javax.swing.JLabel();
        cmbNivelCultural = new javax.swing.JComboBox<>();
        lblAficiones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltAficiones = new javax.swing.JList<>();
        lblNivelEducativo = new javax.swing.JLabel();
        cmbNivelEducativo = new javax.swing.JComboBox<>();
        spnPeso = new javax.swing.JSpinner();
        spnEstatura = new javax.swing.JSpinner();
        btnAgregarFoto = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        panelDescripcionOtraPersona = new javax.swing.JPanel();
        cmbEstadoCivilOP = new javax.swing.JComboBox<>();
        lblEstadoCivilOP = new javax.swing.JLabel();
        lblMargenEdad = new javax.swing.JLabel();
        lblAceptaHijo = new javax.swing.JLabel();
        rbtnSiOP = new javax.swing.JRadioButton();
        rbtnNoOP = new javax.swing.JRadioButton();
        lblNivelCulturalOP = new javax.swing.JLabel();
        cmbNivelCulturalOP = new javax.swing.JComboBox<>();
        lblMargenEstatura = new javax.swing.JLabel();
        lblMargenPeso = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        btnRegistrarse = new javax.swing.JButton();
        btnVentaCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");

        panelRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", 2, 0));

        panelDatosPersonalesyGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales y Generales", 2, 0));

        lblNombre.setText("Nombre:");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        lblApellido.setText("Apellido:");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        lblCedula.setText("Cedula:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblCiudad.setText("Ciudad:");

        lblDepartamento.setText("Departamento:");

        lblDireccion.setText("Direccion:");

        lblEmail.setText("E-mail: ");

        lblEstadoCivil.setText("Estado Civil:");

        lblEdad.setText("Edad:");

        lblSexo.setText("Sexo:");

        lblHijos.setText("Hijos:");

        lblNumeroTarjetaCredito.setText("Numero de la tarjeta de credito: ");

        lblCodigoTarjeta.setText("Codigo de la tarjeta:");

        txtDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartamentoActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtNumeroTarjetaCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroTarjetaCreditoActionPerformed(evt);
            }
        });
        txtNumeroTarjetaCredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroTarjetaCreditoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroTarjetaCreditoKeyTyped(evt);
            }
        });

        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Separado/a", "Comprometido/a" }));
        cmbEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoCivilActionPerformed(evt);
            }
        });

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fememino", "Masculino" }));

        txtCodigoTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoTarjetaActionPerformed(evt);
            }
        });
        txtCodigoTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoTarjetaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoTarjetaKeyTyped(evt);
            }
        });

        rbtnSi.setText("Si");
        rbtnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSiActionPerformed(evt);
            }
        });

        rbtnNo.setText("No");
        rbtnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNoActionPerformed(evt);
            }
        });

        spnEdad.setModel(new javax.swing.SpinnerNumberModel(18, 18, 90, 1));
        spnEdad.setMinimumSize(new java.awt.Dimension(35, 25));
        spnEdad.setRequestFocusEnabled(false);
        spnEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spnEdadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spnEdadKeyTyped(evt);
            }
        });

        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });

        lblPais.setText("Pais:");

        javax.swing.GroupLayout panelDatosPersonalesyGeneralesLayout = new javax.swing.GroupLayout(panelDatosPersonalesyGenerales);
        panelDatosPersonalesyGenerales.setLayout(panelDatosPersonalesyGeneralesLayout);
        panelDatosPersonalesyGeneralesLayout.setHorizontalGroup(
            panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPersonalesyGeneralesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosPersonalesyGeneralesLayout.createSequentialGroup()
                        .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPais)
                            .addComponent(lblApellido))
                        .addGap(59, 59, 59)
                        .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPais, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCedula)
                            .addComponent(txtApellido)))
                    .addGroup(panelDatosPersonalesyGeneralesLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(59, 59, 59)
                        .addComponent(txtNombre))
                    .addGroup(panelDatosPersonalesyGeneralesLayout.createSequentialGroup()
                        .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblEstadoCivil)
                            .addComponent(lblEdad)
                            .addComponent(lblSexo)
                            .addComponent(lblHijos))
                        .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosPersonalesyGeneralesLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(rbtnSi)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnNo)
                                .addGap(0, 119, Short.MAX_VALUE))
                            .addGroup(panelDatosPersonalesyGeneralesLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelDatosPersonalesyGeneralesLayout.createSequentialGroup()
                                        .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spnEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtEmail)))))
                    .addGroup(panelDatosPersonalesyGeneralesLayout.createSequentialGroup()
                        .addComponent(lblCedula)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelDatosPersonalesyGeneralesLayout.createSequentialGroup()
                        .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCiudad)
                            .addComponent(lblDireccion)
                            .addComponent(lblDepartamento))
                        .addGap(27, 27, 27)
                        .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDepartamento)
                            .addComponent(txtDireccion)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(panelDatosPersonalesyGeneralesLayout.createSequentialGroup()
                        .addComponent(lblNumeroTarjetaCredito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroTarjetaCredito))
                    .addGroup(panelDatosPersonalesyGeneralesLayout.createSequentialGroup()
                        .addComponent(lblCodigoTarjeta)
                        .addGap(68, 68, 68)
                        .addComponent(txtCodigoTarjeta)))
                .addContainerGap())
        );
        panelDatosPersonalesyGeneralesLayout.setVerticalGroup(
            panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPersonalesyGeneralesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPais)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDepartamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoCivil)
                    .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnSi)
                    .addComponent(rbtnNo)
                    .addComponent(lblHijos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroTarjetaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumeroTarjetaCredito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPersonalesyGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoTarjeta))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panelDescripcionPersonal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripción Personal", 2, 0));

        lblEstatura.setText("Estatura:");

        lblPeso.setText("Peso:");

        lblNivelCultural.setText("Nivel Cultural:");

        cmbNivelCultural.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajo", "Medio", "Alto" }));
        cmbNivelCultural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelCulturalActionPerformed(evt);
            }
        });

        lblAficiones.setText("Aficiones:");

        ltAficiones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Leer", "Ir al cine", "Escuchar música", "Practicar algún deporte", "Pintar", "Bailar", "Escribir", "Correr", "Jugar video juegos", "Jardineria", "Dormir", "Yoga", "Tocar instrumento", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ltAficiones);

        lblNivelEducativo.setText("Nivel Educativo:");

        cmbNivelEducativo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Primaria", "Bachillerato", "Universitario", "Especialista", "Master", "Doctor" }));

        spnPeso.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(20.0f), Float.valueOf(20.0f), Float.valueOf(120.0f), Float.valueOf(0.5f)));
        spnPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spnPesoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spnPesoKeyTyped(evt);
            }
        });

        spnEstatura.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(80.0f), Float.valueOf(80.0f), Float.valueOf(250.0f), Float.valueOf(0.5f)));
        spnEstatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spnEstaturaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spnEstaturaKeyTyped(evt);
            }
        });

        btnAgregarFoto.setText("Agregar Foto");
        btnAgregarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFotoActionPerformed(evt);
            }
        });

        jLabel26.setText("Foto de Perfil");

        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setText("FOTO");
        lblFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelDescripcionPersonalLayout = new javax.swing.GroupLayout(panelDescripcionPersonal);
        panelDescripcionPersonal.setLayout(panelDescripcionPersonalLayout);
        panelDescripcionPersonalLayout.setHorizontalGroup(
            panelDescripcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDescripcionPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDescripcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDescripcionPersonalLayout.createSequentialGroup()
                        .addGroup(panelDescripcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstatura)
                            .addComponent(lblPeso)
                            .addComponent(lblNivelCultural))
                        .addGap(18, 18, 18)
                        .addGroup(panelDescripcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelDescripcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spnEstatura, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spnPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                            .addGroup(panelDescripcionPersonalLayout.createSequentialGroup()
                                .addComponent(cmbNivelCultural, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))))
                    .addGroup(panelDescripcionPersonalLayout.createSequentialGroup()
                        .addComponent(lblNivelEducativo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbNivelEducativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDescripcionPersonalLayout.createSequentialGroup()
                        .addComponent(lblAficiones)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelDescripcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDescripcionPersonalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAgregarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDescripcionPersonalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(45, 45, 45))
        );
        panelDescripcionPersonalLayout.setVerticalGroup(
            panelDescripcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDescripcionPersonalLayout.createSequentialGroup()
                .addGroup(panelDescripcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDescripcionPersonalLayout.createSequentialGroup()
                        .addGroup(panelDescripcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstatura)
                            .addComponent(spnEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDescripcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPeso)
                            .addComponent(spnPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDescripcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNivelCultural)
                            .addComponent(cmbNivelCultural, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDescripcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNivelEducativo)
                            .addComponent(cmbNivelEducativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDescripcionPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAficiones)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDescripcionPersonalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarFoto)))
                .addGap(10, 10, 10))
        );

        panelDescripcionOtraPersona.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripcion de la Persona que Busca", 2, 0));

        cmbEstadoCivilOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Separado/a", "Comprometido/a" }));
        cmbEstadoCivilOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoCivilOPActionPerformed(evt);
            }
        });

        lblEstadoCivilOP.setText("Estado Civil:");

        lblMargenEdad.setText("Margen de edad:");

        lblAceptaHijo.setText("Acepta que tenga hijos:");

        rbtnSiOP.setText("Si");
        rbtnSiOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSiOPActionPerformed(evt);
            }
        });

        rbtnNoOP.setText("No");
        rbtnNoOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNoOPActionPerformed(evt);
            }
        });

        lblNivelCulturalOP.setText("Nivel Cultural:");

        cmbNivelCulturalOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajo", "Medio", "Alto" }));

        lblMargenEstatura.setText("Margen de Estatura:");

        lblMargenPeso.setText("Margen de Peso:");

        jLabel1.setText("Desde:");

        jLabel2.setText("Hasta:");

        jLabel3.setText("Desde:");

        jLabel4.setText("Hasta:");

        jLabel5.setText("Desde:");

        jLabel6.setText("Hasta:");

        javax.swing.GroupLayout panelDescripcionOtraPersonaLayout = new javax.swing.GroupLayout(panelDescripcionOtraPersona);
        panelDescripcionOtraPersona.setLayout(panelDescripcionOtraPersonaLayout);
        panelDescripcionOtraPersonaLayout.setHorizontalGroup(
            panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescripcionOtraPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDescripcionOtraPersonaLayout.createSequentialGroup()
                        .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMargenEdad)
                            .addComponent(lblEstadoCivilOP))
                        .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDescripcionOtraPersonaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbEstadoCivilOP, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDescripcionOtraPersonaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))
                    .addGroup(panelDescripcionOtraPersonaLayout.createSequentialGroup()
                        .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAceptaHijo)
                            .addComponent(lblNivelCulturalOP))
                        .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDescripcionOtraPersonaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnSiOP)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnNoOP))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDescripcionOtraPersonaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(cmbNivelCulturalOP, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelDescripcionOtraPersonaLayout.createSequentialGroup()
                        .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMargenEstatura)
                            .addComponent(lblMargenPeso))
                        .addGap(18, 18, 18)
                        .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDescripcionOtraPersonaLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDescripcionOtraPersonaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(47, 47, 47))
        );
        panelDescripcionOtraPersonaLayout.setVerticalGroup(
            panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDescripcionOtraPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoCivilOP)
                    .addComponent(cmbEstadoCivilOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMargenEdad)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAceptaHijo)
                    .addComponent(rbtnSiOP)
                    .addComponent(rbtnNoOP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNivelCulturalOP)
                    .addComponent(cmbNivelCulturalOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(lblMargenEstatura))
                .addGap(18, 18, 18)
                .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDescripcionOtraPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addComponent(lblMargenPeso))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        btnVentaCliente.setText("ir ventana Cliente");
        btnVentaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosPersonalesyGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDescripcionPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDescripcionOtraPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(btnRegistrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVentaCliente)
                .addGap(79, 79, 79))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addComponent(panelDescripcionPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDescripcionOtraPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelDatosPersonalesyGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarse)
                    .addComponent(btnVentaCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartamentoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void cmbEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoCivilActionPerformed

    private void cmbEstadoCivilOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoCivilOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoCivilOPActionPerformed

    private void rbtnSiOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSiOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSiOPActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
             
        Cliente cli = new Cliente();
        //Datos Cliente
        cli.setNombre(txtNombre.getText());
        cli.setApellido(txtApellido.getText());
        cli.setCedula(txtCedula.getText());
        cli.setPais(txtPais.getText());
        cli.setDepartamento(txtDepartamento.getText());
        cli.setCiudad(txtCiudad.getText());
        cli.setEmail(txtEmail.getText());
        cli.setEstadocivil(cmbEstadoCivil.getSelectedItem().toString());
        cli.setEdad((int) spnEdad.getValue());
        cli.setSexo(cmbSexo.getSelectedItem().toString());
        //cli.setHijos(getValue());
        cli.setNo_tarjetacredito(txtNumeroTarjetaCredito.getText());
        cli.setCodigo_tarjeta(txtCodigoTarjeta.getText());
        cli.setEstatura(spnEstatura.getComponentCount());
        cli.setPeso((float)spnPeso.getValue());
        cli.setNivelcultural(cmbNivelCultural.getSelectedItem().toString());
        cli.setNiveleducativo(cmbNivelEducativo.getSelectedItem().toString());
        
        //aficiones
        //imagen
//        cli.
        
          
//        cliente.add(cli);
        
        limpiarPantalla();
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        
    }//GEN-LAST:event_txtNombreActionPerformed
File fichero;
    private void btnAgregarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFotoActionPerformed
        int resultado;
        CargarImagen ventana = new CargarImagen();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG Y PNG","jpg","png");
        ventana.jfchCargarFoto.setFileFilter(filtro);
        //MOSTRAR VENTANA A USUARIO, AL MOMENTO QUE SELECCIONE UN ARCHIVO SE DEVOLVERA UN VALOR QUE ES EL QUE VALIDAREMOS
        resultado = ventana.jfchCargarFoto.showOpenDialog(null);
        if(JFileChooser.APPROVE_OPTION == resultado){
            fichero = ventana.jfchCargarFoto.getSelectedFile();
            try{
                ImageIcon icon = new ImageIcon(fichero.toString());
                //Se ajusta el tamaño de la imagen 
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lblFoto.getWidth(),lblFoto.getHeight(),Image.SCALE_DEFAULT));
                //Borrar lo que halla en el label
                lblFoto.setText(null);                
                
                //Mostrar imagen
                lblFoto.setIcon(icono);
                
            }catch(Exception ex){
                
                JOptionPane.showMessageDialog(null,"Error al abrir la imagen"+ex);
            }
            
        }
        
        
    }//GEN-LAST:event_btnAgregarFotoActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        comprobarTextoNumero(evt);
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void rbtnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSiActionPerformed

    private void rbtnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnNoActionPerformed

    private void txtNumeroTarjetaCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroTarjetaCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroTarjetaCreditoActionPerformed

    private void txtNumeroTarjetaCreditoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroTarjetaCreditoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroTarjetaCreditoKeyReleased

    private void txtNumeroTarjetaCreditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroTarjetaCreditoKeyTyped
      comprobarTextoNumero(evt);
    }//GEN-LAST:event_txtNumeroTarjetaCreditoKeyTyped

    private void txtCodigoTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoTarjetaActionPerformed

    private void txtCodigoTarjetaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoTarjetaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoTarjetaKeyReleased

    private void txtCodigoTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoTarjetaKeyTyped
        comprobarTextoNumero(evt);
    }//GEN-LAST:event_txtCodigoTarjetaKeyTyped

    private void spnEstaturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnEstaturaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_spnEstaturaKeyReleased

    private void spnEstaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnEstaturaKeyTyped
       comprobarTextoNumero(evt);
    }//GEN-LAST:event_spnEstaturaKeyTyped

    private void spnPesoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnPesoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_spnPesoKeyReleased

    private void spnPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnPesoKeyTyped
      comprobarTextoNumero(evt);
    }//GEN-LAST:event_spnPesoKeyTyped

    private void spnEdadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnEdadKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_spnEdadKeyReleased

    private void spnEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnEdadKeyTyped
        comprobarTextoNumero(evt);
    }//GEN-LAST:event_spnEdadKeyTyped

    private void rbtnNoOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNoOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnNoOPActionPerformed

    private void btnVentaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaClienteActionPerformed
        Principal Cli = new Principal ();
        Cli.setVisible(true);
    }//GEN-LAST:event_btnVentaClienteActionPerformed

    private void cmbNivelCulturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelCulturalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNivelCulturalActionPerformed
    
    private void limpiarPantalla(){
                txtNombre.setText("");
                txtApellido.setText("");
                txtCedula.setText("") ;
                txtPais.setText("") ;
                txtDepartamento.setText("");
                txtCiudad.setText("");
                txtDireccion.setText("");
                txtEmail.setText("");
                cmbEstadoCivil.setSelectedIndex(0);
                //spnEdad.getText().equals("");
                //cmbSexo.getText().equals("") ;
                //hijos limpiar
                txtNumeroTarjetaCredito.setText("") ;
                txtCodigoTarjeta.setText("") ;
    }
    
    
    private void comprobarTextoNumero(java.awt.event.KeyEvent evt){
        char caracter;        
        caracter = evt.getKeyChar();
        if(!Character.isDigit(caracter)){
            evt.consume();
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarFoto;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnVentaCliente;
    private javax.swing.JComboBox<String> cmbEstadoCivil;
    private javax.swing.JComboBox<String> cmbEstadoCivilOP;
    private javax.swing.JComboBox<String> cmbNivelCultural;
    private javax.swing.JComboBox<String> cmbNivelCulturalOP;
    private javax.swing.JComboBox<String> cmbNivelEducativo;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JLabel lblAceptaHijo;
    private javax.swing.JLabel lblAficiones;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCodigoTarjeta;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblEstadoCivilOP;
    private javax.swing.JLabel lblEstatura;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblHijos;
    private javax.swing.JLabel lblMargenEdad;
    private javax.swing.JLabel lblMargenEstatura;
    private javax.swing.JLabel lblMargenPeso;
    private javax.swing.JLabel lblNivelCultural;
    private javax.swing.JLabel lblNivelCulturalOP;
    private javax.swing.JLabel lblNivelEducativo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroTarjetaCredito;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JList<String> ltAficiones;
    private javax.swing.JPanel panelDatosPersonalesyGenerales;
    private javax.swing.JPanel panelDescripcionOtraPersona;
    private javax.swing.JPanel panelDescripcionPersonal;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JRadioButton rbtnNo;
    private javax.swing.JRadioButton rbtnNoOP;
    private javax.swing.JRadioButton rbtnSi;
    private javax.swing.JRadioButton rbtnSiOP;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JSpinner spnEstatura;
    private javax.swing.JSpinner spnPeso;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigoTarjeta;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroTarjetaCredito;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
