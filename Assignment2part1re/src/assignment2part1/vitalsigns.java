/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2part1;

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
    
    
    
}

