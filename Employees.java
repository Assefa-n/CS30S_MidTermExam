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
    // ***Constants******
         private final double RH = 40;    //the amount of ours there are in regular pay

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
    * Description: calculate the payccheck for an employe in 
    *              regulat time
    * 
    * Interface:
    * 
    * @return       double: regeular pay
    * //*** Getters ***
    // spetial  'getters'
    * ****************************************/
    public double  getRegPay(){
         double extra = 0;     // the amount of non over time 
         double regpay = 0.0;     // the paycheck given to the employes 
                                 // for working 40 hours
         extra = getHours() - RH;
         regpay = (getHours()-extra) * getPay();
         
        return regpay;
    }// end getRP()
    
    /*****************************************
    * Description: calculate an employees overtime pay
    * 
    * Interface:
    * 
    * @return       double: over time pay
    * //*** Getters ***
    // spetial  'getters'
    * ****************************************/
    public double  getOtPay(){
        // variables
         double oth = 0;          // the over time hours
         double otp = 0;          // the over time pay
         
        // calculations
         oth = getHours() - RH;
         otp = oth * getPay() * 1.5;
        //return 
         return otp;
    }// end getOvertimePay()
    
    /*****************************************
    * Description: calculate the employees total pay 
    * 
    * Interface:
    * 
    * @return       double: gross pay
    * //*** Getters ***
    // spetial  'getters'
    * ****************************************/
    public double  getGrossPay(){
        //variables
        double gp = 0;          // the total 
        //calculations 
        gp = getRegPay() + getOtPay();
        //return
        return gp;
    }// end getRP()
    
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
        St.append(String.format( "Hours worked: " + getHours()));
        St.append(String.format( "Hourly wage: " + getPay()));
        St.append(String.format( "Regular pay: " + getRegPay())); 
        St.append(String.format( "Overtime pay: " + getOtPay())); 
        St.append(String.format( "Gross pay: " + getGrossPay())); 
        return St.toString();
    }// end toString
} // end of public class
