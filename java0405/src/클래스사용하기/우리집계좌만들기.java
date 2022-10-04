package 클래스사용하기;

import 클래스만들기.계좌;

public class 우리집계좌만들기 {

	public static void main(String[] args) {
		계좌 계좌1 = new 계좌();
		
		계좌1.이름 = "홍길동";
		계좌1.계좌이름 = "튼튼적금";
		계좌1.금액 = 1000;
		
		계좌1.입금하다();
		계좌1.출금하다();
		계좌1.계좌출력();
	}

}
