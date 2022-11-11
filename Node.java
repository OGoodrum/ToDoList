public class Node<T>{
	    
	private T data;
	protected Node<T> next;
	protected Node<T> prev;

	public Node (T value) {
		this.data = value;
		this.next = null;
		this.prev = null;
	}

	/*
	 * Purpose: get the data value of this Node
	 * Parameters: nothing	 
	 * Returns: T - the data value
	 */
	public T getData() {
		return data;
	}

	/*
	 * Purpose: get the next node
	 * Parameters: nothing
	 * Returns: Node<T> - the next node
	 */
	public Node<T> getNext() {
		return next;
	}

	/*
	 * Purpose: update the next reference for this node
	 * Parameters: Node<T> next - the new next
	 * Returns: void - nothing
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}

	public void setPrev(Node<T> prev){
		this.prev = prev;
	}

	public Node<T> getPrev(){
		return prev;
	}

}