package Business;

import Business.Admin.Admin;
import Business.Admin.AdminDirectory;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Manager.Manager;
import Business.Manager.ManagerDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.User;
import static Business.UserAccount.User.Role.Customer;
import Business.UserAccount.UserAccount;
import Business.pojo.Item;
import Business.pojo.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        system.setAdminDirectory(new AdminDirectory());
        system.setManagerDirectory(new ManagerDirectory());
        system.setCustomerDirectory(new CustomerDirectory());
        system.setRestaurantDirectory(new RestaurantDirectory());
        system.setDeliveryManDirectory(new DeliveryManDirectory());
        
        Restaurant re1 = system.getRestaurantDirectory().createRestaurant("Qdoba Mexican Grill");     
        Restaurant re2 = system.getRestaurantDirectory().createRestaurant("Fenny's Mexican Home");
        
        system.getUserAccountDirectory().createUserAccount("a", "A1","a", "a",User.Role.Admin);
        UserAccount m1 = system.getUserAccountDirectory().createUserAccount("John_Manager","M1","john","manager",User.Role.Manager);
        ((Manager)(m1.getUser())).setRestaurant(re1);
        UserAccount m2 = system.getUserAccountDirectory().createUserAccount("Zayn_Manager2","M2","zayn","manager",User.Role.Manager);
        ((Manager)(m2.getUser())).setRestaurant(re2);
        UserAccount d1 = system.getUserAccountDirectory().createUserAccount("Mack_DeliveryPerson", "Mack", "Mack", "delivery", User.Role.DeliveryMan);
        ((DeliveryMan)(d1.getUser())).setRestaurant(re1);
        UserAccount d2 = system.getUserAccountDirectory().createUserAccount("Sam_DeliveryPerson", "Sam", "Sam", "delivery", User.Role.DeliveryMan);
        ((DeliveryMan)(d2.getUser())).setRestaurant(re1);
        UserAccount d3 = system.getUserAccountDirectory().createUserAccount("David_DeliveryPerson", "D3", "David", "delivery", User.Role.DeliveryMan);
        ((DeliveryMan)(d3.getUser())).setRestaurant(re2);
        UserAccount c1 = system.getUserAccountDirectory().createUserAccount("Winson", "Winson", "Winson", "customer", User.Role.Customer);
        ((Customer)(c1.getUser())).setAddress("75 St Alphonsus Street.");
        UserAccount c2 = system.getUserAccountDirectory().createUserAccount("Peter", "Peter", "Peter", "customer", User.Role.Customer);
        ((Customer)(c2.getUser())).setAddress("113 Peter Street near Park Drive.");
        
        Item i1 = new Item("Margaritas", 4.99f,re1);
        Item i2 = new Item("Chicken Enchiladas", 2.99f,re1);
        Item i3 = new Item("Churros", 9.99f,re1);
        Item i4 = new Item("Pasta", 1.99f,re2);
        Item i5 = new Item("Chicken Tamales", 2.99f,re2);
        Item i6 = new Item("Corn with Chipotle", 6.99f,re2);
        
        re1.addMenuItem(i1);
        re1.addMenuItem(i2);
        re1.addMenuItem(i3);
        re2.addMenuItem(i4);
        re2.addMenuItem(i5);
        re2.addMenuItem(i6);
        
        List<Item> order = new ArrayList();
        order.add(i1);
        order.add(i3);
        List<Item> order2 = new ArrayList();
        order2.add(i4);
        order2.add(i5);
        Order orderObject1 = new Order((Customer)c1.getUser(),order,"spicy",re1);
        Order orderObject2 = new Order((Customer)c1.getUser(),order2,"sweet",re2);
        re1.getOrders().add(orderObject1);
        ((Customer)c1.getUser()).addOrder(orderObject1);
        re2.getOrders().add(orderObject2);
        ((Customer)c1.getUser()).addOrder(orderObject2);
        
        return system;
    }
    
}
