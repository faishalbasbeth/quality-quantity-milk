/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin pc
 */
public class m_standarisasi extends m_model{
    String query;
    
    public m_standarisasi() throws SQLException{
    super();
}
        public DefaultTableModel getTabel(){
        String[] header = {"Id Standarisasi", "Id P Susu", "P Susu/bulan", "S Produksi susu"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from standarisasisusu";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[4];
                kolom[0] = rs.getString("id_standarisasi");
                kolom[1] = rs.getString("id_produksisusu");
                kolom[2] = rs.getString("susu_bulan");
                kolom[3] = rs.getString("standarisasi_susu");
                dtm.addRow(kolom);
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
}
        public String getsusuperbulan_tf(String id) throws SQLException{
        System.out.println(id);
        String susuperbulan = null;
        try{
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select p_susubulan from produksisusu where id_produksisusu= " + id + " ");
            rs.next();
            susuperbulan = String.valueOf(rs.getInt("p_susubulan"));
        }catch (SQLException ex) {
            Logger.getLogger(m_standarisasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    return susuperbulan;
}
        
        public String[] getidpsusu_combo(){
            String[] idpsusu = null;
            int x=0;
            try{
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_produksisusu from produksisusu order by id_produksisusu desc limit 1");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                idpsusu = new String [row];
                while(rs.next()){
                    idpsusu[x] = rs.getString("id_produksisusu");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_standarisasi.class.getName()).log(Level.SEVERE, null, ex);
        }
            return idpsusu;
}

    public void insert(String idpsusu_combo, String susuperbulan_tf, String standarisasisusu_tf) {
        try {
            String query="INSERT INTO `ppl_simulasi`.`standarisasisusu` (`id_standarisasi`,`id_produksisusu`,`susu_bulan`,`standarisasi_susu`) "
                    + "VALUES (NULL, '" + idpsusu_combo + "', '" + susuperbulan_tf + "', '" + standarisasisusu_tf + "');";
            kon.execute(query);
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
}
