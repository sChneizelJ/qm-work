
class Ta
{
  String  ana1, ana2, ana3;
  String qana;
}


class test
{
  public static void main(String [] args)
  {
    Ta [] rec = new Ta[2];
    for(int i=0;i<2;i++)
    {
      rec [i] = createT(i);

    }
    askques(rec);
    System.exit(0);
  }
  public static void askques(Ta rec[])
  {
      for(int i=0;i<2;i++)
      {
        print(getqana(rec[i]) +"\n"+ getana1(rec[i]));
      }
  }
  public static Ta createT(int i)
  {
    String [] ques = {"is this name?","is this type?"};
    String [] ans1 = {"Gara","Sundere"};
    String [] ans2 = {"Naruto","Yandere"};
    String [] ans3 = {"Sauske","Himedere"};
    Ta n = new Ta();
    n = setq(n,ques[i]);
    n = seta(n,ans1[i],ans2[i],ans3[i]);
    return n;
  }
  public static Ta setq (Ta n, String a)
  {
    n.qana = a;
    return n;
  }
  public static Ta seta(Ta n, String b,String c,String d)
  {
    n.ana1 = b;
    n.ana2 = c;
    n.ana3 = d;

    return n;
  }
  public static String getqana(Ta n)
  {
    return n.qana;
  }
  public static String getana1(Ta n)
  {
    return n.ana1;
  }
  public static String getana2(Ta n)
  {
    return n.ana2;
  }
  public static String getana3(Ta n)
  {
    return n.ana3;
  }


  public static void print(String a)
  {
    System.out.println(a);
  }

}
