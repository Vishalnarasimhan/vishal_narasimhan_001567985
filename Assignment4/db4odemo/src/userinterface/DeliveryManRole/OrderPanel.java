/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

//import Business.WorkQueue.LabTestWorkRequest;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Restaurant;
import Business.pojo.Order;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author visha
 */


public class OrderPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    //LabTestWorkRequest request;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    //public ProcessWorkRequestJPanel(JPanel userProcessContainer, LabTestWorkRequest request) {
    //    initComponents();
    //    this.userProcessContainer = userProcessContainer;
    //    this.request = request;
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    DeliveryMan deliveryMan;
    private Restaurant restaurant;
    
    public OrderPanel(DeliveryMan d){
        initComponents();
        this.restaurant = d.getRestaurant();
        this.deliveryMan = d;
        refreshOrders();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FullDetailsButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 153));
        setMinimumSize(new java.awt.Dimension(394, 281));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FullDetailsButton.setText("Full Order Details");
        FullDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullDetailsButtonActionPerformed(evt);
            }
        });
        add(FullDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("My Orders");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 69, -1));

        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 68, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Deliver Order ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Activate Order ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jButton1.setText("Deliver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jButton2.setText("Activate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Customer Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 44, 350, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshOrders(){
        List<Order> orders = restaurant.getOrders();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        model.setRowCount(0);
        for(Order o :orders){
            if(o.getDeliveryMan() !=null && o.getDeliveryMan().equals(this.deliveryMan))
                model.addRow(new Object[]{o.getId(), o.getCustomer().getLastName(),o.getStatus()});
            else continue;
            if(o.getStatus()==Order.Status.Active)jComboBox1.addItem(o);
            if(o.getStatus()==Order.Status.Assigned)jComboBox2.addItem(o);
        }
    }
    
    private void FullDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullDetailsButtonActionPerformed
        Order temp=null;
        for(Order o : restaurant.getOrders()){
            int column = 0;
            int row = jTable1.getSelectedRow();
            int selectedId = (Integer)jTable1.getModel().getValueAt(row, column);
            if(o.getId()==selectedId){
                temp = o;
                break;
            }
        }
        if (temp==null)return;
        OrderDetailsPopup popup = new OrderDetailsPopup(temp);
        popup.setBounds(500, 500, 347, 440);
        JOptionPane jop = new JOptionPane();
        JDialog dialog = jop.createDialog("Order Details");
        dialog.setSize(347, 440);
        dialog.setContentPane(popup);
        dialog.setVisible(true);

    }//GEN-LAST:event_FullDetailsButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Order o = (Order) jComboBox1.getSelectedItem();
        o.setStatus(Order.Status.Completed);
        o.setTimeCompleted(new SimpleDateFormat("MM/dd HH:mm:ss").format(new Date()));
        deliveryMan.setAvailable(true);
        refreshOrders();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Order o = (Order) jComboBox2.getSelectedItem();
        o.setStatus(Order.Status.Active);
        deliveryMan.setAvailable(false);
        refreshOrders();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FullDetailsButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Order> jComboBox1;
    private javax.swing.JComboBox<Order> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
