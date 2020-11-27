package forms;

import entidades.ClienteAfiliado;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Model;

public class TabelaAfiliado extends javax.swing.JDialog {

    DefaultTableModel tabela;
    ClienteAfiliado cm = new ClienteAfiliado();

    public TabelaAfiliado() {
        initComponents();
    }

    private void montarTabela() {
        tbCliente.setModel(new DefaultTableModel(
                new Object[][]{}, new String[]{"ID", "NOME", "CPF", "CONTATO", "ALOCAÇÕES"}
        ));
        tabela = (DefaultTableModel) tbCliente.getModel();
        Model m = new Model();
        for (ClienteAfiliado ca : m.listaClientes()) {
            tabela.addRow(new Object[]{ca.getId(), ca.getNome(), ca.getCpf(), ca.getContato(), ca.getAlocar()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        botaoCadastrar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela Afiliado");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Contato"
            }
        ));
        jScrollPane1.setViewportView(tbCliente);

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
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
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        montarTabela();
    }//GEN-LAST:event_formWindowActivated

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        CadastroAfiliado fcc = new CadastroAfiliado();
        fcc.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed

        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir este cliente?") == 0) {

        } else if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir este cliente?") == 1) {

        } else {

        }
        Model m = new Model();

        try {
            m.remove((Long) tbCliente.getValueAt(tbCliente.getSelectedRow(), 0));
            JOptionPane.showMessageDialog(rootPane, "Cliente removido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Não foi possível excluir o cliente: " + e.getMessage());

        }

    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        if (tbCliente.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente para esta ação");
        } else {
            CadastroAfiliado c = new CadastroAfiliado();
            c.ca.setId((Long) tbCliente.getValueAt(tbCliente.getSelectedRow(), 0));
            c.ca.setNome((String) tbCliente.getValueAt(tbCliente.getSelectedRow(), 1));
            c.ca.setCpf((String) tbCliente.getValueAt(tbCliente.getSelectedRow(), 2));
            c.ca.setContato((String) tbCliente.getValueAt(tbCliente.getSelectedRow(), 3));
            c.ca.setAlocar((String) tbCliente.getValueAt(tbCliente.getSelectedRow(), 4));
            c.setVisible(true);

        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaAfiliado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCliente;
    // End of variables declaration//GEN-END:variables
}
