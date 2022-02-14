class armstrong
{
  public static void main(String arg[])
  {
   int n=153,r,sum=0;
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
