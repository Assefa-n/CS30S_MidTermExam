/********************************************************************
 * Programmer:    Naga Assefa
 * Class: CS30S
 *
 * Assignment: ProgramInfo
 *
 * Description: program information class to print
 *  banner cand closing message
 ***********************************************************************/

// import libraries as needed here

public class ProgramInfo {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    
     private String assignment;               // the name of the assignent for teh banner
     
    //*** Constructors ***
    
    public ProgramInfo(String a){
        assignment = a;
        
    }  // end constructor
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
    // spetial  'getters'
    public String getBanner(){
       String St;
       String nl = System.lineSeparator();
       
        St = "*****************************" + nl;
        St += "Name:        Sveinson" + nl;
        St += "Class:       CS30S" + nl;
        St += "Assignment:  "+ assignment + nl;
        St += "*****************************" + nl + nl;
       return St + assignment;
    }// end getBanner()
    
    
    //*** Setters ***
    
} // end of public class
