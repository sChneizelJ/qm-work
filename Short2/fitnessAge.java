
/* *****************************************
AUTHOR Sm Shahnaiz 4th Oct 2016
This program tells users if they are fitter than the user's PC.
******************************************** */

import java.util.Scanner; // Need to import Scanner
import javax.swing.*; // Needed to import swing library

class fitnessAge
{
    public static void main (String[] param)
    {
        fcalculator();
        System.exit(0);   
    } // END main
   
    
    
    public static void fcalculator()
    {
       int age1; 
       int age2;       
       int totalAge; 
       int averageAge;
       int aver;
       int averMulti;
       int divi; 
       int add1;
       int fitage;
       int actualAge;
       int diff;
      
       age1 = inputAge1(); 
       age2 = inputAge2();
           
       
       totalAge = age1 + age2;
       averageAge = totalAge / 2; 
       aver = averageAge;   
       averMulti = averageAge * 8;
       divi = averMulti / 5;
       add1 = divi + 10;
       fitage = add1;
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Your average score is " + aver);
       
       System.out.println("Your PC Fit age is " + fitage + " years old.");
       
       System.out.println("What is your actual age?");
       
       actualAge = Integer.parseInt(sc.nextLine());
       
       diff = actualAge - fitage;
       
       System.out.println("You are " + diff + " years away from your PC fit age");
    	
       
       return;
    } // END fcalculator


    
    public static int inputAge1()
    {
       int age;
       
       Scanner scanner = new Scanner(System.in);  
       
       System.out.println("Score for fitness test 1?");
       
       age = Integer.parseInt(scanner.nextLine());
       
       
       return age;
    } // END inputAge1
    
    public static int inputAge2()
    {
       int agea;
       
       Scanner scanner = new Scanner(System.in);  
       
       System.out.println("Score for fitness test 2?");
       
       agea = Integer.parseInt(scanner.nextLine());
 
       
       return agea;
    } // END inputAge2

    
} // END class fitnessAge
