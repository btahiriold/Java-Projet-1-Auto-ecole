/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlCategorie;
import Controlers.CtrlLecon;
import Controlers.CtrlMoniteur;
import Controlers.CtrlVehicule;
import Entities.Categorie;
import Entities.Eleve;
import Tools.ConnexionBDD;
import Tools.ModelJTable;

/**
 *
 * @author ninou
 */
public class FrmEleveStatLecon extends javax.swing.JFrame {

    CtrlLecon ctrlLecon;
    ModelJTable mdl;
    ConnexionBDD cnx;
    CtrlVehicule ctrlVehicule;
    CtrlCategorie ctrlCategorie;
    CtrlMoniteur ctrlMoniteur;
    static Eleve eleve;
    
    /**
     * Creates new form FrmEleveLecon
     */
    public FrmEleveStatLecon() {
        initComponents();
    }
    public FrmEleveStatLecon(Eleve unEleve) {
        initComponents();
        eleve=unEleve;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEleveStats = new javax.swing.JTable();
        lblTitre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMontantTotal = new javax.swing.JLabel();
        lblMontantARegler = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblLeconTerminer = new javax.swing.JLabel();
        lblLeconAFinir = new javax.swing.JLabel();
        txtMontantTotal = new javax.swing.JTextField();
        txtResteARegler = new javax.swing.JTextField();
        txtLeconTermi = new javax.swing.JTextField();
        txtLeconAFinir = new javax.swing.JTextField();
        cboCategoriePermis = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblEleveStats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblEleveStats);

        lblTitre.setText("Voir mes statistiques");

        jLabel2.setText("Le type de permis  :");

        lblMontantTotal.setText("Montant total :");

        lblMontantARegler.setText("Reste à régler :");

        jLabel5.setText("Vos leçon : ");

        lblLeconTerminer.setText("Leçon terminées :");

        lblLeconAFinir.setText("Leçon à finir :");

        txtMontantTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontantTotalActionPerformed(evt);
            }
        });

        cboCategoriePermis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriePermisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lblTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLeconTerminer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLeconAFinir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboCategoriePermis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMontantTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMontantARegler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMontantTotal)
                                    .addComponent(txtResteARegler)
                                    .addComponent(txtLeconTermi)
                                    .addComponent(txtLeconAFinir))))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitre)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboCategoriePermis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontantTotal)
                    .addComponent(txtMontantTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontantARegler)
                    .addComponent(txtResteARegler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLeconTerminer)
                    .addComponent(txtLeconTermi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLeconAFinir)
                    .addComponent(txtLeconAFinir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ctrlLecon = new CtrlLecon();
        mdl = new ModelJTable();
        ctrlCategorie=new CtrlCategorie();
         for (Categorie cat : ctrlCategorie.getAllCategorie()){
            cboCategoriePermis.addItem(cat.getLibelle());
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtMontantTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontantTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontantTotalActionPerformed

    private void cboCategoriePermisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriePermisActionPerformed
        // TODO add your handling code here:
        txtMontantTotal.setText(String.valueOf(ctrlLecon.MontantTotalPermis(eleve.getNumEleve(), ctrlCategorie.getIdCategorie(cboCategoriePermis.getSelectedItem().toString()))));
        txtResteARegler.setText(String.valueOf(ctrlLecon.MontantTotalPermisARegler(eleve.getNumEleve(), ctrlCategorie.getIdCategorie(cboCategoriePermis.getSelectedItem().toString()))));
        
        txtLeconTermi.setText(String.valueOf(ctrlLecon.nombreDeLeconParEleveEtPermisFini(eleve.getNumEleve(), ctrlCategorie.getIdCategorie(cboCategoriePermis.getSelectedItem().toString()))));
        txtLeconAFinir.setText(String.valueOf(ctrlLecon.nombreDeLeconParEleveEtPermisAfaire(eleve.getNumEleve(), ctrlCategorie.getIdCategorie(cboCategoriePermis.getSelectedItem().toString()))));
    }//GEN-LAST:event_cboCategoriePermisActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEleveStatLecon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEleveStatLecon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEleveStatLecon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEleveStatLecon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEleveStatLecon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCategoriePermis;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLeconAFinir;
    private javax.swing.JLabel lblLeconTerminer;
    private javax.swing.JLabel lblMontantARegler;
    private javax.swing.JLabel lblMontantTotal;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JTable tblEleveStats;
    private javax.swing.JTextField txtLeconAFinir;
    private javax.swing.JTextField txtLeconTermi;
    private javax.swing.JTextField txtMontantTotal;
    private javax.swing.JTextField txtResteARegler;
    // End of variables declaration//GEN-END:variables
}