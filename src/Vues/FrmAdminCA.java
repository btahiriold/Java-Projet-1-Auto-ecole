/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlLecon;
import javax.swing.JOptionPane;

/**
 *
 * @author Rakotomalala Cédric
 */
public class FrmAdminCA extends javax.swing.JFrame {

    CtrlLecon ctrlLecon;
    /**
     * Creates new form FrmAdminCA
     */
    public FrmAdminCA() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblChiffreDAffaire = new javax.swing.JLabel();
        lblPeriode = new javax.swing.JLabel();
        dcAdminChiffreDAffaire1 = new com.toedter.calendar.JDateChooser();
        lblAu = new javax.swing.JLabel();
        dcAdminChiffreDAffaire2 = new com.toedter.calendar.JDateChooser();
        btnAdminChiffreDAffaires = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtChiffreDAFFAIRE = new javax.swing.JTextField();
        btnAdminGrapheChiffreDAFffaire = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblChiffreDAffaire.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblChiffreDAffaire.setText("Le Chiffre d'Affaire");

        lblPeriode.setText("Choisissez une période :");

        lblAu.setText("Au");

        btnAdminChiffreDAffaires.setText("Voir votre chiffre d'affaire");
        btnAdminChiffreDAffaires.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminChiffreDAffairesMouseClicked(evt);
            }
        });

        jLabel1.setText("Votre chiffre d'affaire durant cette période : ");

        btnAdminGrapheChiffreDAFffaire.setText("Voir le graphique ");
        btnAdminGrapheChiffreDAFffaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminGrapheChiffreDAFffaireMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdminGrapheChiffreDAFffaire, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtChiffreDAFFAIRE, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnAdminChiffreDAffaires, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblChiffreDAffaire)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dcAdminChiffreDAffaire1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblAu)))
                        .addGap(18, 18, 18)
                        .addComponent(dcAdminChiffreDAffaire2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblChiffreDAffaire)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPeriode)
                    .addComponent(dcAdminChiffreDAffaire1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcAdminChiffreDAffaire2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnAdminChiffreDAffaires)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtChiffreDAFFAIRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnAdminGrapheChiffreDAFffaire)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminChiffreDAffairesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminChiffreDAffairesMouseClicked
        if (dcAdminChiffreDAffaire1.getDate().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Le champ date du ne peut pas être vide !","Chiffre d'affaires",JOptionPane.WARNING_MESSAGE);

        } else if (dcAdminChiffreDAffaire2.getDate().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Le champ date au ne peut pas être vide !","Chiffre d'affaires",JOptionPane.WARNING_MESSAGE);
        } else {
            Double chiffreAffaires = ctrlLecon.getChiffreAffaires(dcAdminChiffreDAffaire1.getDate(), dcAdminChiffreDAffaire2.getDate());
            
            txtChiffreDAFFAIRE.setText(Double.toString(chiffreAffaires));
        }
    }//GEN-LAST:event_btnAdminChiffreDAffairesMouseClicked

    private void btnAdminGrapheChiffreDAFffaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminGrapheChiffreDAFffaireMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminGrapheChiffreDAFffaireMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ctrlLecon = new CtrlLecon();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmAdminCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdminCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdminCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdminCA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdminCA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminChiffreDAffaires;
    private javax.swing.JButton btnAdminGrapheChiffreDAFffaire;
    private com.toedter.calendar.JDateChooser dcAdminChiffreDAffaire1;
    private com.toedter.calendar.JDateChooser dcAdminChiffreDAffaire2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAu;
    private javax.swing.JLabel lblChiffreDAffaire;
    private javax.swing.JLabel lblPeriode;
    private javax.swing.JTextField txtChiffreDAFFAIRE;
    // End of variables declaration//GEN-END:variables

    private void remove(CtrlLecon ctrlLecon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
