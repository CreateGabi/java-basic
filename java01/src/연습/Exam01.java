package 연습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = JOptionPane.showInputDialog("가로를 입력하세요.");
		String y = JOptionPane.showInputDialog("세로를 입력하세요.");
		
		int x2 = Integer.parseInt(x);
		int y2 = Integer.parseInt(y);

		int result = x2 * y2;
		
		JOptionPane.showMessageDialog(null, "사각형의 면적은 " + result);

	}

}
