package 연습;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int front = 0;
		int back = 0;
		
		while (true) {
			System.out.print("숫자입력1>>");
			int n1 = sc.nextInt();
			System.out.print("숫자입력2>>");
			int n2 = sc.nextInt();
			
			if (n1 > n2) {
				System.out.println("앞 숫자가 더 큽니다.");
				front++;
			} else if (n1 == n2) {
				System.out.println("숫자가 동일함");
			} else {
				System.out.println("뒷 숫자가 더 큽니다.");
				back++;
			}
			
			System.out.print("종료할까요?(x) 계속할까요?(o)");
			String exit = sc.next();
			char exit2 = exit.charAt(0);
			if (exit2 == 'x') {
				System.out.println("게임을 종료합니다.");
				System.out.println("앞 숫자가 더 큰 횟수: " + front);
				System.out.println("뒷 숫자가 더 큰 횟수: " + back);
				System.exit(0);
			}
		}
	}

}
