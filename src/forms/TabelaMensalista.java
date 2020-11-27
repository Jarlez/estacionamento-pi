package forms;

import entidades.ClienteMensalista;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.ModelMensalista;

public class TabelaMensalista extends javax.swing.JDialog {

    DefaultTableModel tabela;
    ClienteMensalista cm = new ClienteMensalista();

    public TabelaMensalista() {
        initComponents();
    }

    private void montarmTabela() {
        tbClientem.setModel(new DefaultTableModel(
                new Object[][]{}, new String[]{"ID", "USUARIO", "CPF", "TELEFONE", "DATA", "PAGAMENTO", "VALOR"}
        ));
        tabela = (DefaultTableModel) tbClientem.getModel();
        ModelMensalista mm = new ModelMensalista();
        for (ClienteMensalista cm : mm.listamClientes()) {
            tabela.addRow(new Object[]{cm.getIds(), cm.getUsuario(), cm.getCpfs(), cm.getTelefone(), cm.getData(), cm.getPagamento(), cm.getValor()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCadastrarm = new javax.swing.JButton();
        botaoExcluirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientem = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela Clientes Mensalistas");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        botaoCadastrarm.setText("Cadastrar");
        botaoCadastrarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarmActionPerformed(evt);
            }
        });

        botaoExcluirm.setText("Excluir");
        botaoExcluirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirmActionPerformed(evt);
            }
        });

        tbClientem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Contato", "Data", "Pagamento", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tbClientem);

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoCadastrarm, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluirm, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarm)
                    .addComponent(botaoExcluirm)
                    .addComponent(btAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarmActionPerformed
        CadastroMensalista fccs = new CadastroMensalista();
        fccs.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarmActionPerformed

    private void botaoExcluirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirmActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir este cliente?") == 0) {

        } else if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir este cliente?") == 1) {

        } else {

        }
        ModelMensalista mm = new ModelMensalista();

        try {
            mm.remove((Long) tbClientem.getValueAt(tbClientem.getSelectedRow(), 0));
            JOptionPane.showMessageDialog(rootPane, "Cliente removido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Não foi possível excluir o cliente: " + e.getMessage());

        }
    }//GEN-LAST:event_botaoExcluirmActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        montarmTabela();
    }//GEN-LAST:event_formWindowActivated

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if (tbClientem.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente para esta ação");
        } else {
            CadastroMensalista cme = new CadastroMensalista();

            cme.cm.setIds((Long) tbClientem.getValueAt(tbClientem.getSelectedRow(), 0));
            cme.cm.setUsuario((String) tbClientem.getValueAt(tbClientem.getSelectedRow(), 1));
            cme.cm.setCpfs((String) tbClientem.getValueAt(tbClientem.getSelectedRow(), 2));
            cme.cm.setTelefone((String) tbClientem.getValueAt(tbClientem.getSelectedRow(), 3));
            cme.cm.setData((String) tbClientem.getValueAt(tbClientem.getSelectedRow(), 4));
            cme.cm.setPagamento((String) tbClientem.getValueAt(tbClientem.getSelectedRow(), 5));
            cme.cm.setValor((String) tbClientem.getValueAt(tbClientem.getSelectedRow(), 6));
            cme.setVisible(true);

        }

    }//GEN-LAST:event_btAlterarActionPerformed
    static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TabelaMensalista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaMensalista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaMensalista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaMensalista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaMensalista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarm;
    private javax.swing.JButton botaoExcluirm;
    private javax.swing.JButton btAlterar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbClientem;
    // End of variables declaration//GEN-END:variables
}
