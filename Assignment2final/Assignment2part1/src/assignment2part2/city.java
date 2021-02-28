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
public class city {
    public String CityC;
    public ArrayList<community>CityN;
    
     public city(){
        this.CityN = new ArrayList<community>();
    }
    
    public void addcommunity(community City){
        this.CityN.add(City);
    }

    public String getCityC() {
        return CityC;
    }

    public void setCityC(String CityC) {
        this.CityC = CityC;
    }

    public ArrayList<community> getCityN() {
        return CityN;
    }

    public void setCityN(ArrayList<community> CityN) {
        this.CityN = CityN;
    }
    
   
            
            
}
