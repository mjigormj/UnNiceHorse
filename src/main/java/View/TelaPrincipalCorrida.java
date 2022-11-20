package View;

import Controller.CRUD;
import Controller.Cliente;
import Model.Stock;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipalCorrida extends javax.swing.JFrame {

    String stockName;
    String email;

    public TelaPrincipalCorrida() {
        initComponents();
        this.setLocationRelativeTo(null);
        atualizarLabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlEmail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        btnAdicionarDinheiro = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNovaAposta = new javax.swing.JButton();
        chegada = new javax.swing.JLabel();
        pocoto2 = new javax.swing.JLabel();
        jlSaldo = new javax.swing.JLabel();
        pocoto1 = new javax.swing.JLabel();
        pocoto4 = new javax.swing.JLabel();
        pocoto3 = new javax.swing.JLabel();
        pocoto5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jlEmail.setText("Email do Usuario:");

        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Cavalo", "Valor Apostado", "Qtd Apostadores"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(stockTable);

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

        pocoto1.setIcon(new javax.swing.ImageIcon("C:\\Users\\igorc\\OneDrive\\Documentos\\NetBeansProjects\\CorridaCavalo\\src\\main\\java\\View\\Icons\\cavalo1.png")); // NOI18N
        pocoto1.setToolTipText("");

        pocoto4.setIcon(new javax.swing.ImageIcon("C:\\Users\\igorc\\OneDrive\\Documentos\\NetBeansProjects\\CorridaCavalo\\src\\main\\java\\View\\Icons\\cavalo4.png")); // NOI18N
        pocoto4.setToolTipText("");

        pocoto3.setIcon(new javax.swing.ImageIcon("C:\\Users\\igorc\\OneDrive\\Documentos\\NetBeansProjects\\CorridaCavalo\\src\\main\\java\\View\\Icons\\cavalo3.png")); // NOI18N
        pocoto3.setToolTipText("");

        pocoto5.setIcon(new javax.swing.ImageIcon("C:\\Users\\igorc\\OneDrive\\Documentos\\NetBeansProjects\\CorridaCavalo\\src\\main\\java\\View\\Icons\\cavalo5.png")); // NOI18N
        pocoto5.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pocoto4)
                    .addComponent(pocoto2)
                    .addComponent(pocoto3)
                    .addComponent(pocoto5)
                    .addComponent(pocoto1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chegada)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(32, Short.MAX_VALUE))
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
                        .addGap(36, 36, 36)
                        .addComponent(pocoto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pocoto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pocoto3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pocoto4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pocoto5))
                    .addComponent(chegada, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarDinheiro)
                    .addComponent(btnDelete)
                    .addComponent(btnNovaAposta))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarDinheiroActionPerformed
        try {
            //new Mover().start();
            AdicionarDinheiro ss = new AdicionarDinheiro();
            ss.setEmail(this.getEmail());
            ss.setVisible(true);
        this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipalCorrida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdicionarDinheiroActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
//        try {
//            tituloList();
//        } catch (SQLException ex) {
//            Logger.getLogger(TelaPrincipalCorrida.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(TelaPrincipalCorrida.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_formComponentShown

    private void btnNovaApostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaApostaActionPerformed
        NovaAposta ss = new NovaAposta();
        ss.setVisible(true);
        ss.setEmail(this.getEmail());
        //Cliente.cliente();
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
                jlSaldo.setText("Saldo da carteira: "+ CRUD.returnValorFromUserTable(getEmail()));
            } catch (SQLException ex) {
                Logger.getLogger(TelaPrincipalCorrida.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TelaPrincipalCorrida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
    });
        t.start();
    }
    
    public class Mover extends Thread{
        public void run(){
            while(pocoto1.getLocation().x < 470){
                try {
                    sleep(100);
                } catch (Exception e) {
                    System.out.println("error " + e);
                }
                pocoto1.setBounds(pocoto1.getLocation().x + 5, pocoto1.getLocation().y, pocoto1.getWidth(), pocoto1.getHeight());
            }
        }
    }

    // Methods
    private static final DecimalFormat df = new DecimalFormat("0.00");
//    public void tituloList() throws SQLException, IOException {
//        
//        ArrayList<Stock> titulos = CRUD.returnStockFromTable();
//        try {
//            DefaultTableModel val = (DefaultTableModel) stockTable.getModel();
//            val.setRowCount(0);
//            for (Stock titulo : titulos) {
//                String valorAtual = df.format(titulo.getMarcketValue());
//                String tituloQtd = String.valueOf(titulo.getStockQtd());
//                String precoMedio = df.format(titulo.getAvgCust());
//                String valorTotal = df.format(titulo.getMarcketValue() * titulo.getStockQtd());
//                String lucro = df.format(titulo.getMarcketValue() * titulo.getStockQtd() - titulo.getAvgCust() * titulo.getStockQtd());
//                val.addRow(new String[]{titulo.getName(), valorAtual, precoMedio, tituloQtd, valorTotal, lucro });
//            }
//            
//        } catch (NumberFormatException e) {
//            System.out.println("Entrada invalida");
//        }
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarDinheiro;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNovaAposta;
    public javax.swing.JLabel chegada;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlSaldo;
    public javax.swing.JLabel pocoto1;
    public javax.swing.JLabel pocoto2;
    public javax.swing.JLabel pocoto3;
    public javax.swing.JLabel pocoto4;
    public javax.swing.JLabel pocoto5;
    private javax.swing.JTable stockTable;
    // End of variables declaration//GEN-END:variables
}
