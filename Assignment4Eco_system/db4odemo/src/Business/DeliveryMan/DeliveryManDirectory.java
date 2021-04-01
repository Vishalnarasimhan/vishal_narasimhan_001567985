/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Manager.Manager;
import Business.Restaurant.Restaurant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private List<DeliveryMan> deliveryManList = new ArrayList();
    
    public List<DeliveryMan> getDeliveryManList(){
        return this.deliveryManList;
    }
    
    public DeliveryMan createDeliveryMan(int id){//, int restaurantId){
        DeliveryMan temp = new DeliveryMan(id);//, restaurantId);
        deliveryManList.add(temp);
        return temp;
    }
    public void updateDeliveryMan(String firstName, String lastName, int id, int restaurantID){
        DeliveryMan temp=new DeliveryMan(id);
        for(DeliveryMan m:this.getDeliveryManList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
            if(m.getId()==id){
                for(Restaurant r:EcoSystem.getInstance().getRestaurantDirectory().getRestaurantList()){//.getRestaurantById(Integer.parseInt(jTextField4.getText()));){
                    if(r.getId()==restaurantID){                        
                        m.setRestaurantByID(restaurantID);
                        m.setFirstName(firstName);
                        m.setLastName(lastName);
                        break;
                    }
                }                   
            }
        }
    } 
    public void removeDeliveryMan(DeliveryMan d){
        deliveryManList.remove(d);
    }
    public void removeDeliveryManById(int id){
        for(DeliveryMan m : this.getDeliveryManList()){
            if(m.getId()==id){
                this.getDeliveryManList().remove(m);
                return;
            }
        }
    }
}
