/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author admin pc
 */
public class v_menu extends javax.swing.JFrame {

    /**
     * Creates new form v_menu
     */
 
    public v_menu() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public JButton getstart() {
        return start;
    }
    public JButton getoptions() {
        return options;
    }
    public JButton gethtp() {
        return htp;
    }
    public JButton getexit() {
        return exit;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quantity_v_menu = new javax.swing.JLabel();
        milk_v_menu = new javax.swing.JLabel();
        quality_v_menu = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        options = new javax.swing.JButton();
        htp = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        background_v_menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quantity_v_menu.setFont(new java.awt.Font("OCR-B 10 BT", 0, 48)); // NOI18N
        quantity_v_menu.setText("QUANTITY");
        getContentPane().add(quantity_v_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        milk_v_menu.setFont(new java.awt.Font("OCR-B 10 BT", 0, 40)); // NOI18N
        milk_v_menu.setText("MILK");
        getContentPane().add(milk_v_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        quality_v_menu.setFont(new java.awt.Font("OCR-B 10 BT", 0, 75)); // NOI18N
        quality_v_menu.setText("QUALITY");
        getContentPane().add(quality_v_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        start.setFont(new java.awt.Font("OCR-B 10 BT", 0, 24)); // NOI18N
        start.setText("Start");
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 200, -1));

        options.setFont(new java.awt.Font("OCR-B 10 BT", 0, 24)); // NOI18N
        options.setText("Options");
        getContentPane().add(options, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 200, -1));

        htp.setFont(new java.awt.Font("OCR-B 10 BT", 0, 24)); // NOI18N
        htp.setText("How To Play");
        getContentPane().add(htp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 200, -1));

        exit.setFont(new java.awt.Font("OCR-B 10 BT", 0, 24)); // NOI18N
        exit.setText("Exit");
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 200, -1));

        background_v_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ternak sapi perah.jpg"))); // NOI18N
        getContentPane().add(background_v_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(v_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_v_menu;
    private javax.swing.JButton exit;
    private javax.swing.JButton htp;
    private javax.swing.JLabel milk_v_menu;
    private javax.swing.JButton options;
    private javax.swing.JLabel quality_v_menu;
    private javax.swing.JLabel quantity_v_menu;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
