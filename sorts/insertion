import java.io.*;
import java.lang.Math;
public class insertion
{
public static void main(String args[])
{
 int []arr=new int[10];
 int i,j,t;
 System.out.println("Array before sorting:");
   for(i=0;i<arr.length;i++) {
   arr[i]=(int)(Math.random()*100);
   System.out.println(arr[i]);
   }
 for(j=1;j<arr.length;j++) {
   t=arr[j];
   for(i=j-1;(i>=0) && (arr[i]>t);i--) {
   arr[i+1]=arr[i];
   }
 arr[i+1]=t;
 }
 System.out.println("Array after sorting:");
 for(j=0;j<arr.length;j++) {

 System.out.println(arr[j]);
 }
}

}
