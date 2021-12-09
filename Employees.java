/********************************************************************
 * Programmer:    Naga Assefa
 * Class:  CS30S
 *
 * Assignment: MidtermExam_ClassCode_PartB
 *
 * Description: brief description of class
 ***********************************************************************/

// import libraries as needed here

public class Employees {
    //*** Class Variables ***
         private static int NextID = 1000;
    //*** Instance Variables ***
         private int hours;
         private double paycheck;
         private int id;
    //*** Constructors ***
    public Employees(){
        id = NextID++; // the Id updating every time
        
        hours = 0;     // the hours an employee works
        paycheck = 0;  // the pay check of an employee depending on hours
    }// end default/no-arg constructor
       
       public Employees( int h, double p){
           id = NextID++; // the Id updating every time
           
           hours = 0;     // the hours an employee works
           paycheck = 0;  // the pay check of an employee depending on hours
       }//full arg constructor
    /*****************************************
    * Description: Get employee hours worked
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    //*** Getters ***
    /*****************************************
    * Description: Get employee hours worked
    * 
    * Interface:
    *
    * @return       int: hours worked
    * ****************************************/
    public int getHours(){
        return hours;
    }//end getHours()
    /*****************************************
    * Description: the paycheck of an employee
    * 
    * Interface:
    *
    * @return       double: Paycheck earned
    * ****************************************/
    public double getPay(){
        return paycheck;
    }//end getHours()
    
    /*****************************************
    * Description: the ID of an Employee
    * 
    * Interface:
    *
    * @return       int: id number
    * ****************************************/
    public int getID(){
        return id;
    }//end getHours()
    
    //*** Setters ***
    /*****************************************
    * Description: the paycheck of the employee
    * 
    * Interface:
    *
    * @parm       double: new paycheck for the employee
    * ****************************************/
    public void setPay(double p){
        this.paycheck = p;
    }//end getHours()
    /*****************************************
    * Description: The hours an emoloyee has worked
    * 
    * Interface:
    *
    * @parm       double: new hours worked for employees
    * ****************************************/
    public void setHours(int h){
        this.hours = h;
    }//end getHours()
    //*** Others ***
    
    
    
    /*****************************************
    * Description: Overide to string
    * 
    * Interface:
    * 
    * @return       String: employee state
    * ****************************************/
    @Override
    public String toString(){
        String nl = System.lineSeparator(); 
        StringBuilder St = new StringBuilder();
        
        St.append(String.format("ID"+ getID()));
        St.append(String.format( "Hours worked" + getHours()));
        St.append(String.format( "Hourly wage" + getPay()));    
        return St.toString();
    }// end toString
} // end of public class
