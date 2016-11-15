/*Author: Sm Shahnaiz
 *
 *The program gets the user inputs as integers and shows the most endangered animal*/
import java.util.*;

class endangeredAnimals
{
    public static void main(String [] args)
    {
        endangered();
        System.exit(0);
    }//END main

    public static void endangered()
    {
        String [] animals = {"Komodo Dragon","Manatee","Kakapo","Florida Panther","White Rhino"};

        int [] numbers = new int[5];
        //Storing the values from the user input in an array.
        for (int i = 0; i<5 ; i++)
        {
            print(animals[i] + ":");
            print("How many are left in the wild?");
            numbers[i]= inp();
        }

		fin(animals, numbers);

		
    }//END endangered
    //final and passing the arrays. 
	public static void fin(String animals[],int numbers[])
	{
		//Finding the minimum using a fixed value of 0 and scanning the loop for lowest
	 	int min = 0;
        for(int k=0; k<5;k++)
        {
            	if(numbers[k]<numbers[min])
            	min = k;
        }

        print("The most endangered animal is the " + animals[min] +"."+ "\n" +
               "There are only " + numbers[min] + " left in the wild." +"\n" );
        for(int j= 0; j<5; j++)
        {
            print(numbers[j]+","+animals[j]);
        }
		
	}
    //For integer input.
    public static int inp()
    {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        return a;
    }//END inp

    //For output.
    public static void print(String s)
    {
        System.out.println(s);
    }//END print

}

