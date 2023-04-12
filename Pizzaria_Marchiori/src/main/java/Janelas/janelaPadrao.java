/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

import Controladora.Interface_Grafica;

/**
 *
 * @author luiz.marchiori
 */
public class janelaPadrao extends javax.swing.JFrame {

    private Interface_Grafica gerIG;

    public janelaPadrao(Interface_Grafica gerIG) {
        this.gerIG = gerIG;
        initComponents();
        esconderBotoes();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBorda = new javax.swing.ButtonGroup();
        grupoTamanho = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtNumero = new javax.swing.JFormattedTextField();
        txtRua = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        botCriar = new javax.swing.JButton();
        botPesquisar = new javax.swing.JButton();
        botAdicionarCliente = new javax.swing.JButton();
        botLimpar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        radioPequena = new javax.swing.JRadioButton();
        radioMedia = new javax.swing.JRadioButton();
        radioGrande = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        chkEntregar = new javax.swing.JCheckBox();
        radioCatupiry = new javax.swing.JRadioButton();
        radioCheddar = new javax.swing.JRadioButton();
        chkMaionese = new javax.swing.JCheckBox();
        chkBarbecue = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPizza = new javax.swing.JList<>();
        botAdicionarPizza = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        chkCebola = new javax.swing.JCheckBox();
        chkMussarela = new javax.swing.JCheckBox();
        chkPalmito = new javax.swing.JCheckBox();
        chkBacon = new javax.swing.JCheckBox();
        chkAzeitona = new javax.swing.JCheckBox();
        chkOregano = new javax.swing.JCheckBox();
        chkPresunto = new javax.swing.JCheckBox();
        chkLombo = new javax.swing.JCheckBox();
        chkAlho = new javax.swing.JCheckBox();
        chkAtum = new javax.swing.JCheckBox();
        chkOvo = new javax.swing.JCheckBox();
        botAdicionar = new javax.swing.JButton();
        botEncerrar = new javax.swing.JButton();
        botSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPedido = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criar Pedido");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 49, -1, 44));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel3.setText("Nome");

        lblBairro.setText("Bairro");

        lblRua.setText("Rua");

        lblNumero.setText("Número");

        lblTelefone.setText("Telefone");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        botCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/botao-adicionar.png"))); // NOI18N
        botCriar.setText("Adicionar");
        botCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCriarActionPerformed(evt);
            }
        });

        botPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/lupa.png"))); // NOI18N
        botPesquisar.setText("Pesquisar");
        botPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPesquisarActionPerformed(evt);
            }
        });

        botAdicionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/verifica.png"))); // NOI18N

        botLimpar.setText("Cancelar");
        botLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(lblNumero)
                            .addComponent(lblRua)
                            .addComponent(jLabel3)
                            .addComponent(lblBairro))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone)
                            .addComponent(txtNumero)
                            .addComponent(txtRua)
                            .addComponent(txtBairro)
                            .addComponent(txtNome)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(botLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botAdicionarCliente)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botCriar)
                    .addComponent(botPesquisar))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(botLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, -1, 400));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tamanho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        radioPequena.setBackground(new java.awt.Color(255, 255, 255));
        grupoTamanho.add(radioPequena);
        radioPequena.setText("Pequena");

        radioMedia.setBackground(new java.awt.Color(255, 255, 255));
        grupoTamanho.add(radioMedia);
        radioMedia.setText("Média");

        radioGrande.setBackground(new java.awt.Color(255, 255, 255));
        grupoTamanho.add(radioGrande);
        radioGrande.setText("Grande");

        jTextField5.setEditable(false);
        jTextField5.setText("30,00");

        jTextField6.setEditable(false);
        jTextField6.setText("42,00");

        jTextField7.setEditable(false);
        jTextField7.setText("53,00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioPequena)
                    .addComponent(radioMedia)
                    .addComponent(radioGrande))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jTextField6)
                    .addComponent(jTextField5)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPequena)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMedia)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioGrande)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 49, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        chkEntregar.setBackground(new java.awt.Color(255, 255, 255));
        chkEntregar.setText("Entregar (2,00)");

        radioCatupiry.setBackground(new java.awt.Color(255, 255, 255));
        grupoBorda.add(radioCatupiry);
        radioCatupiry.setText("Borda Catupiry (3,00)");

        radioCheddar.setBackground(new java.awt.Color(255, 255, 255));
        grupoBorda.add(radioCheddar);
        radioCheddar.setText("Borda Cheddar (4,50)");
        radioCheddar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCheddarActionPerformed(evt);
            }
        });

        chkMaionese.setBackground(new java.awt.Color(255, 255, 255));
        chkMaionese.setText("Maionese Caseira (2,00)");

        chkBarbecue.setBackground(new java.awt.Color(255, 255, 255));
        chkBarbecue.setText("Molho Barbecue (3,00)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkEntregar)
                    .addComponent(radioCatupiry)
                    .addComponent(radioCheddar)
                    .addComponent(chkMaionese)
                    .addComponent(chkBarbecue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkEntregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkMaionese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkBarbecue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioCatupiry)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioCheddar)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 189, 262, 260));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pizzas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        listaPizza.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pizzas padrao" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaPizza);

        botAdicionarPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/botao-adicionar.png"))); // NOI18N
        botAdicionarPizza.setText("Adicionar nova pizza");
        botAdicionarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAdicionarPizzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addComponent(botAdicionarPizza)
                .addGap(26, 26, 26))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botAdicionarPizza)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 49, -1, 400));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Adicionais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        chkCebola.setBackground(new java.awt.Color(255, 255, 255));
        chkCebola.setText("Cebola (2,00)");

        chkMussarela.setBackground(new java.awt.Color(255, 255, 255));
        chkMussarela.setText("Mussarela (6,00)");

        chkPalmito.setBackground(new java.awt.Color(255, 255, 255));
        chkPalmito.setText("Palmito (2,00)");

        chkBacon.setBackground(new java.awt.Color(255, 255, 255));
        chkBacon.setText("Bacon (4,00)");

        chkAzeitona.setBackground(new java.awt.Color(255, 255, 255));
        chkAzeitona.setText("Azeitona (2,00)");

        chkOregano.setBackground(new java.awt.Color(255, 255, 255));
        chkOregano.setText("Orégano (1,00)");

        chkPresunto.setBackground(new java.awt.Color(255, 255, 255));
        chkPresunto.setText("Presunto (2,00)");

        chkLombo.setBackground(new java.awt.Color(255, 255, 255));
        chkLombo.setText("Lombo canadense (4,00)");

        chkAlho.setBackground(new java.awt.Color(255, 255, 255));
        chkAlho.setText("Alho Tostado (1,00)");

        chkAtum.setBackground(new java.awt.Color(255, 255, 255));
        chkAtum.setText("Atum (5,00)");

        chkOvo.setBackground(new java.awt.Color(255, 255, 255));
        chkOvo.setText("Ovo (2,00)");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkLombo)
                    .addComponent(chkOregano)
                    .addComponent(chkAlho)
                    .addComponent(chkAzeitona)
                    .addComponent(chkCebola)
                    .addComponent(chkBacon))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPresunto)
                    .addComponent(chkOvo)
                    .addComponent(chkAtum)
                    .addComponent(chkMussarela)
                    .addComponent(chkPalmito))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(chkCebola)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkBacon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAzeitona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkLombo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkOregano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAlho))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(chkPresunto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAtum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkOvo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkMussarela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkPalmito)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 770, -1));

        botAdicionar.setBackground(new java.awt.Color(102, 255, 255));
        botAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/botao-adicionar.png"))); // NOI18N
        botAdicionar.setText("Adicionar no Carrinho");
        botAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(botAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 228, 37));

        botEncerrar.setBackground(java.awt.Color.orange);
        botEncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/cesta-de-compras.png"))); // NOI18N
        botEncerrar.setText("Encerrar Pedido");
        botEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEncerrarActionPerformed(evt);
            }
        });
        jPanel1.add(botEncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 740, -1, 38));

        botSair.setBackground(new java.awt.Color(255, 0, 0));
        botSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/sair.png"))); // NOI18N
        botSair.setText("Sair");
        botSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSairActionPerformed(evt);
            }
        });
        jPanel1.add(botSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 740, 89, 38));

        listaPedido.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Onde vão ficar as pizzas criadas", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaPedido);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 760, 152));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Total");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, -1, -1));

        txtTotal.setEditable(false);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 182, 57));

        jLabel8.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel8.setText("Marchiori's Pizzaria");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/pizza.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 36, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intergraf/imagens/pizza1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 590, 130, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarBotoes() {
        lblBairro.setVisible(true);
        txtBairro.setVisible(true);
        lblNumero.setVisible(true);
        txtNumero.setVisible(true);
        lblRua.setVisible(true);
        txtRua.setVisible(true);
        lblTelefone.setVisible(true);
        txtTelefone.setVisible(true);
        botAdicionarCliente.setVisible(true);
        botLimpar.setVisible(true);

    }

    private void esconderBotoes() {
        lblBairro.setVisible(false);
        txtBairro.setVisible(false);
        lblNumero.setVisible(false);
        txtNumero.setVisible(false);
        lblRua.setVisible(false);
        txtRua.setVisible(false);
        lblTelefone.setVisible(false);
        txtTelefone.setVisible(false);
        botAdicionarCliente.setVisible(false);
        botLimpar.setVisible(false);

    }
    private void radioCheddarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCheddarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCheddarActionPerformed

    private void botCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCriarActionPerformed
        mostrarBotoes();
        botPesquisar.setVisible(false);
    }//GEN-LAST:event_botCriarActionPerformed

    private void botPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPesquisarActionPerformed

    }//GEN-LAST:event_botPesquisarActionPerformed

    private void botAdicionarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAdicionarPizzaActionPerformed
        gerIG.janelaCadPizza();
    }//GEN-LAST:event_botAdicionarPizzaActionPerformed

    private void botAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botAdicionarActionPerformed

    private void botEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEncerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botEncerrarActionPerformed

    private void botSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSairActionPerformed
        gerIG.encerrarPrograma(this);
    }//GEN-LAST:event_botSairActionPerformed

    private void botLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botLimparActionPerformed
        txtNome.setText("");
        txtBairro.setText("");
        txtNumero.setText("");
        txtRua.setText("");
        txtTelefone.setText("");
        esconderBotoes();
        botPesquisar.setVisible(true);
    }//GEN-LAST:event_botLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAdicionar;
    private javax.swing.JButton botAdicionarCliente;
    private javax.swing.JButton botAdicionarPizza;
    private javax.swing.JButton botCriar;
    private javax.swing.JButton botEncerrar;
    private javax.swing.JButton botLimpar;
    private javax.swing.JButton botPesquisar;
    private javax.swing.JButton botSair;
    private javax.swing.JCheckBox chkAlho;
    private javax.swing.JCheckBox chkAtum;
    private javax.swing.JCheckBox chkAzeitona;
    private javax.swing.JCheckBox chkBacon;
    private javax.swing.JCheckBox chkBarbecue;
    private javax.swing.JCheckBox chkCebola;
    private javax.swing.JCheckBox chkEntregar;
    private javax.swing.JCheckBox chkLombo;
    private javax.swing.JCheckBox chkMaionese;
    private javax.swing.JCheckBox chkMussarela;
    private javax.swing.JCheckBox chkOregano;
    private javax.swing.JCheckBox chkOvo;
    private javax.swing.JCheckBox chkPalmito;
    private javax.swing.JCheckBox chkPresunto;
    private javax.swing.ButtonGroup grupoBorda;
    private javax.swing.ButtonGroup grupoTamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JList<String> listaPedido;
    private javax.swing.JList<String> listaPizza;
    private javax.swing.JRadioButton radioCatupiry;
    private javax.swing.JRadioButton radioCheddar;
    private javax.swing.JRadioButton radioGrande;
    private javax.swing.JRadioButton radioMedia;
    private javax.swing.JRadioButton radioPequena;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
