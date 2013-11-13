import java.io.*;
import java.lang.Math;
public class bubble
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
-------------------------------------------------------------------------
Compare each element adjacent to the current element and swap if required     
-------------------------------------------------------------------------          

 for(i=0;i<arr.length && flag==1;i++) {
   flag=0;
   for(j=0;(j<arr.length-1);j++) {
      if(arr[j+1]<arr[j]) {
      t=arr[j];
      arr[j]=arr[j+1];
      arr[j+1]=t;
      flag=1;
      }
   }
 
 }
-------------------------------------------------------------------------
Display sorted array    
-------------------------------------------------------------------------          

 System.out.println("Array after sorting:");
 for(j=0;j<arr.length;j++) {

 System.out.print(arr[j]);
 System.out.print(" ");
 
 }
 System.out.println("");
}

}
