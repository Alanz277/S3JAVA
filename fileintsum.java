import java.io.*;
import java.util.*;
class fileintsum
{
  public static void main(String args[])throws Exception
  {
    try
  {
    FileInputStream fin = new FileInputStream("int.txt");
    int ch;
    String a;
    int sum=0;
    System.out.println("The numbers in the file are: ");
    while((ch=fin.read())!=-1)
    {
      String s=Character.toString((char)ch);
      StringTokenzier st=new StringTokenzier(s);
      while(st.hasMoreTokens())
      {
        a=st.nextToken();
        int b=Integer.parseInt(a);
        System.out.println(b);
        sum=sum+b;
      } 
    }
  System.out.println("The sum is"+sum);
  }
  catch(Exception e)
  {
    System.out.print(e);
  }
 }
}
