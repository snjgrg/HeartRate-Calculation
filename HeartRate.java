/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heartrate;

/**
 *
 * @author Sanjay
 */
import java.time.*;


  
public class HeartRate {

   private String fName,lName,dob;
   private int day,month,year;
   
   //Empty constructor 

     public HeartRate(){
         
     }
   //Constructor
   public HeartRate(String firstName,String lastName,int myyear,int mymonth,int myday){
       fName=firstName;
       lName=lastName;
      // dob=dateofBirth; 
      day=myday;
      month=mymonth;
      year=myyear;
      
   }

   //set method for firstname
   public void setfirstName(String firstName){
       fName=firstName;
   }
      //get method for firstname
   public String getfirstName(){
       return fName;  
   }
   
   //set method for lastname
   public void setlastName(String lastName){
       lName=lastName;
   }
   //get method for lastname
   public String getlastName(){
       return lName;  
   }
   //set method for date of birth
    public void setdateofBirth(int myday,int mymonth,int myyear){
       day=myday;
       month=mymonth;
       year=myyear;
   }
  
   //method that returns the age with the respect to date of birth provided.
   public int getdateofBirth() {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
      return Period.between(birthday, today).getYears();
     
    }

  //method that returns the heart rate with person age 
   public int calculate_heartRate(int age){
       return 220-age; 
   }
    
//method that returns the array also the range of target heart rate
    public int[] calc_targetRate(int n) {
        int[] target=new int[2];
        
        target[0]=n*50/100;
        target[1]=n*85/100;
       
        return target;
    }
}
   
     
   

