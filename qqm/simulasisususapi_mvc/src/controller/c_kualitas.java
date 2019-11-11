/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.m_kualitas;
import view.v_kualitas;

/**
 *
 * @author admin pc
 */
public class c_kualitas {
    v_kualitas views;
    m_kualitas models;
    
    public c_kualitas() throws SQLException {
        views = new v_kualitas();
        models = new m_kualitas();
        views.setVisible(true);
        views.gettabel_kualitas().setModel(models.getTabel());
        views.getidkualitas_tf().setEnabled(false);
        
        String[] idpsusu = models.getidpsusu_combo();
        views.comboidpsusu(idpsusu);
        String[] cuaca = models.getcuaca_combo();
        views.combocuaca(cuaca);
        
        views.getback_btn().addActionListener(new Klikback());
        views.setOnClikcuaca(new klikcuaca());
        views.getsimpan_btn().addActionListener(new Kliksimpan());
        
        views.getbulanlaktasi_tf().addKeyListener(new e_bulan());

    }

    private class e_bulan implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println(e);
            if (e.getKeyCode() < 46 || e.getKeyCode() > 57 ) {
                JOptionPane.showMessageDialog(views, "Data Tidak Valid");
                views.getbulanlaktasi_tf().setText("");
            }
            
        }

        
    }

    private class Kliksimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.gettabel_kualitas().setModel(models.getTabel());
            String idkualitas_tf = views.getidkualitas_tf().getText();
            String idpsusu_combo = (String) views.getidpsusu_combo().getSelectedItem();
            String bulanlaktasi_tf = views.getbulanlaktasi_tf().getText();
            String cuaca_combo = (String) views.getcuaca_combo().getSelectedItem();
            String kualitas_tf = views.getkualitas_tf().getText();

            if (idkualitas_tf.equals("")) {
                if (idpsusu_combo.equals("") || bulanlaktasi_tf.equals("") || cuaca_combo.equals("") || kualitas_tf.equals("")) {
                JOptionPane.showMessageDialog(views, "Data Tidak Boleh Kosong");
                
            }
                else{
                    JOptionPane.showMessageDialog(views, "Data Berhasil Disimpan");
                }
                models.insert(idpsusu_combo, bulanlaktasi_tf, cuaca_combo, kualitas_tf);
                views.kosong();
            }


            views.gettabel_kualitas().setModel(models.getTabel());
        }

        
    }

    private class klikcuaca implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            System.out.println(views.getSelectedcuaca());
            if (views.getcuaca_combo().getSelectedIndex() == 0) {
                views.setkualitas_tf("0");
               
            }else {
                try {
                    views.setkualitas_tf(String.valueOf(models.getkualitas_tf(views.getSelectedcuaca())));
                    
                } catch (SQLException ex) {
                    Logger.getLogger(c_standarisasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        
    }

    private class Klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu2();
            } catch (SQLException ex) {
                Logger.getLogger(c_kualitas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
