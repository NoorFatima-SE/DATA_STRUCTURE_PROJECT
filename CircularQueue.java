
public class CircularQueue {
	

	    int[] queue = new int[5];
	    int front = -1;
	    int rear = -1;

	    
	    void enqueue(int value) {

	       
	        if ((rear + 1) % queue.length == front) {
	            System.out.println("Queue is Full");
	            return;
	        }

	       
	        if (front == -1) {
	            front = 0;
	            rear = 0;
	        } 
	        else {
	            rear = (rear + 1) % queue.length;
	        }

	        queue[rear] = value;
	    }

	  
	    void dequeue() {

	        
	        if (front == -1) {
	            System.out.println("Queue is Empty");
	            return;
	        }

	        System.out.println("Deleted: " + queue[front]);

	     
	        if (front == rear) {
	            front = -1;
	            rear = -1;
	        } 
	        else {
	            front = (front + 1) % queue.length;
	        }
	    }

	    
	    void display() {

	        if (front == -1) {
	            System.out.println("Queue is Empty");
	            return;
	        }

	        int i = front;

	        while (true) {
	            System.out.print(queue[i] + " ");

	            if (i == rear) {
	                break;
	            }

	            i = (i + 1) % queue.length;
	        }

	        System.out.println();
	    }

	    public static void main(String[] args) {

	        CircularQueue q = new CircularQueue();

	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);
	        q.enqueue(40);
	        q.enqueue(50);

	        System.out.println("Queue:");
	        q.display();

	        q.dequeue();
	        q.dequeue();

	        System.out.println("After Dequeue:");
	        q.display();

	        q.enqueue(60);
	        q.enqueue(70);

	        System.out.println("After Enqueue:");
	        q.display();
	    }
	}

