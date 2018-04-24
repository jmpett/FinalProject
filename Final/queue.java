package Final;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * @author Joe Pett 
 * A queue class used to store the owners from the fantasy
 * football tracker
 */
public class queue {
	private static final Component Null = null;
	private owner[] array;
	private int arraySize;
	private int elementCount;
	private int front;
	private int rear;

	/**
	 * Default Constructor
	 */
	public queue() {

	}

	/**
	 * @param size
	 * Constructor that creates the queue
	 */
	public queue(int size) {
		this.arraySize = size;
		array = new owner[arraySize];
		this.front = 0;
		this.rear = -1;
		this.elementCount = 0;
	}

	/**
	 * @param add
	 * Adds an string to the queue Also provides the wrap
	 */
	public void enqueue(owner add) {
		if (rear == arraySize - 1) {
			rear = -1;
		}
		array[++rear] = add;
		elementCount++;
	}

	/**
	 * removes an string from the queue sets element to null
	 */
	public void dequeue() {
		if (front == arraySize) {
			front = 0;
		}
		array[front++] = null;
		elementCount--;
	}

	/**
	 * @return checks if the queue is empty
	 */
	public boolean isEmpty() {
		return (elementCount == 0);
	}

	/**
	 * @return checks if the queue is full
	 */
	public boolean isFull() {
		return (elementCount == arraySize);
	}

	/**
	 * @return returns the current size of the queue
	 */
	public int size() {
		if (elementCount > arraySize) {
			elementCount = arraySize;
		}
		return elementCount;
	}

	/**
	 * prints out the list of currently in the queue
	 */

	public void print() {
		for (@SuppressWarnings("unused") owner arraySize : array) {
		}
		JOptionPane.showMessageDialog(null, "Results, Click OK");
		JOptionPane.showMessageDialog(Null, array);
	}

	/**
	 * @return Shows the element at the top of the queue
	 */
	public owner peek() {
		return array[front];
	}

}
