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
 *  Description:    this class will put the information of workers inside an 
 *                  array list and print that information and other information 
 *                  through the array list
 * 
 *************************************************************/

public class EmployeeDriver {
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
        ArrayList<Employee> workers = new ArrayList<>();

        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        ProgramInfo pf = new ProgramInfo("MidtermExam Q2"); //the banner and closing message info
                                                            
        System.out.println(pf.getBanner());

        // ***** Get Input *****
        // ***** Main Processing *****
        // all the workers in the job
            Employee w1 = new Employee(35, 12.50);
            Employee w2 = new Employee(40, 17.25);
            Employee w3 = new Employee(45, 12.50);
            Employee w4 = new Employee(40, 25.00);
            Employee w5 = new Employee(46, 20.00);
            Employee w6 = new Employee(21, 18.75);
            Employee w7 = new Employee(48, 15.50);
            Employee w8 = new Employee(40, 32.75);
            Employee w9 = new Employee(41, 30.00);
            
        // loading array list   
            workers.add(w1);
            workers.add(w2);
            workers.add(w3);
            workers.add(w4);
            workers.add(w5);
            workers.add(w6);
            workers.add(w7);
            workers.add(w8);
            workers.add(w9);
          
            System.out.println("**************************");
          for(Employee e: workers){
            System.out.println(e);
         }// end for each loop
            System.out.println("**************************");
        
            workers.get(5).setHours(50);
            workers.get(5).setWage(50);
            System.out.println("the hours and wage of employee"
                                +workers.get(5).getID()
                                +"have been changed to");
            System.out.println( workers.get(5));
            
            System.out.println("**************************"+nl);
            System.out.println( workers.remove(0)+ nl +"This worker will be removed from the list"+nl);

            System.out.println("**************************");
         for(Employee e: workers){
            System.out.println(e);
        }// end for each loop
            System.out.println("**************************");

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

            System.out.println();
            System.out.println(pf.getClosingMessage());
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate
