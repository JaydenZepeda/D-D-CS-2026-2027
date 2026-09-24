// Implements a singly-linked list.

public class SinglyLinkedList<E> {
	private ListNode<E> head;
	private ListNode<E> tail;

	// Edge cases:
	// exactly 1 thing
	// messing w/ end
	// messing w/ start
	// nothing in list
	// messing w/ middle

	// Constructor: creates an empty list
	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	// Constructor: creates a list that contains
	// all elements from the array values, in the same order
	public SinglyLinkedList(E[] values) {
	}

	public ListNode<E> getHead() {
		return head;
	}

	public ListNode<E> getTail() {
		return tail;
	}

	// Returns true if this list is empty; otherwise returns false.
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	// Returns the number of elements in this list.
	public int size() {
		int i = 0;
		for (ListNode<E> node = this.head; node != null; node = node.getNext()) {
			i++;
		}
		return i;
	}

	// Returns true if this list contains an element equal to obj;
	// otherwise returns false.
	public boolean contains(E obj) {
		for (ListNode<E> node = head; node != null; node = node.getNext()) {
			if (node.getValue().equals(obj)) {
				return true;
			}
		}
		return false;
	}

	// Returns the index of the first element in equal to obj;
	// if not found, returns -1.
	public int indexOf(E obj) {
		int i = 0;
		for (ListNode<E> node = head; node != null; node = node.getNext()) {
			if (node.getValue().equals(obj)) {
				return i;
			}
			i++;
		}
	}

	// Adds obj to this collection. Returns true if successful;
	// otherwise returns false.
	public boolean add(E obj) {
		if (head == null) {
			ListNode<E> a = new ListNode<E>(obj);
			head = a;
			tail = a;
			return true;
		}
		ListNode<E> a = new ListNode<E>(obj);
		tail.setNext(a);
		tail = a;
		return true;
	}

	// Removes the first element that is equal to obj, if any.
	// Returns true if successful; otherwise returns false.
	public boolean remove(E obj) {

	}

	// Returns the i-th element.
	public E get(int i) {
		ListNode<E> node = head;
		for (int j = 0; j < i; j++) {
			if (node == null) {
				throw new IndexOutOfBoundsException("Index is Invalid");
			}
			node = node.getNext();
		}
		return node.getValue();
	}

	// Replaces the i-th element with obj and returns the old value.
	public E set(int i, E obj) {
		ListNode<E> node = head;
		for (int j = 0; j < i; j++) {
			if (node == null) {
				throw new IndexOutOfBoundsException("Index is Invalid");
			}
			node = node.getNext();
		}
		E old = node.getValue();
		node.setValue(obj);
		return old;
	}

	// Inserts obj to become the i-th element. Increments the size
	// of the list by one.
	public void add(int i, E obj) {
	}

	// Removes the i-th element and returns its value.
	// Decrements the size of the list by one.
	public E remove(int i) {

	}

	// Returns a string representation of this list exactly like that for
	// MyArrayList.
	public String toString() {
		if (head == null) {
			return "[]";
		}
		StringBuilder str = new StringBuilder("[");
		for (ListNode<E> switching = head; switching != null; switching = switching.getNext()) {
			str.append(switching.getValue() + ", ");
		}
		str.delete(str.lastIndexOf(","), str.length());
		str.append("]");
		return str.toString();
	}

	public ListNode getNode() {

	}

}
