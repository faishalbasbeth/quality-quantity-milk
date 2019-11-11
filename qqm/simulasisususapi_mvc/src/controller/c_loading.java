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
import javax.swing.Timer;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import view.v_loading;

/**
 *
 * @author admin pc
 */
public class c_loading {
    v_loading views;

    Timer timer;
    ActionListener action;
    
        public c_loading() throws SQLException {
        views = new v_loading();
        views.setVisible(true);
        
        act();
        timer = new Timer(50,action);
        timer.start();
       
        
    }

    private void act() {
        action = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                views.getloading().setValue(views.getloading().getValue()+2);
                views.getloading().setStringPainted(true);
                if (views.getloading().getPercentComplete()== 1.00 ) {
                    timer.stop();
                    views.dispose();
            try {
                new c_menu2();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
                }
            }
            
        };
    }

}


