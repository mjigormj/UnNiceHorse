package View;

import Controller.CRUD;
import Controller.Cliente;
import Model.RankingCavalo;
import Model.RunnableCavalo;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TelaPrincipalCorrida extends javax.swing.JFrame {

    String stockName;
    String email;
    String cavaloApostado;

    public TelaPrincipalCorrida() {
        initComponents();
        this.setLocationRelativeTo(null);
        atualizarLabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlEmail = new javax.swing.JLabel();
        btnAdicionarDinheiro = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNovaAposta = new javax.swing.JButton();
        chegada = new javax.swing.JLabel();
        pocoto2 = new javax.swing.JLabel();
        jlSaldo = new javax.swing.JLabel();
        pocoto4 = new javax.swing.JLabel();
        pocoto3 = new javax.swing.JLabel();
        pocoto5 = new javax.swing.JLabel();
        pocoto1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        jlEmail.setText("Email do Usuario:");

        btnAdicionarDinheiro.setText("Adicionar Dinheiro");
        btnAdicionarDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarDinheiroActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setText("Resgatar Valor");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNovaAposta.setText("Nova Aposta");
        btnNovaAposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaApostaActionPerformed(evt);
            }
        });

        chegada.setIcon(new javax.swing.ImageIcon("C:\\Users\\igorc\\OneDrive\\Documentos\\NetBeansProjects\\CorridaCavalo\\src\\main\\java\\View\\Icons\\chegada.png")); // NOI18N
        chegada.setToolTipText("");

        pocoto2.setIcon(new javax.swing.ImageIcon("C:\\Users\\igorc\\OneDrive\\Documentos\\NetBeansProjects\\CorridaCavalo\\src\\main\\java\\View\\Icons\\cavalo2.png")); // NOI18N
        pocoto2.setToolTipText("");

        jlSaldo.setText("Saldo da carteira:");

        pocoto4.setIcon(new javax.swing.ImageIcon("C:\\Users\\igorc\\OneDrive\\Documentos\\NetBeansProjects\\CorridaCavalo\\src\\main\\java\\View\\Icons\\cavalo4.png")); // NOI18N
        pocoto4.setToolTipText("");

        pocoto3.setIcon(new javax.swing.ImageIcon("C:\\Users\\igorc\\OneDrive\\Documentos\\NetBeansProjects\\CorridaCavalo\\src\\main\\java\\View\\Icons\\cavalo3.png")); // NOI18N
        pocoto3.setToolTipText("");

        pocoto5.setIcon(new javax.swing.ImageIcon("C:\\Users\\igorc\\OneDrive\\Documentos\\NetBeansProjects\\CorridaCavalo\\src\\main\\java\\View\\Icons\\cavalo5.png")); // NOI18N
        pocoto5.setToolTipText("");

        pocoto1.setIcon(new javax.swing.ImageIcon("C:\\Users\\igorc\\OneDrive\\Documentos\\NetBeansProjects\\CorridaCavalo\\src\\main\\java\\View\\Icons\\cavalo1.png")); // NOI18N
        pocoto1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pocoto4)
                    .addComponent(pocoto3)
                    .addComponent(pocoto5)
                    .addComponent(pocoto2)
                    .addComponent(pocoto1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chegada)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnNovaAposta)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionarDinheiro)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlSaldo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlEmail)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlSaldo)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(pocoto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pocoto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pocoto3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pocoto4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pocoto5))
                    .addComponent(chegada, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarDinheiro)
                    .addComponent(btnDelete)
                    .addComponent(btnNovaAposta))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarDinheiroActionPerformed
        try {
            AdicionarDinheiro ss = new AdicionarDinheiro();
            ss.setEmail(this.getEmail());
            ss.setVisible(true);
        this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipalCorrida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdicionarDinheiroActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    }//GEN-LAST:event_formComponentShown
    private void btnNovaApostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaApostaActionPerformed
        NovaAposta ss = new NovaAposta();
        ss.setVisible(true);
        ss.setEmail(this.getEmail());
        this.dispose();
    }//GEN-LAST:event_btnNovaApostaActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            CRUD.sacarSaldoCarteira(this.getEmail());
            this.atualizarLabel();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipalCorrida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatOneDarkIJTheme());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaPrincipalCorrida tp = new TelaPrincipalCorrida();
                tp.setVisible(true);
                jlEmail.setText("Email do Usuario: " + tp.getEmail());
            }
        });
    }

    //Methods Cavalos
    public void atualizarLabel() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                jlEmail.setText("Email do Usuario: " + getEmail());
                try {
                    jlSaldo.setText("Saldo da carteira: " + CRUD.returnValorFromUserTable(getEmail()));
                } catch (SQLException ex) {
                    Logger.getLogger(TelaPrincipalCorrida.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(TelaPrincipalCorrida.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        t.start();
    }

    public void mover(List<Long> sleepTime) {
        RunnableCavalo runnableCavalo1 = new RunnableCavalo(pocoto1, "Imperatriz", sleepTime.get(0));
        RunnableCavalo runnableCavalo2 = new RunnableCavalo(pocoto2, "Duque", sleepTime.get(1));
        RunnableCavalo runnableCavalo3 = new RunnableCavalo(pocoto3, "Princesa (vc sabe quem)", sleepTime.get(2));
        RunnableCavalo runnableCavalo4 = new RunnableCavalo(pocoto4, "Pé de Pano", sleepTime.get(3));
        RunnableCavalo runnableCavalo5 = new RunnableCavalo(pocoto5, "Pangaré", sleepTime.get(4));

        //Instanciando as Threads
        Thread threadCavalo1 = new Thread(runnableCavalo1, "Imperatriz");
        Thread threadCavalo2 = new Thread(runnableCavalo2, "Duque");
        Thread threadCavalo3 = new Thread(runnableCavalo3, "Princesa (vc sabe quem)");
        Thread threadCavalo4 = new Thread(runnableCavalo4, "Pé de Pano");
        Thread threadCavalo5 = new Thread(runnableCavalo5, "Pangaré");

        threadCavalo1.start();
        threadCavalo2.start();
        threadCavalo3.start();
        threadCavalo4.start();
        threadCavalo5.start();
    }

    // Methods
    public void corridaCavalo(int aposta, Double valorAposta) throws SQLException, IOException {
        List<RankingCavalo> rankingCavalos = Cliente.cliente(aposta, valorAposta);
        Double valorAnterior = CRUD.returnValorFromUserTable(this.getEmail());
        this.atualizarLabel();
        List<Long> sleepTime = tempoCadaCavalo(rankingCavalos);
        mover(sleepTime);
        if (jogadorGanhou(rankingCavalos.get(0), getCavaloApostado())) {
            CRUD.updateInTableCarteira((valorAnterior + valorAposta * 2), this.getEmail());
            valorAnterior = CRUD.returnSaldoFromCarteiraUnNiceHorse(1);
            CRUD.updateInTableCarteiraUnNiceHorse((valorAnterior - valorAposta), 1);
        }
    }

    private List<Long> tempoCadaCavalo(List<RankingCavalo> rankingCavalos) {
        List<Long> tempoCadaCavalo = new ArrayList<>();
        for (RankingCavalo rankingCavalo : rankingCavalos) {
            if (rankingCavalo.getNomeCavalo().equals("Imperatriz")) {
                tempoCadaCavalo.add(rankingCavalo.getTempoCavalo());
            }
        }
        for (RankingCavalo rankingCavalo : rankingCavalos) {
            if (rankingCavalo.getNomeCavalo().equals("Duque")) {
                tempoCadaCavalo.add(rankingCavalo.getTempoCavalo());
            }
        }
        for (RankingCavalo rankingCavalo : rankingCavalos) {
            if (rankingCavalo.getNomeCavalo().equals("Princesa (vc sabe quem)")) {
                tempoCadaCavalo.add(rankingCavalo.getTempoCavalo());
            }
        }
        for (RankingCavalo rankingCavalo : rankingCavalos) {
            if (rankingCavalo.getNomeCavalo().equals("Pé de Pano")) {
                tempoCadaCavalo.add(rankingCavalo.getTempoCavalo());
            }
        }
        for (RankingCavalo rankingCavalo : rankingCavalos) {
            if (rankingCavalo.getNomeCavalo().equals("Pangaré")) {
                tempoCadaCavalo.add(rankingCavalo.getTempoCavalo());
            }
        }

        return tempoCadaCavalo;
    }

    private boolean jogadorGanhou(RankingCavalo rankingCavalos, String cavaloApostado) {
        if (rankingCavalos.getNomeCavalo().equals(cavaloApostado)) {
            JOptionPane.showMessageDialog(null, "VOCÊ GANHOU!!! \n O cavalo: "+ rankingCavalos.getNomeCavalo() + "venceu a corrida.", "GANHOU!!!", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "O cavalo " + rankingCavalos.getNomeCavalo() +" venceu a corrida\n não desista e aposte novamente!", "Você Perdeu", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCavaloApostado() {
        return cavaloApostado;
    }

    public void setCavaloApostado(String cavaloApostado) {
        this.cavaloApostado = cavaloApostado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarDinheiro;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNovaAposta;
    public javax.swing.JLabel chegada;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlSaldo;
    public javax.swing.JLabel pocoto1;
    public javax.swing.JLabel pocoto2;
    public javax.swing.JLabel pocoto3;
    public javax.swing.JLabel pocoto4;
    public javax.swing.JLabel pocoto5;
    // End of variables declaration//GEN-END:variables
}
