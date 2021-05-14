package hospital.views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import hospital.bo.MedicoBO;
import hospital.entity.Medico;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Medico_historia extends javax.swing.JFrame {

    /**
     * Creates new form Admision
     */
    private static Medico med;
    private static String nom;
    private static String ape;
    private static String dni;
    private static String fecha;
    private MedicoBO mbo = new MedicoBO();
    public Medico_historia(Medico med, String nom, String ape, String dni) {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon smile = new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png"));
        Icon img = new ImageIcon(smile.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(),Image.SCALE_DEFAULT));
        lblLogo.setIcon(img);
        //rsscalelabel.RSScaleLabel.setScaleLabel(fondo,"src\\hospital\\views\\imagesa\\Deep Space.png");
        setIconImage(new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png")).getImage());
        this.med = med;
        this.nom = nom;
        this.ape = ape;
        this.dni = dni;
        txtNombes.setText(this.nom);
        txtApellidos.setText(this.ape);
        txtDni.setText(this.dni);
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        this.fecha = formateador.format(ahora);
        txtFecha.setText(fecha);
        txtNombes.setBackground(new java.awt.Color(0,0,0,1));
        txtApellidos.setBackground(new java.awt.Color(0,0,0,1));
        txtDni.setBackground(new java.awt.Color(0,0,0,1));
        txtFecha.setBackground(new java.awt.Color(0,0,0,1));
        lblNombre.setText(med.getNombres());
        lblApellido.setText(med.getApellidos());
    }
    
    public String crearHistoria(String date, String dni){
        return mbo.crearHistoria(date,dni);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblLogo1 = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtNombes = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnCrearHistoria = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/home-16(blanco).PNG"))); // NOI18N
        jLabel4.setText("Inicio");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel4MouseMoved(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 185, -1, 20));

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/cita-16(blanco).png"))); // NOI18N
        jLabel10.setText("Citas");
        jLabel10.setToolTipText("");
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MouseMoved(evt);
            }
        });
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 215, 70, -1));

        jLabel14.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/paciente-16(blanco).png"))); // NOI18N
        jLabel14.setText("Atenciones");
        jLabel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel14MouseMoved(evt);
            }
        });
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 245, -1, -1));

        jButton4.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jButton4.setText("Buscar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 150, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/user-64(verde).png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 70));

        jLabel11.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/exit-32(blanco).png"))); // NOI18N
        jLabel11.setText("Cerrar Sesión");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        lblNombre.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("USUARIO");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 140, -1));

        lblApellido.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellido.setText("USUARIO");
        jPanel2.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 130, 140, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 400));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel4.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jLabel16.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("MediDesk");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/close-32(blanco).png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        lblLogo1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        lblLogo1.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel4.add(lblLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/minimize-32(blanco).png"))); // NOI18N
        Minimizar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        jPanel4.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/back-32(blanco).png"))); // NOI18N
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 60));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel5.setText("Creación de Historias");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 72, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 278, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 508, 10));

        txtNombes.setEditable(false);
        txtNombes.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        txtNombes.setForeground(new java.awt.Color(102, 102, 102));
        txtNombes.setBorder(null);
        txtNombes.setOpaque(false);
        txtNombes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombesActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombes, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 120, 510, 30));

        txtApellidos.setEditable(false);
        txtApellidos.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(102, 102, 102));
        txtApellidos.setBorder(null);
        txtApellidos.setOpaque(false);
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 180, 510, 30));

        jLabel15.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel15.setText("Apellidos:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 20));

        jLabel22.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel22.setText("Nombres:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, 10));

        jLabel23.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel23.setText("DNI:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 248, -1, 20));

        txtDni.setEditable(false);
        txtDni.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        txtDni.setForeground(new java.awt.Color(102, 102, 102));
        txtDni.setBorder(null);
        txtDni.setOpaque(false);
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 240, 280, 30));

        btnCrearHistoria.setBackground(new java.awt.Color(0, 51, 51));
        btnCrearHistoria.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        btnCrearHistoria.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearHistoria.setText("Crear Historia");
        btnCrearHistoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearHistoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearHistoriaMouseClicked(evt);
            }
        });
        getContentPane().add(btnCrearHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 340, 30));

        jLabel26.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel26.setText("Fecha:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, 20));

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(102, 102, 102));
        txtFecha.setBorder(null);
        txtFecha.setOpaque(false);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 290, 280, 30));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 508, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 278, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Medico_inicio r = new Medico_inicio(med);
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Medico_cita ac = new Medico_cita(med);
        ac.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        Medico_atenciones ma = new Medico_atenciones(med);
        ma.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"¿Desea Salir?","Exit",dialog);
        if(result==0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
    }//GEN-LAST:event_jLabel4MouseMoved

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
    }//GEN-LAST:event_jLabel10MouseMoved

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseMoved
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
    }//GEN-LAST:event_jLabel14MouseMoved

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked

        setExtendedState(ICONIFIED );
    }//GEN-LAST:event_MinimizarMouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        Medico_cita ac = new Medico_cita(med);
        ac.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Login lo = new Login();
        lo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void txtNombesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombesActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnCrearHistoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearHistoriaMouseClicked
        JOptionPane.showMessageDialog(null, this.crearHistoria(this.fecha,this.dni));
        Medico_cita mc = new Medico_cita(med);
        mc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCrearHistoriaMouseClicked

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

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
            java.util.logging.Logger.getLogger(Medico_historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medico_historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medico_historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medico_historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medico_historia(med, nom, ape, dni).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Minimizar;
    private javax.swing.JButton btnCrearHistoria;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombes;
    // End of variables declaration//GEN-END:variables
}
