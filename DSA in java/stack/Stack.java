class Stack{



private int arr[];
private int top;
private int capacity;
/*

creating a Stack

*/
Stack(int size){
arr = new int [size];
capacity =size;
top = -1;
}
/*
Add Element into Stack
*/
public void push(int x){
if (isFull()){
System.out.println("overflow \n Program Terminated\n");
System.exit(1);
}
 
 System.out.println("Inserting" + x);
 arr[++top] = x;
}

/*
Remove element from stack

*/

public int pop(){
if(isEmpty()){
System.out.println("STACK EMPTY");
System.exit(1);
}
return arr[top--];
}


// Until function to return the size of the stack

public int size(){
return top+1;

}


/*
Check if the stack is empty 

*/

public Boolean isEmpty(){
return top ==-1;

}


/*

check if the stck is full

*/
public Boolean isFull(){
 return top == capacity -1;
}




public void printStack(){

for(int i = 0; i<=top;i++){
System.out.print(arr[i]+" ");
}


}

public static void main(String[] args){
Stack stack = new Stack(5);

stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
// stack.pop();
System.out.print("\nAfter popping Out\n");
stack.printStack();


}

}

