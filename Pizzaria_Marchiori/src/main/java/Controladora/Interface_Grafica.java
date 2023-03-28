/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladora;

import Janelas.adicionarPizza;
import Janelas.janelaPadrao;

/**
 *
 * @author luiz.marchiori
 */
public class Interface_Grafica {

    private janelaPadrao janelaPrincipal;
    private adicionarPizza janelaPizza;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Interface_Grafica gerenciadorIG = new Interface_Grafica();
        gerenciadorIG.abrirJanelaPrincipal();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("WindowsXP".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(janelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

    }

    public Interface_Grafica() {

    }

    public void abrirJanelaPrincipal() {
        if (janelaPrincipal == null) {
            janelaPrincipal = new janelaPadrao(this);
            janelaPrincipal.setVisible(true);
        }

    }
   
    
    public void fecharJanela (){
        janelaPizza.setVisible(false);
        janelaPrincipal.setVisible(true);
    }

}
