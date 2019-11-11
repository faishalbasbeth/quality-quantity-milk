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
public class m_kualitas extends m_model {
    String query;
    
    public m_kualitas() throws SQLException{
    super();
}
        public DefaultTableModel getTabel(){
        String[] header = {"Id Kualitas", "Id P Susu", "Bulan Laktasi", "Cuaca", "Kualitas Susu"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from kualitassusu";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[5];
                kolom[0] = rs.getString("id_kualitas");
                kolom[1] = rs.getString("id_produksisusu");
                kolom[2] = rs.getString("bulanlak_ke");
                kolom[3] = rs.getString("id_cuaca");
                kolom[4] = rs.getString("kualitas_susu");
                dtm.addRow(kolom);
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
}
        public String getkualitas_tf(String id) throws SQLException{
        System.out.println(id);
        String kualitas = null;
        try{
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select keterangan from cuaca where id_cuaca= " + id + " ");
            rs.next();
            kualitas = String.valueOf(rs.getString("keterangan"));
        }catch (SQLException ex) {
            Logger.getLogger(m_kualitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    return kualitas;
}
        public String[] getcuaca_combo(){
            String[] cuaca = null;
            int x=0;
            try{
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_cuaca from cuaca");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                cuaca = new String [row];
                while(rs.next()){
                    cuaca[x] = rs.getString("id_cuaca");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_kualitas.class.getName()).log(Level.SEVERE, null, ex);
        }
            return cuaca;
}
        public String[] getidpsusu_combo(){
            String[] idpsusu = null;
            int x=0;
            try{
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_produksisusu from produksisusu");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                idpsusu = new String [row];
                while(rs.next()){
                    idpsusu[x] = rs.getString("id_produksisusu");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_kualitas.class.getName()).log(Level.SEVERE, null, ex);
        }
            return idpsusu;
}

    public void insert(String idpsusu_combo, String bulanlaktasi_tf, String cuaca_combo, String kualitas_tf) {
        try {
            String query="INSERT INTO `ppl_simulasi`.`kualitassusu` (`id_kualitas`,`id_produksisusu`,`bulanlak_ke`,`id_cuaca`,`kualitas_susu`) "
                    + "VALUES (NULL, '" + idpsusu_combo + "', '" + bulanlaktasi_tf + "', '" + cuaca_combo + "', '" + kualitas_tf + "');";
            kon.execute(query);
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }
}
