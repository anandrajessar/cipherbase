import java.io.*;
import java.lang.Math;
public class shell
{
public static void main(String args[])
{
 int []arr=new int[10];
 int i,j,t,flag=1;
 System.out.println("Array before sorting:");
   for(i=0;i<arr.length;i++) {
   arr[i]=(int)(Math.random()*100);
   System.out.print(arr[i]);
   System.out.print(" ");
   }
 System.out.println("");
/*-------------------------------------------------------------------------
Compare each element adjacent to the current element and swap if required     
-------------------------------------------------------------------------*/          

 int l=arr.length;
   while((flag==1)||(l>1)) {
   flag=0;
   l=(l+1)/2;
   for(j=0;(j<arr.length-l);j++) {
      if(arr[j+l]<arr[j]) {
      t=arr[j+l];
      arr[j+l]=arr[j];
      arr[j]=t;
      flag=1;
      }
   }
 
 }
/*-------------------------------------------------------------------------
Display sorted array    
-------------------------------------------------------------------------*/         

 System.out.println("Array after sorting:");
 for(j=0;j<arr.length;j++) {

 System.out.print(arr[j]);
 System.out.print(" ");
 
 }
 System.out.println("");
}

}
