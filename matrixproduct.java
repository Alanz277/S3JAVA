import java.util.*;
class matrixproduct
{
 public static void main(String args[])
 {
   int row1,col1,row2,col2;
   Scanner obj=new Scanner(System.in);   
   System.out.println("Enter the number of Rows of First Matrix:");
   row1=obj.nextInt();
   System.out.println("Enter the number of Columns of First Matrix:");
   col1=obj.nextInt();
    System.out.println("Enter the elements of Fist Matrix:");
   int[][] A=new int[row1][col1];
   for(int i=0;i<row1;i++)
   { 
     for(int j=0;j<col1;j++)
     A[i][j]=obj.nextInt(); 
   }
   System.out.println("Enter the number of Rows of Second Matrix:");
   row2=obj.nextInt();
   System.out.println("Enter the number of Columns of Second Matrix:");
   col2=obj.nextInt();
   int[][] B=new int[row2][col2];
   System.out.println("Enter the elements of Second Matrix:");
   for(int k=0;k<row2;k++)
   { 
     for(int l=0;l<col2;l++)
     B[k][l]=obj.nextInt(); 
   }
   int[][] C=new int[row1][col2];
   if(col1!=row2)
     System.out.println("Multiplication is not possible since number of columns of first matrix is not equal to number of rows of second matrix! ");
   else
   {
     int m,n,p;
     for(m=0;m<row1;m++)
     {
      for(n=0;n<col2;n++)
      {
        C[m][n]=0;
        for(p=0;p<row2;p++)
        {
          C[m][n]+=A[m][p]*B[p][n];
        }
      }
     }
    System.out.println("The Product Matrix is: ");
   for(int s=0;s<row1;s++)
   { 
     System.out.print("\n");
     for(int t=0;t<col2;t++)
       System.out.print(C[s][t]+" ");
   }
  }
 }
}
          
        
