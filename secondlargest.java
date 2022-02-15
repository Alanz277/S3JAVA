import java.util.*;
class secondlargest
{
 public static void main(String args[])
 {
   int n;
   System.out.println("Enter the number of elements:");
   Scanner obj=new Scanner(System.in);
   n=obj.nextInt(); 
   int[] A=new int[n]; 
   System.out.println("Enter the elements:");
   for(int i=0;i<n;i++)
     A[i]=obj.nextInt();
   int temp1=A[0],pos1=0;
   for(int j=1;j<n;j++)
   {
    if(A[j]>temp1)
    {  
      temp1=A[j];
      pos1=j;
    }   
   }
   int temp2=A[0],pos2=0;
   for(int k=1;k<n;k++)
   {
    if(k==pos1)
      continue;
    if(A[k]>temp2)
    {  
      temp2=A[k];
      pos2=k;
    }   
   }
   System.out.println("The Second Largest element is "+temp2+" and it is in the array position "+pos2);
 }
}
