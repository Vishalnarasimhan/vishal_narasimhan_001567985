/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.User;

/**
 *
 * @author visha
 */
public class Update_DeliveryMenJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryMenJPanel
     */
    public Update_DeliveryMenJPanel() {
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
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delivery Men");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 418, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Delivery Man ID");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Delivery Man First Name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 96, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Delivery Man Last Name");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 136, -1, -1));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, -1));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 120, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 120, -1));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Restaurant ID");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 120, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 120, -1));
        add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //EcoSystem.getInstance().getRestaurantDirectory().updateRestaurant(jTextField1.getText(),jTextField2.getText())  ;//createRestaurant(jTextField1.getText());
        Restaurant r = EcoSystem.getInstance().getRestaurantDirectory().getRestaurantById(Integer.parseInt(jTextField7.getText()));
        if(r==null) return;//fn ln un pass role
        
        //UserAccount(String firstName, String lastName, String username, String password, Role role)
        EcoSystem.getInstance().getDeliveryManDirectory().updateDeliveryMan(jTextField5.getText(), jTextField6.getText(), Integer.parseInt(jTextField4.getText()), Integer.parseInt(jTextField7.getText()));//,User.Role.Manager);
        EcoSystem.getInstance().getUserAccountDirectory().updateUserAccount(Integer.parseInt((jTextField4.getText())),jTextField5.getText(),jTextField6.getText(), jTextField8.getText(),jTextField9.getText(), User.Role.DeliveryMan);//, TOOL_TIP_TEXT_KEY, TOOL_TIP_TEXT_KEY, User.Role.Admin);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed

    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
