
public class QueueArray {
	
	    int[] arr = new int[5];
	    int front = 0;
	    int rear = -1;

	    void enqueue(int value) {
	        if (rear == arr.length - 1) {
	            System.out.println("Queue Overflow");
	        } else {
	            arr[++rear] = value;
	        }
	    }

	    void dequeue() {
	        if (front > rear) {
	            System.out.println("Queue Underflow");
	        } else {
	            System.out.println("Deleted: " + arr[front++]);
	        }
	    }

	    void display() {
	        if (front > rear) {
	            System.out.println("Queue is Empty");
	            return;
	        }

	        for (int i = front; i <= rear; i++) {
	            System.out.print(arr[i] + " ");
	        }

	        System.out.println();
	    }

	    public static void main(String[] args) {
	        QueueArray q = new QueueArray();

	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);

	        q.display();

	        q.dequeue();
	        q.display();
	    }
	}

