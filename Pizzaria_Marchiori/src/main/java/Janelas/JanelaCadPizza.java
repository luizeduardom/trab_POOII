/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

import Controladora.Interface_Grafica;
import Dominio.Ingrediente;
import Dominio.Pizza;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.Position;

/**
 *
 * @author 2021122760224
 */
public class JanelaCadPizza extends javax.swing.JDialog {

    private Interface_Grafica gerIG;

    public JanelaCadPizza(java.awt.Frame parent, boolean modal, Interface_Grafica gerIG) {
        initComponents();
        this.gerIG = gerIG;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labNomePizza1 = new javax.swing.JLabel();
        txtNomePizza = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botConfirmar1 = new javax.swing.JButton();
        botCancelar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        lblValorPizza = new javax.swing.JLabel();
        txtValorPizza = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastrar Pizza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentShown(evt);
            }
        });

        labNomePizza1.setText("Nome da Pizza");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ingredientes");

        botConfirmar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/botao-adicionar.png"))); // NOI18N
        botConfirmar1.setText("Confirmar");
        botConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botConfirmar1ActionPerformed(evt);
            }
        });

        botCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/sair.png"))); // NOI18N
        botCancelar1.setText("Cancelar e voltar");
        botCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelar1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        lblValorPizza.setText("Valor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labNomePizza1)
                                    .addComponent(lblValorPizza, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomePizza)
                                    .addComponent(txtValorPizza)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botCancelar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNomePizza1)
                    .addComponent(txtNomePizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorPizza)
                    .addComponent(txtValorPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botCancelar1)
                    .addComponent(botConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botConfirmar1ActionPerformed
        String nomePizza = txtNomePizza.getText();
        String valorPizza = txtValorPizza.getText();
        float valor_convertido = Float.parseFloat(valorPizza);
        List listaIngredientes = jList1.getSelectedValuesList();
        Pizza pizza = gerIG.getObj();

        if (gerIG.getObj() == null) {
            gerIG.getGerDominio().inserirPizza(listaIngredientes, nomePizza, valor_convertido);
        } else {
            gerIG.getGerDominio().alterarPizza (pizza, nomePizza, valor_convertido, listaIngredientes);
        }
        

        JOptionPane.showMessageDialog(this, "Pizza " + nomePizza + " adicionada com sucesso.", "Inserir Pizza", JOptionPane.INFORMATION_MESSAGE);

        gerIG.janelaCadPizzaFechar(this);
    }//GEN-LAST:event_botConfirmar1ActionPerformed

    private void botCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelar1ActionPerformed
        gerIG.janelaCadPizzaFechar(this);
    }//GEN-LAST:event_botCancelar1ActionPerformed

    private void jPanel2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentShown

    }//GEN-LAST:event_jPanel2ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        gerIG.carregarListBox(jList1, Ingrediente.class);

        if (gerIG.getObj() != null) {
            // Setando o nome da pizza como padrão na textfield
            txtNomePizza.setText(gerIG.getObj().getNomePizza());
            
            String valor_convertido = String.valueOf(gerIG.getObj().getValorPizza());
            txtValorPizza.setText(valor_convertido);
            

            // Pegando o objeto pizza para fazer as consultas
            List novaSelecao = gerIG.getObj().getIngrediente();

            int i = 0;

            // Apaga a seleção corrente
            jList1.clearSelection();

            // Percorre a lista com a NOVA SELEÇÃO
            for (Object obj : novaSelecao) {

                // Pesquisa no JList principal
                i = jList1.getNextMatch(((Ingrediente) obj).getNomeIngrediente(), i, Position.Bias.Forward);

                // Deixa selecionado
                jList1.addSelectionInterval(i, i);
            }

        }
    }//GEN-LAST:event_formComponentShown

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCancelar1;
    private javax.swing.JButton botConfirmar1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labNomePizza1;
    private javax.swing.JLabel lblValorPizza;
    private javax.swing.JTextField txtNomePizza;
    private javax.swing.JTextField txtValorPizza;
    // End of variables declaration//GEN-END:variables
}
