/*
 *
 Author: Sm Shahniaz
 This is a program that gives information of zone of a particular station is in.
 *
 * */


import java.util.Scanner; //Scanner for user input via terminal.


class undergroundtfl
{
  // This is main function calling the function for the initialization of the program.
  public static void main(String[] args)
  {
    askusr();
    System.exit(0);

  }// END main
  /*
    This is the method where the user will be asked for the inputs
    and a seperate method will be called based un the user inputs.
  */
  public static void askusr()
  {

    String userin;
    //Initialising scanner
    Scanner scan = new Scanner(System.in);

    System.out.println("What station do you need to know zone of?");

    userin = scan.nextLine(); // Stores the user input in the variable userin.

    if (userin.equals("Mile End")){
      int usro = mile(); //Zone 2
      System.out.println(userin + " is in Zone " + usro);
    }
    else if (userin.equals("Liverpool Street")){
      int usro = liverpoolst(); //Zone 1
      System.out.println(userin + " is in Zone " + usro);
    }
    else if (userin.equals("Woodford")){
      int usro = woodford(); //Zone 4
      System.out.println(userin + " is in Zone " + usro);
    }
    else if (userin.equals("Royal Victoria")){
      int usro = royalv(); //Zone 3 ^-^
      System.out.println(userin + " is in Zone " + usro);
    }
    else if (userin.equals("Buckhurst Hill")){
      int usro = buckhill(); //Zone 5 ^-^
      System.out.println(userin + " is in Zone " + usro);
    }
    else {
      System.out.println("Is " + userin + " a London Underground station? Maybe check your spelling.");
    }

    return;
  }// END askusr

  /*
  The following blocks of method returns the value
  assigned to a variable in this case returns the zone.
  */
  // Should have used records though for this particular problem.
  // Called when Mile End is typed.
  public static int mile()
  {
    int zone = 2;

    return zone;
  }// END mile

  // Called when Liverpool Street is typed
  public static int liverpoolst()
  {
    int zone = 1;

    return zone;
  }// END liverpoolst

  // Called when Woodford is typed
  public static int woodford()
  {
    int zone = 4;

    return zone;
  }// END woodford

  // Called when Royal Victoria is typed
  public static int royalv()
  {
    int zone = 3;

    return zone;
  }// END royalv

  // Called when Buckhurst Hill is typed
  public static int buckhill()
  {
    int zone = 2;

    return zone;
  }// END buckhill



}// END class undergroundtfl
