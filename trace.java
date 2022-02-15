import java.util.*;
class trace
{
 public static void main(String args[])
 {
   int n,sum=0;
   System.out.println("Enter the order of Matrix:");
   Scanner obj=new Scanner(System.in);
   n=obj.nextInt();
   int[][] A=new int[n][n];
   System.out.println("Enter the elements:");
   for(int i=0;i<n;i++)
   { 
     for(int j=0;j<n;j++)
     A[i][j]=obj.nextInt(); 
   }
    System.out.println("The given Matrix is:");
   for(int i=0;i<n;i++)
   { 
     System.out.print("\n");
     for(int j=0;j<n;j++)
       System.out.print(A[i][j]+" ");
   }
   for(int i=0;i<n;i++)
   {  
     for(int j=0;j<n;j++)
     {  
       if(i==j)  
        sum+=A[i][j];
     }
   }
   System.out.println("\n\nThe trace of the Matrix is "+sum);
 }
}
