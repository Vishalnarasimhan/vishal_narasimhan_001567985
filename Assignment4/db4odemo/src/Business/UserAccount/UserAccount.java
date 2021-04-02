/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.EcoSystem;
import Business.UserAccount.User.Role;

/**
 *
 * @author visha
 */
public class UserAccount {
    
    private int accountId;
    private String username;
    private String password;
    private User user;
    private Role role;
    private static int counter=0;

    //String firstName, String lastName, String username, String password, int restaurantId, Role role
    public UserAccount(String firstName, String lastName, String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
        accountId = ++counter;
        
        if(role==Role.Admin)this.user = EcoSystem.getInstance().getAdminDirectory().createAdmin(accountId);
        if(role==Role.Customer)this.user = EcoSystem.getInstance().getCustomerDirectory().createCustomer(accountId);
        if(role==Role.DeliveryMan)this.user = EcoSystem.getInstance().getDeliveryManDirectory().createDeliveryMan(accountId);
        if(role==Role.Manager)this.user = EcoSystem.getInstance().getManagerDirectory().createManager(accountId);
        this.user.setFirstName(firstName);
        this.user.setLastName(lastName);
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
  
    @Override
    public String toString() {
        return username;
    }
    
    
    
}