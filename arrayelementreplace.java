import java.util.*;
class arrayelementreplace
{
 public static void main(String args[])
 {
   int n,a,b,pos=0;
   int[] A=new int[100];
   System.out.println("Enter the number of elements:");
   Scanner obj=new Scanner(System.in);
   n=obj.nextInt();
   System.out.println("Enter the elements:");
   for(int i=0;i<n;i++)
     A[i]=obj.nextInt();
   System.out.println("Enter the value to be replaced:");
   a=obj.nextInt();
   System.out.println("Enter the value to place:");
   b=obj.nextInt();
   for(int j=0;j<n;j++)
   {
     if(A[j]==a)
     pos=j;
   }
   A[pos]=b;
   System.out.println("New array is :");
   for(int k=0;k<n;k++)
     System.out.println(A[k]);
 }
}
