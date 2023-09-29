/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quiz1;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Barista extends javax.swing.JFrame {
    
    
    String pilihan = "";
    int harga_kopi;
    int item =0;

 
    public Barista() {
        initComponents();
        setTitle("Kopi Kenangan");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ejenis = new javax.swing.JComboBox<>();
        ejumlah = new javax.swing.JTextField();
        ekopi = new javax.swing.JTextField();
        eharga = new javax.swing.JTextField();
        eitem = new javax.swing.JTextField();
        etotal = new javax.swing.JTextField();
        ekeluar = new javax.swing.JButton();
        eselesai = new javax.swing.JButton();
        ehapus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rosewood Std Regular", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELAMAT DATANG DI KOPI KENANGAN");

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel2.setText("Jenis Kopi               :");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel3.setText("Jumlah Pesanan    :");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel4.setText("Kopi                         :");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel5.setText("Harga                      :");

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel6.setText("Jumlah Item          :");

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel8.setText("Total                       :");

        ejenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arabica Cofee", "Robusta Cofee", "Liberian Cofee", "Excelsa Cofee" }));
        ejenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejenisActionPerformed(evt);
            }
        });

        ejumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejumlahActionPerformed(evt);
            }
        });

        ekopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekopiActionPerformed(evt);
            }
        });

        etotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etotalActionPerformed(evt);
            }
        });

        ekeluar.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        ekeluar.setText("Keluar");
        ekeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekeluarActionPerformed(evt);
            }
        });

        eselesai.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        eselesai.setText("Selesai");
        eselesai.setActionCommand("Batal");
        eselesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eselesaiActionPerformed(evt);
            }
        });

        ehapus.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        ehapus.setText("Hapus");
        ehapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ehapusActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel7.setText("=================================================");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(ejenis, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(ehapus))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(eselesai)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ekeluar))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(etotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(eitem))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(eharga))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(ekopi))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(ejumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ejenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ejumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ekopi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(eharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(eitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(etotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ehapus)
                    .addComponent(eselesai)
                    .addComponent(ekeluar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ejenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejenisActionPerformed
        pilihan = (String) ejenis.getSelectedItem();
        switch (pilihan) {
            case "Arabica Coffe":
                harga_kopi = 25000;
                break;
            case "Robusta Coffe":
                harga_kopi = 30000;
                break;
            case "Liberian Coffe":
                harga_kopi = 350000;
                break;
            case "Excelsa Coffe":
                harga_kopi = 50000;
                break;
           
        }
        eharga.setText(""+Integer.toString(harga_kopi));

        // TODO add your handling code here:
        
    }//GEN-LAST:event_ejenisActionPerformed

    private void ejumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ejumlahActionPerformed

    private void ekopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekopiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ekopiActionPerformed

    private void ekeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekeluarActionPerformed
        Toolkit.getDefaultToolkit().beep();
        int pilih = JOptionPane.showConfirmDialog(this, "Apakah Ingin Keluar?", "Telah Keluar",
        JOptionPane.YES_NO_OPTION);
        if (pilih == JOptionPane.YES_OPTION){
            System.exit(0); 
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ekeluarActionPerformed

    private void ehapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ehapusActionPerformed
        ekopi.setText("");
        eharga.setText("");
        ejumlah.setText("");
        ejenis.setSelectedItem("Pilih Item");
        eitem.setText("");
        etotal.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_ehapusActionPerformed

    private void eselesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eselesaiActionPerformed
        item = Integer.parseInt(ejumlah.getText());
        int TotalHarga = harga_kopi * item;

        etotal.setText("Rp."+TotalHarga);
        eitem.setText(""+item);
        ekopi.setText(""+pilihan);
        // TODO add your handling code here:
    }//GEN-LAST:event_eselesaiActionPerformed

    private void etotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etotalActionPerformed

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
            java.util.logging.Logger.getLogger(Barista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ehapus;
    private javax.swing.JTextField eharga;
    private javax.swing.JTextField eitem;
    private javax.swing.JComboBox<String> ejenis;
    private javax.swing.JTextField ejumlah;
    private javax.swing.JButton ekeluar;
    private javax.swing.JTextField ekopi;
    private javax.swing.JButton eselesai;
    private javax.swing.JTextField etotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
