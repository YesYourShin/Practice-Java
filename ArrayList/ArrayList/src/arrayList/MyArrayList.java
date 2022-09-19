package arrayList;

public class MyArrayList<T> {
	private Object[] arr;
	private int capacity = 10;
	private int size = 0;
	
	public MyArrayList() {
		arr = new Object[capacity];
	}
	
	private void increaseCapacity() {
		//������ �� ������ arr�� �迭�� ũ�⸦ �÷��� �Ѵ�.
		capacity = capacity + capacity/2;
		Object[] tmp = new Object[capacity];
		// ���� ������ tmp�� ����
		for (int i = 0; i < size; i++) {
			tmp[i] = arr[i];
		}
		// arr �뷮�� �þ �迭�� ����Ű���� �Ѵ�.
		arr = tmp;		
	}
	
	public void add(T value) {
		// ���� �뷮���� �߰��Ǵ� ���� ������ �� ������
		if (size < capacity) {
			increaseCapacity();
		}
		arr[size++] = value;
	}
	
	public void add(int idx, T value) {
		// �뷮�� �̹� ���������� �뷮�� 50%�� �ø���
		// �Ʒ� �ڵ带 �����Ѵ�.
		if (size == capacity) {
			// �뷮�� �ø���
			increaseCapacity();
		}
		
		// �� �ڿ� �ִ� ���Һ��� ���������� �� ĭ�� �δ�.
		for (int i = size-1; i>=idx; i--) {
			arr[i+1] = arr[i];
		}
		// idx �ڸ��� value�� �ִ´�
		arr[idx] = value ;
		size++;
	}
	
	public void remove() {
		if(size > 0) size--;
	}
	
	public void remove(int idx) {
		
	}
	
	public T get (int idx) {
		return (T)arr[idx];
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		if (size == 0) return "[]";
		String result = "[";
		for(int i = 0; i < size-1; i++) {
			result += arr[i] + ",";
			if ((i+1) % 10 == 0) result += "\n";
		}
		result += arr[size-1];
		result += "]";
		return result;
	}
	
	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<>();
//		MyArrayList list = new MyArrayList();
//		System.out.println(list);
//		
//		for (int i = 0; i < 10; i++) {
//			list.add(i);			
//		}
		
		
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		

//		System.out.println(list);

//		list.add(3, 100);
//		System.out.println(list);
//		
////		list.remove(3);
//		list.remove(Integer.valueOf(100));
//		System.out.println(list);
		
		MyArrayList<String> list2 = new MyArrayList<>();
		list2.add("ȫ�浿");
		list2.add("�ƹ���");
		
		list2.add(1, "��Ӵ�");
		
		System.out.println(list2);
		
		MyArrayList<Student> list3 = new MyArrayList<>();
		list3.add(new Student("�տ���", 123));
		list3.add(new Student("�տ���", 124));
		list3.add(new Student("�տ���", 125));
		
		System.out.println(list3);
	}

}
