/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacocola;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author affad
 */

public class koneksi {
//testing
    /**
     * @param args the command line arguments
     */
 
        // TODO code application logic here
        private static Connection akses;
      public static Connection akses()throws Exception{
            try{
                String url ="jdbc:mysql://localhost/warehouse";
                String user = "root";
                String pass ="";
                
                DriverManager.getConnection(url,"root","");
                akses = DriverManager.getConnection(url, user, pass);
                
            } catch (HeadlessException | SQLException e){
                System.out.println("koneksi gagal"+ e.getMessage());
        }
            return akses;
    }
    
}
