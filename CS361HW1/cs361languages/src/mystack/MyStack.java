/**
 * 
 */
package mystack;

/**
 * @author Sebastian Dabrowski 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		MyNode<T> currentNode = theStack;
		MyNode<T> nextNode = theStack.next;
		if (nextNode == null) {
			theStack = null;
			return currentNode.val;
		}
		else {
			// loop until nextNode is the last node in the list
			while (nextNode.next != null) {
				currentNode = nextNode;
				nextNode = currentNode.next;
			}
			// remove previous Node's pointer to nextNode and return the value of nextNode
			currentNode.next = null;
			return nextNode.val;
		}
	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> pushedNode = new MyNode<T>(v, null);
		if (theStack == null) {
			theStack = pushedNode;
		}
		else {
			MyNode<T> currentNode = theStack;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = pushedNode;
		}
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> stack = new MyStack<Integer>();
		// Push 1 and 2
		stack.push(new Integer(1));
		stack.push(new Integer(2));
		// Pop
		stack.pop();
		// Push 5
		stack.push(new Integer(5));
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> personStack = new MyStack<Person>();
		// Push a person p1 with your name
		Person p1 = new Person("Sebastian", "Dabrowski");
		personStack.push(p1);
		// Push a person p2 with my name
		Person p2 = new Person("Christelle", "Scharff");
		personStack.push(p2);
	}

}
