/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulasisususapi_mvc;

import controller.c_menu;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author admin pc
 */
public class Simulasisususapi_mvc {

    /**
     * @param args the command line arguments
     */
        public static void play1() {
        
    InputStream in;
    
    try        
    {            
    in = new FileInputStream(new File("D:\\Musik\\Backgrounprojek.wav"));            
    AudioStream audios = new AudioStream(in);            
    AudioPlayer.player.start(audios);        
    }        
    catch(Exception e)                
    {                    
    JOptionPane.showMessageDialog(null, e);                
    }
       }
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        new c_menu();
        play1();
    }
    
}
