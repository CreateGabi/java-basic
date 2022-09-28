package 반복문;

public class For문확인문제 {

	public static void main(String[] args) {
		// 1번 문제
		int sum = 0;
		for (int i=33; i<=222; i++) {
			sum += i;
		}
		System.out.println(sum);

		int sum2 = 0;
		for (int i=55; i<=4500; i+=2) {
			sum2 += i;
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for (int i=0; i<=6000; i+=5) {
			sum3 += i;
		}
		System.out.println(sum3);
	}

}
