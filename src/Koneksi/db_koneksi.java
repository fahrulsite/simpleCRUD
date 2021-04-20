/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;



import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author fahrul
 */
public class db_koneksi {
    private static Connection conn;
    public static Connection getKoneksi(){
        String host = "jdbc:mysql://localhost/Karyawan", 
                user = "root",
                pass = "Fahrul2016";
        try {
            conn = (Connection) DriverManager.getConnection(host, user,  pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "errorr");
        }
        return conn;
    }
}
