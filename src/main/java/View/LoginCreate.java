package View;

import Controller.CRUD;
import Model.Stock;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class LoginCreate extends javax.swing.JFrame {

    String stockName;

    public LoginCreate() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomeUsuario = new javax.swing.JLabel();
        userNameInput = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        labelPasswd = new javax.swing.JLabel();
        passwdInput = new javax.swing.JTextField();
        labelPasswdConfirm = new javax.swing.JLabel();
        passwdConfirmInput = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNomeUsuario.setText("Nome de Usuário");

        userNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameInputActionPerformed(evt);
            }
        });

        labelEmail.setText("Email");

        emailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInputActionPerformed(evt);
            }
        });

        labelPasswd.setText("Senha");

        passwdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwdInputActionPerformed(evt);
            }
        });

        labelPasswdConfirm.setText("Confirmar Senha");

        passwdConfirmInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwdConfirmInputActionPerformed(evt);
            }
        });

        btnCreate.setText("Criar conta");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreate)
                            .addComponent(labelNomeUsuario)
                            .addComponent(userNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail)
                            .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPasswd)
                            .addComponent(passwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPasswdConfirm)
                            .addComponent(passwdConfirmInput, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnVoltar)
                .addGap(52, 52, 52)
                .addComponent(labelNomeUsuario)
                .addGap(6, 6, 6)
                .addComponent(userNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmail)
                .addGap(6, 6, 6)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(labelPasswd)
                .addGap(6, 6, 6)
                .addComponent(passwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(labelPasswdConfirm)
                .addGap(6, 6, 6)
                .addComponent(passwdConfirmInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInputActionPerformed
        String email = emailInput.getText().trim();
    }//GEN-LAST:event_emailInputActionPerformed

    private void userNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameInputActionPerformed
        String userName = userNameInput.getText().trim();
    }//GEN-LAST:event_userNameInputActionPerformed

    private void passwdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwdInputActionPerformed
        String passwd = passwdInput.getText().trim();
    }//GEN-LAST:event_passwdInputActionPerformed

    private void passwdConfirmInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwdConfirmInputActionPerformed
        String passwdConfirm = passwdConfirmInput.getText().trim();
    }//GEN-LAST:event_passwdConfirmInputActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        this.criarConta();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        LoginScreen ls = new LoginScreen();
        ls.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatOneDarkIJTheme());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginCreate().setVisible(true);
            }
        });
    }

    //Methods
    public void criarConta() {
        try {
            if (!userNameInput.getText().isEmpty() && !emailInput.getText().isEmpty() && !passwdInput.getText().isEmpty()) {
                if (emailInput.getText().contains("@")) {
                    if (passwdInput.getText().equals(passwdConfirmInput.getText())) {
                        CRUD.insertInTableUsuario(userNameInput.getText(), emailInput.getText(), passwdInput.getText());
                        LoginScreen ls = new LoginScreen();
                        ls.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "As senhas digitadas não são iguais", "Erro ao inserir senha", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Insira um email valido", "Erro no campo email", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Verifique se existe algum campo vazio", "Campo vazio", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar usuario");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNomeUsuario;
    private javax.swing.JLabel labelPasswd;
    private javax.swing.JLabel labelPasswdConfirm;
    private javax.swing.JTextField passwdConfirmInput;
    private javax.swing.JTextField passwdInput;
    private javax.swing.JTextField userNameInput;
    // End of variables declaration//GEN-END:variables
}
