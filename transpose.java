import java.util.*;
class transpose
{
 public static void main(String args[])
 {
   int row,col,sum=0;
   Scanner obj=new Scanner(System.in);   
   System.out.println("Enter the number of Rows:");
   row=obj.nextInt();
   System.out.println("Enter the number of Columns:");
   col=obj.nextInt();
   int[][] A=new int[row][col];
   System.out.println("Enter the elements:");
   for(int i=0;i<row;i++)
   { 
     for(int j=0;j<col;j++)
     A[i][j]=obj.nextInt(); 
   }
    System.out.println("The given Matrix is:");
   for(int i=0;i<row;i++)
   { 
     System.out.print("\n");
     for(int j=0;j<col;j++)
       System.out.print(A[i][j]+" ");
   }
   System.out.println("\n\nThe Transpose of the Matrix is: ");
   for(int k=0;k<col;k++)
   { 
     System.out.print("\n");
     for(int l=0;l<row;l++)
       System.out.print(A[l][k]+" ");
   }
 }
}  
