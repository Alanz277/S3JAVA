import java.util.*;
class arraysmallest
{
 public static void main(String args[])
 {
   int n;
   int[] A=new int[100];
   System.out.println("Enter the number of elements:");
   Scanner obj=new Scanner(System.in);
   n=obj.nextInt();
   System.out.println("Enter the elements:");
   for(int i=0;i<n;i++)
     A[i]=obj.nextInt();
   int temp=A[0],pos=0;
   for(int j=1;j<n;j++)
   {
    if(A[j]<temp)
    {  
      temp=A[j];
      pos=j;
    }   
   }
   System.out.println("The smallest element is "+temp+" and it is in the array position "+pos);
 }
}
