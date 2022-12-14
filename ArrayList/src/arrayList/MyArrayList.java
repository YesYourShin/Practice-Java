package arrayList;

public class MyArrayList<T> {
	private Object[] arr;
	private int capacity = 10;
	private int size = 0;
	
	public MyArrayList() {
		arr = new Object[capacity];
	}
	
	private void increaseCapacity() {
		//수용할 수 없으면 arr의 배열의 크기를 늘려야 한다.
		capacity = capacity + capacity/2;
		Object[] tmp = new Object[capacity];
		// 원래 값들을 tmp로 복사
		for (int i = 0; i < size; i++) {
			tmp[i] = arr[i];
		}
		// arr 용량이 늘어난 배열을 가르키도록 한다.
		arr = tmp;		
	}
	
	public void add(T value) {
		// 현재 용량으로 추가되는 값을 수용할 수 있으면
		if (size < capacity) {
			increaseCapacity();
		}
		arr[size++] = value;
	}
	
	public void add(int idx, T value) {
		// 용량이 이미 꽉차있으면 용량을 50%를 늘리고
		// 아래 코드를 실행한다.
		if (size == capacity) {
			// 용량을 늘리자
			increaseCapacity();
		}
		
		// 맨 뒤에 있는 원소부터 오른쪽으로 한 칸씩 민다.
		for (int i = size-1; i>=idx; i--) {
			arr[i+1] = arr[i];
		}
		// idx 자리에 value를 넣는다
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
		list2.add("홍길동");
		list2.add("아버지");
		
		list2.add(1, "어머니");
		
		System.out.println(list2);
		
		MyArrayList<Student> list3 = new MyArrayList<>();
		list3.add(new Student("손오공", 123));
		list3.add(new Student("손오공", 124));
		list3.add(new Student("손오공", 125));
		
		System.out.println(list3);
	}

}
