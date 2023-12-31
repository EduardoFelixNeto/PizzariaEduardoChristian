/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Model_pizzariaclaudiaerica.Cliente;
import Model_pizzariaclaudiaerica.TabelaCliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class jfprincipal extends javax.swing.JFrame {
    private final TabelaCliente modelo = new TabelaCliente();
    private final List<Cliente> listaDeClientes = new ArrayList();
    private int linhaClicada=-1;
        
    public static boolean cadastro; //em qualquer local do projeto essa variável é tratada da mesma forma, pois é glogal

    /**
     * Creates new form jfprincipal
     */
    public jfprincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDprincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastro = new javax.swing.JMenu();
        jCadastroClientes = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        jConsultaClientes = new javax.swing.JMenuItem();
        jListagemClientes = new javax.swing.JMenuItem();
        jPedido = new javax.swing.JMenu();
        jNovoPedido = new javax.swing.JMenuItem();
        jPreco = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCadastroSabores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Pizzaria");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jDprincipalLayout = new javax.swing.GroupLayout(jDprincipal);
        jDprincipal.setLayout(jDprincipalLayout);
        jDprincipalLayout.setHorizontalGroup(
            jDprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        jDprincipalLayout.setVerticalGroup(
            jDprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        Cadastro.setText("Cadastro");

        jCadastroClientes.setText("Cadastro de Clientes");
        jCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroClientesActionPerformed(evt);
            }
        });
        Cadastro.add(jCadastroClientes);

        jMenuBar1.add(Cadastro);

        Consultas.setText("Consultas");

        jConsultaClientes.setText("Consulta de Clientes");
        jConsultaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaClientesActionPerformed(evt);
            }
        });
        Consultas.add(jConsultaClientes);

        jListagemClientes.setText("Listagem de Clientes");
        Consultas.add(jListagemClientes);

        jMenuBar1.add(Consultas);

        jPedido.setText("Pedidos");

        jNovoPedido.setText("Novo Pedido");
        jPedido.add(jNovoPedido);

        jMenuBar1.add(jPedido);

        jPreco.setText("Preço");

        jMenuItem1.setText("Atualizar Preços");
        jPreco.add(jMenuItem1);

        jMenuBar1.add(jPreco);

        jMenu3.setText("Sabores");

        jCadastroSabores.setText("Cadastro de Sabores");
        jMenu3.add(jCadastroSabores);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDprincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDprincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
            this.setExtendedState(MAXIMIZED_BOTH); //Função para deixar a tela do tamanho da tela do monitor
            jfprincipal.cadastro = false; //quando a tela abrir a tela cadastro é falsa, não abre
            
    // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroClientesActionPerformed
               
        if(cadastro == false){
                   
        jifCadastro obj = new jifCadastro();/**Pegar a classe tela de cadastro e criamos um objeto**/
        jDprincipal.add(obj); // fazer essa classe ser add ao jDprincipal
        obj.setVisible(true);//tornando esse objeto visivel
        } //fim do if
            
        // TODO add your handling code here:
    }//GEN-LAST:event_jCadastroClientesActionPerformed

    private void jConsultaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaClientesActionPerformed
        
        jifConsulta obj = new jifConsulta();/**Pegar a classe tela de consulta e criamos um objeto**/
        jDprincipal.add(obj); // fazer essa classe ser add ao jDprincipal
        obj.setVisible(true);//tornando esse objeto visivel
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultaClientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenu Consultas;
    private javax.swing.JMenuItem jCadastroClientes;
    private javax.swing.JMenuItem jCadastroSabores;
    private javax.swing.JMenuItem jConsultaClientes;
    private javax.swing.JDesktopPane jDprincipal;
    private javax.swing.JMenuItem jListagemClientes;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jNovoPedido;
    private javax.swing.JMenu jPedido;
    private javax.swing.JMenu jPreco;
    // End of variables declaration//GEN-END:variables
}
