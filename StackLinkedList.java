
public class StackLinkedList {
	

	      class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    Node top = null;

	    void push(int value) {
	        Node newNode = new Node(value);

	        newNode.next = top;
	        top = newNode;
	    }

	    void pop() {
	        if (top == null) {
	            System.out.println("Stack Underflow");
	        } else {
	            System.out.println("Popped: " + top.data);
	            top = top.next;
	        }
	    }

	    void display() {
	        Node temp = top;

	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }

	        System.out.println();
	    }

	    public static void main(String[] args) {
	        StackLinkedList s = new StackLinkedList();

	        s.push(10);
	        s.push(20);
	        s.push(30);

	        s.display();

	        s.pop();
	        s.display();
	    }
	}

