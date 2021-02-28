/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2part2;

import java.util.ArrayList;

/**
 *
 * @author visha
 */
public class persondirectory {
    private ArrayList<person>personD;
    
    public persondirectory(){
        this.personD = new ArrayList<person>();
    }
     public void addperson(person pp){
         this.personD.add(pp);
     }   
    
     public person getpersonid(int personid){
         person people=null;
         for(person ppeople:this.personD){
             if(people.getPersonid()==personid){
                 people = ppeople;
             }
         }
         return people;
     }

    public ArrayList<person> getPersonD() {
        return personD;
    }

    public void setPersonD(ArrayList<person> personD) {
        this.personD = personD;
    }
     
}
