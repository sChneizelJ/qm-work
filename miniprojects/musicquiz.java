/*
 *Author: Sm Shahniaz
  This is a program for a music quiz.
  Source of questions : http://www.triviachamp.com/2016-Pop-Music-Quiz.php
 * */


import java.util.*;// Using Random and Scanner
import javax.swing.*;// Here for virtually no reason

//Record
class QandA
{
  String question;
  String ans1, ans2, ans3;// multiple answers for output
  int ansCorrect; //Keeping a count of how many people got a question correct.
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
    int [] pscore1 = new int[j];// To keep count of each indivisual scores of players for round 1.
    int [] pscore2 = new int[j];
    int round = 1;
/*****************************
*Control using while loop.
**/

    while(round == 1)
    {

   	 for (int i = 0; i<j; i++)
    	{
      int score1 = 0;
      print("Start Player: " + (i+1));
      for(int k=0; k<2;k++)
      {
        /*The loop using the array construct of the record to return values based on passing integers.
        This is a more efficient way for this construct as there is less code involved and also less
        repetative work*/
        print(getQues(rec[k]) +"\n"+ "a)" + getAns1(rec[k]) +"\n"+"b)" + getAns2(rec[k]) +"\n"+ "c)" + getAns3(rec[k]) +"\n");
        ansu = userin();
        usrAns = anscheck(ansu, answ[k]);
        int inter = disroll(usrAns); //Intermediatary Storage of int for further manipulation.
        score1 = adderOr(inter, score1);
        int intermCorrect = getansCorrect(rec[k]);
        int n = ifCorrect(usrAns);
        rec[k] = setansCorrect(rec[k], intermCorrect, n);
      }
      pscore1[i] = score1; //Stores the indivisual results of the players after every loop.

    }
		round++;

	}

		while (round == 2){

			for (int m = 0; m<j; m++)
		  {
		    int score2 = 0;
		    print("Start Player: " + (m+1));
		    for(int l=2;l<5;l++)
		    {
		      /*The loop using the array construct of the record to return values based on passing integers.
		      This is a more efficient way for this construct as there is less code involved and also less
		      repetative work*/
		      print(getQues(rec[l]) +"\n"+ "a)" + getAns1(rec[l]) +"\n"+"b)" + getAns2(rec[l]) +"\n"+ "c)" + getAns3(rec[l]) +"\n");
		      ansu = userin();
		      usrAns = anscheck(ansu, answ[l]);
		      int inter = disroll(usrAns); //Intermediatary Storage of int for further manipulation.
		      score2 = adderOr(inter, score2);
          int intermCorrect = getansCorrect(rec[m]);
          int n = ifCorrect(usrAns);
          rec[m] = setansCorrect(rec[m], intermCorrect, n);
		    }
		    pscore2[m] = score2; //Stores the indivisual results of the players after every loop.

		  }
		break;

	}

    finalMessage(pscore1,pscore2);// Prints score
    answerSort(rec,answ);// prints sorted answers

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
  {
   int roll = score();
    int fin = 0;
    if (uans = true)
    {
      if (roll == 6)
      {
        fin = 6;
        return fin;
      }
      else
      {
        fin = 3;
        return fin;
      }
    }
    else
    {
      print("System Broken :P");
      return fin;
    }
  }
  
  /*This method is an adder if the value given is 3 or else just returns 6*/
  public static int adderOr(int a,int score)
  {
    if(a == 3)
    {
      score = score + 3;
      return score;
    }
    else if(a == 0)
    {
      score = 0;
      return score;
    }
    else
    {
      score = 6;
      return score;
    }
  }
  /*The method does the calculation for the indivisual player scores and total team results*/
  public static void finalMessage(int [] pscore1, int [] pscore2)
  {

    for(int i = 0; i<pscore1.length; i++)
    {
      print("Player " + (i+1) + " scored : " + pscore1[i] + " for round 1");
    }

		for(int i = 0; i<pscore2.length; i++)
    {
      print("Player " + (i+1) + " scored : " + pscore2[i] + " for round 2");
    }
    // Block of code for calculation '+=' means add the term from before to te current one(always use in loop).
    int sum = 0;
    
    for(int i =0; i<pscore1.length; i++)
    {
      sum += pscore1[i];
      sum += pscore2[i];
    }


    print("Thank you all very much for taking part.");
    print("Your team scored :" + sum);

  }
	//Populates the answers but not sort.
  public static void answerSort(QandA rec[], String answ [])
  {
    int [] checkCount= new int[5];

    for(int i=0;i < checkCount.length; i++)
    {
      checkCount[i] = getansCorrect(rec[i]);//getting the number of people who got answers correct.
    }

    int [] index = new int [5];
    for(int j=0;j < index.length; j++)
    {
      index[j] = j;
    }

    index = SortWithIndex(checkCount, index);
    for (int k = 0;k<index.length;k++)
    {
      print(getQues(rec[index[k]]) +"\t \t \t \t "+"|"+"\t \t \t \t"+ answ[index[k]]);

    }

  }// END answerSort
	//Sorts the checkCount and index.
  public static int [] SortWithIndex(int data [], int index [])
  {
			int len = data.length;
			int [] temp1 = new int[len];
			int [] temp2 = new int[len];


      for (int i = 0; i <len; i++)
      {

        for (int j = i + 1; j < len; j++)
        {

            if(data[i]<data[j])
            {
              temp1[i] = data[i];
              data[i] = data[j];
              data[j] = temp1[i];
              /*
              This invert bubble sort uses the swap of the original data and index simultaneously
              as the construct i made required the value of the index to be swapped simultaneously,
              for further operations, i.e. printing the questions and its answers in the order of easiest to hardest.
              */
              temp2[i] = index[i];
              index[i] = index[j];
              index[j] = temp2[i];

            }
        }

      }

      return index;
  }
	//returns a 1 or 0 based on the answer being true.
  public static int ifCorrect(boolean b)
  {
    int a = 0;
    if (b = true)
    {
      a = 1;
      return a;
    }
    else
    {
      return a;
    }
  }
  // Create and Getter and Setters
  public static QandA createQA(int i)
  {	//Question Bank
    String [] ques = {"Which of the following rock songs won the Best Rock Performance at the 2016 Grammy Awards?",
    "Justin Bieber had three of the top five songs on the Billboard Hot 100 chart for January 2nd, 2016. Sorry, Love Yourself and...?",
  "What did Mike Posner take in Ibiza to show Avicii he was cool?",
"Which artist had hits with the songs 'When We Were Young' and 'Hello' in 2016?",
"Canadian singer and songwriter Abel Makkonen Tesfaye is better known as?"};
    String [] ans1 = {"Don't Wanna Fight","What Do You Mean?","Pill","Ariana Grande","Future"};
    String [] ans2 = {"Something From Nothing","I'll Show You","Whiskey","Lady Gaga","Drake"};
    String [] ans3 = {"Moaning Lisa Smile","Purpose","Beer","Adele","The Weeknd"};
    //Populating the record.
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
  public static QandA setansCorrect(QandA q, int i, int j)
  {
    q.ansCorrect = i + j;
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
  public static int getansCorrect(QandA q)
  {
    return q.ansCorrect;
  }
	/*
	This method is used for the user input.
	*/
  public static String userin()
  {

    Scanner scanner = new Scanner(System.in);
    String usrin = scanner.nextLine();
    return usrin;

  }


  //Method for output
  public static void print (String tbOutput)
  {

    System.out.println(tbOutput);

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
