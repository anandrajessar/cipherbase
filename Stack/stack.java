import java.awt.DisplayMode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Stack {
/**************************************************************************
Here size refers to the total size of stack,top points to the top element
of stack
**************************************************************************/
int size,top;
int[] stackArray;
public static int set=0;
/**************************************************************************
createStack() method is used to create  a stack with  user specified 
number of elements .This function will return  true if number of elements 
are successfully read & stack Array is successfully created 
*************************************************************************/
private boolean createStack() throws IOException{
try{
set=1;
System.out.println("Enter the number of elemetns of stack");
size=readNo();
stackArray=new int[size];
return true; 
}
catch(Exception e)
{
return false;
}
}
/**************************************************************************
this readNo() function will read an integer from keyboard and returns the number
 
************************************************************************/
private int readNo(){
int no=-1;
try {
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
String entered;
entered = br.readLine();
no=Integer.parseInt(entered);
} catch (IOException e) 
{
e.printStackTrace();
}
return no;
}
/**************************************************************************
Push() function is used to add new elements to the stack at its 
top position.It will first increment the top to indicate new element 
is added to the stack & the entered element is added to stack  
************************************************************************/
private void Push(){
System.out.println("Enter the element to be inserted");
++top;
System.out.println(top);
int k=readNo();
stackArray[top]=k;
set=1;
}
/*************************************************************************
Pop() function is used to remove /pop elements from the top of stack.Here 
top is decremented to indicate next element 
*************************************************************************/
private void Pop() {
int topElement=stackArray[top];
--top;
System.out.println("The deleted number from stack is "+topElement);
}
/*************************************************************************
Display function is used to display all elements starting from top element
 
*************************************************************************/
private void display(){
int k=top;
System.out.println("Elements in Stack are::");
for(;k>=0;k--){
System.out.println(stackArray[k]+" ");
}
}

public static void main(String[] args) throws Exception{
/*******************************************************************
It creates an object of Stack class named 's'
***************************************************************/
int option=0;
Stack s=new Stack();
s.top=-1;
/***************************************************************************
It is a menu driven program.It runs until user enters exit option
**************************************************************************/
do{
System.out.println("Menu: \n 1- Create Stack \n 2- Push\n 3- Pop\n 4- Display \n 5- Exit  ");
option=s.readNo();
if(option==1){
if(s.createStack()){
System.out.println("Stack created successfully");
}
else{
System.out.println("Stack not created");
}
}
else if(option==2){
if(set==1)
{
s.Push();
System.out.println("One item successfully added to Stack");
}
else
{
System.out.println("Create stack first");
}
}
else if(option==3){
if(s.top!=-1)
s.Pop();
else
{
System.out.println("Stack is empty ! or not build");
}
}
else if(option==4)
{
s.display();
}
}while(option!=5);
}
}
