
public class StackArray {
	
	    int[] arr = new int[5];
	    int top = -1;

	    void push(int value) {
	        if (top == arr.length - 1) {
	            System.out.println("Stack Overflow");
	        } else {
	            arr[++top] = value;
	        }
	    }

	    void pop() {
	        if (top == -1) {
	            System.out.println("Stack Underflow");
	        } else {
	            System.out.println("Popped: " + arr[top--]);
	        }
	    }

	    void display() {
	        for (int i = top; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        StackArray s = new StackArray();

	        s.push(10);
	        s.push(20);
	        s.push(30);

	        s.display();

	        s.pop();
	        s.display();
	    }
	}


