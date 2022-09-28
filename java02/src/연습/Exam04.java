package 연습;

import java.util.Date;

public class Exam04 {

	public static void main(String[] args) {
		// 1번 문제
		Date date = new Date();
		int hour = date.getHours();
		
		if (hour < 11) {
			System.out.println("굿모닝");
		} else if (hour < 15) {
			System.out.println("굿애프터눈");
		} else if (hour < 19) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
		
		
		// 2번 문제
		int month = date.getMonth() + 1;
		
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
			break;
		}
	}

}
