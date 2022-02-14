import java.util.*;
class factorinput
{
   public static void main(String arg[])
   {
      int n,i,fact;
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter the Number: ");    
      n=obj.nextInt();      
      System.out.println("Factors are : ");
      for(i=n;i>0;i--)  
       { if(n%i==0)
         { fact=n/i;
          System.out.println(fact); } }
    }
}
      
