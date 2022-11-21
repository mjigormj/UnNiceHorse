package View;

import Controller.CRUD;
import Controller.Conector;
import Enum.CavaloEnum;
import Model.Stock;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class NovaAposta extends javax.swing.JFrame {

    String stockName;
    String email;
    int numeroCavalo;
    Double valorAposta;
    String cavaloApostado;

    public NovaAposta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        valorApostaInput = new javax.swing.JTextField();
        btnNovaAposta = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        numeroCavaloInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText(" 1-Imperatriz   |   2-Duque  |  3-Princesa (vc sabe quem)  |  4-Pé de Pano  |   5-Pangaré");

        valorApostaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorApostaInputActionPerformed(evt);
            }
        });
        valorApostaInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorApostaInputKeyPressed(evt);
            }
        });

        btnNovaAposta.setText("+");
        btnNovaAposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaApostaActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        numeroCavaloInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroCavaloInputActionPerformed(evt);
            }
        });
        numeroCavaloInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numeroCavaloInputKeyPressed(evt);
            }
        });

        jLabel3.setText("Numero do Cavalo:");

        jLabel4.setText("Valor de aposta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numeroCavaloInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(valorApostaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(btnNovaAposta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(73, 73, 73))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numeroCavaloInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaAposta)
                    .addComponent(valorApostaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaApostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaApostaActionPerformed
        try {
            this.setNumeroCavalo(Integer.parseInt(numeroCavaloInput.getText()));
            this.setValorAposta(Double.parseDouble(valorApostaInput.getText()));
            cavaloApostado = CavaloEnum.cavaloEscolhido(this.getNumeroCavalo()).getNomeCavalo();
            
            Double valorAnterior = CRUD.returnValorFromUserTable(this.email);
            CRUD.updateInTableCarteira((valorAnterior - this.getValorAposta()), this.email);
            valorAnterior = CRUD.returnSaldoFromCarteiraUnNiceHorse(1);
            CRUD.updateInTableCarteiraUnNiceHorse((valorAnterior + this.getValorAposta()), 1);
            JOptionPane.showMessageDialog(null, "Aposta realizada", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            TelaPrincipalCorrida sl = new TelaPrincipalCorrida();
            sl.setEmail(this.getEmail());
            sl.setCavaloApostado(cavaloApostado);
            sl.atualizarLabel();
            sl.setVisible(true);
            sl.corridaCavalo(this.getNumeroCavalo(), this.getValorAposta());

        } catch (SQLException ex) {            
            Logger.getLogger(NovaAposta.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch ( IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "DIGITE APENAS NÚEMEROS", "ERRO", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_btnNovaApostaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPrincipalCorrida sl = new TelaPrincipalCorrida();
        sl.setEmail(this.email);
        sl.setVisible(true);
        sl.setEmail(this.getEmail());
        sl.atualizarLabel();
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void valorApostaInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorApostaInputKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        this.showStock();
    }//GEN-LAST:event_valorApostaInputKeyPressed

    private void valorApostaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorApostaInputActionPerformed
//        setValorAposta(Double.parseDouble(valorApostaInput.getText().trim()));
    }//GEN-LAST:event_valorApostaInputActionPerformed

    private void numeroCavaloInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCavaloInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCavaloInputActionPerformed

    private void numeroCavaloInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroCavaloInputKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCavaloInputKeyPressed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatOneDarkIJTheme());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaAposta().setVisible(true);
            }
        });
    }

    // Methods
    public void showStock() {
        try {
            if (!valorApostaInput.getText().isEmpty() && valorApostaInput.getText().equals(Number.class)) {
                String rapidinha = valorApostaInput.getText().trim();
            }
        } catch (Exception ex) {
            Logger.getLogger(NovaAposta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getValorAposta() {
        return valorAposta;
    }

    public void setValorAposta(Double valorAposta) {
        this.valorAposta = valorAposta;
    }

    public int getNumeroCavalo() {
        return numeroCavalo;
    }

    public void setNumeroCavalo(int numeroCavalo) {
        this.numeroCavalo = numeroCavalo;
    }
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovaAposta;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField numeroCavaloInput;
    private javax.swing.JTextField valorApostaInput;
    // End of variables declaration//GEN-END:variables
}
