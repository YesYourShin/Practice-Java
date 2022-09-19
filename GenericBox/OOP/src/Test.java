import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("날짜 입력");
		int date = input.nextInt();
		
		assert (date >= 1 && date <= 31);
		
		System.out.printf("입력된 날짜는 %d 입니다.\n", date);
		
		
	}

}
