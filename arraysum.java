import java.util.*;
class arraysum
{
 public static void main(String args[])
 {
   int n,sum=0;
   int[] A=new int[100];
   System.out.println("Enter the number of elements:");
   Scanner obj=new Scanner(System.in);
   n=obj.nextInt();
   System.out.println("Enter the elements:");
   for(int i=0;i<n;i++)
     A[i]=obj.nextInt();
   for(int j=0;j<n;j++)
     sum=sum+A[j];
   System.out.println("Sum of elements are "+sum);
 }
}
