/********************************************************************
 * Programmer:    Naga Assefa
 * Class:  CS30S
 *
 * Assignment: MidtermExam_ClassCode_PartB
 *
 * Description: brief description of class
 ***********************************************************************/

// import libraries as needed here

public class Employes {
    //*** Class Variables ***
         private static int NextID = 1000;
    //*** Instance Variables ***
         private int hours;
         private double paycheck;
         private int id;
    //*** Constructors ***
       public Employes(){
           id = NextID++;
           
           hours = 0;
           paycheck = 0;
       }// end default/no-arg constructor
       
       public Employes( int h, double p){
           
       }
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    
    //*** Getters ***
    
    //*** Setters ***
    
} // end of public class
