/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;

/**
 *
 * @author admin pc
 */
public class v_menu2 extends javax.swing.JFrame {

    /**
     * Creates new form v_menu2
     */
    public v_menu2() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public JButton getproduksisusu_btn() {
        return produksisusu_btn;
    }
    public JButton getestimasisusu_btn() {
        return estimasisusu_btn;
    }
    public JButton getstandarisasisusu_btn() {
        return standarisasisusu_btn;
    }
    public JButton getkualitassusu_btn() {
        return kualitassusu_btn;
    }
    public JButton getback_btn() {
        return back_btn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quality_v_menu = new javax.swing.JLabel();
        quantity_v_menu = new javax.swing.JLabel();
        milk_v_menu = new javax.swing.JLabel();
        estimasisusu_btn = new javax.swing.JButton();
        produksisusu_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        standarisasisusu_btn = new javax.swing.JButton();
        kualitassusu_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quality_v_menu.setFont(new java.awt.Font("OCR-B 10 BT", 0, 75)); // NOI18N
        quality_v_menu.setText("QUALITY");
        getContentPane().add(quality_v_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        quantity_v_menu.setFont(new java.awt.Font("OCR-B 10 BT", 0, 48)); // NOI18N
        quantity_v_menu.setText("QUANTITY");
        getContentPane().add(quantity_v_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        milk_v_menu.setFont(new java.awt.Font("OCR-B 10 BT", 0, 40)); // NOI18N
        milk_v_menu.setText("MILK");
        getContentPane().add(milk_v_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        estimasisusu_btn.setFont(new java.awt.Font("OCR-B 10 BT", 0, 24)); // NOI18N
        estimasisusu_btn.setText("Estimasi SUSU");
        estimasisusu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estimasisusu_btnActionPerformed(evt);
            }
        });
        getContentPane().add(estimasisusu_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 290, 50));

        produksisusu_btn.setFont(new java.awt.Font("OCR-B 10 BT", 0, 24)); // NOI18N
        produksisusu_btn.setText("Produksi SUSU");
        getContentPane().add(produksisusu_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 290, 50));

        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        standarisasisusu_btn.setFont(new java.awt.Font("OCR-B 10 BT", 0, 24)); // NOI18N
        standarisasisusu_btn.setText("Standarisasi SUSU");
        standarisasisusu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standarisasisusu_btnActionPerformed(evt);
            }
        });
        getContentPane().add(standarisasisusu_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 290, 50));

        kualitassusu_btn.setFont(new java.awt.Font("OCR-B 10 BT", 0, 24)); // NOI18N
        kualitassusu_btn.setText("Kualitas SUSU");
        kualitassusu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kualitassusu_btnActionPerformed(evt);
            }
        });
        getContentPane().add(kualitassusu_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 290, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ternak sapi perah.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estimasisusu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estimasisusu_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estimasisusu_btnActionPerformed

    private void standarisasisusu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standarisasisusu_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standarisasisusu_btnActionPerformed

    private void kualitassusu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kualitassusu_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kualitassusu_btnActionPerformed

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
            java.util.logging.Logger.getLogger(v_menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_menu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton estimasisusu_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kualitassusu_btn;
    private javax.swing.JLabel milk_v_menu;
    private javax.swing.JButton produksisusu_btn;
    private javax.swing.JLabel quality_v_menu;
    private javax.swing.JLabel quantity_v_menu;
    private javax.swing.JButton standarisasisusu_btn;
    // End of variables declaration//GEN-END:variables
}
