/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.v_menu2;

/**
 *
 * @author admin pc
 */
public class c_menu2 {
    v_menu2 views;
    
    public c_menu2() throws SQLException {
        views = new v_menu2();
        views.setVisible(true);
        
        views.getproduksisusu_btn().addActionListener(new Klikpsusu());
        views.getestimasisusu_btn().addActionListener(new Klikesusu());
        views.getback_btn().addActionListener(new Klikback());
        views.getstandarisasisusu_btn().addActionListener(new Klikssusu());
        views.getkualitassusu_btn().addActionListener(new Klikksusu());


    }

    private class Klikksusu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_kualitas();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class Klikssusu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_standarisasi();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class Klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class Klikesusu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_estimasisusu();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class Klikpsusu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_produksusu();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
