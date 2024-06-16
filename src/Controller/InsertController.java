/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class InsertController {
    
    public static void InsertRecepDetails(String RName, String RNIC, String Contact, String RUser, String RPassword, String RConfirm){
        if(RName.length()==0 || RNIC.length()==0 || Contact.length()==0 || RUser.length()==0 || RPassword.length()==0 || RConfirm.length()==0 ){
            JOptionPane.showMessageDialog(null, "Fill all details", "Message",JOptionPane.INFORMATION_MESSAGE);
        }
        if(RPassword.equals(RConfirm)){
            int Tele = Integer.parseInt(Contact);
            new Model.AddRecord().AddRecepDetails(RName, RNIC, Tele , RUser, RPassword,RConfirm);
            JOptionPane.showMessageDialog(null, "Details has been inserted", "Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null, "Passwords don't match", "Message",JOptionPane.INFORMATION_MESSAGE);
    
    }
    
 
    
    public static void InsertDoctorDetails(String DName,String DNIC,String DReg,String DEligibility,String special,String DContact,String DUser,String DPassword,String DConfirm){
        
        if(DName.length()==0 || DNIC.length()==0 || DReg.length()==0 || DEligibility.length()==0 || special.length()==0 || DContact.length()==0 || DUser.length()==0 || DPassword.length()==0 || DConfirm.length()==0){
            JOptionPane.showMessageDialog(null, "Fill all details", "Message",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(DPassword.equals(DConfirm)){
            int Tele = Integer.parseInt(DContact);
            new Model.AddRecord().AddDoctorDetails(DName,DNIC,DReg,DEligibility,special,Tele,DUser,DConfirm);
            JOptionPane.showMessageDialog(null, "Details has been inserted", "Successful",JOptionPane.INFORMATION_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null, "Passwords don't match", "Message",JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    /**
     *
     * @param FNameTF
     * @param LNameTF
     * @param NICTF
     * @param DOBTf
     * @param ReGe
     * @param AddressTF
     * @param ContactTF
     * @param PaBl
     */
    public static void InsertPatient(String FNameTF, String LNameTF, String NICTF, String DOBTf,String ReGe, String AddressTF, String ContactTF, String PaBl){
        if(FNameTF.length()==0 || LNameTF.length()==0 || NICTF.length()==0 || DOBTf.length()==0 || ReGe.length()==0 ||   AddressTF.length()==0 || ContactTF.length()==0 || PaBl.length()==0 ){
            JOptionPane.showMessageDialog(null, "Fill all details", "Message",JOptionPane.INFORMATION_MESSAGE);
        }
        int Tele = Integer.parseInt(ContactTF);
        int BDate = Integer.parseInt(DOBTf);
        new Model.AddRecord().AddPatient( FNameTF, LNameTF,  NICTF,  BDate, ReGe , AddressTF,Tele, PaBl);
        JOptionPane.showMessageDialog(null, "Details has been inserted", "Successful",JOptionPane.INFORMATION_MESSAGE);

    }
    
    
    public static void InsertChannelling(String Name, String NIC, String clinic, String Date, String Time, String Amount){
        if(Name.length()==0 || NIC.length()==0 || clinic.length()==0 || Date.length()==0 || Time.length()==0 || Amount.length()==0 ){
            JOptionPane.showMessageDialog(null, "Fill all details", "Message",JOptionPane.INFORMATION_MESSAGE);
        }
        new Model.AddRecord().AddChannelling( Name, NIC, clinic, Date, Time, Amount);
        JOptionPane.showMessageDialog(null, "Details has been inserted", "Successful",JOptionPane.INFORMATION_MESSAGE);
    
    }


    
    public static void InsertPharmacy(String Name, String NIC, String clinic, String Date, String Time, String Amount){
        if(Name.length()==0 || NIC.length()==0 || clinic.length()==0 || Date.length()==0 || Time.length()==0 || Amount.length()==0 ){
            JOptionPane.showMessageDialog(null, "Fill all details", "Message",JOptionPane.INFORMATION_MESSAGE);
        }
        new Model.AddRecord().AddChannelling( Name, NIC, clinic, Date, Time, Amount);
        JOptionPane.showMessageDialog(null, "Details has been inserted", "Successful",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void InsertPharmacyDetails(String name, String nic, String phregno, String contactNum, String username, String password, String password2) {
        if(name.equals("") || nic.equals("") || phregno.equals("") || contactNum.equals("") || username.equals("") || password.equals("") || password2.equals("")){
            JOptionPane.showMessageDialog(null, "Fill all details", "Message",JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(password.equals(password2)){
                int phregnoInt = Integer.parseInt(phregno);
                int contactNumInt = Integer.parseInt(contactNum);
                new Model.AddRecord().InsertPharmacyDetails(name, nic, phregnoInt, contactNumInt, username, password, password2);
                JOptionPane.showMessageDialog(null, "Details has been inserted", "Successful",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Passwords doesn't match", "Message",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
    
        



    

 

    
    

 
