package forms;

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastrar = new javax.swing.JMenu();
        Clientes = new javax.swing.JMenu();
        CadastroAfiliado = new javax.swing.JMenuItem();
        CadastroMensalista = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Tabela = new javax.swing.JMenu();
        TabelaCliente = new javax.swing.JMenu();
        TabelaAfiliado = new javax.swing.JMenuItem();
        TabelaMensalista = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Estacionamento ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/467287e7-5bc2-449d-86d2-ff979820730e.jpg"))); // NOI18N

        Cadastrar.setText("Cadastrar");

        Clientes.setText("Clientes");

        CadastroAfiliado.setText("Afiliado");
        CadastroAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroAfiliadoActionPerformed(evt);
            }
        });
        Clientes.add(CadastroAfiliado);

        CadastroMensalista.setText("Mensalista");
        CadastroMensalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroMensalistaActionPerformed(evt);
            }
        });
        Clientes.add(CadastroMensalista);

        Cadastrar.add(Clientes);

        jMenuBar1.add(Cadastrar);
        jMenuBar1.add(jMenu3);

        Tabela.setText("Tabelas");

        TabelaCliente.setText("Clientes");

        TabelaAfiliado.setText("Afiliado");
        TabelaAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelaAfiliadoActionPerformed(evt);
            }
        });
        TabelaCliente.add(TabelaAfiliado);

        TabelaMensalista.setText("Mensalista");
        TabelaMensalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelaMensalistaActionPerformed(evt);
            }
        });
        TabelaCliente.add(TabelaMensalista);

        Tabela.add(TabelaCliente);

        jMenuBar1.add(Tabela);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroAfiliadoActionPerformed
        CadastroAfiliado fcc = new CadastroAfiliado();
        fcc.setVisible(true);
    }//GEN-LAST:event_CadastroAfiliadoActionPerformed

    private void CadastroMensalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroMensalistaActionPerformed
        CadastroMensalista fcc = new CadastroMensalista();
        fcc.setVisible(true);
    }//GEN-LAST:event_CadastroMensalistaActionPerformed

    private void TabelaMensalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelaMensalistaActionPerformed
        TabelaMensalista fcc = new TabelaMensalista();
        fcc.setVisible(true);
    }//GEN-LAST:event_TabelaMensalistaActionPerformed

    private void TabelaAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelaAfiliadoActionPerformed
        TabelaAfiliado fcc = new TabelaAfiliado();
        fcc.setVisible(true);
    }//GEN-LAST:event_TabelaAfiliadoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastrar;
    private javax.swing.JMenuItem CadastroAfiliado;
    private javax.swing.JMenuItem CadastroMensalista;
    private javax.swing.JMenu Clientes;
    private javax.swing.JMenu Tabela;
    private javax.swing.JMenuItem TabelaAfiliado;
    private javax.swing.JMenu TabelaCliente;
    private javax.swing.JMenuItem TabelaMensalista;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
