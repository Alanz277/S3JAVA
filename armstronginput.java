import java.util.*;
class armstronginput
{
  public static void main(String arg[])
  {
   int n,r,sum=0;
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter The Number: ");    
   n=obj.nextInt();   
   int temp=n;
   while(n>0)
   {
     r=n%10;
     sum=sum+r*r*r;
     n=n/10;
   }
  if(temp==sum)
   System.out.println("It is a Armstrong");
  else
   System.out.println("Not Armstrong");
   }
}
