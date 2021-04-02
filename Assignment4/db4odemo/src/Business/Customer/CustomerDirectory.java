/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Admin.Admin;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Manager.Manager;
import Business.Restaurant.Restaurant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private List<Customer> customerList = new ArrayList();
    
    public List<Customer> getCustomerList(){
        return this.customerList;
    }
    
    public Customer createCustomer(int id){
        Customer temp = new Customer(id);
        customerList.add(temp);
        return temp;
    }
    public void updateCustomer(String firstName, String lastName, int id){
        Customer temp=new Customer(id);
        for(Customer m:this.getCustomerList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
            if(m.getId()==id){
                //for(Restaurant r:EcoSystem.getInstance().getRestaurantDirectory().getRestaurantList()){//.getRestaurantById(Integer.parseInt(jTextField4.getText()));){
                //    if(r.getId()==restaurantID){                        
                        //m.setRestaurantByID(restaurantID);
                        m.setFirstName(firstName);
                        m.setLastName(lastName);
                        break;
                    }
                }                   
            }
    
    public void removeCustomer(Customer u){
        customerList.remove(u);
    }
    public void removeCustomerById(int id){
        for(Customer m : this.getCustomerList()){
            if(m.getId()==id){
                this.getCustomerList().remove(m);
                return;
            }
        }
    }
}
