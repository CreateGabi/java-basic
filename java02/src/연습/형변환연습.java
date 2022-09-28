package 연습;

public class 형변환연습 {

	public static void main(String[] args) {
		int a = 100;  // 4개
		byte b = 50;  // 1개
		a = b;  // int <-- byte
		// 타입변환(형변환)
		// 큰 공간 <-- 작은 공간 데이터(자동형변환)
		
//		int c = 200;
		int c = 100;
		b = (byte)c;
		// 작은 공간 <-- 큰 공간 데이터(강제형변환)
		// (작은공간이름)변수;
		// 조심할 것은 작은 공간에 들어갈 수 있는 범위여야한다.
		System.out.println(b);
	}

}
