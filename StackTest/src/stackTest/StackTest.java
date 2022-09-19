package stackTest;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		/*
		 * Stack : LIFO(Last In First Out)
		 */
		/*
		 * Generic : Ŭ���� ���ο��� ����� ������ Ÿ���� ������ ���� �ƴϰ�
		 * 			�� Ŭ������ ��ü�� ������ �� ������ �� �ֵ���, 
		 * 			����� ������ Ÿ���� �Ķ���ͷ� �޾Ƽ� ��ü�� �����ϴ� ��.
		 * �Ķ����(Type Parameter)
		 */
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < 10; i++) {
			stack.push(i + 1);
		}
		System.out.println(stack);
		// 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 
		while(!stack.isEmpty()) {
			Integer val = stack.pop();
			System.out.println(val);
		}
	}

}
