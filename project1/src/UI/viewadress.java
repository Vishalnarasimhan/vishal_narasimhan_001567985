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
public class viewadress extends javax.swing.JPanel {

    /**
     * Creates new form viewadress
     */
    lab1 product;
    public viewadress(lab1 product) {
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

        header = new javax.swing.JLabel();
        streetaddress = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        state = new javax.swing.JLabel();
        zipcode = new javax.swing.JLabel();
        Tstreetaddress = new javax.swing.JLabel();
        Tcity = new javax.swing.JLabel();
        Tstate = new javax.swing.JLabel();
        Tzipcode = new javax.swing.JLabel();

        header.setText("Address information");

        streetaddress.setText("street address");

        city.setText("city");

        state.setText("state");

        zipcode.setText("zip code");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(header))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(city)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Tcity))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(streetaddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                .addComponent(Tstreetaddress))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zipcode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Tzipcode))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(state)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Tstate)))))
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetaddress)
                    .addComponent(Tstreetaddress))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city)
                    .addComponent(Tcity))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(state))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Tstate)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipcode)
                    .addComponent(Tzipcode))
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tcity;
    private javax.swing.JLabel Tstate;
    private javax.swing.JLabel Tstreetaddress;
    private javax.swing.JLabel Tzipcode;
    private javax.swing.JLabel city;
    private javax.swing.JLabel header;
    private javax.swing.JLabel state;
    private javax.swing.JLabel streetaddress;
    private javax.swing.JLabel zipcode;
    // End of variables declaration//GEN-END:variables

    private void displayProduct() {
        
        
       Tstreetaddress.setText(product.getStreetaddress());
       Tcity.setText(product.getCity());
       Tstate.setText(product.getState());
       Tzipcode.setText(product.getZipcode());
       
        
        
        
        }
}
