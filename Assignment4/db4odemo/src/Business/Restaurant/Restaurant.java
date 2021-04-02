/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.pojo.Item;
import Business.pojo.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Restaurant {
    private static int ctr = 0;
    private String name;
    private List<Item> menu;
    private List<Order> orders;
    private int id;

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Restaurant(String name){
        this.id = ++ctr;
        this.name = name;
        this.menu = new ArrayList();
        this.orders = new ArrayList();
    }
    
    public void addMenuItem(Item i){
        this.menu.add(i);
    }
    
    public void removeMenuItem(Item i){
        this.menu.remove(i);
    }

    public List<Order> getOrders() {
        return orders;
    }
    
    public void addOrder(Order o){
        this.orders.add(o);
    }
    
    public List<Item> getMenu(){
        return this.menu;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
    
}
