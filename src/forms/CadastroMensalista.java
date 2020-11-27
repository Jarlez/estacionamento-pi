package forms;

import entidades.ClienteMensalista;
import javax.swing.JOptionPane;
import models.ModelMensalista;

public class CadastroMensalista extends javax.swing.JFrame {

    ClienteMensalista cm = new ClienteMensalista();

    public CadastroMensalista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCPFm = new javax.swing.JTextField();
        cadastrarm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDatam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContatom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPagamentom = new javax.swing.JTextField();
        txtValorm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        txtNomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomemActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        txtCPFm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFmActionPerformed(evt);
            }
        });

        cadastrarm.setText("Cadastrar");
        cadastrarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarmActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setText("CADASTRAR MENSALISTA");

        jLabel4.setText("Contato");

        txtDatam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatamActionPerformed(evt);
            }
        });

        jLabel5.setText("Data");

        txtContatom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContatomActionPerformed(evt);
            }
        });

        jLabel6.setText("Pagamento");

        txtPagamentom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagamentomActionPerformed(evt);
            }
        });

        txtValorm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValormActionPerformed(evt);
            }
        });

        jLabel7.setText("Valor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCPFm, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtNomem, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtContatom, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtDatam, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtPagamentom, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtValorm))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastrarm)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPFm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtContatom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPagamentom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addComponent(cadastrarm)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomemActionPerformed

    }//GEN-LAST:event_txtNomemActionPerformed

    private void txtCPFmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFmActionPerformed

    }//GEN-LAST:event_txtCPFmActionPerformed

    private void cadastrarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarmActionPerformed
        ModelMensalista mm = new ModelMensalista();

        cm.setUsuario(txtNomem.getText());
        cm.setCpfs(txtCPFm.getText());
        cm.setTelefone(txtContatom.getText());
        cm.setData(txtDatam.getText());
        cm.setPagamento(txtPagamentom.getText());
        cm.setValor(txtValorm.getText());
        Long ids = cm.getIds();
        if (mm.cadastrarmActionPerformed(cm) == true) {

            if (ids == null) {
                JOptionPane.showMessageDialog(rootPane, "Cliente Cadastrado com Sucesso");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Cliente Alterado com Sucesso");
            }
            cm.setIds(null);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro no Cadastro do Cliente");
        }

    }//GEN-LAST:event_cadastrarmActionPerformed

    private void txtDatamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatamActionPerformed

    }//GEN-LAST:event_txtDatamActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (cm.getIds() == null) {
            txtNomem.setText(cm.getUsuario());
            txtCPFm.setText(cm.getCpfs());
            txtContatom.setText(cm.getTelefone());
            txtDatam.setText(cm.getData());
            txtPagamentom.setText(cm.getPagamento());
            txtValorm.setText(cm.getValor());
        }
    }//GEN-LAST:event_formWindowActivated

    private void txtContatomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContatomActionPerformed

    }//GEN-LAST:event_txtContatomActionPerformed

    private void txtPagamentomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagamentomActionPerformed

    }//GEN-LAST:event_txtPagamentomActionPerformed

    private void txtValormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValormActionPerformed

    }//GEN-LAST:event_txtValormActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMensalista().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCPFm;
    private javax.swing.JTextField txtContatom;
    private javax.swing.JTextField txtDatam;
    private javax.swing.JTextField txtNomem;
    private javax.swing.JTextField txtPagamentom;
    private javax.swing.JTextField txtValorm;
    // End of variables declaration//GEN-END:variables

}
