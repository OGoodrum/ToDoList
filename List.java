public interface List<T> {
    
	/*
	 * Purpose:  add val to the front of the list
	 * Parameters: T val - the value to insert
	 * Returns: void - nothing
	 */
	void addFront (T val);

	/*
	 * Purpose:  add val to the back of the list
	 * Parameters: T val - the value to insert
	 * Returns: void - nothing
	 */
	void addBack (T val);
	
	/*
	 * Purpose: remove and return the front element from the list
	 * Parameters: none
	 * Returns: T - the value of the element removed
	 * Throws: ListEmptyException - if there is nothing to remove
	 */
	T removeFront() throws ListEmptyException;
	
	/*
	 * Purpose: remove and return the back element from the list
	 * Parameters: none
	 * Returns: T - the value of the element removed
	 * Throws: ListEmptyException - if there is nothing to remove
	 */
	T removeBack();
	
	/*
	 * Purpose: get the number of elements in the list
	 * Parameters: none
	 * Returns: int - number of elements in list
	 */
	int size ();
	
	/* Purpose: insert val into the specified position while
	 *          maintaining the order of all other elements
	 * Parameters: int position - the 0-based position to insert
	 *             T val - the value to insert
	 * Returns: void - nothing
	 * Throws: InvalidPositionException - if the given position
	 *         is less than 0 or greater than the number of elements
	 */
	void insertAt (int position, T val) throws InvalidPositionException;

	/*
	 * Purpose: remove the specified item while keeping the order of th list
	 * Parameters: String item - the string value of the item that you want 
	 * 			   to be removed from the list
	 * Returns: T - The Data of the node
	 */
	T removeItem(String item);

	/*
	 * Purpose: to check if the list is empty
	 * Parameters: none
	 * Returns: true if the list is empty and false if the list is not empty
	 */
	boolean isEmpty();

	/* Purpose: to get the head of the list
	 * Parameters: none
	 * Returns: Node<T> - the head of the list
	 */
	Node<T> getHead ();
    
}

