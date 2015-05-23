import java.util.*;

public class Bucky {
	public static void main (String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		q.offer("first");
		q.offer("second");
		q.offer("third");
		//print the queue
		System.out.printf("%s ", q);
		System.out.println();
		//print the priority of the queue
		System.out.printf("%s ", q.peek());
		System.out.println();
		//show the remaining queue
		q.poll();
		System.out.printf("%s ", q);
	}
}
