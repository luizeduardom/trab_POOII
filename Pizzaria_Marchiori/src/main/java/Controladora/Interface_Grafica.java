package Controladora;

import Dominio.Pizza;
import Janelas.janelaPizza;
import Janelas.janelaPadrao;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author luiz.marchiori
 */
public class Interface_Grafica {

    private janelaPadrao janelaPrincipal = null;
    private janelaPizza janPizza = null;
    private GerenciadorDominio gerDominio;

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
        try {
            gerDominio = new GerenciadorDominio();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(janPizza, "Erro de conexão com o banco. " + ex.getMessage());
            System.exit(-1);
        }
    }

    public void abrirJanelaPrincipal() {
        janelaPrincipal = new janelaPadrao(this);
        janelaPrincipal.setVisible(true);

    }

    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        try {
            dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, Interface_Grafica.class).newInstance(parent, true, this);
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName());
        }
        dlg.setVisible(true);
        return dlg;
    }

    public void janelaCadPizza() {
        janPizza = (janelaPizza) abrirJanela(janelaPrincipal, janPizza, janelaPizza.class);

    }

    public void janelaCadPizzaFechar(JDialog janela) {
        janela.setVisible(false);

    }

    public void encerrarPrograma(java.awt.Frame parent) {
        JOptionPane.showMessageDialog(parent, "Obrigado por usar nossos serviços!");
        System.exit(0);
    }

      public void carregarCombo(JComboBox combo, Class classe) {
        
        try {
            List<Pizza> lista = gerDominio.listar(classe);
            combo.setModel( new DefaultComboBoxModel( lista.toArray() )  );
                                   
        } catch (HibernateException  ex) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro ao carregar pizzas. " + ex.getMessage() );          
        } 
        
    }
}
