/*
 * Author: Sm Shahnaiz
 * This is a program that gives information about paintings in an art gallery for visitors.
 *
*/

import java.util.*;

class artgallery
{
    public static void main(String[] args)
    {
        askvisitor();
        System.exit(0);
    }
    /*Asks the user for the room they are in and hence then calling information from records
    associated with that room*/

    public static void askvisitor()
    {
        String userin;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which room are you in?");
        userin = scanner.nextLine();

        if (foo)
        {
            System.out.println(" Something +s+ somethinf +s+ ");
        }
        else if
        {
            System.out.println(" Something +s+ somethinf +s+ ");
        }
        else if
        {
            System.out.println(" Something +s+ somethinf +s+ ");
        }
        else if
        {
            System.out.println(" Something +s+ somethinf +s+ ");
        }
        else
        {
            System.out.println(" Something +s+ somethinf +s+ "); //:P
        }

    }// END askvisitor

    public static void room1()
    {
        artrecords r1 = new artrecords()




        return;

    }
    /*These following methods are the getter methods*/

    public static String getDirerction (artrecords r)
    {
        return r.direction;
    }

    public static String getArtist (artrecords r)
    {

        return r.artist;

    }

    public static String getTitle (artrecords r)
    {
         return r.title;

    }

    public static int getYear (artrecords r)
    {
         return r.year;

    }

    public static double getHeight (artrecords r)
    {
         return r.height;

    }

    public static double getWidth (artrecords r)
    {
         return r.width;

    }

    /*The following methods are the setter methods*/

     public static String setDirerction (artrecords r, String direc)
     {
        r.directions = direc;
        return r;

     }

     public static String setArtist (artrecords r, String name)
     {
        r.artist = name;
        return r;

     }

     public static String setTitle (artrecords r, String artname)
     {
         r.title = artname;
         return r;

     }

     public static int setYear (artrecords r, int yrs)
     {
        r.year = yrs;
        return r;


     }

     public static double setHeight (artrecords r, double hei)
     {
        r.height = hei;
        return r;


     }

     public static double setWidth (artrecords r, double wid)
     {
        r.width = wid;
        return r;


     }


}// END class artgallery

/*This is the class for storing the records of the different paintings and different info about them*/

class artrecords
{
    String direction; String artist; String title;
    int year;
    double height; double width;
}// END class artrecords
