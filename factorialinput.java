import java.util.*;
class factorialinput
{
   public static void main(String arg[])
   {
      int n,i,fact=1;
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter the Number: ");    
      n=obj.nextInt();      
      if(n==0)
      System.out.println("Factorial is 1");
      else
      {
      for(i=1;i<=n;i++)  
        fact=fact*i;
      System.out.println("Factorial is "+fact);
      }
   }
}
      
