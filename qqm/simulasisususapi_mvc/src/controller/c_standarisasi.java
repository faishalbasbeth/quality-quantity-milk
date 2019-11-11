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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.m_standarisasi;
import view.v_standarisasi;

/**
 *
 * @author admin pc
 */
public class c_standarisasi {
    v_standarisasi views;
    m_standarisasi models;
    
    public c_standarisasi() throws SQLException {
        views = new v_standarisasi();
        models = new m_standarisasi();
        views.setVisible(true);
        views.gettabel_standarisasi().setModel(models.getTabel());
        views.getidstandarisasi_tf().setEnabled(false);
        
        String[] idpsusu = models.getidpsusu_combo();
        views.comboidpsusu(idpsusu);
        
        views.getback_btn().addActionListener(new Klikback());
        views.setOnClikidpsusu(new klikidpsusu());
        views.getsimpan_btn().addActionListener(new Kliksimpan());

    }

    private class Kliksimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.gettabel_standarisasi().setModel(models.getTabel());
            String idstandarisasi_tf = views.getidstandarisasi_tf().getText();
            String idpsusu_combo = (String) views.getidpsusu_combo().getSelectedItem();
            String susuperbulan_tf = views.getsusuperbulan_tf().getText();
            String standarisasisusu_tf = views.getstandarisasisusu_tf().getText();

            if (idstandarisasi_tf.equals("")) {
                if (idpsusu_combo.equals("") || susuperbulan_tf.equals("") || standarisasisusu_tf.equals("")) {
                JOptionPane.showMessageDialog(views, "Data Tidak Boleh Kosong");
                
            }
                else{
                    JOptionPane.showMessageDialog(views, "Data Berhasil Disimpan");
                }
                models.insert(idpsusu_combo, susuperbulan_tf, standarisasisusu_tf);
                views.kosong();
            }

            views.gettabel_standarisasi().setModel(models.getTabel());
        }

        
    }

    private class klikidpsusu implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            double susuper_bulan, standarisasi;
            String standarisasi_1;
            
            System.out.println(views.getSelectedidpsusu());
            if (views.getidpsusu_combo().getSelectedIndex() == 0) {
                views.setsusuperbulan_tf("0");
               
            }else {
                try {
                    views.setsusuperbulan_tf(String.valueOf(models.getsusuperbulan_tf(views.getSelectedidpsusu())));
                    
                    susuper_bulan = Double.parseDouble(models.getsusuperbulan_tf(views.getSelectedidpsusu()));
                    standarisasi = ((0.4 * susuper_bulan)+(15 * 0.04));
                    standarisasi_1 = String.valueOf(standarisasi);
                
                    views.getstandarisasisusu_tf().setText(standarisasi_1);
                    
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
                Logger.getLogger(c_standarisasi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
