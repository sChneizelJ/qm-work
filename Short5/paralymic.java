/******
 *Author = Sm Shahnaiz
  Date: 18 Oct 2016
    This program works out the total disability points for a single team
    and also verifies if the team is fit to play or not using arrays abd loop.
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
    public static void legalverifier()
    {
        int maxnum = 32; //Limit of disability points.
        int [] ans1 = loopaskUsr();
        boolean legit;

        /***********************************************
        *The idea was to change the index value of the array
        automatically using the
        *
        */

        int sum = 0;
        for (int i=0; i <5; i++)
        {
            sum += ans1[i];
        }

        //Verification if number is less than 32

        if (sum < maxnum)
        {   // for being legitimate
            print("That team has " + sum + " so is legal");
            legit = true;
        }
        else
        {   //!legit means for not being legitimate
            print("That team has " + sum + " so is NOT legal");
            legit = !true;
        }

    }//END legalverifier

    //This is a special method as its returning the value of the array hence [] are used.

    public static int[] loopaskUsr()
    {
        int [] vals = new int[5];
        for (int i=1; i<=4; i++)
        {
            print("What is the dissability class of Runner " + i);
            vals [i] = userin();
        }
        return vals;
    }
    //Method for asking input from user
    public static int userin()
    {
        Scanner scan = new Scanner(System.in);
        int usrin = Integer.parseInt(scan.nextLine());
        return usrin;

    }
    //Method for printing out to screen. Keep it simple.
    public static void print(String ans)
    {
         System.out.println(ans);
    }
}// END class paralymic
