import java.util.*;
class exception2
{
  public static void main(String args[])throws Exception
  {
    try
  {
    int[] ar=new int[5];
    System.out.println(ar[5]);
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
  }
}
