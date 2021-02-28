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
public class patient extends person{
   

public Encounterhistory Enhistory;
public Encounterhistory getEnhistory(){
    return Enhistory;
}

public void setEhistory(Encounterhistory Ehistory){
    this.Enhistory = Enhistory;
}

public patient(person epp){
    this.PersonName=epp.PersonName;
    this.personid = epp.personid ;
    Enhistory = new Encounterhistory();
    
    
     
}
    
public boolean isPatientNormal(vitalsigns vitalsign){
    Encounter Ecount = this.Enhistory.getEhistory().get(this.Enhistory.Getsize()-1);
    vitalsign = Ecount.getVitalsign();
    boolean standard = false;
    int Agegroup = vitalsign.getAgegroup();
    switch(Agegroup){
        case 1:
            if(vitalsign.getRespiratory_rate()>=30 && vitalsign.getRespiratory_rate() <=50  && vitalsign.getHeart_rate() >=120 && vitalsign.getHeart_rate() <=160  && vitalsign.getSystolic_Blood_pressure() >=50 && vitalsign.getSystolic_Blood_pressure() <=70  && vitalsign.getWeights_in_kilos() >=2 && vitalsign.getWeights_in_kilos() <=3  && vitalsign.getWeights_in_pounds() >=4.5 && vitalsign.getWeights_in_pounds() <=7 ){
            System.out.println("patient is stable");
            standard = true;
            }
            else{
                System.out.println("patient is unstable");
                standard = false;
            }
            break;
        case 2:
            if(vitalsign.getRespiratory_rate() >=20 && vitalsign.getRespiratory_rate() <=30 && vitalsign.getHeart_rate() >=80 && vitalsign.getHeart_rate() <=140  && vitalsign.getSystolic_Blood_pressure() >=70 && vitalsign.getSystolic_Blood_pressure() <=100  && vitalsign.getWeights_in_kilos() >=4 && vitalsign.getWeights_in_kilos() <=10  && vitalsign.getWeights_in_pounds() >=9 && vitalsign.getWeights_in_pounds() <=22 ){
            System.out.println("patient is stable");
            standard = true;
            }
            else{
                System.out.println("patient is unstable");
                standard = false;
            }
            break;
        case 3:
            if(vitalsign.getRespiratory_rate() >=20 && vitalsign.getRespiratory_rate() <=30  && vitalsign.getHeart_rate() >=80 && vitalsign.getHeart_rate() <=130  && vitalsign.getSystolic_Blood_pressure() >=80 && vitalsign.getSystolic_Blood_pressure() <=110  && vitalsign.getWeights_in_kilos() >=10 && vitalsign.getWeights_in_kilos() <=14  && vitalsign.getWeights_in_pounds() >=22 && vitalsign.getWeights_in_pounds() <=31 ){
            System.out.println("patient is stable");
            standard = true;
            }
            else{
                System.out.println("patient is unstable");
                standard = false;
            }
            break;
        case 4:
            if(vitalsign.getRespiratory_rate() >=20 && vitalsign.getRespiratory_rate() <=30  && vitalsign.getHeart_rate() >=80 && vitalsign.getHeart_rate() <=120 && vitalsign.getSystolic_Blood_pressure() >=80 && vitalsign.getSystolic_Blood_pressure() <=110  && vitalsign.getWeights_in_kilos() >=14 && vitalsign.getWeights_in_kilos() <=18  && vitalsign.getWeights_in_pounds() >=31 && vitalsign.getWeights_in_pounds() <=40 ){
            System.out.println("patient is stable");
            standard = true;
            }
            else{
                System.out.println("patient is unstable");
                standard = false;
            }
            break;
        case 5:
            if(vitalsign.getRespiratory_rate() >=20 && vitalsign.getRespiratory_rate() <=30  && vitalsign.getHeart_rate() >=70 && vitalsign.getHeart_rate() <=110  && vitalsign.getSystolic_Blood_pressure() >=80 && vitalsign.getSystolic_Blood_pressure() <=120  && vitalsign.getWeights_in_kilos() >=20 && vitalsign.getWeights_in_kilos() <=42  && vitalsign.getWeights_in_pounds() >=41 && vitalsign.getWeights_in_pounds() <=92 ){
            System.out.println("patient is stable");
            standard = true;
            }
            else{
                System.out.println("patient is unstable");
                standard = false;
            }
            break;
        case 6:
            if(vitalsign.getRespiratory_rate() >=12 && vitalsign.getRespiratory_rate() <=20  && vitalsign.getHeart_rate() >=55 && vitalsign.getHeart_rate() <=105  && vitalsign.getSystolic_Blood_pressure() >=110 && vitalsign.getSystolic_Blood_pressure() <=120  && vitalsign.getWeights_in_kilos() >=50 && vitalsign.getWeights_in_pounds() >=110){
            System.out.println("patient is stable");
            standard = true;
            }
            else{
                System.out.println("patient is unstable");
                standard = false;
            }
            break;
        
        }
    return standard;
}
}

