/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import model.lab1;

/**
 *
 * @author visha
 */
public class demographicview extends javax.swing.JPanel {

    /**
     * Creates new form demographicview
     */
    lab1 product;
    public demographicview(lab1 product) {
        initComponents();
        
        this.product = product;
        displayProduct();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VDHeader = new javax.swing.JLabel();
        VDfirstname = new javax.swing.JLabel();
        VDlastname = new javax.swing.JLabel();
        VDPhonenumber = new javax.swing.JLabel();
        VDDOB = new javax.swing.JLabel();
        VDage = new javax.swing.JLabel();
        VDheight = new javax.swing.JLabel();
        VDweight = new javax.swing.JLabel();
        TVDfirstname = new javax.swing.JLabel();
        TVDlastname = new javax.swing.JLabel();
        TVDphonenumber = new javax.swing.JLabel();
        TVDDOB = new javax.swing.JLabel();
        TVDage = new javax.swing.JLabel();
        TVDHeight = new javax.swing.JLabel();
        TVDWeight = new javax.swing.JLabel();
        VDssn = new javax.swing.JLabel();
        TVDssn = new javax.swing.JLabel();

        VDHeader.setText("Demographic info");

        VDfirstname.setText("First Name");

        VDlastname.setText("Last Name");

        VDPhonenumber.setText("Phone Number");

        VDDOB.setText("DOB");

        VDage.setText("Age");

        VDheight.setText("Height");

        VDweight.setText("Weight");

        VDssn.setText("SSN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VDfirstname)
                            .addComponent(VDlastname)
                            .addComponent(VDPhonenumber)
                            .addComponent(VDDOB)
                            .addComponent(VDage)
                            .addComponent(VDheight)
                            .addComponent(VDweight)
                            .addComponent(VDssn))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TVDssn)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TVDHeight)
                                                .addComponent(TVDage)
                                                .addComponent(TVDWeight)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(TVDfirstname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TVDlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(TVDphonenumber)
                                        .addGap(62, 62, 62))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TVDDOB)))
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(VDHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(VDHeader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TVDfirstname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VDfirstname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VDlastname)
                    .addComponent(TVDlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VDPhonenumber)
                    .addComponent(TVDphonenumber))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VDDOB)
                    .addComponent(TVDDOB))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VDage)
                    .addComponent(TVDage))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VDheight)
                    .addComponent(TVDHeight))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VDweight)
                    .addComponent(TVDWeight))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VDssn)
                    .addComponent(TVDssn))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TVDDOB;
    private javax.swing.JLabel TVDHeight;
    private javax.swing.JLabel TVDWeight;
    private javax.swing.JLabel TVDage;
    private javax.swing.JLabel TVDfirstname;
    private javax.swing.JLabel TVDlastname;
    private javax.swing.JLabel TVDphonenumber;
    private javax.swing.JLabel TVDssn;
    private javax.swing.JLabel VDDOB;
    private javax.swing.JLabel VDHeader;
    private javax.swing.JLabel VDPhonenumber;
    private javax.swing.JLabel VDage;
    private javax.swing.JLabel VDfirstname;
    private javax.swing.JLabel VDheight;
    private javax.swing.JLabel VDlastname;
    private javax.swing.JLabel VDssn;
    private javax.swing.JLabel VDweight;
    // End of variables declaration//GEN-END:variables

    private void displayProduct() {
        
        TVDfirstname.setText(product.getFristname());
        TVDlastname.setText(product.getLastname());
        TVDphonenumber.setText(product.getPhone());
        TVDDOB.setText(product.getDOB());
        TVDage.setText(product.getAge());
        TVDHeight.setText(product.getHeight());
        TVDWeight.setText(product.getWeight());
        TVDssn.setText(product.getSSN());
        
    
   
    
    }
}