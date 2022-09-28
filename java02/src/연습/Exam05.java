package 연습;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// 1번 문제
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력>>");
		int n1 = sc.nextInt();
		System.out.print("숫자2 입력>>");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println("앞 숫자가 크다.");
		} else {
			System.out.println("뒤 숫자가 더 크거나 같다.");
		}
		
		
		// 2번 문제
		System.out.print("당신이 좋아하는 과목은>> ");
		String data = sc.next();
		
		switch (data) {
		case "java":	
			System.out.println("JSP로 점프");
			break;
		case "python":
			System.out.println("장고로 점프");
			break;
		default:
			System.out.println("무조건 열심히!");
			break;
		}
	}

}
