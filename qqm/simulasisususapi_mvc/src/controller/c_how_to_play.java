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
import view.v_how_to_play;

/**
 *
 * @author admin pc
 */
public class c_how_to_play {
    v_how_to_play views;
    
        public c_how_to_play() throws SQLException {
        views = new v_how_to_play();
        views.setVisible(true);

        views.getback().addActionListener(new Klikback());

    }

    private class Klikback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
    
}
