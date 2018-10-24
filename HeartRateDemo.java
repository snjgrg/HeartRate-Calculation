/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heartrate;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Sanjay
 */
public class HeartRateDemo {
    public static void main(String[]args){
        
        
        HeartRate check_Rate= new HeartRate();
   
    
        Scanner sc=new Scanner(System.in);  //scanner object that ask input of user
        System.out.print("Enter your first name:");
        String fName=sc.nextLine();
        check_Rate.setfirstName(fName);
        
        System.out.print("Enter your last name:");
        String lName=sc.nextLine();
        check_Rate.setlastName(lName);
        
        System.out.print("Enter your Date of Birth: day month year:");
        int day=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();
        check_Rate.setdateofBirth(day,month,year );
       
 
        System.out.print( check_Rate.getfirstName()+"\t");
        System.out.print( check_Rate.getlastName()+"\t");
        System.out.print("Age:"+ check_Rate. getdateofBirth()+"\t");   
        System.out.print("Maximum heartrate:");
        System.out.print(check_Rate.calculate_heartRate(check_Rate.getdateofBirth())+"\t");
        int k=(check_Rate.calculate_heartRate(check_Rate.getdateofBirth()));
       
        System.out.print("Target Heartrate Range:");
        System.out.print(Arrays.toString((check_Rate.calc_targetRate(k))));
    }
}
