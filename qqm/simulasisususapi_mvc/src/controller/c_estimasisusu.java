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
import model.m_estimasisusu;
import view.v_estimasisusu;

/**
 *
 * @author admin pc
 */
public class c_estimasisusu {
    v_estimasisusu views;
    m_estimasisusu models;
    
    public c_estimasisusu() throws SQLException {
        views = new v_estimasisusu();
        models = new m_estimasisusu();
        views.setVisible(true);
        views.gettabel_estimasi().setModel(models.getTabel());
        views.getidestimasi_tf().setEnabled(false);
        
        String[] idpsusu = models.getidpsusu_combo();
        views.comboidpsusu(idpsusu);
        
        views.getback_btn().addActionListener(new Klikback());
        views.setOnClikidpsusu(new klikidpsusu());
        views.getsimpan_btn().addActionListener(new Kliksimpan());

    }

    private class Kliksimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.gettabel_estimasi().setModel(models.getTabel());
            String idestimasi_tf = views.getidestimasi_tf().getText();
            String idpsusu_combo = (String) views.getidpsusu_combo().getSelectedItem();
            String susuperbulan_tf = views.getsusuperbulan_tf().getText();
            String laktasi1_tf = views.getlaktasi1_tf().getText();
            String laktasi2_tf = views.getlaktasi2_tf().getText();
            String laktasi3_tf = views.getlaktasi3_tf().getText();
            String laktasi4_tf = views.getlaktasi4_tf().getText();
            String laktasi5_tf = views.getlaktasi5_tf().getText();
            String laktasi6_tf = views.getlaktasi6_tf().getText();
            String laktasi7_tf = views.getlaktasi7_tf().getText();
            String laktasi8_tf = views.getlaktasi8_tf().getText();
            String laktasi9_tf = views.getlaktasi9_tf().getText();
            String laktasi10_tf = views.getlaktasi10_tf().getText();

            if (idestimasi_tf.equals("")) {
                if (idpsusu_combo.equals("") || susuperbulan_tf.equals("") || laktasi1_tf.equals("") || laktasi2_tf.equals("") || laktasi3_tf.equals("") || laktasi4_tf.equals("") || laktasi5_tf.equals("") || laktasi6_tf.equals("") || laktasi7_tf.equals("") || laktasi8_tf.equals("") || laktasi9_tf.equals("") || laktasi10_tf.equals("")) {
                JOptionPane.showMessageDialog(views, "Data Tidak Boleh Kosong");
                
            }
                else{
                    JOptionPane.showMessageDialog(views, "Data Berhasil Disimpan");
                }
                models.insert(idpsusu_combo, susuperbulan_tf, laktasi1_tf, laktasi2_tf, laktasi3_tf, laktasi4_tf, laktasi5_tf, laktasi6_tf, laktasi7_tf, laktasi8_tf, laktasi9_tf, laktasi10_tf);
                views.kosong();
            }

