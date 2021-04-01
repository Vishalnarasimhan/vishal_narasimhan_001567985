/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Manager.Manager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private List<Restaurant> restaurantList = new ArrayList();
    
    public List<Restaurant> getRestaurantList(){
        return this.restaurantList;
    }
    
    public Restaurant createRestaurant(String name){
        Restaurant temp = new Restaurant(name);
        restaurantList.add(temp);
        return temp;
    }
    public Restaurant updateRestaurant(String name, String id){
        Restaurant temp=new Restaurant(name);
        for(Restaurant r:this.restaurantList){
            if(r.getId()==Integer.parseInt(id)){
                r.setName(name);//=rest;
                //temp=r;
                temp=r;
            }
        }
        return temp;
    }
    public void removeRestaurant(Restaurant rest){
        restaurantList.remove(rest);
    }
    
    public Restaurant getRestaurantById(int id){
        for(Restaurant r : this.restaurantList){
            if(r.getId()==id) return r;
        }
        return null;
    }
    
    public void removeRestaurantById(int id){
        for(Restaurant r : this.restaurantList){
            if(r.getId()==id){
                this.restaurantList.remove(r);
                return;
            }
        }
    }
}
