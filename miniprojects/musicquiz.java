/*
 *Author: Sm Shahniaz
  This is a program for a music quiz.
  Source of questions : http://www.triviachamp.com/2016-Pop-Music-Quiz.php
 * */


import java.util.*;// Using Random and Scanner
import javax.swing.*;// Here for virtually no reason


class musicquiz
{

  public static void main(String[] args)
  {

    askQuestions();
    //Don't Wanna Fight
    //What Do You Mean?
    //Pill
    //Adele
    // The Weeknd
    System.exit(0);

  }//END main

  /*This method askQuestions contains all the questions for the quiz.
  and contains all the answers on the side comments*/


  public static void askQuestions()
  {
    //IMPORTANT!! Do not move this block of code until further notice.
    QandA q1 = createQA("Which of the following rock songs won the Best Rock Performance at the 2016 Grammy Awards?","Don't Wanna Fight","Something From Nothing","Moaning Lisa Smile");
    QandA q2 = createQA("Justin Bieber had three of the top five songs on the Billboard Hot 100 chart for January 2nd, 2016. Sorry, Love Yourself and...?","What Do You Mean?","I'll Show You","Purpose");
    QandA q3 = createQA("What did Mike Posner take in Ibiza to show Avicii he was cool?","Pill","Whiskey","Beer");
    QandA q4 = createQA("Which artist had hits with the songs 'When We Were Young' and 'Hello' in 2016?","Ariana Grande","Lady Gaga","Adele");
    QandA q5 = createQA("anadian singer and songwriter Abel Makkonen Tesfaye is better known as?","Future","Drake","The Weeknd");
    String openMesasge; String ans;String ansu;
    openMesasge = "Welcome to the Random Music Quiz!" + "\n" + "Let's Begin!" + "\n";
    boolean usrAns = false;

    //Questions on Screen
    print(openMesasge);


    print("How many are going to take the quiz?");
    int j = Integer.parseInt(userin());
    int [] pscore = new int[5];
    for (int i = 1; i<=j; i++)
    {

      print("Start Player: " + i);
      print(getQues(q1) +"\n"+ "a)" + getAns1(q1) +"\n"+"b)" + getAns2(q1) +"\n"+ "c)" + getAns3(q1) +"\n");
      ansu = userin();
      usrAns = anscheck(ansu, "a");
      pscore[0] = disroll(usrAns);
      print(getQues(q2) +"\n"+ "a)" + getAns1(q2) +"\n"+"b)" + getAns2(q2) +"\n"+ "c)" + getAns3(q2) +"\n");
      ansu = userin();
      usrAns = anscheck(ansu, "a");
      pscore[1] = disroll(usrAns);
      print(getQues(q3) +"\n"+ "a)" + getAns1(q3) +"\n"+"b)" + getAns2(q3) +"\n"+ "c)" + getAns3(q3) +"\n");
      ansu = userin();
      usrAns = anscheck(ansu, "a");
      pscore[2] = disroll(usrAns);
      print(getQues(q4) +"\n"+ "a)" + getAns1(q4) +"\n"+"b)" + getAns2(q4) +"\n"+ "c)" + getAns3(q4) +"\n");
      ansu = userin();
      usrAns = anscheck(ansu, "c");
      pscore[3] = disroll(usrAns);
      print(getQues(q5) +"\n"+ "a)" + getAns1(q5) +"\n"+"b)" + getAns2(q5) +"\n"+ "c)" + getAns3(q5) +"\n");
      ansu = userin();
      usrAns = anscheck(ansu, "c");
      pscore[4] = disroll(usrAns);


    }
    // Block of code for calculation '+=' means add the term from before to te current one(always use in loop).
    int sum = 0;
    for(int i =0; i<5; i++)
    {
      sum += pscore[i];
    }
    //Stores total score of each member of team.
    int [] teamtotal = new int[j+1];
    int ttot = 0;
    for(int i=1; i<j; i++)
    {
      teamtotal[i] = sum;
    }
    //The final team total for the run.
    for(int i=1; i<j;i++)
    {
      ttot += teamtotal[i];
    }
    finalMessage(ttot);

    return;
  }// END askQuestions

  /*This is the method for calling the user inputs thorugh the terminal
  returns the values required for further calculations*/
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

  public static void finalMessage(int score)
  {
    print("Thank you all very much for taking part.");
    print("Your team scored :" + score);

  }
  // Create and Getter and Setters
  public static QandA createQA(String ques, String an1,String an2, String an3)
  {
    QandA q = new QandA();
    q = setQues(q,ques);
    q = setAns(q,an1,an2,an3);

    return q;
  }

  public static QandA setQues(QandA q, String ques)
  {
    q.question = ques;

    return q;
  }

  public static QandA setAns(QandA q,String an1, String an2, String an3)
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

class QandA
{
  String question;
  String ans1, ans2, ans3;
}
