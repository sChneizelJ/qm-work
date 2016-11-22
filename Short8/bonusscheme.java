 /******************************************************************
Author Sm Shahniaz
This is a program that shows the bonus scheme of a company
based on certain scores giving them an overall performance score.
Hence, calculating bonus based on that.
*******************************************************************/


import java.util.*;

class Scores
{
  int profitScore; //Score for profit.
  int hardworkScore;//Score for hard work.
}// END class scores

class bonusscheme
{
  public static void main(String [] args)
  {
    scheme();
    System.exit(0);
  }

  //for multiplying the profit score
  public static int profitMulti(int p)
  {
    int pMulti = (p * 2);

    return pMulti;
  }
  // for multiplying the hard work score
  public static int HardMulti(int h)
  {
    int hMulti = h * 5;
    return hMulti;
  }
  // for calculating performance score
  public static int performance(Scores s)
  {
    //Getting the values in record
    final int p = getProfits(s);
    final int h = getHards(s);
    // intermediate values
    int interP = profitMulti(p);
    int interH = HardMulti(h);
    // performance calculation

    int performScore = ((interP + interH)/7);

    return performScore;
  }
  public static int bonusCal(int perfScore)
  {
    int bonusC = perfScore * 5000;
    return bonusC;
  }
  //**** Method for most of the task *****
  public static void scheme()
  {
    print("Profit Score?");
    int pScore = input();

    print("Hard Work Score?");
    int hScore = input();

    Scores sc = createScore(pScore, hScore);

    int perF = performance(sc);

    print("Your performance score this year is " + perF + " out of 10.");

    int bonus = bonusCal(perF);

    print("Your bonus is " + bonus + " pounds.");

  }
  //For Creating a new record of scores
  public static Scores createScore(int profScore, int hardScore)
  {

    Scores s = new Scores();
    s = setProfits(s,profScore);
    s = setHards(s,hardScore);
    return s;
  }
  //Setters
  public static Scores setProfits(Scores s, int proScore)
  {
    s.profitScore = proScore;
    return s;
  }

  public static Scores setHards(Scores s, int hardScore)
  {
    s.hardworkScore = hardScore;
    return s;
  }
  //Getters
  public static int getProfits(Scores s)
  {
    return s.profitScore;
  }
  public static int getHards(Scores s)
  {
    return s.hardworkScore;
  }
  //For integer input
  public static int input()
  {
    Scanner scan = new Scanner(System.in);
    int a = Integer.parseInt(scan.nextLine());
    return a;
  }// END input

  // For output.
  public static void print(String s)
  {
    System.out.println(s);
  }//END output
}// END class bounsscheme
