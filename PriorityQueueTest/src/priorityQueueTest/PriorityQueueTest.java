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
		 * �켱 ���� ť ��ü�� �����ϰ�
		 * Task �ν��Ͻ��� ����, ���� �غ���.
		 */
		// �켱����ť: �⺻������ ������������ ����ȴ�.
//		Queue<Task> queue = new PriorityQueue<>();
		Queue<Task> queue = new PriorityQueue<>(new TaskComparator());
		queue.offer(new Task("�۾�1", 3));
		queue.offer(new Task("�۾�2", 2));
		queue.offer(new Task("�۾�3", 5));
		queue.offer(new Task("�۾�4", 1));
		queue.offer(new Task("�۾�5", 4));
		// �۾�4, �۾�2, �۾�1, �۾�5, �۾�3
		while(queue.isEmpty() == false) {
			Task task = queue.poll();
			
			System.out.println(task);
		}
	}

}

//Task �ν��Ͻ��� �񱳰����� ��ü�� �����ϱ� ���� Comparable �������̽��� ����
class Task /*implements Comparable<Task>*/{ 
		String desc; // ����
		int priority = 5; //�� �۾��� �켱����
	
		@Override // Object Ŭ������ ���ǵ� toString �޼ҵ带 �������ϴ� ��
		public String toString() {
			return "[desc:"+desc+", priority:"+priority+"]";
		}
		
		public Task(String desc, int priority) {
			this.desc = desc;
			this.priority = priority;
		}

//		@Override
		public int compareTo(Task o) {
			// �� ��ü�� ���� ũ�� ���, ������ 0, ������ ������ ��ȯ.
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