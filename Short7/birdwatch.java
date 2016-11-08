/*Author: Sm Shahniaz
 * This is a program that stores and gives the most watched bird in their gardens
 * as a part of a bird watch convention*/

import java.util.*;

class birdwatch
{
    public static void main(String [] args)
    {
        birds();
        System.exit(0);
    }

    public static void birds()
    {
        String [] bnames = new String[5];
        int [] numbers = new int[5];
        int i = 0;

        while(!inp.equals("END"))
        {
            print("Which bird have you seen?");
            bnames[i]= inp();
            print("How many were in your garden at once?");
            numbers[i] = Integer.parseInt(inp());
            i + 1;
        }

        int max = 0;
        for(int k= 0;k<5;k++)
        {
            if(numbers[k]>numbers[min])
            max = k;
        }



    }

}

