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
import javax.swing.JOptionPane;
import view.v_menu;

/**
 *
 * @author admin pc
 */
public class c_menu {
    v_menu views;
    
    public c_menu() throws SQLException {
        views = new v_menu();
        views.setVisible(true);
        
        views.getstart().addActionListener(new Klikstart());
        views.gethtp().addActionListener(new Klikhow_to_play());
        views.getexit().addActionListener(new Klikexit());
        views.getoptions().addActionListener(new Klikoptions());

    }

    private class Klikoptions implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
             views.dispose();
            try {
                new c_options();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class Klikstart implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           views.dispose();
            try {
                new c_loading();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private  class Klikhow_to_play implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_how_to_play();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class Klikexit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedOption = JOptionPane.showConfirmDialog(null,
            "Apakah anda akan menutup aplikasi?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
               int c_login = 0;
            System.exit(c_login);
        }

        
    }

    

}
}
