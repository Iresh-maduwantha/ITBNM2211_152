/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.InsertController;

/**
 *
 * @author Iresh
 */
public class AddPharmacy extends javax.swing.JFrame {

    /**
     * Creates new form AddPharmacy
     */
    public AddPharmacy() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PhNa = new javax.swing.JTextField();
        PhNi = new javax.swing.JTextField();
        PhReg = new javax.swing.JTextField();
        PhCo = new javax.swing.JTextField();
        PhUs = new javax.swing.JTextField();
        PhPa = new javax.swing.JPasswordField();
        PhPass = new javax.swing.JPasswordField();
        PhRe = new javax.swing.JButton();
        PhClear = new javax.swing.JButton();
        PhBa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pharmacient Datails");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 24, 258, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 101, 66, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NIC :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 141, 64, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Reg  No :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 179, -1, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("User Name :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 276, 108, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Password :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 328, 82, 32));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Confirm :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 371, 71, 21));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Contect Number :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 222, -1, -1));

        PhNa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhNaActionPerformed(evt);
            }
        });
        getContentPane().add(PhNa, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 103, 124, 27));
        getContentPane().add(PhNi, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 141, 124, -1));

        PhReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhRegActionPerformed(evt);
            }
        });
        getContentPane().add(PhReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 179, 124, -1));

        PhCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhCoActionPerformed(evt);
            }
        });
        getContentPane().add(PhCo, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 222, 124, -1));
        getContentPane().add(PhUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 280, 112, -1));

        PhPa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PhPa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhPaActionPerformed(evt);
            }
        });
        getContentPane().add(PhPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 328, 128, -1));

        PhPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PhPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhPassActionPerformed(evt);
            }
        });
        getContentPane().add(PhPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 375, 128, -1));

        PhRe.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PhRe.setText("Register");
        PhRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhReActionPerformed(evt);
            }
        });
        getContentPane().add(PhRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 444, -1, -1));

        PhClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PhClear.setText("Clear");
        PhClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhClearActionPerformed(evt);
            }
        });
        getContentPane().add(PhClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 444, -1, -1));

        PhBa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PhBa.setText("Back");
        PhBa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhBaActionPerformed(evt);
            }
        });
        getContentPane().add(PhBa, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 444, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Home01.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PhCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhCoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhCoActionPerformed

    private void PhNaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhNaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhNaActionPerformed

    private void PhRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhRegActionPerformed

    private void PhPaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhPaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhPaActionPerformed

    private void PhClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhClearActionPerformed
        // TODO add your handling code here
        clearField();
    }//GEN-LAST:event_PhClearActionPerformed

    private void PhBaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhBaActionPerformed
        // TODO add your handling code here:
         PharmacyLogin back = new PharmacyLogin();
        back.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_PhBaActionPerformed

    private void PhReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhReActionPerformed
        // TODO add your handling code here:
        InsertController.InsertPharmacyDetails(PhNa.getText(),PhNi.getText(),PhReg.getText(),PhCo.getText(),PhUs.getText(),PhPa.getText(),PhPass.getText());
        
     
        
    }//GEN-LAST:event_PhReActionPerformed

    private void PhPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhPassActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_PhPassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPharmacy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PhBa;
    private javax.swing.JButton PhClear;
    private javax.swing.JTextField PhCo;
    private javax.swing.JTextField PhNa;
    private javax.swing.JTextField PhNi;
    private javax.swing.JPasswordField PhPa;
    private javax.swing.JPasswordField PhPass;
    private javax.swing.JButton PhRe;
    private javax.swing.JTextField PhReg;
    private javax.swing.JTextField PhUs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void clearField() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
