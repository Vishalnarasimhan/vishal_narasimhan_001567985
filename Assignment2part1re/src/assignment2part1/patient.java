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
public class patient {
    
    private String First_Name;
    private String Second_name;
    private float Age;
    private vitalsigns vitalsign;
    boolean standard = false;
    
    public patient(String First_Name,String Second_name,float Age,vitalsigns vitalsign){
        this.First_Name = First_Name;
        this.Second_name = Second_name;
        this.Age = Age;
        this.vitalsign = vitalsign;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getSecond_name() {
        return Second_name;
    }

    public void setSecond_name(String Second_name) {
        this.Second_name = Second_name;
    }

    public float getAge() {
        return Age;
    }

    public void setAge(float Age) {
        this.Age = Age;
    }

    public vitalsigns getVitalsign() {
        return vitalsign;
    }

    public void setVitalsign(vitalsigns vitalsign) {
        this.vitalsign = vitalsign;
    }
    public boolean isPatientNormal(){
        if((Age == 0) && (vitalsign.getRespiratory_rate() >=30 && vitalsign.getRespiratory_rate() <=50 ) && (vitalsign.getHeart_rate() >=120 && vitalsign.getHeart_rate() <=160 ) && (vitalsign.getSystolic_Blood_pressure() >=50 && vitalsign.getSystolic_Blood_pressure() <=70 ) && (vitalsign.getWeights_in_kilos() >=2 && vitalsign.getWeights_in_kilos() <=3 ) && (vitalsign.getWeights_in_pounds() >=4.5 && vitalsign.getWeights_in_pounds() <=7 )){
        standard = true;
        }
        if((Age == 0) && (vitalsign.getRespiratory_rate() >50 ) && (vitalsign.getHeart_rate() >160) && (vitalsign.getSystolic_Blood_pressure() >70)){
        standard = false;
        System.out.println("Patient may be experiencing from fever or stress");
        }
        if((Age == 0) && (vitalsign.getHeart_rate() <120)){
        standard = false;
        System.out.println("Patient is critical ,suffering from bradycadia");
        }
        
        
        else if ((Age >=0.1 && Age <1 ) && (vitalsign.getRespiratory_rate() >=20 && vitalsign.getRespiratory_rate() <=30 ) && (vitalsign.getHeart_rate() >=80 && vitalsign.getHeart_rate() <=140 ) && (vitalsign.getSystolic_Blood_pressure() >=70 && vitalsign.getSystolic_Blood_pressure() <=100 ) && (vitalsign.getWeights_in_kilos() >=4 && vitalsign.getWeights_in_kilos() <=10 ) && (vitalsign.getWeights_in_pounds() >=9 && vitalsign.getWeights_in_pounds() <=22 )){
        standard = true;
        }
        if((Age >=0.1 && Age <1 ) && (vitalsign.getRespiratory_rate() >30 ) && (vitalsign.getHeart_rate() >140) && (vitalsign.getSystolic_Blood_pressure() >100)){
        standard = false;
        System.out.println("Patient may be experiencing from fever or stress");
        }
        if((Age >=0.1 && Age <1 ) && (vitalsign.getHeart_rate() <80)){
        standard = false;
        System.out.println("Patient is critical ,suffering from bradycadia");
        }
        
        
        else if ((Age >=1 && Age <3 ) && (vitalsign.getRespiratory_rate() >=20 && vitalsign.getRespiratory_rate() <=30 ) && (vitalsign.getHeart_rate() >=80 && vitalsign.getHeart_rate() <=130 ) && (vitalsign.getSystolic_Blood_pressure() >=80 && vitalsign.getSystolic_Blood_pressure() <=110 ) && (vitalsign.getWeights_in_kilos() >=10 && vitalsign.getWeights_in_kilos() <=14 ) && (vitalsign.getWeights_in_pounds() >=22 && vitalsign.getWeights_in_pounds() <=31 )){
        standard = true;
        }
        if((Age >=1 && Age <3 ) && (vitalsign.getRespiratory_rate() >30 ) && (vitalsign.getHeart_rate() >130) && (vitalsign.getSystolic_Blood_pressure() >110)){
        standard = false;
        System.out.println("Patient may be experiencing from fever or stress");
        }
        if((Age >=1 && Age <3 ) && (vitalsign.getHeart_rate() <80 )){
        standard = false;
        System.out.println("Patient is critical ,suffering from bradycadia");
        }
        
        
        else if ((Age >=3 && Age <=5 ) && (vitalsign.getRespiratory_rate() >=20 && vitalsign.getRespiratory_rate() <=30 ) && (vitalsign.getHeart_rate() >=80 && vitalsign.getHeart_rate() <=120 ) && (vitalsign.getSystolic_Blood_pressure() >=80 && vitalsign.getSystolic_Blood_pressure() <=110 ) && (vitalsign.getWeights_in_kilos() >=14 && vitalsign.getWeights_in_kilos() <=18 ) && (vitalsign.getWeights_in_pounds() >=31 && vitalsign.getWeights_in_pounds() <=40 )){
        standard = true;
        }
        if((Age >=3 && Age <5 ) && (vitalsign.getRespiratory_rate() >30 ) && (vitalsign.getHeart_rate() >120) && (vitalsign.getSystolic_Blood_pressure() >110)){
        standard = false;
        System.out.println("Patient may be experiencing from fever or stress");
        }
        if((Age >=3 && Age <=5 ) && (vitalsign.getHeart_rate() <80)){
        standard = false;
        System.out.println("Patient is critical ,suffering from bradycadia");
        }
        
        
        else if ((Age >=6 && Age <=12 ) && (vitalsign.getRespiratory_rate() >=20 && vitalsign.getRespiratory_rate() <=30 ) && (vitalsign.getHeart_rate() >=70 && vitalsign.getHeart_rate() <=110 ) && (vitalsign.getSystolic_Blood_pressure() >=80 && vitalsign.getSystolic_Blood_pressure() <=120 ) && (vitalsign.getWeights_in_kilos() >=20 && vitalsign.getWeights_in_kilos() <=42 ) && (vitalsign.getWeights_in_pounds() >=41 && vitalsign.getWeights_in_pounds() <=92 )){
        standard = true;
        }
        if((Age >=6 && Age <=12 ) && (vitalsign.getRespiratory_rate() >30 ) && (vitalsign.getHeart_rate() >110) && (vitalsign.getSystolic_Blood_pressure() >120)){
        standard = false;
        System.out.println("Patient may be experiencing from fever or stress");
        }
        if((Age >=6 && Age <=12 ) && (vitalsign.getHeart_rate() <70)){
        standard = false;
        System.out.println("Patient is critical ,suffering from bradycadia");
        }
        
        
        else if ((Age >= 12) && (vitalsign.getRespiratory_rate() >=12 && vitalsign.getRespiratory_rate() <=20 ) && (vitalsign.getHeart_rate() >=55 && vitalsign.getHeart_rate() <=105 ) && (vitalsign.getSystolic_Blood_pressure() >=110 && vitalsign.getSystolic_Blood_pressure() <=120 ) && (vitalsign.getWeights_in_kilos() >=50) && (vitalsign.getWeights_in_pounds() >=110)){
        standard = true;
        }
        if((Age >12 ) && (vitalsign.getRespiratory_rate() >20 ) && (vitalsign.getHeart_rate() >105) && (vitalsign.getSystolic_Blood_pressure() >120)){
        standard = false;
        System.out.println("Patient may be experiencing from fever or stress");
        }
        
        

return standard;
} 
    }
     
    
    
    
    
    

