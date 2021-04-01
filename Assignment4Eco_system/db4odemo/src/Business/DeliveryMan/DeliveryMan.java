/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.User;

/**
 *
 * @author harold
 */
public class DeliveryMan extends User{
    private Restaurant restaurant;
    private boolean available = true;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public DeliveryMan(int id){//, int restaurantId){
        super(id);
//        this.restaurantID=restaurantId;
    }
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
    
    @Override
    public String toString(){
        return this.getLastName();
    }
}
