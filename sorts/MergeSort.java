import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MergeSort {
/*********************************************************************************
 The arrayUnsorted[] is where user inputs the unsorted elements
 arraySorted[]-array which will contain the elements of in sorted order
 temp[]-array which is used for temporary use
 length-indicates the number of elements in the array
 *********************************************************************************/
	int length,i;
	int arrayUnsorted[],arraySorted[],temp[];
	public static void main(String[] args) throws Exception{
		
		MergeSort ms=new MergeSort();
		ms.readArray();
		System.out.println("The Unsorted array is ");
		ms.displayArray(ms.arrayUnsorted);
		/*************************************************************************
		 The array arrayUnsorted[] is copied to arraySorted[] which will be used for 
		 mergeSort
		 *************************************************************************/
		ms.copyArray(ms.arrayUnsorted, ms.arraySorted, 0, ms.length-1);
		ms.mergeSort(0, ms.length-1);
		System.out.println("The Sorted array is ");
		ms.displayArray(ms.arraySorted);

	}
	/*******************************************************************
	 function readArray() reads the length of array & then reads all 
	 elements to arrayUnsorted[]
	 *******************************************************************/
	private void readArray() throws Exception{
		System.out.println("Enter the number of elements  in the array");
		length=readNo();
		arrayUnsorted=new int[length];
		arraySorted=new int[length];
		temp=new int[length];
		System.out.println("Enter the elements of array");
		for(i=0;i<length;i++){
			
			arrayUnsorted[i]=readNo();	
		}
	}
	/*******************************************************************
	 function readNo() reads an integer from keyboard & returns it
	 *******************************************************************/
	private int readNo() throws Exception{
		String enteredElement;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		enteredElement=br.readLine();
		int no=Integer.parseInt(enteredElement);
		return no;
	}

	/**************************************************************************
	 function displayArray() is used to display all the elements of the array,
	 which  given as its input 
	 **************************************************************************/
	private void displayArray(int[] arrayToDisplay ){
		int i;
		for(i=0;i<length;i++) {
                System.out.print(arrayToDisplay[i]);
                System.out.print(" ");
		}
		System.out.println();	
	}
	/*****************************************************************************
	 function mergeSort() is where original divide and conquer approach happens.Here 
	 the lower & upper limit of array are taken as input & the whole array is split 
	 into two subarrays.Then these two subarrays are again divided until subarray 
	 will have 1 element in it.Then sub arrays are merged in a sorted manner
	 *****************************************************************************/
	private void mergeSort(int low,int high){
		if(low<high){
			int mid=(low+high)/2;
			mergeSort(low, mid);
			mergeSort(mid+1, high);
			merge(low,mid,high);
			
		}
				
	}
	/*****************************************************************************
	 function merge() is used to merge two subarrays in a sorted manner.For temporary 
	 storing results of sorted array, temp[] array is used.
	 In this function the subarrays are individually sorted.The subarray elements are 
	 compared with other & the elements of both array are stored to temporary array 
	 in sorted manner.After sorting  the both arrays & then the sorted result is copied 
	 from temp[] array to arraySorted[] 
	 ******************************************************************************/
	private void merge(int low,int mid,int high){
		int i,j,k;
		i=j=low;
		k=mid+1;
		while(i<=mid&&k<=high){
			if(arraySorted[i]<=arraySorted[k]){
				temp[j]=arraySorted[i];
				i++;
			}
			else{
				temp[j]=arraySorted[k];
				k++;
				
			}
			j++;
		}
		while(i<=mid){
			temp[j]=arraySorted[i];
			j++;i++;
		}
		while(k<=high){
			temp[j]=arraySorted[k];
			k++;
			j++;
		}
		
		copyArray(temp, arraySorted, low,high);
		
	}
	
	/****************************************************************************
	  function copyArray() is used to copy existingArray[] to newArray with lower 
	  & upper limits as existingArrayLow & existingArrayHigh 
	 ***************************************************************************/
	private void copyArray(int existingArray[],int newArray[],int existingArrayLow,int existingArrayHigh){
		for(int i=existingArrayLow;i<=existingArrayHigh;i++){
			newArray[i]=existingArray[i];
		}
			
		
	}
	

}
