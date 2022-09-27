package 연습;

import javax.swing.JOptionPane;

public class Exam04 {

	public static void main(String[] args) {
		// 1번
		char pw = 'p';
		
		String pw2 = JOptionPane.showInputDialog("패스워드");
		
		char pw3 = pw2.charAt(0);
		
		if (pw == pw3) {
			JOptionPane.showMessageDialog(null, "PASS!");
		} else {
			JOptionPane.showMessageDialog(null, "재입력!");
		}
	
		
		// 2번
		String weight = JOptionPane.showInputDialog("어제와 오늘의 몸무게 변화");
		
		double weight2 = Double.parseDouble(weight);
		
		if (weight2 > 2) {
			JOptionPane.showMessageDialog(null, "다이어트 성공!");
		}
		
		
		// 3번
		if (pw == pw3 && weight2 > 2) {
			JOptionPane.showMessageDialog(null, "오늘은 성공!");
		} else {
			JOptionPane.showMessageDialog(null, "내일 다시 도전!");
		}
	
		
		// 4번
		int n1 = 66;
		int n2 = 77;
		int n3 = 88;
		int n4 = 99;
		
		double result1 = (n1 + n2 + n3 + n4) / 4.0;
		
		System.out.println(result1);
		
		
		// 5번
		double PI = 3.14;
		double r = 2.2;
		
		double result2 = PI * r * r;
		
		System.out.printf("%.2f", result2);
	}

}
