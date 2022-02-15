import java.util.*;
class exception1
{
  public static void main(String args[])throws Exception
  {
    try
  {
    int a=6;
    int b=a/0;
    System.out.println(b);
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
  }
}
