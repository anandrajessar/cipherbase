import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Queue {

	/*******************************************************************
	 front is where elements are deleted& rear is where elements are inserted
	 *******************************************************************/
	int queueArray[],maxQueueSize,front,rear,currentQueueSize;
	String enteredElement;
	
	/********************************************************************
	 The function createQueue() creates a queue array with number of elements 
	 as User's input	 
	 ******************************************************************/
	private void createQueue() throws Exception{
		
	System.out.println("Enter the number of elements of Queue");
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String s=br.readLine();
	maxQueueSize=Integer.parseInt(s);
	/*************************************************************************
	 This will create a queueArray with the size entered by user
	 **************************************************************************/
	queueArray=new int [maxQueueSize];
	/*************************************************************************
	 Initially the front is set as -1 & rear is set as 0 in order to indicate there
	  is no element  in the queue.These values will be updated when elements are 
	  added to the list
	 **************************************************************************/
	front=-1;
	rear=0;
	
	}
	
	/*******************************************************************
	 function readNo() reads an integer from keyboard & returns it
	 *******************************************************************/
	private int readNo() throws Exception{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		enteredElement=br.readLine();
		int no=Integer.parseInt(enteredElement);
		return no;
	}
	/*************************************************************************
	 The function enQueue will add elements to the rear end of queue
	 ************************************************************************/
	private void enQueueRear() throws Exception{
		if(front==-1)
			++front;
		//System.out.println("rear="+rear+"size="+currentQueueSize+"front="+front+"MaxQueueSize="+maxQueueSize);
		
		/************************************************************************
		 If front=0&rear=0 which means there are no elements in the queue and we 
		 are adding first element to the queue  .Then we need to increment currentQueueSize
		 by one in order to indicate that we have added  one element to the queue.Also 
		 the value of  rear needs to be updated 
		 
		 ************************************************************************/
		if(front==0&&rear==0){
			System.out.println("Enter the element to be added to the rear end");
			int no=readNo();
			//We need to increment front in order to insert new element to queue
			queueArray[rear]=no;
			System.out.println("One element is added successfully to the queue"+rear);
			++rear;
			currentQueueSize++;
		//	System.out.println("After addition rear="+rear+"size="+currentQueueSize+"front="+front);
		}
		/************************************************************************
		 Also we can add elements to the queue if the value of rear is less than maxQueueSize
		 that is there are empty places in the queue, Then we can add elements to queue
		 ************************************************************************/
		else if(rear<maxQueueSize){
			System.out.println("Enter the element to be added to the rear end");
			int no=readNo();
			//We need to increment front in order to insert new element to queue
			queueArray[rear]=no;
			System.out.println("One element is added successfully to the queue"+rear);
			++rear;
			currentQueueSize++;
		//	System.out.println("After addition rear="+rear+"size="+currentQueueSize+"front="+front);
		}/************************************************************************
		 If rear==maxQueueSize then we can add elements to queue only if there are 
		 empty slots in the front of array (i.e if currentQueueSize<maxQueueSize)
		 ************************************************************************/
		else if(rear==maxQueueSize&&currentQueueSize<maxQueueSize){
			System.out.println("Enter the element to be added to the rear end");
			int no=readNo();
			rear=0;
			
			queueArray[rear]=no;
			System.out.println("One element is added successfully to the queue"+rear);
			++rear;
			currentQueueSize++;
		//	System.out.println("After addition rear="+rear+"size="+currentQueueSize+"front="+front);
		}
		/************************************************************************
		 If any of the above cases are not true that means there are no place in 
		 the queue
		 ************************************************************************/
		else{
			System.out.println("overflow");
		}
		
	}
	
	/*****************************************************************************
	 The function deQueueFront() is used to delete elements from queueArray.it will 
	 remove elements from Front
	 ****************************************************************************/
	private void deQueueFront(){
		//System.out.println("Before deletion rear="+rear+"size="+currentQueueSize+"front="+front);
		
		/**********************************************************************
		 If elements are present in queue  i.e value of front less  than rear
		 then we can delete element 
		 **********************************************************************/
		if(currentQueueSize==0){
			System.out.println("Underflow");	
		}
		else if(front<maxQueueSize&&currentQueueSize>0){
			queueArray[front]=0;
			++front;
			--currentQueueSize;
			System.out.println("One element has deleted");
		//	System.out.println("After deletion rear="+rear+"size="+currentQueueSize+"front="+front);
		}
		else if(front==maxQueueSize&&currentQueueSize>0){
			
			front=0;
			queueArray[front]=0;
			++front;
			--currentQueueSize;
			System.out.println("One element has deleted");
		//	System.out.println("After deletion rear="+rear+"size="+currentQueueSize+"front="+front);
		}
		
			
		
	}
	
	/****************************************************************************
	 The displayElement() function will display all elements of queue
	 
	 ***************************************************************************/
	private void displayElement(){
		/***********************************************************************
		 There wont be any elements when currentQueueSize==0 
		 *********************************************************************/
		if(currentQueueSize==0)
			System.out.println("No elements in the Queue to display:");
		/*************************************************************************
		 If currentQueueSize!=0 which means there are elements in the queue& we can 
		 print them using below code
		 *************************************************************************/
		else{
			System.out.println("Elements in queue are ");
			int i=front,j=0;
			
			while(j<currentQueueSize){
				if(i==maxQueueSize)
					i=0;
				System.out.println(queueArray[i]);
				
				j++;i++;
			}
				
			
		
		}
	}
	public static void main(String[] args) throws Exception{
		/************************************************************************
		 The Queue q=new Queue() will create a new object of Queue() class 
		 
		 **********************************************************************/
		Queue q=new Queue();
		q.createQueue();
		int choice;
		System.out.println("Menu Driven Queue Implementation using array::");
		do{
			System.out.println("Menu\n1 Enqueue\n2 Dequeue at Front \n3 Display  \n4 Exit");
			System.out.println("Enter your choice");
			choice=q.readNo();
			if(choice==1)
				q.enQueueRear();
			else if(choice==2)
				q.deQueueFront();
			else if(choice==3)
				q.displayElement();
		}while(choice!=4);
		

	}

}
