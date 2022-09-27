package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String height = JOptionPane.showInputDialog("키를 입력하세요.");

		double height2 = Double.parseDouble(height);

		// 자바는 연산 시 연산하는 데이터 중 하나라도 실수이면 결과는 무조건 실수
		double result = (height2 - 100.0) * 0.9;
		
		JOptionPane.showMessageDialog(null, "적정몸무게는 " + result);

	}

}
