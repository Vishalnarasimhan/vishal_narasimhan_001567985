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
public class patientdirectory {
    
    private ArrayList<patient>PatientD;
    
    public patientdirectory(){
        this.PatientD = new ArrayList<>();
    }
    public void addperson(patient pp){
        this.PatientD.add(pp);
     }
    
    public patient GetPatientfileN(int N){
        patient patientN = null;
        for(patient PP:this.PatientD){
            if(PP.getPersonid()== N){
                patientN=PP;
            }
        }
        return patientN;
    }

    public ArrayList<patient> getPatientD() {
        return PatientD;
    }

    public void setPatientD(ArrayList<patient> PatientD) {
        this.PatientD = PatientD;
    }
     
    

    
}
