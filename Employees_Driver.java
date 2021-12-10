import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
/** ***************************************************
 *  Name:           Naga Assefa
 *  Class:          CS30S
 * 
 *  Assignment:     MidtermExam_ClassCode_PartB
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

  public class Employees_Driver {
  public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
        ArrayList<Employees> Worker = new ArrayList<>();
        
        
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Naga Assefa" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Midterm Exam2 Q2" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    // ***** Main Processing *****
        Employees worker1 = new Employees(35, 12.50);
        Employees worker2 = new Employees(40, 17.25);
        Employees worker3 = new Employees(45, 12.50);
        Employees worker4 = new Employees(40, 25.00);
        Employees worker5 = new Employees(46, 20.00);
        Employees worker6 = new Employees(21, 18.75);
        Employees worker7 = new Employees(48, 15.50);
        Employees worker8 = new Employees(40, 32.75);
        Employees worker9 = new Employees(41, 30.00);
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
     } // end main 
    
} // end FormatTemplate
