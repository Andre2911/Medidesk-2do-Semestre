package hospital.views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import hospital.bo.MedicoBO;
import hospital.entity.Medico;
import hospital.entity.Paciente;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Medico_cita extends javax.swing.JFrame {

    /**
     * Creates new form Admision
     */
    private MedicoBO mbo = new MedicoBO();
    private static Medico med;
    public Medico_cita(Medico med) {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon smile = new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png"));
        Icon img = new ImageIcon(smile.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(),Image.SCALE_DEFAULT));
        lblLogo.setIcon(img);
        //rsscalelabel.RSScaleLabel.setScaleLabel(fondo,"src\\hospital\\views\\imagesa\\Deep Space.png");
        setIconImage(new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png")).getImage());
        this.med = med;
        jDateMedCita.setBackground(new java.awt.Color(0,0,0,1));
        jDateMedCita.setWeekOfYearVisible(false);
        btnCrearHistoria.show(false);
        btnAtender.show(false);
        lblNombre.setText(med.getNombres());
        lblApellido.setText(med.getApellidos());
    }
    
    public void mostrarCitas(String date, int idMed) {
        mbo.mostrarCitas(jTableMedCita, date, idMed);
    }
    
    public boolean checkHistoria() {
        int row = jTableMedCita.getSelectedRow();
        if(Integer.parseInt(jTableMedCita.getModel().getValueAt(row, 5).toString())== 0)
            return true;
        else
            return false;
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMedCita = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jDateMedCita = new com.toedter.calendar.JCalendar();
        btnVerCitas = new javax.swing.JButton();
        btnAtender = new javax.swing.JButton();
        btnCrearHistoria = new javax.swing.JButton();

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

        jTableMedCita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableMedCita.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jTableMedCita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Hora", "Apellidos", "Nombres", "DNI", "Nº de Historia"
            }
        ));
        jTableMedCita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableMedCita.setGridColor(new java.awt.Color(255, 255, 255));
        jTableMedCita.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTableMedCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedCitaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableMedCita);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 490, 261));

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel6.setText("Citas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 72, 50, -1));

        jDateMedCita.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jDateMedCita.setOpaque(false);
        getContentPane().add(jDateMedCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 120, 290, 240));

        btnVerCitas.setBackground(new java.awt.Color(0, 51, 51));
        btnVerCitas.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        btnVerCitas.setForeground(new java.awt.Color(255, 255, 255));
        btnVerCitas.setText("Ver Citas");
        btnVerCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerCitasMouseClicked(evt);
            }
        });
        getContentPane().add(btnVerCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 120, 30));

        btnAtender.setBackground(new java.awt.Color(0, 51, 51));
        btnAtender.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        btnAtender.setForeground(new java.awt.Color(255, 255, 255));
        btnAtender.setText("Atender");
        btnAtender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtenderMouseClicked(evt);
            }
        });
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 200, 30));

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
        getContentPane().add(btnCrearHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"¿Desea Salir?","Exit",dialog);
        if(result==0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jTableMedCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedCitaMouseClicked

        if(checkHistoria()){
            btnCrearHistoria.show(true);
            btnAtender.show(false);
        }
        else{
            btnCrearHistoria.show(false);
            btnAtender.show(true);
        }
    }//GEN-LAST:event_jTableMedCitaMouseClicked

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
    }//GEN-LAST:event_jLabel4MouseMoved

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Medico_inicio r = new Medico_inicio(med);
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
    }//GEN-LAST:event_jLabel10MouseMoved

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Medico_cita ac = new Medico_cita(med);
        ac.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseMoved
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
    }//GEN-LAST:event_jLabel14MouseMoved

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        Medico_atenciones ma = new Medico_atenciones(med);
        ma.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
    }//GEN-LAST:event_jLabel14MouseExited

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked

        setExtendedState(ICONIFIED );
    }//GEN-LAST:event_MinimizarMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Login lo = new Login();
        lo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        Medico_inicio m = new Medico_inicio(med);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void btnAtenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtenderMouseClicked
        int row = jTableMedCita.getSelectedRow();
        int idCita = Integer.parseInt(jTableMedCita.getModel().getValueAt(row, 0).toString());
        String dni = jTableMedCita.getModel().getValueAt(row, 4).toString();
        String historia = jTableMedCita.getModel().getValueAt(row, 5).toString();
        Paciente pac = crearPaciente(dni);
        Medico_paciente m = new Medico_paciente(med,idCita,pac,historia);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtenderMouseClicked

    public Paciente crearPaciente(String dni){
        return mbo.crearPaciente(dni);
    }
    
    private void btnVerCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerCitasMouseClicked
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf.format(jDateMedCita.getDate());
        int idMed = med.getIdMedico();
        mostrarCitas(date, idMed);
    }//GEN-LAST:event_btnVerCitasMouseClicked

    private void btnCrearHistoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearHistoriaMouseClicked
        // Llamar a Medico_historia
        int row = jTableMedCita.getSelectedRow();
        String nombres = jTableMedCita.getModel().getValueAt(row, 3).toString();
        String apellidos = jTableMedCita.getModel().getValueAt(row, 2).toString();
        String dni = jTableMedCita.getModel().getValueAt(row, 4).toString();
        Medico_historia m = new Medico_historia(med, nombres, apellidos, dni);
        System.out.println(nombres+apellidos+dni);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCrearHistoriaMouseClicked

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        
    }//GEN-LAST:event_btnAtenderActionPerformed

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
            java.util.logging.Logger.getLogger(Medico_cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medico_cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medico_cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medico_cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Medico_cita(med).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Minimizar;
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnCrearHistoria;
    private javax.swing.JButton btnVerCitas;
    private com.toedter.calendar.JCalendar jDateMedCita;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableMedCita;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
