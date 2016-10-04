/* AUTHOR Sm Shahniaz 3 October 2016
This is a program for concentrating strings. And to print out the initias of my name.
*/

import javax.swing.*;

class initials
{
    public static void main (String[] param)
    {
        firsti(); //First Initial 
	secondi(); //Second Initial
        System.exit(0);

    } // END main



   /* ***************************************************
	The initials split into two seperate methods.
   */
   
   
   // This is the method for the first initial.
    public static void firsti ()
    {
       
        String letter1;
       
        letter1 = "SSSSSS" + "\n" + "SS" + "\n" + "SS" + "\n" + "SSSSSS" + "\n" + "    SS" + "\n" + "    SS" + "\n" +"SSSSSS";
        
        System.out.println(letter1 + "\n"); // Should Print "S"

        return;
     } // END firsti
    
   // This is the method for the second initial.
    public static void secondi() 
    {
    
    	String letter2;
    	
    	letter2 = "SSSSSS" + "\n" + "SS" + "\n" + "SS" + "\n" + "SSSSSS" + "\n" + "    SS" + "\n" + "    SS" + "\n" +"SSSSSS";
    	
    	System.out.println(letter2); //Should print "S"
    	
    	return;
    
    
    } //END secondi		
} // END class initials
