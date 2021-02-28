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
public class House {
    public int houseN;
    public ArrayList<person>houseP;

    public House(){
        this.houseP = new ArrayList<person>();
    }

    public void addperson (person P){
        this.houseP.add(P);
    }

    public int getHouseN() {
        return houseN;
    }

    public void setHouseN(int houseN) {
        this.houseN = houseN;
    }

    public ArrayList<person> getHouseP() {
        return houseP;
    }

    public void setHouseP(ArrayList<person> houseP) {
        this.houseP = houseP;
    }
    
}