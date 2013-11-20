import java.io.*;
import java.lang.Math;
public class Quicksort {
public static void main(String args[]) {
int []arr=new int[10];
int i,j,t,first;
System.out.println("Array before sorting:");
  for(i=0;i<arr.length;i++) {
  arr[i]=(int)(Math.random()*100);
  System.out.print(arr[i]);
  System.out.print(" ");
  }
quickSort(arr,0,arr.length-1);  
/*-------------------------------------------------------------------------
Display sorted array
--------------------------------------------------------------------------*/
System.out.println("");
System.out.println("Array after sorting:");
  for(j=0;j<arr.length;j++) {
  System.out.print(arr[j]);
  System.out.print(" ");
  }
System.out.println("");
}
public static void quickSort(int a[],int low, int len)  {  
      if(low>=len)
      return;             // array length=0
      int l=low,n=len; 
      int pivot=a[(l+n)/2]; // pivot
      while(l<n)
           {               
                while(l<n && a[l]<pivot)   
                     l++;   
             
                while(l<n && a[n]>pivot)  
                     n--;   
            
               if(l<n){  
                 int tem = a[l];  
                 a[l]=a[n];  
                 a[n]=tem; 
               }
               if(n<l) {
               int t = l;l=n;n=t;   
               }  
           quickSort(a,low,l); //left array sorting
           quickSort(a,l==low?l+1:l,len);  //right array sorting
          }
}
}
