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
public class medicalview extends javax.swing.JPanel {

    /**
     * Creates new form medicalview
     */
    lab1 product;
    public medicalview(lab1 product) {
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

        Vmedicalheader = new javax.swing.JLabel();
        Vmedicalrecordnumber = new javax.swing.JLabel();
        Valergy1 = new javax.swing.JLabel();
        Valergy2 = new javax.swing.JLabel();
        VAlergy3 = new javax.swing.JLabel();
        TVmedicalrecordnumber = new javax.swing.JLabel();
        TVAlergy1 = new javax.swing.JLabel();
        TVAlergy2 = new javax.swing.JLabel();
        TVAlergy3 = new javax.swing.JLabel();

        Vmedicalheader.setText("Medical Record");

        Vmedicalrecordnumber.setText("Medical record number");

        Valergy1.setText("Alergy1");

        Valergy2.setText("Alergy2");

        VAlergy3.setText("Alergy3");

        TVmedicalrecordnumber.setText("jLabel6");

        TVAlergy1.setText("jLabel7");

        TVAlergy2.setText("jLabel8");

        TVAlergy3.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(Vmedicalheader))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Valergy1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TVAlergy1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Vmedicalrecordnumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                .addComponent(TVmedicalrecordnumber))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(VAlergy3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TVAlergy3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Valergy2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TVAlergy2)))))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Vmedicalheader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vmedicalrecordnumber)
                    .addComponent(TVmedicalrecordnumber))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Valergy1)
                    .addComponent(TVAlergy1))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Valergy2)
                    .addComponent(TVAlergy2))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VAlergy3)
                    .addComponent(TVAlergy3))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TVAlergy1;
    private javax.swing.JLabel TVAlergy2;
    private javax.swing.JLabel TVAlergy3;
    private javax.swing.JLabel TVmedicalrecordnumber;
    private javax.swing.JLabel VAlergy3;
    private javax.swing.JLabel Valergy1;
    private javax.swing.JLabel Valergy2;
    private javax.swing.JLabel Vmedicalheader;
    private javax.swing.JLabel Vmedicalrecordnumber;
    // End of variables declaration//GEN-END:variables

    private void displayProduct() {
        
    
        TVmedicalrecordnumber.setText(product.getMedicalnumber());
        TVAlergy1.setText(product.getAlergy1());
        TVAlergy2.setText(product.getAlergy2());
        TVAlergy3.setText(product.getAlergy3());
        
    
    }
}
