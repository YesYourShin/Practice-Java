package priorityQueueTest;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		test1();
	}
	
	private static void test1() {
		/*
		 * 우선 순위 큐 객체를 생성하고
		 * Task 인스턴스를 삽입, 인출 해보자.
		 */
		// 우선순위큐: 기본적으로 오름차순으로 인출된다.
//		Queue<Task> queue = new PriorityQueue<>();
		Queue<Task> queue = new PriorityQueue<>(new TaskComparator());
		queue.offer(new Task("작업1", 3));
		queue.offer(new Task("작업2", 2));
		queue.offer(new Task("작업3", 5));
		queue.offer(new Task("작업4", 1));
		queue.offer(new Task("작업5", 4));
		// 작업4, 작업2, 작업1, 작업5, 작업3
		while(queue.isEmpty() == false) {
			Task task = queue.poll();
			
			System.out.println(task);
		}
	}

}

//Task 인스턴스를 비교가능한 객체로 생성하기 위해 Comparable 인터페이스를 구현
class Task /*implements Comparable<Task>*/{ 
		String desc; // 설명
		int priority = 5; //이 작업의 우선순위
	
		@Override // Object 클래스에 정의된 toString 메소드를 재정의하는 것
		public String toString() {
			return "[desc:"+desc+", priority:"+priority+"]";
		}
		
		public Task(String desc, int priority) {
			this.desc = desc;
			this.priority = priority;
		}

//		@Override
		public int compareTo(Task o) {
			// 이 객체의 값이 크면 양수, 같으면 0, 작으면 음수를 반환.
//			return (-1) * (this.priority - o.priority);
			return this.priority - o.priority;
		}
		
}

class TaskComparator implements Comparator<Task> {

	@Override
	public int compare(Task o1, Task o2) {
		// TODO Auto-generated method stub
//		return o1.priority - o2.priority;
		return (-1) * (o1.priority - o2.priority);
	}
	
}