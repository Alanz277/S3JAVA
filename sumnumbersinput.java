import java.util.*;
class sumnumbersinput
{
   public static void main(String arg[])
   {
      int n,i,sum=0;
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter the Number: ");    
      n=obj.nextInt();
      System.out.println("Sum of first "+n+" numbers are :");
      for(i=1;i<=n;i++)  
        sum=sum+i;
          System.out.println(sum);  
    }
}
