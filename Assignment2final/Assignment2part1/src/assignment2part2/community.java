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
public class community {
    public String communityN;
    
    public ArrayList<House> communityH;
    public community(){
        this.communityH = new ArrayList<House>();
    }
    public void addHouse(House H){
        this.communityH.add(H);
    }

    public String getCommunityN() {
        return communityN;
    }

    public void setCommunityN(String communityN) {
        this.communityN = communityN;
    }

    public ArrayList<House> getCommunityH() {
        return communityH;
    }

    public void setCommunityH(ArrayList<House> communityH) {
        this.communityH = communityH;
    }
    
}
