/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.administradorbanda.views;

import br.com.administradorbanda.banco.BancoDeDados;
import br.com.administradorbanda.dao.MusicasDAO;
import br.com.administradorbanda.models.MusicasModel;
import br.com.administradorbanda.utilitarios.JanelaUtils;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Renato Fioroni 
* @author Victor Cachucho 
 */
public class EditarCadastrarMusicaView extends javax.swing.JFrame {
    Connection conexaoBanco = BancoDeDados.getConnection();
    MusicasDAO musicasDao = new MusicasDAO(conexaoBanco);
    MusicasModel model = new MusicasModel(musicasDao);

    /**
     * Creates new form CadastrarMusicaView
     */
    public EditarCadastrarMusicaView() {
        initComponents();
        
        tabelaEditarCadastrarMusica.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtDuracao = new javax.swing.JTextField();
        txtAlbum = new javax.swing.JTextField();
        txtBanda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEditarCadastrarMusica = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnMusicaSalvar = new javax.swing.JButton();
        btnVoltarEditarCadastrarMusicaView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Titulo");

        jLabel3.setText("Duracao (segundos)");

        jLabel4.setText("Album");

        jLabel5.setText("Banda");

        tabelaEditarCadastrarMusica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaEditarCadastrarMusica);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Musicas - Editar/Cadastrar");

        btnMusicaSalvar.setText("Salvar");
        btnMusicaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicaSalvarActionPerformed(evt);
            }
        });

        btnVoltarEditarCadastrarMusicaView.setText("<");
        btnVoltarEditarCadastrarMusicaView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarEditarCadastrarMusicaViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMusicaSalvar)
                .addGap(187, 187, 187))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnVoltarEditarCadastrarMusicaView)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDuracao)
                            .addComponent(txtTitulo)
                            .addComponent(txtAlbum)
                            .addComponent(txtBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltarEditarCadastrarMusicaView, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(txtBanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))
                .addComponent(btnMusicaSalvar)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarEditarCadastrarMusicaViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarEditarCadastrarMusicaViewActionPerformed
        MusicasView musicasView = new MusicasView();
        this.dispose();
        JanelaUtils.centralizar(musicasView);
        musicasView.setVisible(true);
    }//GEN-LAST:event_btnVoltarEditarCadastrarMusicaViewActionPerformed

    private void btnMusicaSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaSalvarActionPerformed
        String titulo = txtTitulo.getText();
        String duracao = txtDuracao.getText();
        String album = txtAlbum.getText();
        String banda = txtBanda.getText();
        
        if(validarCampos(titulo, duracao, album, banda)) {
            this.model.cadastrarMusica(titulo, Integer.parseInt(duracao), album, banda);
            limparCampos();   
        }
    }//GEN-LAST:event_btnMusicaSalvarActionPerformed

    
    public void limparCampos() {
        txtTitulo.setText("");
        txtDuracao.setText("");
        txtAlbum.setText("");
        txtBanda.setText("");
    }
    
    public boolean validarCampos(String titulo, String duracao, String album, String banda) {
        if(titulo.trim().isEmpty() || album.trim().isEmpty() || banda.trim().isEmpty() || duracao.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campos nao preenchidos");
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(EditarCadastrarMusicaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarCadastrarMusicaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarCadastrarMusicaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarCadastrarMusicaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditarCadastrarMusicaView editarCadastrarMusicaView = new EditarCadastrarMusicaView();
                JanelaUtils.centralizar(editarCadastrarMusicaView);
                editarCadastrarMusicaView.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMusicaSalvar;
    private javax.swing.JButton btnVoltarEditarCadastrarMusicaView;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEditarCadastrarMusica;
    private javax.swing.JTextField txtAlbum;
    private javax.swing.JTextField txtBanda;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
