package View;

import Controller.Conector;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class LoginScreen extends javax.swing.JFrame {

    String stockName;

    public LoginScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        tfUserEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();
        tfpUserPasswd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(145, 83, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        tfUserEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserEmailActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 83, 0, 83);
        getContentPane().add(tfUserEmail, gridBagConstraints);

        jLabel3.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 83, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 43, 0, 0);
        getContentPane().add(btnLogin, gridBagConstraints);

        btnCreateAccount.setText("Criar conta");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(71, 35, 42, 0);
        getContentPane().add(btnCreateAccount, gridBagConstraints);

        tfpUserPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpUserPasswdActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 83, 0, 83);
        getContentPane().add(tfpUserPasswd, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserEmailActionPerformed
        //stockName = stockInput.getText().trim();
    }//GEN-LAST:event_tfUserEmailActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            
            Connection con = Conector.conect();
            String sql = "select * from usuario where email=? and passwd=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, tfUserEmail.getText());
            stmt.setString(2, new String(tfpUserPasswd.getPassword()));
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                this.dispose();
                TelaPrincipalCorrida sv = new TelaPrincipalCorrida();
                sv.setEmail(tfUserEmail.getText());
                sv.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Login Invalido \n Verificar email e senha");
            }
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        this.dispose();
        LoginCreate lc = new LoginCreate();
        lc.setVisible(true);
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void tfpUserPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpUserPasswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpUserPasswdActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatOneDarkIJTheme());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfUserEmail;
    private javax.swing.JPasswordField tfpUserPasswd;
    // End of variables declaration//GEN-END:variables
}
