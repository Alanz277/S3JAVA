import java.util.*;
class paliendrominput
{
  public static void main(String arg[])
  {
   int n,r,s=0;
   Scanner obj=new Scanner(System.in);   
   System.out.println("Enter The Number: ");    
   n=obj.nextInt();   
   int f=n;
   while(n>0)
   {
     r=n%10;
     s=(s*10)+r;
     n=n/10;
   }
   if(f==s)
   System.out.println("It is a paliendrom");
   else
   System.out.println("Not paliendrom");
  }
}
   
