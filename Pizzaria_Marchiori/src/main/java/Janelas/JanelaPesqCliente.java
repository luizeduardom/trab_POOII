/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

import Controladora.Interface_Grafica;
import Dominio.Cliente;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;

/**
 *
 * @author luiz.marchiori
 */
public class JanelaPesqCliente extends javax.swing.JDialog {

    private Interface_Grafica gerIG;
    private Cliente cliSelecionado;

    public JanelaPesqCliente(java.awt.Frame parent, boolean modal, Interface_Grafica gerIG) {
        super(parent, modal);
        initComponents();
        this.gerIG = gerIG;
        cliSelecionado = null;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        botPesquisar = new javax.swing.JButton();
        botSair = new javax.swing.JButton();
        botSelecionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botExcluir = new javax.swing.JButton();
        botAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblNome.setText("Nome");

        botPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/lupacliente.png"))); // NOI18N
        botPesquisar.setText("Pesquisar");
        botPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPesquisarActionPerformed(evt);
            }
        });

        botSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/saircliente.png"))); // NOI18N
        botSair.setText("Sair");
        botSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSairActionPerformed(evt);
            }
        });

        botSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/selecione.png"))); // NOI18N
        botSelecionar.setText("Selecionar");
        botSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSelecionarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Bairro", "Rua", "Número", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        botExcluir.setBackground(new java.awt.Color(255, 51, 51));
        botExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/excluir.png"))); // NOI18N
        botExcluir.setText("Excluir");
        botExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botExcluirActionPerformed(evt);
            }
        });

        botAlterar.setBackground(new java.awt.Color(102, 255, 255));
        botAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/conjunto-de-setas-de-sincronizacao.png"))); // NOI18N
        botAlterar.setText("Alterar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botPesquisar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botSair, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(279, 279, 279)
                        .addComponent(botExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(botSelecionar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNome)
                        .addComponent(lblNome))
                    .addComponent(botPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botSelecionar)
                    .addComponent(botExcluir)
                    .addComponent(botAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Cliente getCliente() {
        return cliSelecionado;
    }

    private void botExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botExcluirActionPerformed

    private void botSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSairActionPerformed
        gerIG.janelaCadPizzaFechar(this);
    }//GEN-LAST:event_botSairActionPerformed

    private void botPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPesquisarActionPerformed
        try {
            List<Cliente> lista = gerIG.getGerDominio().pesquisarCliente(txtNome.getText());

            // APAGA as linhas da tabela
            ((DefaultTableModel) jTable1.getModel()).setNumRows(0);

            for (Cliente cli : lista) {
                // ADICIONAR LINHA NA TABELA        
                ((DefaultTableModel) jTable1.getModel()).addRow(cli.toArray());
            }

        } catch (HibernateException | ParseException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERRO ao PESQUISAR Cliente", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botPesquisarActionPerformed

    private void botSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSelecionarActionPerformed
        int linha = jTable1.getSelectedRow();
        if (linha >= 0) {
            cliSelecionado = (Cliente) jTable1.getValueAt(linha, 0);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Pesquisar cliente", JOptionPane.ERROR_MESSAGE);
        }

        this.setVisible(false);
    }//GEN-LAST:event_botSelecionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAlterar;
    private javax.swing.JButton botExcluir;
    private javax.swing.JButton botPesquisar;
    private javax.swing.JButton botSair;
    private javax.swing.JButton botSelecionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
