/* See ArrayList documentation here:
 * http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
 */

/*
 * Your indexed functions should throw IndexOutOfBoundsException if index is invalid!
 */

public class MyArrayList<E> {

	/* Internal Object counter */
	protected int objectCount;

	/* Internal Object array */
	protected E[] internalArray;

	/* Constructor: Create it with whatever capacity you want? */
	@SuppressWarnings("unchecked")
	public MyArrayList() {
		this.internalArray = (E[]) new Object[100];
	}

	/* Constructor with initial capacity */
	@SuppressWarnings("unchecked")
	public MyArrayList(int initialCapacity) {
		this.internalArray = (E[]) new Object[initialCapacity];
	}

	/* Return the number of active slots in the array list */
	public int size() {
		return objectCount;
	}

	/* Are there zero objects in the array list? */
	public boolean isEmpty() {
		if (objectCount == 0) {
			return true;
		}
		return false;
	}

	/* Get the index-th object in the list. */
	public E get(int index) {
		/* ---- YOUR CODE HERE ---- */
	}

	/* Replace the object at index with obj. returns object that was replaced. */
	public E set(int index, E obj) {
		/* ---- YOUR CODE HERE ---- */
	}

	/*
	 * Returns true if this list contains an element equal to obj;
	 * otherwise returns false.
	 */
	public boolean contains(E obj) {
		for (int i = 0; i < objectCount; i++) {
			if (internalArray[i].equals(obj)) {
				return true;
			}
		}
		return false;
	}

	/* Insert an object at index */
	@SuppressWarnings("unchecked")
	public void add(int index, E obj) {
		if (index >= objectCount) {
			throw new IndexOutOfBoundsException();
		}
		this.objectCount++;
		if (internalArray.length < objectCount) {
			E[] temp = (E[]) new Object[objectCount];
			temp[index] = obj;
			for (int i = 0; i < internalArray.length; i++) {
				if (i >= index) {
					temp[i + 1] = internalArray[i];
				} else {
					temp[i] = internalArray[i];
				}
			}
			internalArray = temp;
		} else {
			E[] temp = (E[]) new Object[100];
			temp[index] = obj;
			for (int i = 0; i < objectCount - 1; i++) {
				if (i >= index) {
					temp[i + 1] = internalArray[i];
				} else {
					temp[i] = internalArray[i];
				}
			}
			internalArray = temp;
		}

	}

	/* Add an object to the end of the list; returns true */
	@SuppressWarnings("unchecked")
	public boolean add(E obj) {
		this.objectCount++;
		if (internalArray.length < objectCount) {
			E[] temp = (E[]) new Object[objectCount];
			temp[objectCount - 1] = obj;
			for (int i = 0; i < internalArray.length; i++) {
				temp[i] = internalArray[i];
			}
			internalArray = temp;
			return true;
		}
		internalArray[objectCount - 1] = obj;
		return true;
	}

	/* Remove the object at index and shift. Returns removed object. */
	public E remove(int index) {
		/* ---- YOUR CODE HERE ---- */
	}

	/*
	 * Removes the first occurrence of the specified element from this list,
	 * if it is present. If the list does not contain the element, it is unchanged.
	 * More formally, removes the element with the lowest index i such that
	 * (o==null ? get(i)==null : o.equals(get(i))) (if such an element exists).
	 * Returns true if this list contained the specified element (or equivalently,
	 * if this list changed as a result of the call).
	 */
	public boolean remove(E obj) {
		for (int i = 0; i < objectCount; i++) {
			if (internalArray[i].equals(obj)) {
				this.objectCount--;
				if (internalArray.length > objectCount) {
					E[] temp = (E[]) new Object[100];
					for (int index = 0; index < objectCount + 1; i--) {
						if (index <= i) {
							temp[index] = internalArray[index + 1];
						} else {
							temp[index] = internalArray[index];
						}
					}
					internalArray = temp;
					return true;
				} else {
					E[] temp = (E[]) new Object[objectCount];
					for (int index = 0; index < objectCount + 1; i--) {
						if (index <= i) {
							temp[index] = internalArray[index + 1];
						} else {
							temp[index] = internalArray[index];
						}
					}
					internalArray = temp;
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * For testing; your string should output as "[X, X, X, X, ...]" where X, X, X,
	 * X, ... are the elements in the ArrayList.
	 * If the array is empty, it should return "[]". If there is one element, "[X]",
	 * etc.
	 * Elements are separated by a comma and a space.
	 */
	public String toString() {
		String str = "[";
		for (int i = 0; i < objectCount; i++) {
			str += internalArray[i].toString() + ", ";
		}
		str = str.substring(0, str.lastIndexOf(",")) + "]";
		return str;
	}

}