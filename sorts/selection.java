import java.io.*;
import java.lang.Math;
public class selection
{
public static void main(String args[])
{
 int []arr=new int[10];
 int i,j,t,first;
 System.out.println("Array before sorting:");
   for(i=0;i<arr.length;i++) {
   arr[i]=(int)(Math.random()*100);
   System.out.print(arr[i]);
   System.out.print(" ");
   }
 System.out.println("");
/*-------------------------------------------------------------------------
'first' is used to store the index of element that is currently minimum
the left side of array is always sorted   
--------------------------------------------------------------------------*/        

 for(i=arr.length-1;i>0;i--) {
   first=0;
   for(j=1;j<=i;j++) {
      if(arr[j]>arr[first]) {
      first=j;
      }
   }
 t=arr[first];
 arr[first]=arr[i];
 arr[i]=t;
 
 }
/*-------------------------------------------------------------------------
Display sorted array    
--------------------------------------------------------------------------*/         

 System.out.println("Array after sorting:");
 for(j=0;j<arr.length;j++) {

 System.out.print(arr[j]);
 System.out.print(" ");
 
 }
 System.out.println("");
}

}
