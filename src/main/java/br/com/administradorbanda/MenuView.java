/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.administradorbanda;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Window;

/**
 *
 * @author elder
 */
public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuView() {
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

        jLabel1 = new javax.swing.JLabel();
        btnMusicas = new javax.swing.JButton();
        btnIntegrantes = new javax.swing.JButton();
        btnShows = new javax.swing.JButton();
        btnMenuSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Menu");

        btnMusicas.setText("Musicas");
        btnMusicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicasActionPerformed(evt);
            }
        });

        btnIntegrantes.setText("Integrantes");
        btnIntegrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntegrantesActionPerformed(evt);
            }
        });

        btnShows.setText("Shows");
        btnShows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowsActionPerformed(evt);
            }
        });

        btnMenuSair.setText("Sair");
        btnMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnShows, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMenuSair)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(btnMusicas)
                .addGap(18, 18, 18)
                .addComponent(btnIntegrantes)
                .addGap(18, 18, 18)
                .addComponent(btnShows)
                .addGap(82, 82, 82)
                .addComponent(btnMenuSair)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntegrantesActionPerformed
        IntegrantesView integrantesView = new IntegrantesView();
        this.dispose();
        JanelaUtils.centralizar(integrantesView);
        integrantesView.setVisible(true);
    }//GEN-LAST:event_btnIntegrantesActionPerformed

    private void btnMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicasActionPerformed
        MusicasView musicaView = new MusicasView();
        this.dispose();
        JanelaUtils.centralizar(musicaView);
        musicaView.setVisible(true);
    }//GEN-LAST:event_btnMusicasActionPerformed

    private void btnShowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowsActionPerformed
        ShowsView showsView = new ShowsView();
        this.dispose();
        JanelaUtils.centralizar(showsView);
        showsView.setVisible(true);
    }//GEN-LAST:event_btnShowsActionPerformed

    private void btnMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuSairActionPerformed
        Main main = new Main();
        this.dispose();
        JanelaUtils.centralizar(main);
        main.setVisible(true);
    }//GEN-LAST:event_btnMenuSairActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuView menuView = new MenuView();
                JanelaUtils.centralizar(menuView);
                menuView.setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIntegrantes;
    private javax.swing.JButton btnMenuSair;
    private javax.swing.JButton btnMusicas;
    private javax.swing.JButton btnShows;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
