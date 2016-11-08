/*
 *Author: Sm Shahniaz
  This is a program for a music quiz.
  Source of questions : http://www.triviachamp.com/2016-Pop-Music-Quiz.php
 * */


import java.util.*;// Using Random and Scanner
import javax.swing.*;// Here for virtually no reason

class QandA
{
  String question;
  String ans1, ans2, ans3;
}


class musicquiz
{

  public static void main(String[] args)
  {
    /*Creating a record using an array as everytime the loop is carried a new record is created named rec[1]..rec[2] and so on.
    This allows creation of bulk records*/
    QandA [] rec = new QandA[5];
    for(int i=0;i<5;i++)
    {
      rec [i] = createQA(i);
    }
    askQuestions(rec);//passing record
    //Don't Wanna Fight
    //What Do You Mean?
    //Pill
    //Adele
    // The Weeknd
    System.exit(0);

  }//END main

  /*This method asks the question to the players using the record and loops*/


  public static void askQuestions(QandA rec[])
  {

    String openMesasge; String ans;String ansu;
    openMesasge = "Welcome to the Random Music Quiz!" + "\n" + "Let's Begin!" + "\n";
    boolean usrAns = false;

    //Questions on Screen
    print(openMesasge);

    String [] answ = {"a","a","a","c","c"}; //For storing the short answere.
    print("How many are going to take the quiz?");
    int j = Integer.parseInt(userin()); //Asking for the number of players in a team.
    int [] pscore = new int[j];// To keep count of each indivisual scores of players.
    for (int i = 0; i<j; i++)
    {
      int score = 0;
      print("Start Player: " + (i+1));
      for(int k=0; k<5;k++)
      {
        /*The loop using the array construct of the record to return values based on passing integers.
        This is a more efficient way for this construct as there is less code involved and also less
        repetative work*/
        print(getQues(rec[k]) +"\n"+ "a)" + getAns1(rec[k]) +"\n"+"b)" + getAns2(rec[k]) +"\n"+ "c)" + getAns3(rec[k]) +"\n");
        ansu = userin();
        usrAns = anscheck(ansu, answ[k]);
        int inter = disroll(usrAns); //Intermediatary Storage of int for further manipulation.
        score = adderOr(inter, score);
      }
      pscore[i] = score; //Stores the indivisual results of the players after every loop.

    }


    finalMessage(pscore);

    return;
  }// END askQuestions

  //This method checks and returns a value given that the user inputh a correct value.
  public static boolean anscheck(String ansu, String ans)
  {

    if (ansu.equals(ans))
    {
      print("This that is correct!! ^-^");
      return true;
    }
    else
    {
      print("Better Luck next time");
      return false;
    }
  }
//If the answer is true this method a value 3,6 given the inputs being 1-5 || 6.
  public static int disroll(boolean uans)
  { int roll = score();
    int fin = 0;
    if (uans = true)
    {
      if (roll == 6)
      {
        fin = 6;
      }
      else
      {
        fin = 3;
      }
    }
    else
    {
      print("System Broken :P");
    }

    return fin;
  }
  /*This method is an adder if the value given is 3 or else just returns 6*/
  public static int adderOr(int a,int score)
  {
    if(a == 3)
    {
      score = score + 3;
      return score;
    }
    else
    {
      score = 6;
      return score;
    }
  }
  /*The method does the calculation for the indivisual player scores and total team results*/
  public static void finalMessage(int [] pscore)
  {

    for(int i = 0; i<pscore.length; i++)
    {
      print("Player " + (i+1) + " scored : " + pscore[i]);
    }

    // Block of code for calculation '+=' means add the term from before to te current one(always use in loop).
    int sum = 0;
    for(int i =0; i<pscore.length; i++)
    {
      sum += pscore[i];
    }


    print("Thank you all very much for taking part.");
    print("Your team scored :" + sum);

  }
  // Create and Getter and Setters
  public static QandA createQA(int i)
  {
    String [] ques = {"Which of the following rock songs won the Best Rock Performance at the 2016 Grammy Awards?",
    "Justin Bieber had three of the top five songs on the Billboard Hot 100 chart for January 2nd, 2016. Sorry, Love Yourself and...?",
  "What did Mike Posner take in Ibiza to show Avicii he was cool?",
"Which artist had hits with the songs 'When We Were Young' and 'Hello' in 2016?",
"Canadian singer and songwriter Abel Makkonen Tesfaye is better known as?"};
    String [] ans1 = {"Don't Wanna Fight","What Do You Mean?","Pill","Ariana Grande","Future"};
    String [] ans2 = {"Something From Nothing","I'll Show You","Whiskey","Lady Gaga","Drake"};
    String [] ans3 = {"Moaning Lisa Smile","Purpose","Beer","Adele","The Weeknd"};
    QandA q = new QandA();
    q = setQues(q,ques[i]);
    q = setAns(q,ans1[i],ans2[i],ans3[i]);

    return q;
  }
  //Getter and Setter method follows.
  public static QandA setQues(QandA q, String ques)
  {
    q.question = ques;

    return q;
  }

  public static QandA setAns(QandA q, String an1, String an2, String an3)
  {
    q.ans1 = an1;
    q.ans2 = an2;
    q.ans3 = an3;

    return q;
  }

  public static String getQues(QandA q)
  {
    return q.question;
  }

  public static String getAns1(QandA q)
  {
    return q.ans1;
  }
  public static String getAns2(QandA q)
  {
    return q.ans2;
  }
  public static String getAns3(QandA q)
  {
    return q.ans3;
  }

  public static String userin()
  {

    Scanner scanner = new Scanner(System.in);
    String usrin = scanner.nextLine();
    return usrin;

  }


  //Method for output
  public static void print (String tboutput)
  {

    System.out.println(tboutput);

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
