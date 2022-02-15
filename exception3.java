import java.io.*;
import java.util.*;
class exception3
{
  public static void main(String args[])throws Exception
  { 
   try
   {
   FileInputStream fin = new FileInputStream("nonexist.txt");
   int i=1;
   int ch;
   System.out.print(i+"-");
   while((ch=fin.read())!=-1)
   {
     System.out.print((char)ch);
     if(ch=='\n')
     System.out.print(++i+"-");
   }
   fin.close();
   }
   catch(Exception e)
  {
   System.out.println(e);
  }
 }
}

