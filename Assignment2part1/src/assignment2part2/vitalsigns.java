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
    private int Weights_in_kilos;
    private float weights_in_pounds;
    
   public vitalsigns(int Respiratory_rate,int Heart_rate,int systolic_Blood_pressure,int Weights_in_kilos,float weights_in_pounds){
       this.Respiratory_rate = Respiratory_rate;
       this.Heart_rate = Heart_rate;
       this.systolic_Blood_pressure = systolic_Blood_pressure;
       this.Weights_in_kilos = Weights_in_kilos;
       this.weights_in_pounds = weights_in_pounds;
   }

    @Override
    public String toString() {
        return "vitalsigns{" + "Respiratory_rate=" + Respiratory_rate + ", Heart_rate=" + Heart_rate + ", systolic_Blood_pressure=" + systolic_Blood_pressure + ", Weights_in_kilos=" + Weights_in_kilos + ", weights_in_pounds=" + weights_in_pounds + '}';
    }

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

    public int getWeights_in_kilos() {
        return Weights_in_kilos;
    }

    public void setWeights_in_kilos(int Weights_in_kilos) {
        this.Weights_in_kilos = Weights_in_kilos;
    }

    public float getWeights_in_pounds() {
        return weights_in_pounds;
    }

    public void setWeights_in_pounds(float weights_in_pounds) {
        this.weights_in_pounds = weights_in_pounds;
    }
    
    private String CalculateAge (int Age)
    {
        if (Age == 0){
            return "NEWBORN";
            }else if (Age == 1){
        return "Infant";
            }else if (Age >1 && Age<=3){
                return "Toddler";
            }else if (Age >3 && Age<=5){
                return " preschool";
            }else if (Age >3 && Age<=12){
                return"schoolage";
            }else{
                return "Adolecent";
            }
                 
    }
    
    public boolean isThisvitalsignstable (String vitalsign,float Age){
        Boolean flag = false;
        
                
        switch(vitalsign){
            case "1":
            if (Age == 0 && this.systolic_Blood_pressure >= 50 && this.systolic_Blood_pressure<=70) {
                flag = true;
            }else if((Age >=0.1 && Age <1) && this.systolic_Blood_pressure >= 70 && this.systolic_Blood_pressure<=100){
                flag = true;
            }else if((Age>=1 && Age<=3) && this.systolic_Blood_pressure >= 80 && this.systolic_Blood_pressure<=110){
                flag = true;
            }else if((Age>=3 && Age<=5) && this.systolic_Blood_pressure >= 80 && this.systolic_Blood_pressure<=110){
                flag = true;
            }else if((Age>=6 && Age<=12) && this.systolic_Blood_pressure >= 80 && this.systolic_Blood_pressure<=120){
                flag = true;
            }else if(Age>=13 && this.systolic_Blood_pressure >= 110 && this.systolic_Blood_pressure<=120){
                flag = true;
            }else{
                flag = false;
            }
            break;
            case "2":
            if (Age == 0 && this.Heart_rate >= 120 && this.Heart_rate<= 160) {
                flag = true;
            }else if((Age >=0.1 && Age <1) && this.Heart_rate >= 80 && this.Heart_rate<=140){
                flag = true;
            }else if((Age>=1 && Age<=3) && this.Heart_rate >= 80 && this.Heart_rate<=130){
                flag = true;
            }else if((Age>=3 && Age<=5) && this.Heart_rate >= 80 && this.Heart_rate<=120){
                flag = true;
            }else if((Age>=6 && Age<=12) && this.Heart_rate >= 70 && this.Heart_rate<=110){
                flag = true;
            }else if(Age>=13 && this.Heart_rate >= 55 && this.Heart_rate<=105){
                flag = true;
            }else{
                flag = false;
            }
            break;    
            case "3":
            if (Age == 0 && this.Respiratory_rate >= 30 && this.Respiratory_rate<= 50) {
                flag = true;
            }else if((Age >=0.1 && Age <1) && this.Respiratory_rate >= 20 && this.Respiratory_rate<30){
                flag = true;
            }else if((Age>=1 && Age<=3) && this.Respiratory_rate >= 20 && this.Respiratory_rate<=30){
                flag = true;
            }else if((Age>=3 && Age<=5) && this.Respiratory_rate >= 20 && this.Respiratory_rate<=30){
                flag = true;
            }else if((Age>=6 && Age<=12) && this.Respiratory_rate >= 20 && this.Respiratory_rate<=30){
                flag = true;
            }else if(Age>=13 && this.Respiratory_rate >= 12 && this.Respiratory_rate<=20){
                flag = true;
            }else{
                flag = false;
            }
            break;
            case "4":
            if (Age == 0 && this.Weights_in_kilos >= 2 && this.Weights_in_kilos<= 3) {
                flag = true;
            }else if((Age >=0.1 && Age <1) && this.Weights_in_kilos >= 4 && this.Weights_in_kilos<10){
                flag = true;
            }else if((Age>=1 && Age<=3) && this.Weights_in_kilos >= 10 && this.Weights_in_kilos<=14){
                flag = true;
            }else if((Age>=3 && Age<=5) && this.Weights_in_kilos >= 14 && this.Weights_in_kilos<=18){
                flag = true;
            }else if((Age>=6 && Age<=12) && this.Weights_in_kilos >= 20 && this.Weights_in_kilos<=42){
                flag = true;
            }else if(Age>=13 && this.Weights_in_kilos >= 50){
                flag = true;
            }else{
                flag = false;
            }
            break;
            case "5":
            if (Age == 0 && this.weights_in_pounds >= 4.5 && this.weights_in_pounds<= 7) {
                flag = true;
            }else if((Age >=0.1 && Age <1) && this.weights_in_pounds >= 9 && this.weights_in_pounds<22){
                flag = true;
            }else if((Age>=1 && Age<=3) && this.weights_in_pounds >= 22 && this.weights_in_pounds<=31){
                flag = true;
            }else if((Age>=3 && Age<=5) && this.weights_in_pounds >= 31 && this.weights_in_pounds<=40){
                flag = true;
            }else if((Age>=6 && Age<=12) && this.weights_in_pounds >= 41 && this.weights_in_pounds<=92){
                flag = true;
            }else if(Age>=13 && this.weights_in_pounds >= 110){
                flag = true;
            }else{
                flag = false;
            }
            break; 
         }return flag;
                
    
//     if (flag != null){
//    return false;
//   }else {
//    return true;
//     }
}
}