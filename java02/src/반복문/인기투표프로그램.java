package 반복문;

import java.util.Scanner;

public class 인기투표프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		
		while (true) {
			System.out.print("입력 (1)아이유, (2)유재석, (3)방탄>> ");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				c1++;
			} else if (choice == 2) {
				c2++;
			} else if (choice == 3) {
				c3++;
			} else {
				System.out.println("없는 번호입니다.");
			}
			
			System.out.print("종료할까요?(x) 계속할까요?(o)");
			String exit = sc.next();
			char exit2 = exit.charAt(0);
			if (exit2 == 'x') {
				System.out.println("종료합니다.");
				System.out.println("아이유:" + c1 + " 유재석:" + c2 + " 방탄:" + c3);
				System.exit(0);
			}
		}
		
	}

}
