import java.util.*;
class largestinmatrix
{
 public static void main(String args[])
 {
   int n;
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
   int large=A[0][0];
   for(int i=0;i<n;i++)
   {  
     for(int j=0;j<n;j++)
     {  
       if(A[i][j]>large)
         large=A[i][j];
     }
   }
   System.out.println("\n\nThe largest element in the matrix is "+large);
 }
}
          
