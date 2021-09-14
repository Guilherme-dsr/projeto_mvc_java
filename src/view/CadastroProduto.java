/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ProdutosBean;
import com.placeholder.PlaceHolder;
import connection.ConnectionFactory;
import dao.ProdutosDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author RicardoSilvadeLima
 */
public class CadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProduto
     */
    PlaceHolder holder;
    public CadastroProduto() {
        initComponents();
        //holder = new Placeholder();
        jLabel10.setText("<html><u>Voltar</u>");
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
        nome = new javax.swing.JTextField();
        cod = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        qtd = new javax.swing.JTextField();
        forn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Bt_Cadastrar = new javax.swing.JButton();
        Bt_Pesquisar = new javax.swing.JButton();
        Bt_Atualizar = new javax.swing.JButton();
        Bt_Deletar = new javax.swing.JButton();

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
        jLabel2.setText("PRODUTO");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 80, 130, 20);

        jLabel8.setText("Logo");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(190, 10, 40, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Clique aqui para");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(140, 470, 100, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 255));
        jLabel10.setText("Voltar");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel10);
        jLabel10.setBounds(230, 470, 50, 20);
        jPanel3.add(nome);
        nome.setBounds(20, 140, 380, 30);

        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });
        jPanel3.add(cod);
        cod.setBounds(20, 210, 160, 30);
        jPanel3.add(preco);
        preco.setBounds(240, 210, 160, 30);

        qtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdActionPerformed(evt);
            }
        });
        jPanel3.add(qtd);
        qtd.setBounds(20, 280, 160, 30);

        forn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornActionPerformed(evt);
            }
        });
        jPanel3.add(forn);
        forn.setBounds(20, 350, 160, 30);

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome Do Produto");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 120, 140, 19);

        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Codigo");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 190, 50, 19);

        jLabel4.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Preco");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(240, 190, 60, 19);

        jLabel5.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantidade");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 260, 90, 19);

        cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "FPS", "Terror", "RPG", "Corrida" }));
        jPanel3.add(cat);
        cat.setBounds(240, 280, 70, 30);

        jLabel6.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Categoria");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(240, 260, 80, 19);

        jLabel7.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fornecedor");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 330, 90, 19);

        jLabel11.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CADASTRO");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 50, 140, 50);

        Bt_Cadastrar.setFont(new java.awt.Font("Aharoni", 1, 10)); // NOI18N
        Bt_Cadastrar.setForeground(new java.awt.Color(102, 102, 102));
        Bt_Cadastrar.setText("CADASTRAR");
        Bt_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_CadastrarActionPerformed(evt);
            }
        });
        jPanel3.add(Bt_Cadastrar);
        Bt_Cadastrar.setBounds(10, 430, 90, 30);

        Bt_Pesquisar.setFont(new java.awt.Font("Aharoni", 1, 10)); // NOI18N
        Bt_Pesquisar.setForeground(new java.awt.Color(102, 102, 102));
        Bt_Pesquisar.setText("PESQUISAR");
        Bt_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_PesquisarActionPerformed(evt);
            }
        });
        jPanel3.add(Bt_Pesquisar);
        Bt_Pesquisar.setBounds(110, 430, 93, 30);

        Bt_Atualizar.setFont(new java.awt.Font("Aharoni", 1, 10)); // NOI18N
        Bt_Atualizar.setForeground(new java.awt.Color(102, 102, 102));
        Bt_Atualizar.setText("ATUALIZAR");
        Bt_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_AtualizarActionPerformed(evt);
            }
        });
        jPanel3.add(Bt_Atualizar);
        Bt_Atualizar.setBounds(220, 430, 87, 30);

        Bt_Deletar.setFont(new java.awt.Font("Aharoni", 1, 10)); // NOI18N
        Bt_Deletar.setForeground(new java.awt.Color(102, 102, 102));
        Bt_Deletar.setText("DELETAR");
        Bt_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_DeletarActionPerformed(evt);
            }
        });
        jPanel3.add(Bt_Deletar);
        Bt_Deletar.setBounds(320, 430, 90, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(330, 10, 420, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 530);

        setSize(new java.awt.Dimension(1026, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void qtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdActionPerformed

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codActionPerformed

    private void fornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornActionPerformed

    private void Bt_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_CadastrarActionPerformed
        ProdutosBean pb = new ProdutosBean();
        ProdutosDao  pd = new ProdutosDao();
        
        pb.setNome(nome.getText());
	pb.setCod(Integer.parseInt(cod.getText()));	
        pb.setQtd(Integer.parseInt(qtd.getText()));
	pb.setForn(forn.getText());
        pb.setPreco(Double.parseDouble(preco.getText()));
	pb.setCat((String)cat.getSelectedItem());
       
        pd.create(pb);
        
        cod.setText("");
        nome.setText("");
        qtd.setText("");
        forn.setText("");
        preco.setText("");
        cat.setSelectedIndex(0);
    }//GEN-LAST:event_Bt_CadastrarActionPerformed

    private void Bt_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_PesquisarActionPerformed
        ProdutosBean pb = new ProdutosBean();
        ProdutosDao  pd = new ProdutosDao();
        int co = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
//      pd.findAll(id);
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
       
        try {
            stmt = con.prepareStatement("SELECT * FROM produtos WHERE cod = "+co);
            rs = stmt.executeQuery();
            while(rs.next()){
                
        pb.setCod(rs.getInt("cod"));     
	pb.setNome(rs.getString("nome"));
	pb.setQtd(rs.getInt("qtd"));
	pb.setForn(rs.getString("forn"));
	pb.setPreco(rs.getFloat("preco"));	
	cat.setSelectedItem(rs.getString("cat"));	
	        
        
       

        cod.setText(String.valueOf(pb.getCod()));
        nome.setText(pb.getNome());
        qtd.setText(String.valueOf(pb.getQtd()));
        forn.setText(pb.getForn());
        preco.setText(String.valueOf(pb.getPreco()));
        cat.setSelectedItem(String.valueOf(pb.getCat()));    
               
            }
        } catch (SQLException ex) {
            System.out.println("Pesquisa não deu certo!!");
        }finally{
            connection.ConnectionFactory.closeConnection(con, stmt, rs);
        }
        nome.setText(pb.getNome());
        qtd.setText(String.valueOf(pb.getQtd()));
        forn.setText(pb.getForn());
        preco.setText(String.valueOf(pb.getPreco()));
	cat.setSelectedItem(String.valueOf(pb.getCat()));
        
    }//GEN-LAST:event_Bt_PesquisarActionPerformed

    private void Bt_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AtualizarActionPerformed
        ProdutosBean pb = new ProdutosBean();
        ProdutosDao  pd = new ProdutosDao();
        
        int co = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do produto: "));
        
        pb.setCod(co);
        pb.setNome(nome.getText());
	pb.setQtd(Integer.parseInt(qtd.getText()));
        pb.setForn(forn.getText());
        pb.setPreco(Double.parseDouble(preco.getText()));
	pb.setCat((String)cat.getSelectedItem());        

        pd.Update(pb);
        
        cod.setText("");
	nome.setText("");
        qtd.setText("");
        forn.setText("");
        preco.setText("");
	cat.setSelectedIndex(0);
    }//GEN-LAST:event_Bt_AtualizarActionPerformed

    private void Bt_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_DeletarActionPerformed
                ProdutosBean pb = new ProdutosBean();
        ProdutosDao  pd = new ProdutosDao();
        
        int co = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
        
        pb.setCod(co);
        
        pd.delete(pb);
        
        cod.setText("");
	nome.setText("");
        qtd.setText("");
        forn.setText("");
        preco.setText("");
	cat.setSelectedIndex(0);
    }//GEN-LAST:event_Bt_DeletarActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        TelaPrincipal tp = new TelaPrincipal();
        dispose();
        tp.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Atualizar;
    private javax.swing.JButton Bt_Cadastrar;
    private javax.swing.JButton Bt_Deletar;
    private javax.swing.JButton Bt_Pesquisar;
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField forn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField nome;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField qtd;
    // End of variables declaration//GEN-END:variables
}
