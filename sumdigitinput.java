import java.util.*;
class sumdigitinput
{
  public static void main(String arg[])
  {
   int a,n,i=0;
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter the Number: ");
   a=obj.nextInt();
   while(a>0)
   {
     n=a%10;
     i=i+n;
     a=a/10;
   }
   System.out.println("The sum of digits is "+i);
  }
}
