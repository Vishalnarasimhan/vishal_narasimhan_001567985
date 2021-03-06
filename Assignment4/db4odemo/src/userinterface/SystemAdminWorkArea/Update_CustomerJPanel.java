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
public class Update_CustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerJPanel
     */
    public Update_CustomerJPanel() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        jLabel5.setText("Manager First Name");

        jLabel6.setText("Manager Last Name");

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customers");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 418, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Customer First Name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 91, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Customer Last Name");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 131, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Customer ID");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 51, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 110, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 110, -1));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 110, -1));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 110, -1));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //EcoSystem.getInstance().getRestaurantDirectory().updateRestaurant(jTextField1.getText(),jTextField2.getText())  ;//createRestaurant(jTextField1.getText());
        //Restaurant r = EcoSystem.getInstance().getRestaurantDirectory().getRestaurantById(Integer.parseInt(jTextField4.getText()));
        //if(r==null) return;//fn ln un pass role
        
        //UserAccount(String firstName, String lastName, String username, String password, Role role)
        EcoSystem.getInstance().getCustomerDirectory().updateCustomer(jTextField3.getText(), jTextField4.getText(), Integer.parseInt(jTextField2.getText()));// getDeliveryManDirectory().updateDeliveryMan(jTextField5.getText(), jTextField6.getText(), Integer.parseInt(jTextField4.getText()), Integer.parseInt(jTextField7.getText()));//,User.Role.Manager);
        EcoSystem.getInstance().getUserAccountDirectory().updateUserAccount(Integer.parseInt((jTextField2.getText())),jTextField3.getText(),jTextField4.getText(), jTextField5.getText(),jTextField6.getText(), User.Role.Customer);//, TOOL_TIP_TEXT_KEY, TOOL_TIP_TEXT_KEY, User.Role.Admin);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
