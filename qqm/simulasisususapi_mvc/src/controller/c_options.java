/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import static java.lang.System.in;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import view.v_options;

/**
 *
 * @author admin pc
 */
public class c_options {
    v_options views;
    
    public c_options() throws SQLException {
        views = new v_options();
        views.setVisible(true);
        
        views.getback().addActionListener(new Klikback());
        views.getsound().addActionListener(new Kliksound() );
        views.getsilent().addActionListener(new Kliksilent());

    }

    private class Kliksilent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            InputStream in;
            
         
            try        
    {            
    in = new FileInputStream(new File("D:\\Musik\\Backgrounprojek.wav"));            
    AudioStream audios = new AudioStream(in);            
    AudioPlayer.player.stop(in);
    }        
    catch(Exception ex)                
    {                    
    JOptionPane.showMessageDialog(null, ex);                
    }
        }

        
    }

    private class Kliksound implements ActionListener {

        @Override
        public  void actionPerformed(ActionEvent e) {
            
            InputStream in;
            
            try        
    {            
    in = new FileInputStream(new File("D:\\Musik\\Backgrounprojek.wav"));            
    AudioStream audios = new AudioStream(in);            
    AudioPlayer.player.start(audios);        
    }        
    catch(Exception ex)                
    {                    
    JOptionPane.showMessageDialog(null, ex);                
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
                Logger.getLogger(c_options.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}
