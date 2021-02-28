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
public class Encounterhistory {
    
        public ArrayList<Encounter> Ehistory;
        public Encounterhistory(){
            this.Ehistory = new ArrayList<Encounter>();
            
        }

    public ArrayList<Encounter> getEhistory() {
        return Ehistory;
    }

    public void setEhistory(ArrayList<Encounter> Ehistory) {
        this.Ehistory = Ehistory;
    }
    public void addEncounter (Encounter E){
        this.Ehistory.add(E);
    }
       public int Getsize(){
           return this.Ehistory.size();
       }
}