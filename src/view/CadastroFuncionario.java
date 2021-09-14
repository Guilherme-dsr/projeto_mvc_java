/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.FuncionarioBean;
import bean.ProdutosBean;
import com.placeholder.PlaceHolder;
import connection.ConnectionFactory;
import dao.FuncionarioDao;
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
public class CadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFuncionario
     */
    PlaceHolder holder;
    public CadastroFuncionario() {
        initComponents();
        holder = new PlaceHolder(email, "Digite Seu Email");
        holder = new PlaceHolder(senha, "Digite Sua Senha");
        holder = new PlaceHolder(nome, "Digite Seu Nome");
        holder = new PlaceHolder(username, "Digite Seu Username");
        holder = new PlaceHolder(cidade, "Digite Sua Cidade");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        Bt_Deletar = new javax.swing.JButton();
        Bt_Cadastrar = new javax.swing.JButton();
        Bt_Pesquisar = new javax.swing.JButton();
        Bt_Atualizar = new javax.swing.JButton();
        cod = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(16, 24, 51));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(19, 46, 74));
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CADASTRO");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 50, 130, 50);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 120, 60, 15);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(240, 120, 80, 15);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cidade");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 190, 70, 20);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 260, 80, 15);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Senha");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 330, 60, 15);

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        jPanel3.add(nome);
        nome.setBounds(20, 140, 160, 30);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel3.add(username);
        username.setBounds(240, 140, 160, 30);
        jPanel3.add(cidade);
        cidade.setBounds(20, 210, 160, 30);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel3.add(email);
        email.setBounds(20, 280, 380, 30);

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
        jPanel3.add(senha);
        senha.setBounds(20, 350, 380, 30);

        jLabel11.setFont(new java.awt.Font("Aharoni", 2, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FUNCIONÁRIO");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 80, 130, 20);

        Bt_Deletar.setFont(new java.awt.Font("Aharoni", 1, 10)); // NOI18N
        Bt_Deletar.setForeground(new java.awt.Color(102, 102, 102));
        Bt_Deletar.setText("DELETAR");
        Bt_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_DeletarActionPerformed(evt);
            }
        });
        jPanel3.add(Bt_Deletar);
        Bt_Deletar.setBounds(310, 430, 90, 30);

        Bt_Cadastrar.setFont(new java.awt.Font("Aharoni", 1, 10)); // NOI18N
        Bt_Cadastrar.setForeground(new java.awt.Color(102, 102, 102));
        Bt_Cadastrar.setText("CADASTRAR");
        Bt_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_CadastrarActionPerformed(evt);
            }
        });
        jPanel3.add(Bt_Cadastrar);
        Bt_Cadastrar.setBounds(20, 430, 90, 30);

        Bt_Pesquisar.setFont(new java.awt.Font("Aharoni", 1, 10)); // NOI18N
        Bt_Pesquisar.setForeground(new java.awt.Color(102, 102, 102));
        Bt_Pesquisar.setText("PESQUISAR");
        Bt_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_PesquisarActionPerformed(evt);
            }
        });
        jPanel3.add(Bt_Pesquisar);
        Bt_Pesquisar.setBounds(120, 430, 89, 30);

        Bt_Atualizar.setFont(new java.awt.Font("Aharoni", 1, 10)); // NOI18N
        Bt_Atualizar.setForeground(new java.awt.Color(102, 102, 102));
        Bt_Atualizar.setText("ATUALIZAR");
        Bt_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_AtualizarActionPerformed(evt);
            }
        });
        jPanel3.add(Bt_Atualizar);
        Bt_Atualizar.setBounds(216, 430, 87, 30);

        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });
        jPanel3.add(cod);
        cod.setBounds(240, 210, 160, 30);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Codigo");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(240, 190, 80, 15);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(320, 0, 420, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 530);

        setSize(new java.awt.Dimension(1026, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void Bt_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_DeletarActionPerformed
        FuncionarioBean fb = new FuncionarioBean();
        FuncionarioDao  fd = new FuncionarioDao();
        
        int co = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
        
        fb.setCod(co);
        
        fd.delete(fb);
        
        cod.setText("");
        nome.setText("");
        username.setText("");
        email.setText("");
        cidade.setText("");
        senha.setText("");
    }//GEN-LAST:event_Bt_DeletarActionPerformed

    private void Bt_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_CadastrarActionPerformed
       FuncionarioBean fb = new FuncionarioBean();
        FuncionarioDao fd = new FuncionarioDao();
        
        fb.setNome(nome.getText());
        fb.setUsername(username.getText());
	fb.setCod(Integer.parseInt(cod.getText()));	
        fb.setEmail(email.getText());
	fb.setCidade(cidade.getText());
        fb.setSenha(Integer.parseInt(senha.getText()));
	
       
        fd.create(fb);
        
        cod.setText("");
        nome.setText("");
        username.setText("");
        email.setText("");
        cidade.setText("");
        senha.setText("");
    }//GEN-LAST:event_Bt_CadastrarActionPerformed

    private void Bt_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_PesquisarActionPerformed
        FuncionarioBean fb = new FuncionarioBean();
        FuncionarioDao  fd = new FuncionarioDao();
        int co = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
       
        try {
            stmt = con.prepareStatement("SELECT * FROM produtos WHERE id = "+co);
            rs = stmt.executeQuery();
            while(rs.next()){
                        
        fb.setNome(nome.getText());
        fb.setUsername(username.getText());
	fb.setCod(Integer.parseInt(cod.getText()));	
        fb.setEmail(email.getText());
	fb.setCidade(cidade.getText());
        fb.setSenha(Integer.parseInt(senha.getText()));
	        
        
       

        cod.setText(String.valueOf(fb.getCod()));
        nome.setText(fb.getNome());
        username.setText(fb.getUsername());
        email.setText(fb.getEmail());
        cidade.setText(fb.getCidade());
        senha.setText(String.valueOf(fb.getSenha()));    
               
            }
        } catch (SQLException ex) {
            System.out.println("Pesquisa não deu certo!!");
        }finally{
            connection.ConnectionFactory.closeConnection(con, stmt, rs);
        }
        nome.setText(fb.getNome());
        username.setText(fb.getUsername());
        email.setText(fb.getEmail());
        cidade.setText(fb.getCidade());
        senha.setText(String.valueOf(fb.getSenha()));
        
    }//GEN-LAST:event_Bt_PesquisarActionPerformed

    private void Bt_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AtualizarActionPerformed
        FuncionarioBean fb = new FuncionarioBean();
        FuncionarioDao fd = new FuncionarioDao();
        
        int co = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do produto: "));
        
        
        fb.setNome(nome.getText());
        fb.setUsername(username.getText());
	fb.setCod(Integer.parseInt(cod.getText()));	
        fb.setEmail(email.getText());
	fb.setCidade(cidade.getText());
        fb.setSenha(Integer.parseInt(senha.getText()));      

        fd.Update(fb);
        
        cod.setText("");
	nome.setText("");
        cod.setText("");
        nome.setText("");
        username.setText("");
        email.setText("");
        cidade.setText("");
        senha.setText("");
                                                
    
    }//GEN-LAST:event_Bt_AtualizarActionPerformed

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        // TODO add your handling code here:
        cod.setEnabled(false);
    }//GEN-LAST:event_codActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        TelaPrincipal tp = new TelaPrincipal();
        tp.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Atualizar;
    private javax.swing.JButton Bt_Cadastrar;
    private javax.swing.JButton Bt_Deletar;
    private javax.swing.JButton Bt_Pesquisar;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nome;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}