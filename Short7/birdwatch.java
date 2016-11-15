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
        String birdNames = "";
        int numbers;
        int maxNum = 0;
        String mostSeenbird = "";
        final String quit = "end";
        

        while(!(birdNames.equals(quit)))
        {
            print("Which bird have you seen?");
            birdNames = inp(); 
            if (birdNames.equals(quit))
            { break; }
            else
            {
            print("How many were in your garden at once?");
            numbers = Integer.parseInt(inp());
            maxNum = maxNum(numbers);
            mostSeenbird = nameCheck(birdNames, numbers);
           }

        }
        
        print("You saw " + maxNum + " " + mostSeenbird + "." + "\n" + "It was the most common bird seen at one time in your garden."); 
        
    }
	
	public static int maxNum(int numbers)
	{
		int max = 0;
		if(numbers > max)
		{	
			max = numbers;
			
		}
		else
		{   
			max = max;
			
		}
	
		return max;
	}
	
	
	public static String nameCheck(String birdName, int number)
	{
		int max = 0;
		String nameMax = "";
		if(number > max)
		{
			nameMax = birdName;
		}
		else
		{
			nameMax = nameMax;
		
		}
		
		return nameMax;
	}

	public static String inp()
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        return a;
    }
    
    public static void print(String p)
    {
        System.out.println(p);
    }
}

