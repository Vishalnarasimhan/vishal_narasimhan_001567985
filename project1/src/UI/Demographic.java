/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;
import model.lab1;

/**
 *
 * @author visha
 */
public class Demographic extends javax.swing.JPanel {

    /**
     * Creates new form Demographic
     */
    lab1 product;
    public Demographic(lab1 product) {
        initComponents();
        
        this.product = product;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        demographicHeader = new javax.swing.JLabel();
        CFirstname = new javax.swing.JLabel();
        Clastname = new javax.swing.JLabel();
        TCFirstname = new javax.swing.JTextField();
        Cphonenumber = new javax.swing.JLabel();
        CDob = new javax.swing.JLabel();
        CAge = new javax.swing.JLabel();
        CHeight = new javax.swing.JLabel();
        CWeight = new javax.swing.JLabel();
        CSSN = new javax.swing.JLabel();
        TClastname = new javax.swing.JTextField();
        TCphonenumber = new javax.swing.JTextField();
        TCDOB = new javax.swing.JTextField();
        TCage = new javax.swing.JTextField();
        TCheight = new javax.swing.JTextField();
        TCweight = new javax.swing.JTextField();
        TCSSN = new javax.swing.JTextField();
        demosave = new javax.swing.JButton();

        demographicHeader.setText("Demographic info");

        CFirstname.setText("First Name");

        Clastname.setText(" Last Name");

        TCFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCFirstnameActionPerformed(evt);
            }
        });

        Cphonenumber.setText(" Phone Number");

        CDob.setText("DOB");

        CAge.setText("Age");

        CHeight.setText("Height");

        CWeight.setText("Weight");

        CSSN.setText("SSN");

        demosave.setText("Save");
        demosave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demosaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TCFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CSSN)
                                    .addComponent(CWeight)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Clastname, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cphonenumber)
                                    .addComponent(CFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CAge)
                                        .addComponent(CDob))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(CHeight)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TClastname)
                            .addComponent(TCphonenumber)
                            .addComponent(TCDOB)
                            .addComponent(TCage)
                            .addComponent(TCheight)
                            .addComponent(TCweight)
                            .addComponent(TCSSN, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(demographicHeader))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(demosave)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(demographicHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clastname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TClastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cphonenumber)
                    .addComponent(TCphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CDob))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CAge))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHeight)
                    .addComponent(TCheight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CWeight)
                    .addComponent(TCweight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CSSN)
                    .addComponent(TCSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(demosave)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TCFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCFirstnameActionPerformed

    private void demosaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demosaveActionPerformed
        // TODO add your handling code here:
        product.setFristname(TCFirstname.getText());
        product.setLastname(TClastname.getText());
        product.setPhone(TCphonenumber.getText());
        product.setDOB(TCDOB.getText());
        product.setAge(TCage.getText());
        product.setHeight(TCheight.getText());
        product.setWeight(TCweight.getText());
        product.setSSN(TCSSN.getText());
        
        JOptionPane.showMessageDialog(this,"Saved!!");
        
        
      
    }//GEN-LAST:event_demosaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CAge;
    private javax.swing.JLabel CDob;
    private javax.swing.JLabel CFirstname;
    private javax.swing.JLabel CHeight;
    private javax.swing.JLabel CSSN;
    private javax.swing.JLabel CWeight;
    private javax.swing.JLabel Clastname;
    private javax.swing.JLabel Cphonenumber;
    private javax.swing.JTextField TCDOB;
    private javax.swing.JTextField TCFirstname;
    private javax.swing.JTextField TCSSN;
    private javax.swing.JTextField TCage;
    private javax.swing.JTextField TCheight;
    private javax.swing.JTextField TClastname;
    private javax.swing.JTextField TCphonenumber;
    private javax.swing.JTextField TCweight;
    private javax.swing.JLabel demographicHeader;
    private javax.swing.JButton demosave;
    // End of variables declaration//GEN-END:variables
}
