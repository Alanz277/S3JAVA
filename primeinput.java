import java.util.*;
class primeinput
{
  public static void main(String arg[])
  {
   int i,n,num=1;
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter the Number: ");    
   n=obj.nextInt();
   for(i=2;i<=n/2;i++)
   {
     if(n%i==0)
      {
        num=0;
        break;
      }
   }
   if(num==0)
       System.out.println("The number is not Prime");
   else
        System.out.println("The number is Prime");
   }
}
