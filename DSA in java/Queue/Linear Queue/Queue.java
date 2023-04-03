/*Basic operation of queue 
 Enqueue -    add an element to the end of the queue
 Dequeue -    Remove an element form the fornt of the queue 
 IsEmpty -    Check if the queue is empty
 isFull  -    Check if the queue is full
 peek    -    get the value of the front of the queue without removing it 


 Working of Queue 

 Queue operation is work as follows:
 two pointers FRONT and REAR 
 FRONT track the first element of the queue
 REAR track the last element of the queue
 initial value of FRONT & REAR is -1
 
 ENQUEUE OPERATION 
 check if the queue is full
 for the first element set the value of FRONT to 0
 increase the REAR index by 1
 add the new element in the position pointed to by REAR


 DEUEUE OPERATION 
 check if the queue is empty 
 return the value pointed by front
 increse the front index by 1
 for the last element reset the values of FRONT & REAR to -1

 */
// Queue implementation in Java

public class Queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;
  
    Queue() {
      front = -1;
      rear = -1;
    }
  
    boolean isFull() {
      if (front == 0 && rear == SIZE - 1) {
        return true;
      }
      return false;
    }
  
    boolean isEmpty() {
      if (front == -1)
        return true;
      else
        return false;
    }
  
    void enQueue(int element) {
      if (isFull()) {
        System.out.println("Queue is full");
      } else {
        if (front == -1)
          front = 0;
        rear++;
        items[rear] = element;
        System.out.println("Inserted " + element);
      }
    }
  
    int deQueue() {
      int element;
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return (-1);
      } else {
        element = items[front];
        if (front >= rear) {
          front = -1;
          rear = -1;
        } 
        else {
          front++;
        }
        System.out.println("Deleted -> " + element);
        return (element);
      }
    }
  
    void display() {
      
      int i;
      if (isEmpty()) {
        System.out.println("Empty Queue");
      } else {
        System.out.println("\nFront index-> " + front);
        System.out.println("Items -> ");
        for (i = front; i <= rear; i++)
          System.out.print(items[i] + "  ");
  
        System.out.println("\nRear index-> " + rear);
      }
    }
  
    public static void main(String[] args) {
      Queue q = new Queue();
  
      // deQueue is not possible on empty queue
      q.deQueue();
  
      // enQueue 5 elements
      q.enQueue(1);
      q.enQueue(2);
      q.enQueue(3);
      q.enQueue(4);
      q.enQueue(5);
  
      // 6th element can't be added to because the queue is full
      q.enQueue(6);
  
      q.display();
  
      // deQueue removes element entered first i.e. 1
      q.deQueue();
  
      // Now we have just 4 elements
      q.display();
  
    }
  }
