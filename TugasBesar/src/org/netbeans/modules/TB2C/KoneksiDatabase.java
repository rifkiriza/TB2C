package org.netbeans.modules.TB2C;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDatabase {

    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
       Connection conn = null;
        
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/inventaris_kelas"; // sesuaikan dengan nama database anda
            String user = "root"; // user mysql anda
            String pass = ""; // passowrd mysql
 
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("SQLException: "+e.getMessage());
            System.out.println("SQLState: "+e.getSQLState());
            System.out.println("VendorError: "+e.getErrorCode());
        }
    
    }
}


