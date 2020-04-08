package etc;

import java.util.LinkedList;

public class QueueDemo {

	public static void main(String[] args) {
		
		//LinkedList는 Queue 인터페이스의 구현 클래스 이기도 하다.
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
