/*
 *Author: Sm Shahniaz
  This is a program for a music quiz.
 * */


import java.util.*;
import javax.swing.*;


class musicquiz
{

  public static void main(String[] args)
  {
    askQuenstions();
    System.exit(0);

  }

  /*This method askQuestions contains all the questions for the quiz.
  and contains all the answers on the side comments*/


  public static void askQuenstions()
  {
    String openMesasge, q1, q2, q3, q4, q5, ans;
    openMesasge = "Welcome to the Random Music Quiz!" + "\n" + "Let's Begin!";
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
  }

  /*This is the method for calling the user inputs thorugh the terminal
  returns the */


  public static String finalMessage()
  {
    final String message = "That's an intriguing answer!";

    System.out.println(message);

    return message;
  }
}
