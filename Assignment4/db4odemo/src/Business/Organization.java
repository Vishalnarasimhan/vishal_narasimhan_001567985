/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author visha
 */
public abstract class Organization {

    private String name;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;

    public Organization(String name) {
        this.name = name;
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        this.name = "Organization"+counter;
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
