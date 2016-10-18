/******
 *Author = Sm Shahnaiz
  Date: 18 Oct 2016
    This program works out the total disability points for a single team
 *
 * */

import java.util.Scanner;

class paralymic
{
    public static void main (String[]args)
    {
        legalverifier();
        System.exit(0);

    }
    public static void legalverifier();
    {
        int maxnum = 32; //Limit of disability points.
        int ans1 = loopaskUsr();
        int ans2;
        int ans3;
        int ans4;

    }//END legalverifier

    public static int loopaskUsr()
    {
        for (int i=1, i <= 4, i++)
        {
            print("What is the dissability class of Runner" + i)
        }

    }
    //Method for asking input from user
    public static int userin()
    {
        Scanner scan = new Scanner(System.in);
        int usrin = Integer.praseInteger(scan.nextline());
        return userin;

    }
    //Method for printing out to screen. Keep it simple.
    public static void print(String ans)
    {
         System.out.println(ans);
    }
}// END class paralymic


