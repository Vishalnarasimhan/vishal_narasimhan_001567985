/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2part2;

/**
 *
 * @author visha
 */
public class vitalsigns {
   

    private int Respiratory_rate;
    private int Heart_rate;
    private int systolic_Blood_pressure;
    private double Weights_in_kilos;
    private double weights_in_pounds;
    private int vitalsignD;
    private int Agegroup;

    public int getRespiratory_rate() {
        return Respiratory_rate;
    }

    public void setRespiratory_rate(int Respiratory_rate) {
        this.Respiratory_rate = Respiratory_rate;
    }

    public int getHeart_rate() {
        return Heart_rate;
    }

    public void setHeart_rate(int Heart_rate) {
        this.Heart_rate = Heart_rate;
    }

    public int getSystolic_Blood_pressure() {
        return systolic_Blood_pressure;
    }

    public void setSystolic_Blood_pressure(int systolic_Blood_pressure) {
        this.systolic_Blood_pressure = systolic_Blood_pressure;
    }

    public double getWeights_in_kilos() {
        return Weights_in_kilos;
    }

    public void setWeights_in_kilos(double Weights_in_kilos) {
        this.Weights_in_kilos = Weights_in_kilos;
    }

    public double getWeights_in_pounds() {
        return weights_in_pounds;
    }

    public void setWeights_in_pounds(double weights_in_pounds) {
        this.weights_in_pounds = weights_in_pounds;
    }

    public int getVitalsignD() {
        return vitalsignD;
    }

    public void setVitalsignD(int vitalsignD) {
        this.vitalsignD = vitalsignD;
    }

    

    public int getAgegroup() {
        return Agegroup;
    }

    public void setAgegroup(int Agegroup) {
        this.Agegroup = Agegroup;
    }
    
    
    
    public boolean isThisVitalSignstable(int vitalgroup){
        int Agegroup = this.Agegroup;
        boolean n = false;
        
        switch(vitalgroup){
            case 1:
                if(Agegroup == 1){
                    if(Respiratory_rate>30 && Respiratory_rate<=50){
                        System.out.println("Patient is Stable");
                       n = true; 
                       
                    }
                    else{
                        System.out.println("patient is unstable");
                        n = false;
                    }
                }
                
                if(Agegroup == 2 && Agegroup == 3 &&Agegroup == 4 && Agegroup == 5 ){
                    if(Respiratory_rate>=20 && Respiratory_rate<=30){
                        System.out.println("Patient is Stable");
                       n = true; 
                       
                    }
                    else{
                        System.out.println("patient is unstable");
                        n = false;
                    }
                }
                
                if(Agegroup == 6){
                    if(Respiratory_rate>=12 && Respiratory_rate<=20){
                        System.out.println("Patient is Stable");
                       n = true; 
                       
                    }
                    else{
                        System.out.println("patient is unstable");
                        n = false;
                    }
                
                
        }break;
        
            case 2:
                if(Agegroup == 1){
                    if(Heart_rate>=120 && Heart_rate<=160){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
                if(Agegroup == 2){
                    if(Heart_rate>=80 && Heart_rate<=140){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
                if(Agegroup == 3){
                    if(Heart_rate>=80 && Heart_rate<=103){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
                if(Agegroup == 4){
                    if(Heart_rate>=80 && Heart_rate<=120){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
                if(Agegroup == 5){
                    if(Heart_rate>=70 && Heart_rate<=110){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
                if(Agegroup == 6){
                    if(Heart_rate>=55 && Heart_rate<=105){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }break;
                
            case 3:
             if(Agegroup == 1){
                    if(systolic_Blood_pressure>=50 && systolic_Blood_pressure<=70){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
              
            if(Agegroup == 2){
                    if(systolic_Blood_pressure>=70 && systolic_Blood_pressure<=100){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
            if(Agegroup == 3){
                    if(systolic_Blood_pressure>=80 && systolic_Blood_pressure<=110){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
            if(Agegroup == 4){
                    if(systolic_Blood_pressure>=80 && systolic_Blood_pressure<=110){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
            if(Agegroup == 5){
                    if(systolic_Blood_pressure>=80 && systolic_Blood_pressure<=120){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
            if(Agegroup == 6){
                    if(systolic_Blood_pressure>=110 && systolic_Blood_pressure<=120){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }break;
                
             case 4:
             if(Agegroup == 1){
                    if(Weights_in_kilos>=2 && Weights_in_kilos<=3){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
             if(Agegroup == 2){
                    if(Weights_in_kilos>=4 && Weights_in_kilos<=10){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
             if(Agegroup == 3){
                    if(Weights_in_kilos>=10 && Weights_in_kilos<=14){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
             if(Agegroup == 4){
                    if(Weights_in_kilos>=14 && Weights_in_kilos<=18){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
             if(Agegroup == 5){
                    if(Weights_in_kilos>=20 && Weights_in_kilos<=42){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
             if(Agegroup == 6){
                    if(Weights_in_kilos>50){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }break;
               case 5:
             if(Agegroup == 1){
                    if(weights_in_pounds>=4.5 && weights_in_pounds<=7){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
             if(Agegroup == 2){
                    if(weights_in_pounds>=9 && weights_in_pounds<=22){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
             if(Agegroup == 3){
                    if(weights_in_pounds>=22 && weights_in_pounds<=31){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
             if(Agegroup == 4){
                    if(weights_in_pounds>=31 && weights_in_pounds<=40){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
             if(Agegroup == 5){
                    if(weights_in_pounds>=41 && weights_in_pounds<=92){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
             if(Agegroup == 1){
                    if(weights_in_pounds>110){
                      System.out.println("Patient is Stable");
                       n = true;  
                    }
                   else{
                        System.out.println("patient is unstable");
                        n = false;
                    } 
                }
             break;
               default:
                   System.out.println("Enter Input");
                
                
        }
        return n;
                   
                
        
        
   }

    
}
    
    
