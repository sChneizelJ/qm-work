/*
Author: Sm Shahniaz
This is a program for displaying information about the films at a cinema.*/

import java.util.*;

class Films
{
  String name;
  int hour;
  int min;
}

class boxOffice
{

  public static void main(String [] args)
  {

    showTime();
    System.exit(0);
  }

  public static void showTime()
  {
    //Records are stored in every element of the array through out the loop.
    Films [] film = new Films[4];
    for(int i=0; i<film.length;i++)
    {
      film [i] = createShow(i);
    }

    print("CinemaWorld Films Tonight");
    for(int j=0;j<4;j++)
    {
      print("Screen "+ (j+1) +": " + getName(film[j]) + "\t" +"\t" +"\t"+ getHour(film[j]) +":"+ getMin(film[j]));
    }
  }
 //Creates the record for every array of the type Films.
  public static Films createShow(int i)
  {
    int [] time = new int[2];
    print("Film for Screen " + (i+1) + "?");
    String name = input();

    print("What time does it start? Hour ");
    time[0] = Integer.parseInt(input());

    print("What time does it start? Minutes after the hour ");
    time[1] = Integer.parseInt(input());

    Films f = new Films();
    f = setName(f,name);
    f = setTime(f,time);

    return f;

  }

  //Setters
  public static Films setName(Films f, String n)
  {
    f.name = n;
    return f;
  }
  public static Films setTime(Films f, int time[])
  {
    f.hour = time[0];
    f.min = time[1];
    return f;
  }
  //Getters
  public static String getName(Films f)
  {
    return f.name;
  }

  public static int getHour(Films f)
  {
    return f.hour;
  }

  public static int getMin(Films f)
  {
    return f.min;
  }
  //For input.
  public static String input()
  {
    Scanner scan = new Scanner(System.in);
    String inp = scan.nextLine();
    return inp;
  }

  // For output.
  public static void print(String p)
  {
    System.out.println(p);
  }
}
