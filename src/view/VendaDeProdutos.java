/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendasBean;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RicardoSilvadeLima
 */
public class VendaDeProdutos extends javax.swing.JFrame {

    /**
     * Creates new form VendaDeProdutos
     */
    public VendaDeProdutos() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        qtd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Bt_Pesquisar = new javax.swing.JButton();
        Bt_Vender = new javax.swing.JButton();
        preco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        cat = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        valortotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(16, 24, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(19, 46, 74));
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Aharoni", 2, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUTOS");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 80, 130, 20);

        jLabel8.setText("Logo");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(190, 10, 40, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Clique aqui para");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(150, 470, 100, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 255));
        jLabel10.setText("Voltar");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel10);
        jLabel10.setBounds(240, 470, 50, 20);

        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });
        jPanel3.add(cod);
        cod.setBounds(20, 160, 160, 30);

        qtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdActionPerformed(evt);
            }
        });
        jPanel3.add(qtd);
        qtd.setBounds(20, 240, 160, 30);

        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 140, 50, 19);

        jLabel5.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Preço Unitário");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(240, 220, 140, 19);

        jLabel11.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("VENDA DE");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 50, 130, 50);

        Bt_Pesquisar.setFont(new java.awt.Font("Aharoni", 1, 10)); // NOI18N
        Bt_Pesquisar.setForeground(new java.awt.Color(102, 102, 102));
        Bt_Pesquisar.setText("PESQUISAR");
        Bt_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_PesquisarActionPerformed(evt);
            }
        });
        jPanel3.add(Bt_Pesquisar);
        Bt_Pesquisar.setBounds(200, 160, 90, 30);

        Bt_Vender.setFont(new java.awt.Font("Aharoni", 1, 10)); // NOI18N
        Bt_Vender.setForeground(new java.awt.Color(102, 102, 102));
        Bt_Vender.setText("CONFIRMAR VENDA");
        Bt_Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_VenderActionPerformed(evt);
            }
        });
        jPanel3.add(Bt_Vender);
        Bt_Vender.setBounds(130, 430, 160, 30);
        jPanel3.add(preco);
        preco.setBounds(240, 240, 160, 30);

        jLabel7.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nome do Produto");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 300, 160, 19);

        jLabel14.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Categoria");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(240, 300, 90, 19);

        jLabel15.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Quantidade");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(20, 220, 90, 19);
        jPanel3.add(nome);
        nome.setBounds(20, 320, 160, 30);

        cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "FPS", "Terror", "RPG", "Corrida" }));
        jPanel3.add(cat);
        cat.setBounds(240, 320, 70, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(50, 10, 420, 500);

        jPanel4.setBackground(new java.awt.Color(19, 46, 74));
        jPanel4.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("VALOR TOTAL");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(20, 330, 180, 30);

        jLabel12.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Carrinho");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(20, 140, 90, 19);

        jLabel13.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("VENDA DE");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(20, 50, 130, 50);

        jLabel4.setFont(new java.awt.Font("Aharoni", 2, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRODUTOS");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(20, 80, 130, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Preço Unitário", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(20, 172, 380, 140);

        valortotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valortotalActionPerformed(evt);
            }
        });
        jPanel4.add(valortotal);
        valortotal.setBounds(20, 370, 380, 60);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(550, 10, 420, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 530);

        setSize(new java.awt.Dimension(1026, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codActionPerformed

    private void qtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdActionPerformed

    private void Bt_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_PesquisarActionPerformed
        // TODO add your handling code here:
        VendasBean vb = new VendasBean();
        int co = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
//      pd.findAll(id);
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
       
        try {
            stmt = con.prepareStatement("SELECT * FROM produtos WHERE cod = "+co);
            rs = stmt.executeQuery();
            while(rs.next()){
                
        vb.setCod(rs.getInt("cod"));     
	vb.setNome(rs.getString("nome"));
	vb.setQtd(rs.getInt("qtd"));
	vb.setPreco(rs.getFloat("preco"));	
	cat.setSelectedItem(rs.getString("cat"));	
	        
        
       

        cod.setText(String.valueOf(vb.getCod()));
        nome.setText(vb.getNome());
        qtd.setText(String.valueOf(vb.getQtd()));
        preco.setText(String.valueOf(vb.getPreco()));
        cat.setSelectedItem(String.valueOf(vb.getCat()));  
               
            }
        } catch (SQLException ex) {
            System.out.println("Pesquisa não deu certo!!");
        }finally{
            connection.ConnectionFactory.closeConnection(con, stmt, rs);
        }
        nome.setText(vb.getNome());
        qtd.setText(String.valueOf(vb.getQtd()));
        preco.setText(String.valueOf(vb.getPreco()));
	cat.setSelectedItem(String.valueOf(vb.getCat()));
        
    }//GEN-LAST:event_Bt_PesquisarActionPerformed

    private void Bt_VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_VenderActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.valueOf(cod.getText());
        String name = nome.getText().trim();
        int quant = Integer.valueOf(qtd.getText());
        double precop = Double.valueOf(preco.getText());
        String categoria = ((String)cat.getSelectedItem()); 
        
        DefaultTableModel valor = (DefaultTableModel) jTable1.getModel();
        valor.addRow(new String[]{(String.valueOf(codigo)), name, (String.valueOf(quant)), (String.valueOf(precop)), categoria});        
        
//        double valorTotal = 0;
//        for(int i=0; i < valor.length; i++){
//            valorTotal += ;
//        }
        
        cod.setText("");
        nome.setText("");
        qtd.setText("");
        preco.setText("");
        cat.setSelectedIndex(0);
        
        //VendasBean vt = new VendasBean();
        //vt.setPreco(precop);
        
        //valortotal.setText((String.valueOf(vt.getPreco())));
        
    }//GEN-LAST:event_Bt_VenderActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        TelaPrincipal tp = new TelaPrincipal();
        dispose();
        tp.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void valortotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valortotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valortotalActionPerformed

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
            java.util.logging.Logger.getLogger(VendaDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaDeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaDeProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Pesquisar;
    private javax.swing.JButton Bt_Vender;
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JTextField cod;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField qtd;
    private javax.swing.JTextField valortotal;
    // End of variables declaration//GEN-END:variables
}