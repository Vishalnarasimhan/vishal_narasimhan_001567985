/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.pojo;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Restaurant;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

/**
 *
 * @author visha
 */
public class Order {
    
    static int ctr = 0;
    
    private int id;

    public int getId() {
        return id;
    }
    private DeliveryMan deliveryMan;
    private Status status;
    private String comment;
    private String timePlaced;
    private String timeCompleted;
    private Customer customer;
    private Restaurant restaurant;

    public Customer getCustomer() {
        return customer;
    }
    private List<Item> items;
    
    public Order(List<Item> items){
        this.id = ++ctr;
        this.items = items;
        this.timePlaced = new SimpleDateFormat("MM/dd HH:mm:ss").format(new Date());
        this.status = Status.Pending;
    }
    
    public Order(Customer customer,List<Item> items, String comment,Restaurant r){
        this(items);
        this.restaurant = r;
        this.comment = comment;
        this.customer = customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    
    public void addItem(Item i){
        this.items.add(i);
    }
    
    public void removeItem(Item i){
        this.items.remove(i);
    }
    
    public int getid(){
        return this.id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getTimePlaced() {
        return timePlaced;
    }

    public void setTimePlaced(String timePlaced) {
        this.timePlaced = timePlaced;
    }

    public String getTimeCompleted() {
        return timeCompleted;
    }

    public void setTimeCompleted(String timeCompleted) {
        this.timeCompleted = timeCompleted;
    }
    
    public enum Status{
        Pending("Pending"),
        Assigned("Assigned"),
        Active("Active"),
        Rejected("Rejected"),
        Completed("Completed");
        
        private String value;
        private Status(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    @Override
    public String toString(){
        return ""+this.getId();
    }
    
}
