/* * @author visha

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

/**
 *
 */
public abstract class User {
    String firstName;
    String lastName;
    private int id;
    
    public User(int id){
        this.id = id;
    }
    public User(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public int getId() {
        return id;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setId(int id) {
        this.id = id;
    }
        
    public enum Role{
        Manager("Manager"),
        Customer("Customer"),
        DeliveryMan("DeliveryMan"),
        Admin("Admin");
        
        private String value;
        private Role(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
}
