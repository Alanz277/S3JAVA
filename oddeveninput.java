import java.util.*;
class oddeveninput
{
   public static void main(String arg[])
   {
      int n;
      System.out.println("Enter the Number:");
      Scanner obj=new Scanner(System.in);
      n=obj.nextInt();
      if(n%2==0)
       System.out.println("The Number is Even");
      else
       System.out.println("The Number is Odd");
   }
}

