/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmvc.view;

import crudmvc.controller.UsuarioController;
import crudmvc.model.Conexao;
import crudmvc.model.ModeloTabela;
import crudmvc.model.Usuario;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author u843573
 */
public class ViewMenu extends javax.swing.JFrame {

    Conexao conecta = new Conexao();

    /**
     * Creates new form ViewMenu
     */
    public ViewMenu() {
        initComponents();
        conecta.Conexao();
        preencherTabela("select * from TB_USUARIO");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        novo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldSenha = new javax.swing.JTextField();
        colocarEdicao = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        editar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));

        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        jLabel1.setText("Cadastro de Usuários");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        novo.setText("Novo");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuário:");

        jLabel3.setText("Senha:");

        colocarEdicao.setText("Colocar em Edição");
        colocarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colocarEdicaoActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableUsuario);

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(colocarEdicao)
                                    .addGap(18, 18, 18)
                                    .addComponent(editar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(excluir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonSalvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(novo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldUsuario)
                                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(241, 241, 241)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(novo)
                        .addComponent(jButtonSalvar)
                        .addComponent(excluir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(colocarEdicao)
                        .addComponent(editar)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        Usuario user = new Usuario();
        user.setUser(jTextFieldUsuario.getText());
        user.setPassword(jTextFieldSenha.getText());
        UsuarioController controller = new UsuarioController();
        if (controller.salvarUsuario(user)) {
            jTextFieldUsuario.setText("");
            jTextFieldSenha.setText("");
            excluir.setEnabled(true);
            novo.setEnabled(true);
            preencherTabela("select * from TB_USUARIO");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
//       String nome_usuario = "" + jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 1);
//       jTextFieldUsuario.setText(nome_usuario);
//       excluir.setEnabled(false);
//       novo.setEnabled(false);
    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        String usuario = "" + jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 0);
        String id = "" + jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 1);
        UsuarioController controller = new UsuarioController();
        if (controller.excluir(id, usuario)) {
            preencherTabela("select * from TB_USUARIO");
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void colocarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colocarEdicaoActionPerformed
        String nome_usuario = "" + jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 1);
        jTextFieldUsuario.setText(nome_usuario);
        excluir.setEnabled(false);
        novo.setEnabled(false);
        jButtonSalvar.setEnabled(false);

    }//GEN-LAST:event_colocarEdicaoActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        String id = "" + jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 0);

        Usuario user = new Usuario();
        user.setUser(jTextFieldUsuario.getText());
        user.setPassword(jTextFieldSenha.getText());
        UsuarioController controller = new UsuarioController();
        if (controller.atualizar(user, id)) {
            excluir.setEnabled(true);
            novo.setEnabled(true);
            jButtonSalvar.setEnabled(true);
            jTextFieldUsuario.setText("");
            jTextFieldSenha.setText("");
            preencherTabela("select * from TB_USUARIO");
        }
    }//GEN-LAST:event_editarActionPerformed

    public void preencherTabela(String SQL) {
        ArrayList dados = new ArrayList();

        String[] Colunas = new String[]{"ID", "USERNAME","PASSWORD"};
        conecta.executaSQL(SQL);

        try {

            conecta.rs.first();
            do {
                dados.add(new Object[]{conecta.rs.getString("ID"), conecta.rs.getString("USERNAME"), conecta.rs.getString("PASSWORD")});
            } while (conecta.rs.next());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existe dados cadastrados no banco \n");
        }

        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableUsuario.setModel(modelo);
        jTableUsuario.setDefaultRenderer(Object.class, new CellRenderer());//centralizar o conteudo das celulas da tabela
        jTableUsuario.setRowHeight(20);// cetar a altura de cada celular
        jTableUsuario.setFont(new Font("Serif", Font.PLAIN, 20));//setar qual a fonte usada e o tamanho
        jTableUsuario.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableUsuario.getColumnModel().getColumn(1).setPreferredWidth(260);
        jTableUsuario.getColumnModel().getColumn(2).setPreferredWidth(260);
        jTableUsuario.getColumnModel().getColumn(0).setResizable(false);
        jTableUsuario.getTableHeader().setResizingAllowed(false);
        jTableUsuario.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTableUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colocarEdicao;
    private javax.swing.JButton editar;
    private javax.swing.JButton excluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JButton novo;
    // End of variables declaration//GEN-END:variables
}
