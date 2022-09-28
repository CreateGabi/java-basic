package 순차문;

import java.util.Scanner;

public class 콘솔입력연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력: 나이
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		
		// 처리
		int age2 = age + 1;
		
		// 출력
		System.out.println("내년 나이는 " + age2);
	}

}
