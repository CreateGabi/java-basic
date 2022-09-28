package 조건문;

public class IfElse테스트2 {

	public static void main(String[] args) {
		int jumsu = 88;
		String result = "";  // 초기화
		// 변수를 선언할 때는 초기값을 넣어주세요!
		
		if (jumsu >= 90) {
			result = "A학점";
		} else if (jumsu >= 85 && jumsu < 90) {
			result = "B+학점";
		} else if (jumsu >= 80 && jumsu < 85) {
			result = "B-학점";
		} else if (jumsu >= 70) {
			result = "C학점";
		} else {
			result = "D학점";
		}
		
		System.out.println("당신의 학점은 " + result);
	}

}
