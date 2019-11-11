/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.m_produksusu;
import view.v_produksusu;

/**
 *
 * @author admin pc
 */
public class c_produksusu {
    v_produksusu views;
    m_produksusu models;
    
        public c_produksusu() throws SQLException {
        views = new v_produksusu();
        models = new m_produksusu();
        views.setVisible(true);
        views.gettabel_sususapi().setModel(models.getTabel());
        views.getidsapi_tf().setEnabled(false);
        
        views.getback_btn().addActionListener(new Klikback());
        views.getsimpan_btn().addActionListener(new Kliksimpan());
        views.total(new Kliktotal());
        views.total1(new kliktotal1());
        views.total2(new kliktotal2());
        
        views.getumursapi_tf().addKeyListener(new e_umur());
        views.getperlaktasi_tf().addKeyListener(new e_perlaktasi());
        views.getproduksisusu1_tf().addKeyListener(new e_susu1());
        views.getproduksisusu2_tf().addKeyListener(new e_susu2());
        views.getproduksisusu3_tf().addKeyListener(new e_susu3());

    }

    private class kliktotal2 implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            double ps1,total;
            String total1;
            
            ps1 = Double.parseDouble(views.getproduksisusu1_tf().getText());
            total = ps1 ;
            total1 = String.valueOf(total);
            
            views.gettotalproduksi_tf().setText(total1);
            
            double total2,ratarata;
            String ratarata1;
            
            total2 = Double.parseDouble(views.gettotalproduksi_tf().getText());
            ratarata = total2/3;
            ratarata1 = String.valueOf(ratarata);
            
            views.getratarata_tf().setText(ratarata1);
            
            double ratarata2,susuperbulan;
            String susuperbulan1;
            
            ratarata2 = Double.parseDouble(views.getratarata_tf().getText());
            susuperbulan = 30 * ratarata2;
            susuperbulan1 = String.valueOf(susuperbulan);
            
            views.getp_susubulan_tf().setText(susuperbulan1);
        }

        
    }

    private class kliktotal1 implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            double ps1,ps2,total;
            String total1;
            
            ps1 = Double.parseDouble(views.getproduksisusu1_tf().getText());
            ps2 = Double.parseDouble(views.getproduksisusu2_tf().getText());
            total = ps1 + ps2;
            total1 = String.valueOf(total);
            
            views.gettotalproduksi_tf().setText(total1);
            
            double total2,ratarata;
            String ratarata1;
            
            total2 = Double.parseDouble(views.gettotalproduksi_tf().getText());
            ratarata = total2/3;
            ratarata1 = String.valueOf(ratarata);
            
            views.getratarata_tf().setText(ratarata1);
            
            double ratarata2,susuperbulan;
            String susuperbulan1;
            
            ratarata2 = Double.parseDouble(views.getratarata_tf().getText());
            susuperbulan = 30 * ratarata2;
            susuperbulan1 = String.valueOf(susuperbulan);
            
            views.getp_susubulan_tf().setText(susuperbulan1);
        }

        
    }

    private class e_susu3 implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() < 46 || e.getKeyCode() > 57) {
                JOptionPane.showMessageDialog(views, "Data Tidak Valid");
                views.getproduksisusu3_tf().setText("");
            }
        }

        
    }

    private class e_susu2 implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() < 46 || e.getKeyCode() > 57) {
                JOptionPane.showMessageDialog(views, "Data Tidak Valid");
                views.getproduksisusu2_tf().setText("");
            }
        }

        
    }

    private class e_susu1 implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() < 46 || e.getKeyCode() > 57) {
                JOptionPane.showMessageDialog(views, "Data Tidak Valid");
                views.getproduksisusu1_tf().setText("");
            }
        }

        
    }

    private class e_perlaktasi implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() < 46 || e.getKeyCode() > 57) {
                JOptionPane.showMessageDialog(views, "Data Tidak Valid");
                views.getperlaktasi_tf().setText("");
            }
        }

        
    }

    private class e_umur implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() < 46 || e.getKeyCode() > 57) {
                JOptionPane.showMessageDialog(views, "Data Tidak Valid");
                views.getumursapi_tf().setText("");
            }
        }

        
    }

    private class Kliktotal implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            double ps1,ps2,ps3,total;
            String total1;
            
            ps1 = Double.parseDouble(views.getproduksisusu1_tf().getText());
            ps2 = Double.parseDouble(views.getproduksisusu2_tf().getText());
            ps3 = Double.parseDouble(views.getproduksisusu3_tf().getText());
            total = ps1 + ps2 + ps3;
            total1 = String.valueOf(total);
            
            views.gettotalproduksi_tf().setText(total1);
            
            double total2,ratarata;
            String ratarata1;
            
            total2 = Double.parseDouble(views.gettotalproduksi_tf().getText());
            ratarata = total2/3;
            ratarata1 = String.valueOf(ratarata);
            
            views.getratarata_tf().setText(ratarata1);
            
            double ratarata2,susuperbulan;
            String susuperbulan1;
            
            ratarata2 = Double.parseDouble(views.getratarata_tf().getText());
            susuperbulan = 30 * ratarata2;
            susuperbulan1 = String.valueOf(susuperbulan);
            
            views.getp_susubulan_tf().setText(susuperbulan1);
        }

        
    }

    private class Kliksimpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int angka = 0;
            views.gettabel_sususapi().setModel(models.getTabel());
            String idsapi_tf = views.getidsapi_tf().getText();
            String nama_tf = views.getnama_tf().getText();
            String umursapi_tf = views.getumursapi_tf().getText();
            String pakantambahan_combo = (String) views.getpakantambahan_combo().getSelectedItem();
            String perlaktasi_tf = views.getperlaktasi_tf().getText();
            String produksisusu1_tf = views.getproduksisusu1_tf().getText();
            String produksisusu2_tf = views.getproduksisusu2_tf().getText();
            String produksisusu3_tf = views.getproduksisusu3_tf().getText();
            String totalproduksi_tf = views.gettotalproduksi_tf().getText();
            String ratarata_tf =  views.getratarata_tf().getText();
            String p_susubulan_tf = views.getp_susubulan_tf().getText();
            if (idsapi_tf.equals("")) {
                if (nama_tf.equals("") || umursapi_tf.equals("") || pakantambahan_combo.equals("") || perlaktasi_tf.equals("") || produksisusu1_tf.equals("") || produksisusu2_tf.equals("") || produksisusu3_tf.equals("") || totalproduksi_tf.equals("") || ratarata_tf.equals("") || p_susubulan_tf.equals("")) {
                JOptionPane.showMessageDialog(views, "Data Tidak Boleh Kosong");
                
            }
                else{
                    JOptionPane.showMessageDialog(views, "Data Berhasil Disimpan");
                }
                
                models.insert(nama_tf, umursapi_tf, pakantambahan_combo, perlaktasi_tf, produksisusu1_tf, produksisusu2_tf, produksisusu3_tf, totalproduksi_tf, ratarata_tf, p_susubulan_tf);
                views.kosong();

            }
            

            views.gettabel_sususapi().setModel(models.getTabel());
        }

        
    }


    private class Klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu2();
            } catch (SQLException ex) {
                Logger.getLogger(c_produksusu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
}
