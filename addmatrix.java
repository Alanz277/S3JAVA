import java.util.*;
class addmatrix
{
 public static void main(String args[])
 {
   int row,col;
   Scanner obj=new Scanner(System.in);   
   System.out.println("Enter the number of Rows:");
   row=obj.nextInt();
   System.out.println("Enter the number of Columns:");
   col=obj.nextInt();
   int[][] A=new int[row][col];
   int[][] B=new int[row][col];
   int[][] C=new int[row][col];
   System.out.println("Enter the elements of Fist Matrix:");
   for(int i=0;i<row;i++)
   { 
     for(int j=0;j<col;j++)
     A[i][j]=obj.nextInt(); 
   }
   System.out.println("Enter the elements of Second Matrix:");
   for(int k=0;k<row;k++)
   { 
     for(int l=0;l<col;l++)
     B[k][l]=obj.nextInt(); 
   }
   System.out.println("The First Matrix is:");
   for(int m=0;m<row;m++)
   { 
     System.out.print("\n");
     for(int n=0;n<col;n++)
       System.out.print(A[m][n]+" ");
   }
   System.out.println("\n\nThe Second Matrix is:");
   for(int o=0;o<row;o++)
   { 
     System.out.print("\n");
     for(int p=0;p<col;p++)
       System.out.print(B[o][p]+" ");
   }
   for(int q=0;q<row;q++)
   { 
     for(int r=0;r<col;r++)
     C[q][r]=A[q][r]+B[q][r];
   }
   System.out.println("\n\nThe Sum Matrix is: ");
   for(int s=0;s<row;s++)
   { 
     System.out.print("\n");
     for(int t=0;t<col;t++)
       System.out.print(C[s][t]+" ");
   }
 }
}
