/* AUTHOR Sm Shahniaz
This is a program for concentrating strings. And to print out the initias of my name.
*/

import javax.swing.*;

class concatstringsme
{
    public static void main (String[] param)
    {
        buildMessage();
        System.exit(0);

    } // END main



   /* ***************************************************

   */

    public static void buildMessage ()
    {
        // first create three variables, one for each piece of the final message
        // and another to hold the final combined message
        String letter1;
        String letter2;
        String contact;
	    String fact2;
	    String post;

        // set the first two variable to particular strings
        letter1 = "SSSSSS" + "\n" + "SS" + "\n" + "SS" + "\n" + "SSSSSS" + "\n" + "    SS" + "\n" + "    SS" + "\n" +"SSSSSS";
        letter2 = "SSSSSS" + "\n" + "SS" + "\n" + "SS" + "\n" + "SSSSSS" + "\n" + "    SS" + "\n" + "    SS" + "\n" +"SSSSSS";
        // then combine them using + to stick them end to end

        // print out the final result
        System.out.println(letter1 + "\n" + "\n");
        System.out.println(letter2);
        //Note giving the variable name here is as though the whole message was typed here
        return;
     } // END buildMessage

} // END class concatstrings
