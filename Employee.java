/********************************************************************
 * Programmer:    Naga Assefa
 * 
 * Class:  CS30S
 *
 * Assignment: MidtermExam_ClassCode_PartB
 *
 * Description: Employee class to calculate and print the payrole and 
 *              Id information of employees 
 ***********************************************************************/

// import libraries as needed here

public class Employee {
    //*** Class Variables ***
    private static int NextID = 1000;   // the Id that is diffrent for every imployee
    
    // ***Constants******
    private final int RH = 40;          //the amount of ours there are in regular pay
    private final double OTR = 1.5;  // the over time rate for employees
    
    //*** Instance Variables ***
    private int hours;            // the hours an employee has worked
    private double paycheck;      // the hourly wage of an employee
    private int id;               // the ID of an employee
    
    //*** Constructors ***
    public Employee(){
        id = NextID++; // the Id updating every time

        hours = 0;     // the hours an employee works
        paycheck = 0;  // the pay check of an employee depending on hours
    }// end default/no-arg constructor

    public Employee( int h, double p){
        id = NextID++; // the Id updating every time

        hours = h;     // the hours an employee works
        paycheck = p;  // the pay check of an employee depending on hours
    }//full arg constructor
    
    //*** Getters ***
    
    /*****************************************
     * Description: Get employee hours worked
     * 
     * Interface:
     *
     * @return       double: hours worked
     * ****************************************/
     public double getHours(){
        return hours;
    }//end getHours()

    /*****************************************
     * Description: the paycheck of an employee
     * 
     * Interface:
     *
     * @return       double: Paycheck earned
     * ****************************************/
    public double getWage(){
        return paycheck;
    } //end getHours()

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
    public void setWage(double p){
        this.paycheck = p;
    }//end getHours()

    /*****************************************
     * Description: The hours an emoloyee has worked
     * 
     * Interface:
     *
     * @parm       double: new hours worked for Employees
     * ****************************************/
    public void setHours(int h){
        this.hours = h;
    }//end getHours()
    //*** Others ***
    
    /*****************************************
     * Description: calculate the paycheck for an employe in 
     *              regulate time
     * 
     * Interface:
     * 
     * @return       double: regeular pay
     * ****************************************/
     public double  getRegPay(){
        // variables
         double extra = 0;        // the amount of non regular time in hours
         double regpay = 0.0;     // the paycheck given to the employes 
                                  // for working 40 hours
        // calculations                         
         extra = getHours() - RH;
         if(extra < 0){
         extra = 0;
        }//end if
         regpay = (getHours()-extra) * getWage();
         
        //return 
         return regpay;
    }// end getRP()

    /*****************************************
     * Description: calculate an employees overtime pay
     * 
     * Interface:
     * 
     * @return       double: over time pay
     * ****************************************/
     public double  getOtPay(){
        // variables
        double oth = 0;          // the over time hours
        double otp = 0;          // the over time pay

        // calculations
        oth = getHours() - RH;
        
        if(oth < 0){
        oth = 0;
       }//end if
        otp = oth * getWage() * OTR;
         
        //return 
        return otp;
    }// end getOtPay()

    /*****************************************
     * Description: calculate the employees total pay 
     * 
     * Interface:
     * 
     * @return       double: gross pay
     * ****************************************/
     public double  getGrossPay(){
        //variables
        double gp = 0;          // the total 
        //calculations 
        gp = getRegPay() + getOtPay();
        //return
        return gp;
    }// end getGrossPay()

    /*****************************************
     * Description: Overide to string
     * 
     * Interface:
     * 
     * @return       String: employee state
     * ****************************************/
     @Override
      public String toString(){
        String nl = System.lineSeparator();         // the line separator    
        StringBuilder St = new StringBuilder();
        
        St.append(String.format("%-2s %d %s", "ID:", this.getID(),nl));
        St.append(String.format("%-2s %.0f %s", "Hours worked:", this.getHours(),nl));
        St.append(String.format("%-2s %s%.2f %s","Hourly wage:", "$",this.getWage(),nl));
        St.append(String.format("%-2s %s%.2f %s","Regular pay:", "$",this.getRegPay(),nl)); 
        St.append(String.format("%-2s %s%.2f %s","Overtime pay:", "$",this.getOtPay(),nl)); 
        St.append(String.format("%-2s %s%.2f %s","Gross pay:", "$",this.getGrossPay(),nl)); 
       
        return St.toString();
    }// end toString
} // end of public class
