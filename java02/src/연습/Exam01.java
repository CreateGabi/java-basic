package 연습;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("나에 대한 정보");
		System.out.println("-------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력>> ");
		String name = sc.next();
		System.out.print("나이 입력>> ");
		int age = sc.nextInt();
		System.out.print("취미 입력>> ");
		String hobby = sc.next();
		
		System.out.println("-------------");
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age + "세");
		System.out.println("나의 취미는 " + hobby + "입니다!");
	}

}
