package 연습;

public class Exam01 {

	public static void main(String[] args) {
		// 1번
		int[] arr = new int[5];
		
		// 2번
		System.out.println(arr.length);
		
		// 3번
		arr[0] = 100;
		System.out.println(arr[0]);
		
		// 4번
		arr[arr.length - 1] = 500;
		System.out.println(arr[arr.length - 1]);
		
		// 5번
		arr[2] = 200;
		System.out.println(arr[2]);
		
		// 6번
		for (int i : arr) {
			System.out.println(i);
		}
		
		// 7번
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
	}

}
