package View;

import Controller.CRUD;
import Controller.Conector;
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

public class AdicionarDinheiro extends javax.swing.JFrame {

    Double dinheiro;
    String stockName;
    String email;
    
    public AdicionarDinheiro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        valorInput = new javax.swing.JTextField();
        btnAddStock = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Valor");

        valorInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorInputActionPerformed(evt);
            }
        });
        valorInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorInputKeyPressed(evt);
            }
        });

        btnAddStock.setText("+");
        btnAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStockActionPerformed(evt);
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
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddStock, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnAddStock))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorInputActionPerformed
        //dinheiro = Double.parseDouble(valorInput.getText().trim());
    }//GEN-LAST:event_valorInputActionPerformed

    private void valorInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorInputKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            this.showStock();
    }//GEN-LAST:event_valorInputKeyPressed

    private void btnAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStockActionPerformed
        try {
            Double valorAnterior = CRUD.returnValorFromUserTable(email);
            CRUD.updateInTableCarteira(valorAnterior + Double.parseDouble(valorInput.getText().trim()), email); 
            JOptionPane.showMessageDialog(null, "Dinheiro adicionado a carteira", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            TelaPrincipalCorrida sl = new TelaPrincipalCorrida();
            sl.setEmail(this.getEmail());
            sl.atualizarLabel();
            sl.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {            
            Logger.getLogger(AdicionarDinheiro.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch ( Exception e) {
            JOptionPane.showMessageDialog(null, "DIGITE APENAS NÚEMEROS", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnAddStockActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPrincipalCorrida sl = new TelaPrincipalCorrida();
        sl.setVisible(true);
        sl.setEmail(this.getEmail());
        sl.atualizarLabel();
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
                new AdicionarDinheiro().setVisible(true);
            }
        });
    }

    // Methods
    public void showStock() {
        try {
            if (!valorInput.getText().isEmpty()) {
                  System.out.println("teste");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida");
        
        } catch (Exception ex) {
            Logger.getLogger(AdicionarDinheiro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStock;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField valorInput;
    // End of variables declaration//GEN-END:variables
}
