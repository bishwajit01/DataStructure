/**
 * 
 */
package queue;

/**
 * @author Bishwajit.
 *
 */
public class QueueOpertions {
	final int MAX;
	int front;
	int rear;
	int size;
	int array[];

	public QueueOpertions(int max) {
		this.MAX = max;
		front = this.size = 0;
		rear = this.MAX - 1;
		this.array = new int[this.MAX];
	}

	public static void main(String[] args) {

		QueueOpertions obj = new QueueOpertions(10);

		// Checking if the Queue is Full.
		System.out.println("Is Queue Full? " + obj.isFull());

		// Checking if the Queue is Empty.
		System.out.println("Is Queue Empty? " + obj.isEmpty());

		// Pushing into the Queue
		obj.enqueue(10);
		obj.enqueue(20);

		// Size of the Queue
		System.out.println("SIZE of Queue:: " + obj.sizeQueue());

		// Displaying the Elements of Queue.
		System.out.print("QUEUE :: ");
		obj.display();

		// Dequeue the elements from the queue.
		System.out.println("DEQUE ELEMENT :: " + obj.deque());
		
		// Displaying Elements left in Queue
		System.out.print("QUEUE :: ");
		obj.display();

		System.out.println("DEQUE ELEMENT :: " + obj.deque());

		// Size of the Queue
		System.out.println("SIZE of Queue:: " + obj.sizeQueue());

		// Displaying the Elements of Queue.
		System.out.print("QUEUE :: ");
		obj.display();
		
	}

	boolean isFull() {
		if (MAX == size) {
			System.out.println("QUEUE IS FULL !!!");
			return true;
		}
		return false;
	}

	boolean isEmpty() {
		if (size == 0) {
			System.out.println("QUEUE IS EMPTY !!!");
			return true;
		}
		return false;
	}

	void enqueue(int data) {
		if (isFull()) {
			System.out.println("QUEUE IS FULL !!!");
			return;
		} else {
			rear = (rear + 1) % MAX;
			array[rear] = data;
			size = size + 1;
		}
	}

	int deque() {
		if (size == 0) {
			System.out.println("QUEUE IS EMPTY !!!");
			return Integer.MIN_VALUE;
		} else {
			int data = array[front];
			front = (front + 1) % MAX;
			size = size - 1;
//			array[front] = Integer.MIN_VALUE;
			return data;
		}
	}

	int sizeQueue() {
		return size;
	}

	void display() {
		if (isEmpty()) {
			return;
		}
		for (int i = front; i <= rear; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
