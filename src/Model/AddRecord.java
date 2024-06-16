
package Model;

import java.sql.SQLException;
import java.sql.Statement;

public class AddRecord {
    
    Statement stmt;
    private String RUser;
    
    public void InsertPharmacyDetails(String name, String nic, int phregno, int contactNum, String username, String password, String password2) {
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO pharmacistdetails VALUES('"+name+"','"+nic+"','"+phregno+"','"+contactNum+"','"+username+"','"+password+"','"+password+"')");
        }
        catch(SQLException e){
        }
    }
    
    public void AddRecepDetails(String RName,String RNIC, int RContact,String UserName,String RPassword,String confirm){
        
        try{
            stmt = DBConnection.getStatementConnection();
            String RConfirm = null;
            
            stmt.executeUpdate("INSERT INTO receptiondetails VALUES('"+RName+"','"+RNIC+"','"+RContact+"','"+RUser+"','"+RPassword+"','"+RConfirm+"')");
            
        }
        catch(SQLException e){
        }
    }
    
    public void AddRecepLogin(String UName,String pw){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO receptionlogin VALUES('"+UName+"','"+pw+"')");
        }
        catch(SQLException e){
        }
    }
    public void AddDoctorDetails(String DName,String DNIC,String DReg,String Eligibility, String special, int Contact,String Username, String password){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO doctordetails VALUES('"+DName+"','"+DNIC+"','"+DReg+"','"+Eligibility+"','"+special+"','"+Contact+"', '"+Username+"', '"+password+"')");
        }
        catch(SQLException e){
        }
    }
    
    public void AddDoctorLogin(String UName,String pw){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO doctorlogin VALUES('"+UName+"','"+pw+"')");
        }
        catch(SQLException e){
        }
    }
    
    
    public void AddPatient( String FNameTF, String LNameTF, String NICTF, int DOBTf, String ReGe, String AddressTF, int ContactTF,String PaBl){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO patientdetails VALUES ( '"+FNameTF+"','"+LNameTF+"','"+NICTF+"','"+DOBTf+"','"+ReGe+"','"+AddressTF+"','"+ContactTF+"','"+PaBl+"')");
            
            
                    
        }
        catch(SQLException e){
        }
    }
    
    
    public void AddChannelling(String Name, String NIC, String clinic, String Date, String Time, String Amount){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO channelling VALUES('"+Name+"','"+NIC+"','"+clinic+"','"+Date+"','"+Time+"','"+Amount+"')");
        }
        catch(SQLException e){
        }
    }

    public void AddRecepDetails(String RName, String RNIC, int Tele, String UserName, String Pw2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Insertdoctortreatment(String name, String nic, int phregnoInt, int contactNumInt, String username, String password, String password2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Insertdoctortreatment(String nic, String DATE, String TIme, String Treatment, String Medicines) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

 


