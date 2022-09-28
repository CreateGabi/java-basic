package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);  // 0 ~ 99
//		int target = 88;
		int count = 0;
		int fail = 0;
		
		while (true) {
			String data = JOptionPane.showInputDialog("생각한 숫자 입력");
			count++;
			int data2 = Integer.parseInt(data);
			if (data2 == target) {
				System.out.println("정답입니다!");
				System.out.println("정답은 " + target);
				System.out.println("전체 시도횟수는 " + count);
				System.out.println("틀린 시도횟수는 " + fail);
//				break;  // while 종료
				System.exit(0);  // 게임 프로그램을 종료
			} else {
				fail++;
				System.out.println("정답이 아닙니다.");
				
				// 입력한 값이 정답보다 큰지, 작은지를 알려주세요.
				if (data2 > target) {
					System.out.println("너무 커요.");
				} else {
					System.out.println("너무 작아요.");
				}
			} 
		}

//		JOptionPane.showMessageDialog(null, "다음에 또 방문해주세요.");
	}

}
