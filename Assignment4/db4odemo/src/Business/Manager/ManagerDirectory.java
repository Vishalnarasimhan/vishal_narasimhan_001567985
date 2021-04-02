/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manager;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vishak
 */
public class ManagerDirectory {
    private List<Manager> managerList = new ArrayList();
    public List<Restaurant> restaurantList = new ArrayList();
    
    public List<Manager> getManagerList(){
        return this.managerList;
    }
    
    public Manager createManager(int id){
        Manager temp = new Manager(id);
        managerList.add(temp);
        return temp;
    }
    public void updateManager(String firstName, String lastName, int id, int restaurantID){
        Manager temp=new Manager(id);
        for(Manager m:this.getManagerList()){//EcoSystem.getInstance().getManagerDirectory().getManagerList()){//   this.getManagerList()){
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
    
    public void removeManager(Manager d){
        managerList.remove(d);
    }
    
    public void removeManagerById(int id){
        for(Manager m : this.managerList){
            if(m.getId()==id){
                this.managerList.remove(m);
                return;
            }
        }
    }
}
