/*
 * Author: Sm Shahnaiz Date: 11 Oct 2016
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
        int userin;
        //Starting of the records of the paintings.
        Artrecords r1 = new Artrecords();
        {
            r1 = setDirection(r1, "ahead of you");
            r1 = setArtist(r1,"Mary Cassatt");
            r1 = setYear(r1, 1879);
            r1 = setTitle(r1, "Pearl Necklace in a Loge");
            r1 = setHeight(r1, 81.3);
            r1 = setWidth(r1, 59.7);
        }

        Artrecords r2 = new Artrecords();
        {
            r2 = setDirection(r2, "ahead of you");
            r2 = setArtist(r2,"Rembrandt");
            r2 = setYear(r2, 1659);
            r2 = setTitle(r2, "Self-Portrait with Beret and Turned-Up Collar");
            r2 = setHeight(r2, 84.5);
            r2 = setWidth(r2, 66.0);
        }

        Artrecords r3 = new Artrecords();
        {
            r3 = setDirection(r3, "on the left");
            r3 = setArtist(r3,"Olga Boznanska");
            r3 = setYear(r3, 1894);
            r3 = setTitle(r3, "Girl with Chrysanthemums");
            r3 = setHeight(r3, 88.5);
            r3 = setWidth(r3, 69.0);
        }

        Artrecords r4 = new Artrecords();
        {
            r4 = setDirection(r4, "on your right");
            r4 = setArtist(r4,"Claude Monet");
            r4 = setYear(r4, 1872);
            r4 = setTitle(r4, "Impression");
            r4 = setHeight(r4, 48.0);
            r4 = setWidth(r4, 63.0);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which room are you in?");
        userin = Integer.parseInt(scanner.nextLine());

        if (userin == 1)
        {
            System.out.println("The painting " + getDirection(r1) + " is by "
            + getArtist(r1) + ". It was painted in " + getYear(r1) + " and is called "
            + getTitle(r1) + ". It is " + getHeight(r1) + "cm by " + getWidth(r1) + "cm.");
        }
        else if (userin == 2)
        {
            System.out.println("The painting " + getDirection(r2) + " is by "
            + getArtist(r2) + ". It was painted in " + getYear(r2) + " and is called "
            + getTitle(r2) + ". It is " + getHeight(r2) + "cm by " + getWidth(r2) + "cm.");
        }
        else if (userin == 3)
        {
            System.out.println("The painting " + getDirection(r3) + " is by "
            + getArtist(r3) + ". It was painted in " + getYear(r3) + " and is called "
            + getTitle(r3) + ". It is " + getHeight(r3) + "cm by " + getWidth(r3) + "cm.");
        }
        else if (userin == 4)
        {
            System.out.println("The painting " + getDirection(r4) + " is by "
            + getArtist(r4) + ". It was painted in " + getYear(r4) + " and is called "
            + getTitle(r4) + ". It is " + getHeight(r4) + "cm by " + getWidth(r4) + "cm.");
        }
        else
        {
            System.out.println("Then please ask the reception or read the brochure provided"); //:P
        }
    }// END askvisitor

    /*These following methods are the getter methods*/

    public static String getDirection (Artrecords r)
    {
        return r.direction;
    }

    public static String getArtist (Artrecords r)
    {
        return r.artist;
    }

    public static String getTitle (Artrecords r)
    {
        return r.title;
    }

    public static int getYear (Artrecords r)
    {
        return r.year;
    }

    public static double getHeight (Artrecords r)
    {
        return r.height;
    }

    public static double getWidth (Artrecords r)
    {
        return r.width;
    }

    /*The following methods are the setter methods*/

    public static Artrecords setDirection (Artrecords r, String direc)
    {
        r.direction = direc;
        return r;
    }

    public static Artrecords setArtist (Artrecords r, String name)
    {
        r.artist = name;
        return r;
    }

    public static Artrecords setTitle (Artrecords r, String artname)
    {
        r.title = artname;
        return r;
    }

    public static Artrecords setYear (Artrecords r, int yrs)
    {
        r.year = yrs;
        return r;
    }

    public static Artrecords setHeight (Artrecords r, double hei)
    {
        r.height = hei;
        return r;
    }

    public static Artrecords setWidth (Artrecords r, double wid)
    {
        r.width = wid;
        return r;
    }

}// END class artgallery

/*This is the class for storing the records of the different paintings and different info about them*/

class Artrecords
{
    String direction; String artist; String title;
    int year;
    double height; double width;
}// END class artrecords
