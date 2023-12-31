/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.administradorbanda.views;

import br.com.administradorbanda.banco.BancoDeDados;
import br.com.administradorbanda.dao.IntegrantesDAO;
import br.com.administradorbanda.models.IntegrantesModel;
import br.com.administradorbanda.utilitarios.JanelaUtils;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Renato Fioroni 
* @author Victor Cachucho 
 */
public class EditarCadastrarIntegranteView extends javax.swing.JFrame {
    Connection conexaoBanco = BancoDeDados.getConnection();
    IntegrantesDAO integrantesDAO = new IntegrantesDAO(conexaoBanco);
    IntegrantesModel model = new IntegrantesModel(integrantesDAO);

    /**
     * Creates new form EditarCadastrarIntegrante
     */
    public EditarCadastrarIntegranteView() {
        initComponents();
        
        tabelaEditarCadastrarIntegrante.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFuncao = new javax.swing.JTextField();
        txtBanda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEditarCadastrarIntegrante = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnMusicaSalvar = new javax.swing.JButton();
        btnVoltarEditarCadastrarIntegranteView = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaEditarCadastrarIntegrante.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaEditarCadastrarIntegrante);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Integrantes - Editar/Cadastrar");

        btnMusicaSalvar.setText("Salvar");
        btnMusicaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicaSalvarActionPerformed(evt);
            }
        });

        btnVoltarEditarCadastrarIntegranteView.setText("<");
        btnVoltarEditarCadastrarIntegranteView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarEditarCadastrarIntegranteViewActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel3.setText("Funcao");

        jLabel5.setText("Banda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(btnMusicaSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVoltarEditarCadastrarIntegranteView)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFuncao)
                                    .addComponent(txtNome)
                                    .addComponent(txtBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltarEditarCadastrarIntegranteView, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnMusicaSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarEditarCadastrarIntegranteViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarEditarCadastrarIntegranteViewActionPerformed
        IntegrantesView integrantesView = new IntegrantesView();
        this.dispose();
        JanelaUtils.centralizar(integrantesView);
        integrantesView.setVisible(true);
    }//GEN-LAST:event_btnVoltarEditarCadastrarIntegranteViewActionPerformed

    private void btnMusicaSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicaSalvarActionPerformed
        String nome = txtNome.getText();
        String funcao = txtFuncao.getText();
        String banda = txtBanda.getText();
        
        if(validarCampos(nome, funcao, banda)) {
            this.model.cadastrarIntegrante(nome, funcao, banda);
            limparCampos();   
        }
    }//GEN-LAST:event_btnMusicaSalvarActionPerformed

    
    public void limparCampos() {
        txtNome.setText("");
        txtFuncao.setText("");
        txtBanda.setText("");
    }
    
    public boolean validarCampos(String nome, String funca, String banda) {
        if(nome.trim().isEmpty() || funca.trim().isEmpty() || banda.trim().isEmpty()) {
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
            java.util.logging.Logger.getLogger(EditarCadastrarIntegranteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarCadastrarIntegranteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarCadastrarIntegranteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarCadastrarIntegranteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditarCadastrarIntegranteView editarCadastrarIntegranteView = new EditarCadastrarIntegranteView();
                JanelaUtils.centralizar(editarCadastrarIntegranteView);
                editarCadastrarIntegranteView.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMusicaSalvar;
    private javax.swing.JButton btnVoltarEditarCadastrarIntegranteView;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEditarCadastrarIntegrante;
    private javax.swing.JTextField txtBanda;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
