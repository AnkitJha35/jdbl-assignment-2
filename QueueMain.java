package comparable;

import java.util.Arrays;

public class QueueMain {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.offer(6);
		System.out.println(queue.toString());
		System.out.println("peek "+queue.peek());
		System.out.println("poll "+queue.poll());
		System.out.println("remove "+queue.remove());
		System.out.println("size "+queue.size());
	}
}

class Queue {
	Integer size = 0;
	Integer[] arr = new Integer[5];
	Integer head = 0;
	Integer tail = -1;

	public boolean add(Integer e) {
		if (size >= arr.length * 75 / 100) {
			Integer temp[] = new Integer[arr.length * 2];
			for (int i = tail; i < head; i++) {
				temp[i] = arr[i];
			}

			arr = temp;
		}

		arr[head] = e;
		head++;
		size++;
		if (tail == -1) {
			tail += 1;
		}
		return true;
	}

	public boolean offer(Integer e) {
		arr[head] = e;
		head++;
		size++;
		return true;
	}

	public Integer remove() {
		if (tail == -1) {
			throw new NullPointerException("Queue is empty");
		}
		Integer res = arr[tail];
		tail++;
		size--;
		return res;
	}

	public Integer poll() {
		if (tail == -1) {
			return null;
		}
		Integer res = arr[tail];
		tail++;
		size--;
		return res;
	}

	public Integer peek() {
		if (tail == -1) {
			return null;
		}
		return arr[tail];
	}

	public int size() {
		return this.size;
	}

	@Override
	public String toString() {
		return "Queue [arr=" + Arrays.toString(arr) + "]";
	}

}
