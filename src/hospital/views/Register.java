/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.views;

import hospital.bo.AdmisionBO;
import hospital.bo.RegistroBO;
import hospital.entity.Administrador;
import hospital.entity.Enfermera;
import hospital.entity.Farmaceutico;
import hospital.entity.Medico;
import hospital.entity.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    RegistroBO rbo = new RegistroBO();
    
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png")).getImage());
        //Invisible textfield
        txtNombres.setBackground(new java.awt.Color(0,0,0,1));
        txtApellidos.setBackground(new java.awt.Color(0,0,0,1));
        txtDni.setBackground(new java.awt.Color(0,0,0,1));
        txtEmail.setBackground(new java.awt.Color(0,0,0,1));
        txtEdad.setBackground(new java.awt.Color(0,0,0,1));
        txtContraseña.setBackground(new java.awt.Color(0,0,0,1));
        txtConfirmarContraseña.setBackground(new java.awt.Color(0,0,0,1));
        txtCmp.setBackground(new java.awt.Color(0,0,0,1));
        lblEspecialidad.setVisible(false);
        lblCmp.setVisible(false);
        cbEspecialidad.setVisible(false);
        txtCmp.setVisible(false);
        jsCmp.setVisible(false);
        AdmisionBO a = new AdmisionBO();
        a.listar_especialidades(cbEspecialidad);
    }

    public String encrypt(String pass){
        return rbo.encrypt(pass);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupNivel = new javax.swing.ButtonGroup();
        groupGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblEspecialidad = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        rbtAdministrador = new javax.swing.JRadioButton();
        rbtMedico = new javax.swing.JRadioButton();
        rbtEnfermera = new javax.swing.JRadioButton();
        rbtFarmaceutico = new javax.swing.JRadioButton();
        rbtMasculino = new javax.swing.JRadioButton();
        rbtFemenino = new javax.swing.JRadioButton();
        txtNombres = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtApellidos = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        Minimizar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jsCmp = new javax.swing.JSeparator();
        jsEdad = new javax.swing.JSeparator();
        lblEdad = new javax.swing.JLabel();
        lblCmp = new javax.swing.JLabel();
        cbEspecialidad = new javax.swing.JComboBox<>();
        txtContraseña = new javax.swing.JPasswordField();
        txtConfirmarContraseña = new javax.swing.JPasswordField();
        txtCmp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(14, 14, 14));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(40, 240, 220));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/Fondo(300x460).png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 460));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE USUARIOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NIVEL DE USUARIO:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOMBRES:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("APELLIDOS:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));

        lblEspecialidad.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        lblEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        lblEspecialidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEspecialidad.setText("ESPECIALIDAD:");
        jPanel2.add(lblEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, 30));

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GÉNERO:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, 30));

        btnRegistrar.setBackground(new java.awt.Color(0, 51, 51));
        btnRegistrar.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/check-16(verde).png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, 30));

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CONFIRMAR CONTRASEÑA:");
        jLabel10.setToolTipText("");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 50));

        jLabel8.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("E-MAIL:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 50, 30));

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CONTRASEÑA:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 50));

        txtEmail.setBackground(new java.awt.Color(28, 28, 28));
        txtEmail.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.setOpaque(false);
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 410, 30));

        txtEdad.setBackground(new java.awt.Color(28, 28, 28));
        txtEdad.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(255, 255, 255));
        txtEdad.setBorder(null);
        txtEdad.setOpaque(false);
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 170, 30));

        rbtAdministrador.setBackground(new java.awt.Color(51, 51, 51));
        groupNivel.add(rbtAdministrador);
        rbtAdministrador.setFont(new java.awt.Font("Maiandra GD", 0, 10)); // NOI18N
        rbtAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        rbtAdministrador.setText("ADMINISTRADOR");
        rbtAdministrador.setContentAreaFilled(false);
        rbtAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtAdministradorMouseClicked(evt);
            }
        });
        jPanel2.add(rbtAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 120, 30));

        rbtMedico.setBackground(new java.awt.Color(51, 51, 51));
        groupNivel.add(rbtMedico);
        rbtMedico.setFont(new java.awt.Font("Maiandra GD", 0, 10)); // NOI18N
        rbtMedico.setForeground(new java.awt.Color(255, 255, 255));
        rbtMedico.setText("MÉDICO");
        rbtMedico.setContentAreaFilled(false);
        rbtMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtMedicoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbtMedicoMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rbtMedicoMouseReleased(evt);
            }
        });
        rbtMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(rbtMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, 30));

        rbtEnfermera.setBackground(new java.awt.Color(51, 51, 51));
        groupNivel.add(rbtEnfermera);
        rbtEnfermera.setFont(new java.awt.Font("Maiandra GD", 0, 10)); // NOI18N
        rbtEnfermera.setForeground(new java.awt.Color(255, 255, 255));
        rbtEnfermera.setText("ENFERMERA");
        rbtEnfermera.setContentAreaFilled(false);
        rbtEnfermera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtEnfermeraMouseClicked(evt);
            }
        });
        jPanel2.add(rbtEnfermera, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, 30));

        rbtFarmaceutico.setBackground(new java.awt.Color(51, 51, 51));
        groupNivel.add(rbtFarmaceutico);
        rbtFarmaceutico.setFont(new java.awt.Font("Maiandra GD", 0, 10)); // NOI18N
        rbtFarmaceutico.setForeground(new java.awt.Color(255, 255, 255));
        rbtFarmaceutico.setText("FARMACÉUTICO");
        rbtFarmaceutico.setContentAreaFilled(false);
        rbtFarmaceutico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtFarmaceuticoMouseClicked(evt);
            }
        });
        jPanel2.add(rbtFarmaceutico, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, 30));

        rbtMasculino.setBackground(new java.awt.Color(51, 51, 51));
        groupGenero.add(rbtMasculino);
        rbtMasculino.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        rbtMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rbtMasculino.setText("MASCULINO");
        rbtMasculino.setContentAreaFilled(false);
        jPanel2.add(rbtMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, 30));

        rbtFemenino.setBackground(new java.awt.Color(51, 51, 51));
        groupGenero.add(rbtFemenino);
        rbtFemenino.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        rbtFemenino.setForeground(new java.awt.Color(255, 255, 255));
        rbtFemenino.setText("FEMENINO");
        rbtFemenino.setContentAreaFilled(false);
        jPanel2.add(rbtFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, 30));

        txtNombres.setBackground(new java.awt.Color(28, 28, 28));
        txtNombres.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        txtNombres.setBorder(null);
        txtNombres.setOpaque(false);
        jPanel2.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 410, 30));

        txtDni.setBackground(new java.awt.Color(28, 28, 28));
        txtDni.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setBorder(null);
        txtDni.setOpaque(false);
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 130, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/close-32(blanco).png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 51, 51));
        btnLimpiar.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/eraser-16.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, 30));

        btnCancelar.setBackground(new java.awt.Color(0, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/cancel-16(rojo).PNG"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, -1, 30));

        txtApellidos.setBackground(new java.awt.Color(28, 28, 28));
        txtApellidos.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos.setBorder(null);
        txtApellidos.setOpaque(false);
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 410, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 410, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 410, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 410, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 130, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 170, 10));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 170, 10));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/minimize-32(blanco).png"))); // NOI18N
        Minimizar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        jPanel2.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, 40));

        jLabel11.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DNI:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 30));

        jsCmp.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jsCmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 170, 10));

        jsEdad.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jsEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 170, 10));

        lblEdad.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(255, 255, 255));
        lblEdad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEdad.setText("EDAD:");
        jPanel2.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        lblCmp.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        lblCmp.setForeground(new java.awt.Color(255, 255, 255));
        lblCmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCmp.setText("CMP:");
        jPanel2.add(lblCmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, 30));

        cbEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        cbEspecialidad.setForeground(new java.awt.Color(0, 0, 0));
        cbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cardiología", "Dermatología", "Endocrinología", "Gastroenterología", "Geriatría", "Ginecología", "Nefrología", "Neumología", "Neurocirugía", "Nutrición", "Obstetricía", "Odontología", "Oftalmología", "Oncología", "Otorrinolaringología", "Pediatría", "Psicología", "Psiquiatría", "Reumatología", "Urología", " ", " ", " ", " ", " " }));
        cbEspecialidad.setBorder(null);
        cbEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspecialidadActionPerformed(evt);
            }
        });
        jPanel2.add(cbEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 120, 30));

        txtContraseña.setBackground(new java.awt.Color(28, 28, 28));
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setBorder(null);
        txtContraseña.setOpaque(false);
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 170, 30));

        txtConfirmarContraseña.setBackground(new java.awt.Color(28, 28, 28));
        txtConfirmarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmarContraseña.setBorder(null);
        txtConfirmarContraseña.setOpaque(false);
        jPanel2.add(txtConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 170, 30));

        txtCmp.setBackground(new java.awt.Color(28, 28, 28));
        txtCmp.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtCmp.setForeground(new java.awt.Color(255, 255, 255));
        txtCmp.setBorder(null);
        txtCmp.setOpaque(false);
        jPanel2.add(txtCmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 170, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/Deep Space(650x460).png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 460));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/Deep Space(650x460).png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 460));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 650, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir del Register?","Exit",dialog);
        if(result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel12MouseClicked
    
    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        if(txtNombres.getText().isEmpty() || txtApellidos.getText().isEmpty()
                || txtDni.getText().isEmpty() || txtEdad.getText().isEmpty()
                || txtEmail.getText().isEmpty() || String.valueOf(txtContraseña.getPassword()).isEmpty()
                || String.valueOf(txtConfirmarContraseña.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }else{
            
            char tipo;
            char genero;
            if (rbtMasculino.isSelected()){
                genero = 'M';
            }else{
                genero = 'F';
            }
            if (rbtAdministrador.isSelected()){
                tipo = 'A';
                Usuario user = createUser(tipo);
                System.out.println("Usuario: "+user.getIdUsuario()+user.getCorreo()+user.getClave()+user.getTipo());       
                Administrador adm  = new Administrador();
                adm.setDni(Integer.parseInt(txtDni.getText()));
                adm.setNombres(txtNombres.getText());
                adm.setApellidos(txtApellidos.getText());
                adm.setGenero(genero);
                adm.setEdad(Integer.parseInt(txtEdad.getText()));
                adm.setIdUsuario(user.getIdUsuario());
                adm.setCorreo(user.getCorreo());
                adm.setClave(user.getClave());
                adm.setTipo(user.getTipo());               
                String mensaje = rbo.regAdm(adm);                
                adm.setIdAdministrador(getIdAdm(adm));
                System.out.println("US(adm): "+"IdUser: "+adm.getIdUsuario()+"IdCorreo: "+adm.getCorreo()+"IdClave: "+adm.getClave()+
                        "IdTipo: "+adm.getTipo());
                System.out.println("ADM: "+adm.getIdAdministrador()+adm.getDni()+adm.getNombres()+adm.getApellidos()
                        +adm.getGenero()+adm.getEdad());
                limpiar();
                JOptionPane.showMessageDialog(null, mensaje);
            }
            if(rbtMedico.isSelected()){
                System.out.println(String.valueOf(cbEspecialidad.getSelectedItem()));
                tipo = 'M';
                Usuario user = createUser(tipo);
                int id = this.getIdEsp(String.valueOf(cbEspecialidad.getSelectedItem()));       
                Medico med = new Medico();
                med.setDni(Integer.parseInt(txtDni.getText()));
                med.setNombres(txtNombres.getText());
                med.setApellidos(txtApellidos.getText());
                med.setGenero(genero);
                med.setEdad(Integer.parseInt(txtEdad.getText()));
                med.setIdUsuario(user.getIdUsuario());
                med.setCorreo(user.getCorreo());
                med.setClave(user.getClave());
                med.setTipo(user.getTipo());
                med.setCmp(Integer.parseInt(txtCmp.getText()));
                med.setIdEspecialidad(id);
                
                String mensaje = rbo.regMed(med);
                
                med.setIdMedico(getIdMed(med));
                limpiar();
                JOptionPane.showMessageDialog(null, mensaje);
            }
            if(rbtEnfermera.isSelected()){
                tipo = 'E';
                Usuario user = createUser(tipo);
                       
                Enfermera enf  = new Enfermera();
                enf.setDni(Integer.parseInt(txtDni.getText()));
                enf.setNombres(txtNombres.getText());
                enf.setApellidos(txtApellidos.getText());
                enf.setGenero(genero);
                enf.setEdad(Integer.parseInt(txtEdad.getText()));
                enf.setIdUsuario(user.getIdUsuario());
                enf.setCorreo(user.getCorreo());
                enf.setClave(user.getClave());
                enf.setTipo(user.getTipo());
                
                String mensaje = rbo.regEnf(enf);
                enf.setIdEnfermera(getIdEnf(enf));
                limpiar();
                JOptionPane.showMessageDialog(null, mensaje);
            }
            if(rbtFarmaceutico.isSelected()){
                tipo = 'F';
                Usuario user = createUser(tipo);
                       
                Farmaceutico farm  = new Farmaceutico();
                farm.setDni(Integer.parseInt(txtDni.getText()));
                farm.setNombres(txtNombres.getText());
                farm.setApellidos(txtApellidos.getText());
                farm.setGenero(genero);
                farm.setEdad(Integer.parseInt(txtEdad.getText()));
                farm.setIdUsuario(user.getIdUsuario());
                farm.setCorreo(user.getCorreo());
                farm.setClave(user.getClave());
                farm.setTipo(user.getTipo());
                
                String mensaje = rbo.regFarm(farm);
                farm.setIdFarmaceutico(getIdFarm(farm));
                limpiar();
                JOptionPane.showMessageDialog(null, mensaje);
            }                      
        }
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        Login lo = new Login();
        lo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked

        setExtendedState(ICONIFIED );
    }//GEN-LAST:event_MinimizarMouseClicked

    private void cbEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEspecialidadActionPerformed

    private void rbtMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMedicoActionPerformed
        
    }//GEN-LAST:event_rbtMedicoActionPerformed

    private void rbtMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtMedicoMouseClicked
        lblEspecialidad.setVisible(true);
        lblCmp.setVisible(true);
        cbEspecialidad.setVisible(true);
        txtCmp.setVisible(true);
        jsCmp.setVisible(true);
    }//GEN-LAST:event_rbtMedicoMouseClicked

    private void rbtMedicoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtMedicoMouseReleased

    }//GEN-LAST:event_rbtMedicoMouseReleased

    private void rbtMedicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtMedicoMouseExited
        
    }//GEN-LAST:event_rbtMedicoMouseExited

    private void rbtAdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtAdministradorMouseClicked
        lblEspecialidad.setVisible(false);
        lblCmp.setVisible(false);
        cbEspecialidad.setVisible(false);
        txtCmp.setVisible(false);
        jsCmp.setVisible(false);
    }//GEN-LAST:event_rbtAdministradorMouseClicked

    private void rbtFarmaceuticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtFarmaceuticoMouseClicked
        lblEspecialidad.setVisible(false);
        lblCmp.setVisible(false);
        cbEspecialidad.setVisible(false);
        txtCmp.setVisible(false);
        jsCmp.setVisible(false);
    }//GEN-LAST:event_rbtFarmaceuticoMouseClicked

    private void rbtEnfermeraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtEnfermeraMouseClicked
        lblEspecialidad.setVisible(false);
        lblCmp.setVisible(false);
        cbEspecialidad.setVisible(false);
        txtCmp.setVisible(false);
        jsCmp.setVisible(false);
    }//GEN-LAST:event_rbtEnfermeraMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_btnLimpiarMouseClicked
    
    public Usuario createUser(char tipo){
        Login lo = new Login();
        Usuario user = new Usuario();
        user.setCorreo(txtEmail.getText());
        user.setClave(this.encrypt(txtContraseña.getText()));
        user.setTipo(tipo);
        rbo.regUser(user);
        user.setIdUsuario(lo.getIdUser(user));
        return user;
    }
    
    public int getIdAdm(Administrador adm){
        return rbo.getIdAdm(adm);
    }
    public int getIdMed(Medico med){
        return rbo.getIdMed(med);
    }
    public int getIdEnf(Enfermera enf){
        return rbo.getIdEnf(enf);
    }
    public int getIdFarm(Farmaceutico farm){
        return rbo.getIdFarm(farm);
    }
    
    public void limpiar(){
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDni.setText("");
        txtEdad.setText("");
        txtEmail.setText("");
        txtContraseña.setText("");
        txtConfirmarContraseña.setText("");
        txtCmp.setText("");
        cbEspecialidad.setSelectedItem("Seleccionar");
        groupGenero.clearSelection();
        groupNivel.clearSelection();
    }
    

    public int getIdEsp(String espe){
        return rbo.getIdEsp(espe);

    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Minimizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbEspecialidad;
    private javax.swing.ButtonGroup groupGenero;
    private javax.swing.ButtonGroup groupNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jsCmp;
    private javax.swing.JSeparator jsEdad;
    private javax.swing.JLabel lblCmp;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JRadioButton rbtAdministrador;
    private javax.swing.JRadioButton rbtEnfermera;
    private javax.swing.JRadioButton rbtFarmaceutico;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JRadioButton rbtMedico;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCmp;
    private javax.swing.JPasswordField txtConfirmarContraseña;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
