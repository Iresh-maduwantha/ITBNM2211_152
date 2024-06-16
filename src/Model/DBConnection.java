/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Agnar
 */
public class DBConnection {
    static Connection conn;
    static Statement stat=null;
    
   
    static Statement getStatementConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/hospitial?useUnicode=yes&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&sslMode={sslMode}";
            conn= DriverManager.getConnection(url, "root" , "");
            stat=conn.createStatement();
        }
        
        catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
            return stat;
    }
public static void closeCon() throws SQLException{
    conn.close();
    }

}
    
