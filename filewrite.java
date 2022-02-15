import java.io.*;
import java.util.*;
class filewrite
{
  public static void main(String args[])throws Exception
  {
    try
  {
    Scanner sc=new Scanner(System.in);
    FileWriter fw=new FileWriter("b.txt");
    System.out.println("Enter your Name: ");
    String name=sc.nextLine();
    System.out.println("Enter your Address: ");
    String address=sc.nextLine();
    fw.write(name+"\n");
    fw.write(address);
    fw.close();
    System.out.println("\n\nData Written to a text file!\nReading Data from that text file...\n");
    FileReader fr=new FileReader("b.txt");
    int ch;
    while((ch=fr.read())!=-1)
     {
       System.out.print((char)ch);
     }
    fr.close();
    System.out.print("\n"); 
  }
  catch (Exception e)
  {
   System.out.println(e);
  }
 }
}
