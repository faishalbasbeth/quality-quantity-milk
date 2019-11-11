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
public class m_estimasisusu extends m_model{
    String query;
    
    public m_estimasisusu() throws SQLException{
    super();
}
        public DefaultTableModel getTabel(){
        String[] header = {"Id Estimasi", "Id P Susu", "P Susu/bulan", "B Laktasi 1", "B Laktasi 2", "B Laktasi 3", "B Laktasi 4", "B Laktasi 5", "B Laktasi 6", "B Laktasi 7", "B Laktasi 8", "B Laktasi 9", "B Laktasi 10"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from estimasisusu";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[13];
                kolom[0] = rs.getString("id_estimasi");
                kolom[1] = rs.getString("id_produksisusu");
                kolom[2] = rs.getString("p_susubulan");
                kolom[3] = rs.getString("b_laktasi1");
                kolom[4] = rs.getString("b_laktasi2");
                kolom[5] = rs.getString("b_laktasi3");
                kolom[6] = rs.getString("b_laktasi4");
                kolom[7] = rs.getString("b_laktasi5");
                kolom[8] = rs.getString("b_laktasi6");
                kolom[9] = rs.getString("b_laktasi7");
                kolom[10] = rs.getString("b_laktasi8");
                kolom[11] = rs.getString("b_laktasi9");
                kolom[12] = rs.getString("b_laktasi10");
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
            Logger.getLogger(m_estimasisusu.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(m_estimasisusu.class.getName()).log(Level.SEVERE, null, ex);
        }
            return idpsusu;
}

    public void insert(String idpsusu_combo, String susuperbulan_tf, String laktasi1_tf, String laktasi2_tf, String laktasi3_tf, String laktasi4_tf, String laktasi5_tf, String laktasi6_tf, String laktasi7_tf, String laktasi8_tf, String laktasi9_tf, String laktasi10_tf) {
        try {
            String query="INSERT INTO `ppl_simulasi`.`estimasisusu` (`id_estimasi`,`id_produksisusu`,`p_susubulan`,`b_laktasi1`,`b_laktasi2`,`b_laktasi3`,`b_laktasi4`,`b_laktasi5`,`b_laktasi6`,`b_laktasi7`,`b_laktasi8`,`b_laktasi9`,`b_laktasi10`) "
                    + "VALUES (NULL, '" + idpsusu_combo + "', '" + susuperbulan_tf + "', '" + laktasi1_tf + "', '" + laktasi2_tf + "', '" + laktasi3_tf + "', '" + laktasi4_tf + "', '" + laktasi5_tf + "', '" + laktasi6_tf + "', '" + laktasi7_tf + "', '" + laktasi8_tf + "', '" + laktasi9_tf + "', '" + laktasi10_tf + "');";
            kon.execute(query);
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
}
