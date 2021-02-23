/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2part1;

import java.util.Scanner;

/**
 *
 * @author visha
 */
public class Assignment2part1 {
    public static Scanner Input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter First Name");
        String First_Name = Input.nextLine();
        System.out.println("Enter Last Name");
        String Last_name = Input.nextLine();
        
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
        
        
        
        vitalsigns Vitals = new vitalsigns(Respiratory_rate,Heart_rate,systolic_Blood_pressure,Weights_in_kilos,weights_in_pounds);
        patient detail = new patient(First_Name,Last_name,Age,Vitals);
        if(detail.isPatientNormal()){
            System.out.println("Patient is Stable");
        }
        else
        {
            System.out.println("patient is Unstable");
            
            
        }
                
        
        
    }
    
}