            views.gettabel_estimasi().setModel(models.getTabel());
        }

        
    }

    private class klikidpsusu implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {           
            double susuper_bulan, laktasi1,laktasi12
                    , laktasi2,laktasi22
                    , laktasi3,laktasi32
                    , laktasi4,laktasi42
                    , laktasi5,laktasi52
                    , laktasi6,laktasi62
                    , laktasi7,laktasi72
                    , laktasi8,laktasi82
                    , laktasi9,laktasi92
                    , laktasi10,laktasi102;
            String laktasi1_1, laktasi2_1, laktasi3_1, laktasi4_1, laktasi5_1, laktasi6_1, laktasi7_1, laktasi8_1, laktasi9_1, laktasi10_1;
            
            System.out.println(views.getSelectedidpsusu());
            if (views.getidpsusu_combo().getSelectedIndex() == 0) {
                views.setsusuperbulan_tf("0");
               
            }else {
                try {
                    views.setsusuperbulan_tf(String.valueOf(models.getsusuperbulan_tf(views.getSelectedidpsusu())));
                    
                    susuper_bulan = Double.parseDouble(models.getsusuperbulan_tf(views.getSelectedidpsusu()));
                    laktasi1 = 0.13 * susuper_bulan;
                    laktasi12 = ((laktasi1/3)*30);
                    laktasi1_1 = String.valueOf(laktasi12);
                
                    views.getlaktasi1_tf().setText(laktasi1_1);
                    
                    susuper_bulan = Double.parseDouble(models.getsusuperbulan_tf(views.getSelectedidpsusu()));
                    laktasi2 = (0.13 * (susuper_bulan + 1));
                    laktasi22 = ((laktasi2/3)*30);
                    laktasi2_1 = String.valueOf(laktasi22);
                
                    views.getlaktasi2_tf().setText(laktasi2_1);
                    
                    susuper_bulan = Double.parseDouble(models.getsusuperbulan_tf(views.getSelectedidpsusu()));
                    laktasi3 = (0.12 * (susuper_bulan + 2));
                    laktasi32 = ((laktasi3/3)*30);
                    laktasi3_1 = String.valueOf(laktasi32);
                
                    views.getlaktasi3_tf().setText(laktasi3_1);
                    
                    susuper_bulan = Double.parseDouble(models.getsusuperbulan_tf(views.getSelectedidpsusu()));
                    laktasi4 = (0.12 * (susuper_bulan + 3));
                    laktasi42 = ((laktasi4/3)*30);
                    laktasi4_1 = String.valueOf(laktasi42);
                
                    views.getlaktasi4_tf().setText(laktasi4_1);
                    
                    susuper_bulan = Double.parseDouble(models.getsusuperbulan_tf(views.getSelectedidpsusu()));
                    laktasi5 = (0.1 * (susuper_bulan + 4));
                    laktasi52 = ((laktasi5/3)*30);
                    laktasi5_1 = String.valueOf(laktasi52);
                
                    views.getlaktasi5_tf().setText(laktasi5_1);
                    
                    susuper_bulan = Double.parseDouble(models.getsusuperbulan_tf(views.getSelectedidpsusu()));
                    laktasi6 = (0.1 * (susuper_bulan + 5));
                    laktasi62 = ((laktasi6/3)*30);
                    laktasi6_1 = String.valueOf(laktasi62);
                
                    views.getlaktasi6_tf().setText(laktasi6_1);
                    
                    susuper_bulan = Double.parseDouble(models.getsusuperbulan_tf(views.getSelectedidpsusu()));
                    laktasi7 = (0.09 * (susuper_bulan + 6));
                    laktasi72 = ((laktasi7/3)*30);
                    laktasi7_1 = String.valueOf(laktasi72);
                
                    views.getlaktasi7_tf().setText(laktasi7_1);
                    
                    susuper_bulan = Double.parseDouble(models.getsusuperbulan_tf(views.getSelectedidpsusu()));
                    laktasi8 = (0.08 * (susuper_bulan + 7));
                    laktasi82 = ((laktasi8/3)*30);
                    laktasi8_1 = String.valueOf(laktasi82);
                
                    views.getlaktasi8_tf().setText(laktasi8_1);
                    
                    susuper_bulan = Double.parseDouble(models.getsusuperbulan_tf(views.getSelectedidpsusu()));
                    laktasi9 = (0.07 * (susuper_bulan + 8));
                    laktasi92 = ((laktasi9/3)*30);
                    laktasi9_1 = String.valueOf(laktasi92);
                
                    views.getlaktasi9_tf().setText(laktasi9_1);
                    
                    susuper_bulan = Double.parseDouble(models.getsusuperbulan_tf(views.getSelectedidpsusu()));
                    laktasi10 = (0.06 * (susuper_bulan + 9));
                    laktasi102 = ((laktasi10/3)*30);
                    laktasi10_1 = String.valueOf(laktasi102);
                
                    views.getlaktasi10_tf().setText(laktasi10_1);
                
                } catch (SQLException ex) {
                    Logger.getLogger(c_estimasisusu.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(c_estimasisusu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
