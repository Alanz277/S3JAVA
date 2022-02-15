import java.io.*;
import java.util.*;
class filenoofchar
{
  public static void main(String args[])throws Exception
  {
   FileInputStream fin = new FileInputStream("a.txt");
   int k=0,l=0,m=0;
   int ch;
   while((ch=fin.read())!=-1)
   {
     k++;
    
     if(ch=='\n')
     
     l++;
     if(ch=='\n'||ch==' ')
     m++;
     System.out.print((char)ch);
   }
   System.out.print("\nNumber of characters = "+(k-l)+"\nNumber of lines = "+l+"\nNumber of words = "+m+"\n");   
   fin.close();
   }
}
