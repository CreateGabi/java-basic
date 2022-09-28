package 반복문;

public class For문확인문제2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=1000; i+=3) {			
			if (sum >= 100) {
				break;
			}
			if (i % 5 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}

}
