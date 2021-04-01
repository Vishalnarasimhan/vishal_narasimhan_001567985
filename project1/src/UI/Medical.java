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
public class Medical extends javax.swing.JPanel {

    /**
     * Creates new form Medical
     */
    lab1 product;
    public Medical(lab1 product) {
        initComponents();
        
        this.product =product;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MedicalRecordheader = new javax.swing.JLabel();
        CMMedicalrecordnumber = new javax.swing.JLabel();
        CMAlergy1 = new javax.swing.JLabel();
        CMAlergy2 = new javax.swing.JLabel();
        CMAlergy3 = new javax.swing.JLabel();
        CTMedicalrecordnumber = new javax.swing.JTextField();
        CTAlergy1 = new javax.swing.JTextField();
        CTAlergy2 = new javax.swing.JTextField();
        CTAlergy3 = new javax.swing.JTextField();
        medicalSave = new javax.swing.JButton();

        MedicalRecordheader.setText("                                    Medical Record");

        CMMedicalrecordnumber.setText("Medical record number");

        CMAlergy1.setText("Alergy1");

        CMAlergy2.setText("Alergy2");

        CMAlergy3.setText("Alergy3");

        medicalSave.setText("Save");
        medicalSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MedicalRecordheader, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CMAlergy1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CMAlergy2)
                                            .addComponent(CMAlergy3)))
                                    .addComponent(CMMedicalrecordnumber))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CTAlergy3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CTMedicalrecordnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CTAlergy1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CTAlergy2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(medicalSave)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MedicalRecordheader, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CMMedicalrecordnumber)
                    .addComponent(CTMedicalrecordnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CMAlergy1)
                    .addComponent(CTAlergy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CMAlergy2)
                    .addComponent(CTAlergy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CMAlergy3)
                    .addComponent(CTAlergy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(medicalSave)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void medicalSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalSaveActionPerformed
        // TODO add your handling code here:
        product.setMedicalnumber(CTMedicalrecordnumber.getText());
        product.setAlergy1(CTAlergy1.getText());
        product.setAlergy2(CTAlergy2.getText());
        product.setAlergy3(CTAlergy3.getText());
        
        JOptionPane.showMessageDialog(this,"Saved!!");
    }//GEN-LAST:event_medicalSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CMAlergy1;
    private javax.swing.JLabel CMAlergy2;
    private javax.swing.JLabel CMAlergy3;
    private javax.swing.JLabel CMMedicalrecordnumber;
    private javax.swing.JTextField CTAlergy1;
    private javax.swing.JTextField CTAlergy2;
    private javax.swing.JTextField CTAlergy3;
    private javax.swing.JTextField CTMedicalrecordnumber;
    private javax.swing.JLabel MedicalRecordheader;
    private javax.swing.JButton medicalSave;
    // End of variables declaration//GEN-END:variables
}