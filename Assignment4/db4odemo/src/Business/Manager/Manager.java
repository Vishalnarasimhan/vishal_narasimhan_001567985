/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manager;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.User;

/**
 *
 * @author visha
 */
public class Manager extends User{
    
    private Restaurant restaurant;

   // public Manager(){
        
   // }
    public Restaurant getRestaurant() {
        return restaurant;
    }
    public void setRestaurantByID(int id){
        this.restaurant=EcoSystem.getInstance().getRestaurantDirectory().getRestaurantById(id);
    }
    public int getRestaurantByID(int id){
        return EcoSystem.getInstance().getRestaurantDirectory().getRestaurantById(id).getId();
    }
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    public Manager(int id){
        super(id);
    }
}
///