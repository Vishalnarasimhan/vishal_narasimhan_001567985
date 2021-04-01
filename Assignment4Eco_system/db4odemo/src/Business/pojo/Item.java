/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.pojo;

import Business.Restaurant.Restaurant;

/**
 *
 * @author visha
 */
public class Item {
    
    static private int ctr=0;
    
    private int id;
    private String name;
    private float price;
    private Restaurant restaurant;
    
    public Item(String name, float price, Restaurant restaurant){
        this.id = ++ctr;
        this.name = name;
        this.price = price;
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public int getId() {
        return id;
    }

    public static int getCtr() {
        return ctr;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return ""+this.getName();
    }
    
}
