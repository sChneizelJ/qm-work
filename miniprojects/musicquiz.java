/*
 *Author: Sm Shahniaz
  This is a program for a music quiz.
 * */


import java.util.*;// Using Random and Scanner
import javax.swing.*;// Here for virtually no reason


class musicquiz
{

  public static void main(String[] args)
  {
    askQuestions();
    System.exit(0);

  }//END main

  /*This method askQuestions contains all the questions for the quiz.
  and contains all the answers on the side comments*/


  public static void askQuestions()
  {
    String openMesasge; String q1; String q2; String q3; String q4; String q5; String ans;
    openMesasge = "Welcome to the Random Music Quiz!" + "\n" + "Let's Begin!" + "\n";
    q1 = "Which of the following rock songs won the Best Rock Performance at the 2016 Grammy Awards?"; //Don't Wanna Fight
    q2 = "Justin Bieber had three of the top five songs on the Billboard Hot 100 chart for January 2nd, 2016. Sorry, Love Yourself and...?";//What Do You Mean?
    q3 = "What did Mike Posner take in Ibiza to show Avicii he was cool?"; //Pill
    q4 = "Which artist had hits with the songs 'When We Were Young' and 'Hello' in 2016?";//Adele
    q5 = "Canadian singer and songwriter Abel Makkonen Tesfaye is better known as?";// The Weeknd
    Scanner scan = new Scanner(System.in);
    //Questions on Screen

    System.out.println(q1);

    ans = scan.nextLine();
    finalMessage();

    System.out.println(q2);

    ans = scan.nextLine();
    finalMessage();

    System.out.println(q3);

    ans = scan.nextLine();
    finalMessage();

    System.out.println(q4);

    ans = scan.nextLine();
    finalMessage();

    System.out.println(q5);

    ans = scan.nextLine();
    finalMessage();

    return;
  }// END askQuestions

  /*This is the method for calling the user inputs thorugh the terminal
  returns the */


  public static String finalMessage()
  {
    final String message = "That's an intriguing answer!";

    System.out.println(message);

    System.out.println("Your score is " + score());

    return message;
  }

  /*This is a method for the random dice roll returning
  the value and giving the score.*/

  public static int score()
  {
    Random dice = new Random();

    int diceThrow = dice.nextInt(6) + 1; //Generates random number between 1-6. Zero included hence +1

    return diceThrow;

  }
}
