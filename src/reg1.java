
import java.awt.Toolkit;

import javax.swing.JFrame;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daniel
 */
public class reg1 extends javax.swing.JFrame {

    public boolean bandera = false;
    private conector Conector;

    /**
     * Creates new form reg1
     */
    public reg1(conector Conector) {
        this.Conector = Conector;
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Mail = new javax.swing.JMenuItem();
        ServidorBD = new javax.swing.JMenu();
        Servidor = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        About = new javax.swing.JMenu();
        Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consejo de Abogados");

        jMenu1.setText("Registros");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });

        Mail.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        Mail.setText("Mail");
        Mail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MailMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MailMousePressed(evt);
            }
        });
        Mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MailActionPerformed(evt);
            }
        });
        jMenu1.add(Mail);

        jMenuBar1.add(jMenu1);

        ServidorBD.setText("Configuración");

        Servidor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        Servidor.setText("Servidor");
        Servidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ServidorMousePressed(evt);
            }
        });
        Servidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServidorActionPerformed(evt);
            }
        });
        ServidorBD.add(Servidor);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Mail");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ServidorBD.add(jMenuItem1);

        jMenuBar1.add(ServidorBD);

        About.setText("About");
        About.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AboutMousePressed(evt);
            }
        });
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jMenuBar1.add(About);

        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalirMousePressed(evt);
            }
        });
        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MailActionPerformed

    private void MailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MailMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_MailMouseClicked

    private void MailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MailMousePressed
        // TODO add your handling code here:
//        if (!bandera) {
        mail correo = new mail(Conector);
        correo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        correo.setVisible(true);
//            bandera = true;
//        }
    }//GEN-LAST:event_MailMousePressed

    private void SalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_SalirMousePressed

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu1MousePressed

    private void ServidorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServidorMousePressed
        // TODO add your handling code here:
        ServidorSMB Serbase = new ServidorSMB(Conector);
        Serbase.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Serbase.setVisible(true);
    }//GEN-LAST:event_ServidorMousePressed

    private void AboutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMousePressed
        // TODO add your handling code here:
//        JCheckBox chec = new JCheckBox("Prueba");
//
//        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opcion",
//                "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
//                new Object[]{"opcion 1", "opcion 2"}, "opcion 1");
//
//        if (seleccion != -1) {
//            System.out.println("seleccionada opcion " + (seleccion + 1));
//        }
//        if (chec.isSelected()) {
//            System.out.println("Selecciona el Chec");
//        }

//        int resp = JOptionPane.showConfirmDialog(null, "Usas mucho el JOptionPane?");
//        if (JOptionPane.OK_OPTION == resp) {
//            System.out.println("Selecciona opción Afirmativa" + resp);
//            List<String> adjuntos = new ArrayList<String>();
//            Enviomail de = new Enviomail();
//            adjuntos.add("registro.pdf");
//            adjuntos.add("registro1.pdf");
//            Properties configuracionmail = new Properties();
//     
//
//            configuracionmail.put("texto","Estimado le adjunto el saldo adeudado hasta la fecha.");
//            configuracionmail.put("To","dtformosa@gmail.com");
//            try {
//                de.Enviomail(adjuntos, configuracionmail);
//            } catch (IOException ex) {
//                Logger.getLogger(reg1.class.getName()).log(Level.SEVERE, null, ex);
//            }
//       

    }//GEN-LAST:event_AboutMousePressed

    private void ServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServidorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Smpt mail = new Smpt();
        mail.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mail.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        // TODO add your handling code here:



    }//GEN-LAST:event_AboutActionPerformed

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
            java.util.logging.Logger.getLogger(reg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JMenuItem Mail;
    private javax.swing.JMenu Salir;
    private javax.swing.JMenuItem Servidor;
    private javax.swing.JMenu ServidorBD;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("users6.png")));
    }
}