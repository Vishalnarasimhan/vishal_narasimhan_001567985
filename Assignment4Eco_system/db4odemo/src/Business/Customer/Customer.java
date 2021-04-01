/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.User;
import Business.pojo.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Customer extends User{
    
    private String address;
    private List<Order> orders;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        this.orders = new ArrayList();
    }
    public Customer(int id){
        super(id);
    }
    
    public void addOrder(Order o){
        this.orders.add(o);
    }
    
    public List<Order> getOrders(){
        return this.orders;
    }
}