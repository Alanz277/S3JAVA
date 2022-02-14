import java.util.*;
class fibonacciinput
{
  public static void main(String arg[])
  {
   int n,a=0,b=1,c;
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter the Number of Elements: ");    
   n=obj.nextInt();   
   System.out.println("The Fibonacci series is : ");
   System.out.println(a);
   System.out.println(b);
   for(int i=3;i<=n;i++)
   {
     c=a+b;
     System.out.println(c);
     a=b;
     b=c; 
   }
  }
}
