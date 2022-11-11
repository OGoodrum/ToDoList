class ListEmptyException extends Exception {}
class InvalidPositionException extends Exception {}

public class LinkedList<T> {
	private int numElements;
	private Node<T> head;
	private Node<T> tail;

	public LinkedList() {
		head = null;
		tail = null;
		numElements = 0;
	}

	public void addFront (T val) {
		Node<T> n = new Node<T>(val);
		if (head != null) {
			n.next = head;
		} else {
			tail = n;
		}
		head = n;
		numElements++;
	}

	public void addBack (T val) { 
		Node<T> n = new Node<T>(val);
		if (head == null) {
			head = n;
		} else {
			n.prev = tail;
			tail.next = n;
		}
		tail = n;
		numElements++;
	}

	public int size (){
		return numElements;
	}
	
	public void insertAt(int position, T val) throws InvalidPositionException {
		if(position > this.numElements || position < 0){
			throw new InvalidPositionException();
		}
		
		if (position == 0) {
			addFront(val);
		} else if (position == numElements) {
			addBack(val);
		} else {
			Node<T> cur = head;
			for (int i = 0; i < position-1; i++) {
				cur = cur.next;
			}
			// Now cur is pointing the node in the position
			// one before the place we want to insert.
			Node<T> n = new Node<T>(val);
			n.next = cur.next;
			cur.next = n;
			numElements++;
		}
	}
	
	public T removeFront() throws ListEmptyException {
		if (head == null) {
			throw new ListEmptyException();
		}
		T toReturn = head.getData();
		if (head.next == null) {
			tail = null;
		}
		head = head.next;
		numElements--;
		return toReturn;
	}
	
	public T removeBack(){
		if (head == null) {
			return null;
		}
		T toReturn = tail.getData();
		if (head.next == null) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
		}
		numElements--;
		return toReturn;
	}

	/* Parameters: nothing
	 * Purpose: create a string representation of list
	 * Returns: (String) the string representation
	 */
	public String toString() {
		if (head == null) {
			return "\nTo do list is empty\n";
		}
		String s = "\nTo do list:\n"+head.getData().toString();
		Node<T> cur = head.next;
		while (cur != null) {
			s += "\n" + cur.getData().toString();
			cur = cur.next;
		}
		s += "\n";
		return s;
	}

	public T removeItem(String item){
		
		Node<T> cur = head;
		while(cur != null && !cur.getData().equals(item)){
			cur = cur.next;
		}

		if(cur == null){
			System.out.println("\nTask not Found");
			return null;
		}

		if(cur.next == null){
			return removeBack();
		}
		
		if(cur == head){
			head = head.next;
			head.prev = null;
		} else {
			cur.next.prev = cur.prev;
			cur.prev.next = cur.next;

		}
			
		
		System.out.println("Task Completed");

		return cur.getData();
	}

	public boolean isEmpty(){
		if(size() == 0){
			return true;
		} else {
			return false;
		}
	}

	public Node<T> getHead(){
		return this.head;
	}
    
}




