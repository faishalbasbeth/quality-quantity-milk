/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin pc
 */
public class m_produksusu extends m_model {
    String query;
    
    public m_produksusu() throws SQLException{
    super();
}
        public DefaultTableModel getTabel(){
        String[] header = {"Id Prod Susu","Nama", "Umur Sapi","Pakan Tabahan", "Per Laktasi", "Perah Pagi", "Perah Siang", "Perah Sore", "Total Prod Susu", "Rata2/hari", "Prod Susu/bulan"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from produksisusu";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[11];
                kolom[0] = rs.getString("id_produksisusu");
                kolom[1] = rs.getString("nama");
                kolom[2] = rs.getString("umur_sapi");
                kolom[3] = rs.getString("pakan_tambahan");
                kolom[4] = rs.getString("periodelaktasi");
                kolom[5] = rs.getString("ps1");
                kolom[6] = rs.getString("ps2");
                kolom[7] = rs.getString("ps3");
                kolom[8] = rs.getString("total_ps");
                kolom[9] = rs.getString("rata_rata");
                kolom[10] = rs.getString("p_susubulan");
                dtm.addRow(kolom);
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
}

    public void insert(String nama_tf, String umursapi_tf, String pakantambahan_combo, String perlaktasi_tf, String produksisusu1_tf, String produksisusu2_tf, String produksisusu3_tf, String totalproduksi_tf, String ratarata_tf, String p_susubulan_tf) {
        try {
            String query="INSERT INTO `ppl_simulasi`.`produksisusu` (`id_produksisusu`,`nama`,`umur_sapi`,`pakan_tambahan`,`periodelaktasi`,`ps1`,`ps2`,`ps3`,`total_ps`,`rata_rata`,`p_susubulan`) "
                    + "VALUES (NULL, '" + nama_tf + "', '" + umursapi_tf + "', '" + pakantambahan_combo + "','" + perlaktasi_tf + "','" + produksisusu1_tf + "', '" + produksisusu2_tf + "', '" + produksisusu3_tf + "', '" + totalproduksi_tf + "', '" + ratarata_tf + "', '" + p_susubulan_tf + "');";
            kon.execute(query);
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
}
