/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2part2;

import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author visha
 */
public class Main {
    
    
    
    public static void main(String[] args){ 
        patientdirectory patientH = new patientdirectory();
        persondirectory personD = new persondirectory();
        person p1 = new person();
        p1.setPersonName("Vishal_Narasimhan");
        p1.setPersonid(111);
        personD.addperson(p1);
        
        
        person p2 = new person();
        p2.setPersonName("Ajay");
        p2.setPersonid(222);
        personD.addperson(p2);
        
        person p3 = new person();
        p3.setPersonName("Anto");
        p3.setPersonid(333);
        personD.addperson(p3);
        
        person p4 = new person();
        p4.setPersonName("Shankar");
        p4.setPersonid(444);
        personD.addperson(p2);
        
        
      
        
        
        patient pp1 = new patient(p1);
        patient pp2 = new patient(p2);
        patient pp3 = new patient(p3);
        patient pp4 = new patient(p4);
        
        patientH.addperson(pp1);
        patientH.addperson(pp2);
        patientH.addperson(pp3);
        patientH.addperson(pp4);
        
        House H1 = new House();
        H1.setHouseN(111);
        H1.addperson(p1);
        
        House H2 = new House();
        H2.setHouseN(222);
        H2.addperson(p2);
        
        House H3 = new House();
        H3.setHouseN(333);
        H3.addperson(p3);
        
        House H4 = new House();
        H4.setHouseN(444);
        H4.addperson(p4);
        
        
        community C1 = new community();
        C1.setCommunityN("Asian");
        C1.addHouse(H1);
        C1.addHouse(H2);
        
        community C2 = new community();
        C2.setCommunityN("American");
        C2.addHouse(H3);
        C2.addHouse(H4);
        
        city cty = new city();
        cty.addcommunity(C1);
        cty.addcommunity(C2);
        cty.setCityC("Boston");
        
        Scanner In = new Scanner(System.in);
        boolean isPatientNormal = false;
        boolean isThisVitalSignstable = false;
        while(true){
            System.out.println("           Select the Options         "
                                           +"\t \t \n                1 Create\n"
                                           +"\t \t2 View\n"
                                           +"\t \t3 No of unstable Patient\n");
            Scanner ss = new Scanner (System.in);
            int option = ss.nextInt();
            
            switch(option){
                case 1:
                    System.out.println(" Patient Details ");
                    vitalsigns vitals = new vitalsigns();
                    System.out.println("\t\t patient_id");
                    int patientID = ss.nextInt();
                    
                    patient expat = patientH.GetPatientfileN(patientID);
                    if(expat == null){
                        person exper = patientH.GetPatientfileN(patientID);
                        if(expat == null)
                            System.out.println("\t\tNo entery found");
                        break;
                       
                    }else{
                        patient pat = new patient(expat);
                        patientH.addperson(pat);
                        expat=pat;
                    }
                    
                    
                    System.out.println(" Enter Date");
                    String time = ss.next();
                    
                    System.out.println("\t Patient Respiatory Rate");
                    int  Respiratory_rate = In.nextInt();
                    vitals.setRespiratory_rate(Respiratory_rate);
                    
                    System.out.println("\t Patient Heart rate");
                    int  Heart_rate = In.nextInt();
                    vitals.setHeart_rate(Heart_rate);
                    
                    System.out.println("\t Patient systolic Blood pressure ");
                    int  systolic_Blood_pressure = In.nextInt();
                    vitals.setSystolic_Blood_pressure(systolic_Blood_pressure);
                    
                    System.out.println("\t Patient Weights in kilos ");
                    double  Weights_in_kilos = In.nextDouble();
                    vitals.setWeights_in_kilos(Weights_in_kilos);
                    
                    System.out.println("\t Patient Weights in pounds ");
                    double  Weights_in_pounds = In.nextDouble();
                    vitals.setWeights_in_pounds(Weights_in_pounds);
                    
                    
                    System.out.println("     Enter Age Group     ");
                    System.out.println("\t 1.Newborn \n"
                    +"\t 2.Infant(1-12 months) \n"
                    +"\t 3.Toddler(1-3 years) \n"
                    +"\t 4.Preschool(3-5 years) \n"   
                    +"\t 5.School Age(6-12 years) \n"
                    +"\t 6.Adolescent(13+ years) \n" );
                    
                    int Agegroup = ss.nextInt();
                    vitals.setAgegroup(Agegroup);
                    vitals.setHeart_rate(Heart_rate);
                    vitals.setRespiratory_rate(Respiratory_rate);
                    vitals.setSystolic_Blood_pressure(systolic_Blood_pressure);
                    vitals.setWeights_in_kilos(Weights_in_kilos);
                    vitals.setWeights_in_pounds(Weights_in_pounds);
                    
                    
                    Encounter en = new Encounter();
                    en.setTime(time);
                    en.setVitalsign(vitals);
                    
                    expat.Enhistory.addEncounter(en);
                    isPatientNormal = expat.isPatientNormal(vitals);
                    
                    System.out.println("     Is patient stable or unstable       ");
                    
                    System.out.println("\t\t 1.To RespiatoryRate\n"
                            +"\t\t 2.To check HeartRate\n"
                            +"\t\t 3.To check Systolic blood pressure\n"
                            +"\t\t 4.To check Weight in Kg\n"
                            +"\t\t 5.To check weight in Pounds\n");
                    
                    int vitalsignD = ss.nextInt();
                    vitals.setVitalsignD(vitalsignD);
                    isThisVitalSignstable = vitals.isThisVitalSignstable(vitalsignD);
                    
                    break;
                    
                case 2:
                    System.out.println("patient details");
                    
                    for(patient pat:patientH.getPatientD()){
                        System.out.println("Patient Name"+ pat.getPersonName());
                        System.out.println("Patient id"+pat.getPersonid());
                        
                        
                        System.out.println("Patient History");
                        for(Encounter En:pat.getEnhistory().getEhistory()){
                            System.out.println("Timestamp"+En.getTime());
                            vitalsigns v = En.getVitalsign();
                            System.out.println("Respiratory_Rate" + v.getRespiratory_rate() + "Heart_Rate"+ v.getHeart_rate() + "Sysytolic_blood_pressue"+ v.getSystolic_Blood_pressure()+"Weight_in_kilos"+ v.getWeights_in_kilos() +"Weight_in_Pounds"+ v.getWeights_in_pounds());
                            
                            
                        }
                        
                    }break;
                    
                case 3:
                    System.out.println("View no of unstable patient");
                    int counter = 0;
                    for(community cmm: cty.getCityN()){
                        for (House hs: cmm.getCommunityH()){
                            for(person pr: hs.getHouseP()){
                                patient extpat = patientH.GetPatientfileN(pr.getPersonid());
                                if(extpat != null){
                                    if(extpat.Enhistory.Getsize()>0){
                                        Encounter enupdate = extpat.Enhistory.getEhistory().get(extpat.Enhistory.getEhistory().size()-1);
                                    vitalsigns v = enupdate.vitalsign;
                                    if(!v.isThisVitalSignstable(2)){
                                        counter++;
                                        
                                    }
                                    
                                    }
                                }
                                
                            }
                        }
                        
                    }
                    System.out.println(+counter+" patient is unstable with systolic Blood pressure vital");
                    
                    break;
                    
                default:
                   System.exit(0);
                   System.out.println("incorrect input");
                   break;
                   
                    
             }
            
        }
        
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    


