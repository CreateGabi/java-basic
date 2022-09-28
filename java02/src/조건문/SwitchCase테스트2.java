package 조건문;

import java.util.Date;

public class SwitchCase테스트2 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay();
		// 0이 일요일, 1이 월요일, 6이 토요일
		switch (day) {
		case 0: case 6:
			System.out.println("놀자");
			break;
		default:
			System.out.println("자바 공부하러 가자");
			break;
		}
		
		// 계절을 판별해보세요
		switch (month) {
		case 3:
			
			break;

		default:
			break;
		}
	}

}
