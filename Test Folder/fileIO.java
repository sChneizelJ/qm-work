import java.io.*;
import java.lang.*;


class fileIO
{

  public static void main(String [] args)
  {
    String askIf_read = "yes";
    String [] names = new String[5];
    if (askIf_read.equals("yes"))
    {
      names = reader();
      writer();

      if(names != null)
      {worker(names);}
      else
      {
        names = {"nothing","nada","nada","nada","nada"};
        worker(names);
      }
    }
    else
    {
      names = {"nothing","nada","nada","nada","nada"};
      worker(names);
    }

    System.exit(0);
  }


  public static void [] worker(String [] n)
  {

    if(n[0] != null)
    {
      String [] w = {"Cow","Pow","Wow"};
      writer(w);
      for(int i; i<n.length; i++)
      {System.out.println(w);}
    }
    else
    {
      for(int i; i<n.length; i++)
      {System.out.println(n);}
    }
  }

  public static String [] reader()
  {
    try{
    BufferedReader inStream = new BufferedReader(new FileReader("mydata.txt"));

    // Read in first file entry as an integer - the number of names stored
    int NumberofNames = Integer.parseInt(inStream.readLine());
    System.out.println(NumberofNames);

    // Create an array big enough
    String [] names = new String[NumberofNames];

    // Now read in the names
    for (int i = 0; i < names.length; i++)
    {
        names[i] = inStream.readLine();

    }

    inStream.close();

    return names;
    }
  }

  public static void writer(String [] names)
  {
    try
    {
    PrintWriter outputStream = new PrintWriter(new FileWriter("mydata.txt"));

    // Create an array with some sample names to store


    // Store the names from the array in the file, one name per line
    for (int i = 0; i < names.length; i++)
    {
        outputStream.println(names[i]);
    }

    outputStream.close();
    }
    catch(IOException e)
    {}
}
