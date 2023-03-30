package Vues;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Entities.Administrateur;

/**
 *
 * @author ninou
 */
public class FrmAdminAcceuil extends javax.swing.JFrame {
    static Administrateur administrateur;
    /**
     * Creates new form FrmEleveAcceuil
     * @param administrateur
     */
    
    public FrmAdminAcceuil(Administrateur administrateur) {
        initComponents();
        FrmAdminAcceuil.administrateur = administrateur;
    }

    private FrmAdminAcceuil() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdminLecon = new javax.swing.JButton();
        btnAdminModiferVehicule = new javax.swing.JButton();
        txtMoniteurNomConnexion = new javax.swing.JScrollPane();
        txtAdminConnecte = new javax.swing.JTextPane();
        lblAdminNomConnexion = new javax.swing.JLabel();
        btnAdminAjouterVehicule = new javax.swing.JButton();
        lblTitreAdmin = new javax.swing.JLabel();
        lblAdminPlannings = new javax.swing.JLabel();
        btnAdminPlanningEleve = new javax.swing.JButton();
        btnAdminMoniteurPlanning = new javax.swing.JButton();
        lblAdminTitreVehicules = new javax.swing.JLabel();
        lblAdminTitreCategories = new javax.swing.JLabel();
        btnAdminAjouterCategorie = new javax.swing.JButton();
        btnAdminModifCategorie = new javax.swing.JButton();
        lblAdminTitreAutre = new javax.swing.JLabel();
        btnAdminAjouterMoniteur = new javax.swing.JButton();
        btnAdminVoirCA = new javax.swing.JButton();
        btnAdminStatistiqueMoniteur = new javax.swing.JButton();
        btnAdminStatistiqueLecons = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnAdminLecon.setText("Visualiser les leçons");
        btnAdminLecon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminLeconMouseClicked(evt);
            }
        });

        btnAdminModiferVehicule.setText("Modifier un véhicule");
        btnAdminModiferVehicule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminModiferVehiculeMouseClicked(evt);
            }
        });

        txtAdminConnecte.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMoniteurNomConnexion.setViewportView(txtAdminConnecte);

        lblAdminNomConnexion.setText("Vous êtes connecté en tant que  :");

        btnAdminAjouterVehicule.setText("Ajouter un véhicule");
        btnAdminAjouterVehicule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminAjouterVehiculeMouseClicked(evt);
            }
        });

        lblTitreAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitreAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitreAdmin.setText("ESPACE ADMIN");

        lblAdminPlannings.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAdminPlannings.setText("Les Leçons :");

        btnAdminPlanningEleve.setText("Visualiser le planning d'un éleve");
        btnAdminPlanningEleve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminPlanningEleveMouseClicked(evt);
            }
        });

        btnAdminMoniteurPlanning.setText("Visualiser le planning d'un moniteur");
        btnAdminMoniteurPlanning.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMoniteurPlanningMouseClicked(evt);
            }
        });

        lblAdminTitreVehicules.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAdminTitreVehicules.setText("Les Véhicules :");

        lblAdminTitreCategories.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAdminTitreCategories.setText("Les Catégories : ");

        btnAdminAjouterCategorie.setText("Ajouter une catégorie");
        btnAdminAjouterCategorie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminAjouterCategorieMouseClicked(evt);
            }
        });

        btnAdminModifCategorie.setText("Modifier une catégorie");
        btnAdminModifCategorie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminModifCategorieMouseClicked(evt);
            }
        });

        lblAdminTitreAutre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAdminTitreAutre.setText("Autres : ");

        btnAdminAjouterMoniteur.setText("Ajouter un Moniteur");
        btnAdminAjouterMoniteur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminAjouterMoniteurMouseClicked(evt);
            }
        });

        btnAdminVoirCA.setText("Voir le chiffre d'affaires");
        btnAdminVoirCA.setToolTipText("");
        btnAdminVoirCA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminVoirCAMouseClicked(evt);
            }
        });

        btnAdminStatistiqueMoniteur.setText("Statistiques Véhicule/Moniteur");
        btnAdminStatistiqueMoniteur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminStatistiqueMoniteurMouseClicked(evt);
            }
        });

        btnAdminStatistiqueLecons.setText("Statistiques des leçons");
        btnAdminStatistiqueLecons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminStatistiqueLeconsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(214, Short.MAX_VALUE)
                        .addComponent(lblAdminNomConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMoniteurNomConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdminLecon, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(btnAdminAjouterCategorie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdminPlanningEleve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdminMoniteurPlanning, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(btnAdminModifCategorie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdminStatistiqueLecons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdminAjouterVehicule, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(btnAdminModiferVehicule, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(btnAdminVoirCA, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(btnAdminAjouterMoniteur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdminStatistiqueMoniteur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(lblAdminPlannings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAdminTitreVehicules)
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(lblAdminTitreCategories)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAdminTitreAutre)
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitreAdmin)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblAdminNomConnexion)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMoniteurNomConnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdminPlannings)
                    .addComponent(lblAdminTitreVehicules))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminAjouterVehicule)
                    .addComponent(btnAdminLecon))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnAdminModiferVehicule))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdminPlanningEleve)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdminMoniteurPlanning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdminStatistiqueLecons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdminTitreCategories)
                    .addComponent(lblAdminTitreAutre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminAjouterCategorie)
                    .addComponent(btnAdminAjouterMoniteur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdminModifCategorie)
                    .addComponent(btnAdminStatistiqueMoniteur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdminVoirCA)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminLeconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminLeconMouseClicked
        // TODO add your handling code here:

        FrmAdminLecons frm= new FrmAdminLecons();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAdminLeconMouseClicked

    private void btnAdminModiferVehiculeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminModiferVehiculeMouseClicked
        FrmAdminModifierVehicule frm = new FrmAdminModifierVehicule();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAdminModiferVehiculeMouseClicked

    private void btnAdminAjouterVehiculeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminAjouterVehiculeMouseClicked
        FrmAdminAjoutVehicule frm = new FrmAdminAjoutVehicule();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAdminAjouterVehiculeMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtAdminConnecte.setText(administrateur.getNom() + " " + administrateur.getPrenom());
        txtAdminConnecte.setEditable(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnAdminPlanningEleveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminPlanningEleveMouseClicked
        // TODO add your handling code here:
        FrmAdminElevePlanning frm = new FrmAdminElevePlanning();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAdminPlanningEleveMouseClicked

    private void btnAdminMoniteurPlanningMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMoniteurPlanningMouseClicked
        // TODO add your handling code here:
        FrmAdminMoniteurPlanning frm = new FrmAdminMoniteurPlanning();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAdminMoniteurPlanningMouseClicked

    private void btnAdminAjouterCategorieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminAjouterCategorieMouseClicked
        // TODO add your handling code here:
        FrmAdminAjoutCategorie frm = new FrmAdminAjoutCategorie();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAdminAjouterCategorieMouseClicked

    private void btnAdminModifCategorieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminModifCategorieMouseClicked
        // TODO add your handling code here:
        FrmAdminModifierCategorie frm = new FrmAdminModifierCategorie();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAdminModifCategorieMouseClicked

    private void btnAdminAjouterMoniteurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminAjouterMoniteurMouseClicked
        // TODO add your handling code here:
        FrmAdminAjoutMoniteur frm = new FrmAdminAjoutMoniteur();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAdminAjouterMoniteurMouseClicked

    private void btnAdminVoirCAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminVoirCAMouseClicked
        // TODO add your handling code here:
        FrmAdminCA frm = new FrmAdminCA();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAdminVoirCAMouseClicked

    private void btnAdminStatistiqueMoniteurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminStatistiqueMoniteurMouseClicked
        // TODO add your handling code here:
        FrmAdminStatistiqueMoniteurEtVehicule frm = new FrmAdminStatistiqueMoniteurEtVehicule();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAdminStatistiqueMoniteurMouseClicked

    private void btnAdminStatistiqueLeconsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminStatistiqueLeconsMouseClicked
        // TODO add your handling code here:
        FrmAdminStatsLecons frm = new FrmAdminStatsLecons();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAdminStatistiqueLeconsMouseClicked

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
            java.util.logging.Logger.getLogger(FrmAdminAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdminAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdminAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdminAcceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdminAcceuil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminAjouterCategorie;
    private javax.swing.JButton btnAdminAjouterMoniteur;
    private javax.swing.JButton btnAdminAjouterVehicule;
    private javax.swing.JButton btnAdminLecon;
    private javax.swing.JButton btnAdminModifCategorie;
    private javax.swing.JButton btnAdminModiferVehicule;
    private javax.swing.JButton btnAdminMoniteurPlanning;
    private javax.swing.JButton btnAdminPlanningEleve;
    private javax.swing.JButton btnAdminStatistiqueLecons;
    private javax.swing.JButton btnAdminStatistiqueMoniteur;
    private javax.swing.JButton btnAdminVoirCA;
    private javax.swing.JLabel lblAdminNomConnexion;
    private javax.swing.JLabel lblAdminPlannings;
    private javax.swing.JLabel lblAdminTitreAutre;
    private javax.swing.JLabel lblAdminTitreCategories;
    private javax.swing.JLabel lblAdminTitreVehicules;
    private javax.swing.JLabel lblTitreAdmin;
    private javax.swing.JTextPane txtAdminConnecte;
    private javax.swing.JScrollPane txtMoniteurNomConnexion;
    // End of variables declaration//GEN-END:variables
}
