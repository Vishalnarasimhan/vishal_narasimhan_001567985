/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2part2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author visha
 */
public class Assignment2part2 {
    
    public static patient Getpatient(ArrayList<patient> patientArray, int patientId){
        patient patientp = null;
        for(int i=0; i<patientArray.size();i++)
        {
            if (patientArray.get(i).patientId == patientId){
                patientp= patientArray.get(i);
            }
        }
        return patientp;
    }
    public static Scanner Input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
    
            ArrayList<patient> patientArray = new ArrayList<patient>();
            int count = 0;
            
            int userinput;
            
            do{
             System.out.println("Enter any one of below option \n");
             System.out.println("Enter 1. To Create New Data \n");
             System.out.println("      2. To View Data \n");
             System.out.println("      3. To Quit Window \n");
             System.out.println("Number input :");
             userinput = Input.nextInt();
             
             switch (userinput){
             
             
                 case 1:  
      
    
        System.out.println("Enter Patient ID");
        int patientId = Input.nextInt();
            
        
        System.out.println("Enter First Name");
        String First_Name = Input.next();
        
        System.out.println("Enter Last Name");
        String Last_name = Input.next();
        
        System.out.println("Enter your Age");
        float Age = Input.nextFloat();
        
        System.out.println("Enter your Respiratory Rate");
        int Respiratory_rate = Input.nextInt();
        
        System.out.println("Enter your Heart Rate");
        int Heart_rate = Input.nextInt();
        
        System.out.println("Enter your Systolic Blood pressure");
        int systolic_Blood_pressure = Input.nextInt();
        
        System.out.println("Enter your Weights in kilos");
        int Weights_in_kilos = Input.nextInt();
        
        System.out.println("Enter your Weights in Pounds");
        float weights_in_pounds = Input.nextFloat();
        
        
        vitalsigns vitalsign = new vitalsigns(Respiratory_rate,Heart_rate,systolic_Blood_pressure,Weights_in_kilos,weights_in_pounds);
        
        patient existingpatient = Getpatient(patientArray, patientId);
        
        if(existingpatient!=null)
        {
            existingpatient.addvitals(vitalsign);
        }
        else{
            patient p = new patient(patientId,First_Name,Last_name,Age,vitalsign);
            patientArray.add(p);
            
            System.out.println("Enter below option to see patient health");
            System.out.println("1.is patient stable or unstable");
            System.out.println("2.To find vital sign");
            System.out.println("3.End");
            System.out.println("Number input: ");
            int scan = Input.nextInt();
            if(scan == 1){
                if(p.isPatientNormal()){
                    System.out.println("Patient is stable");
                
            }
            else{
                System.out.println("Patient is unstable");
            }
            }
        else{
            
           System.out.println("Enter from below vital sign");
           System.out.println("Bloodpressure HeartRate respiratoryRate WeightKg Weightlbs");
           System.out.println("Number Input: ");
           String Vitalsign1 = Input.next();
           Boolean isThisvitalsignstable = vitalsign.isThisvitalsignstable(Vitalsign1, Age);
           if(isThisvitalsignstable == true) {
               System.out.println("Vital are stable");
           }else{
               System.out.println("Vitals are unstable");
           }
           }  
        break;
        }
        case 2:
            System.out.println("Enter PatientID");
            int patientsId = Input.nextInt();
            patient scan = Getpatient(patientArray, patientsId);
            if(scan !=null){
                System.out.println(scan.toString());
                System.out.println(scan.getVitalsign());
                for(patient n:scan.getPatienthistory()){
                    System.out.println(n.toString());
                }
            }
            else{
                System.out.println("The Patient Data not available");
            }
            break;
            
            case 3:
            System.out.println("END");
            System.exit(0);
            break;
            
            }
            }while(userinput <=3);
            
            
        
        
        
       /* assignment2part1.vitalsigns Vitals = new assignment2part1.vitalsigns(Respiratory_rate,Heart_rate,systolic_Blood_pressure,Weights_in_kilos,weights_in_pounds);
        assignment2part1.patient detail = new assignment2part1.patient(First_Name,Last_name,Age,Vitals);
        if(detail.isPatientNormal()){
            System.out.println("Patient is Stable");
        }
        else
        {
            System.out.println("patient is Unstable");
            
            
        }
                
        */
      /* System.out.println("Enter Vital signs");
       String VitalSign1 = Input.next();
       do{
          Boolean isThisvitalsignstable =vitalsign.isThisvitalsignstable(VitalSign1, Age); 
          
           if(isThisvitalsignstable == true){
              System.out.println("The vital signs is stable");
              break;
          }else{
              System.out.println("The Vital signs are unstable");
              break;
          }
       
       }while (VitalSign1 != null);
       //}while (count >=3);*/
            
            for (patient p: patientArray){
                System.out.println(p.toString());
                System.out.print(p.getVitalsign());
                for(patient y: p.patienthistory)
                {
                    System.out.println(y.toString());
                }
                    
            }
            
          
    }
    
}

