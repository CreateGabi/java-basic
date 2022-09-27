package 연습;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String com = JOptionPane.showInputDialog("통신사 입력");
		String phone = JOptionPane.showInputDialog("전화번호 입력");
		String name = JOptionPane.showInputDialog("가입자이름 입력");
		
		String result = name + "님은 " + com + "에 " + phone + "로 가입되셨습니다.";

		JOptionPane.showMessageDialog(null, result);
	}

}
