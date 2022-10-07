package 크롤링;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 주식정보크롤링 {
	private static JTextField textField;
	// 버튼을 누를 때마다 textArea 부분에 결과를 넣어주려면
	// 아무곳에서나 접근이 가능해야함
	// 전역변수로 선언해주어야함
	static JTextArea textArea;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 주식 정보");
		f.getContentPane().setBackground(new Color(128, 128, 255));
		f.setSize(350, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODE:");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(111, 201, 122, 35);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 128, 192));
		textField.setFont(new Font("굴림", Font.BOLD, 30));
		textField.setBounds(24, 236, 286, 35);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setForeground(new Color(0, 0, 255));
		textArea.setFont(new Font("Monospaced", Font.BOLD, 20));
		textArea.setBounds(24, 334, 288, 204);
		f.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("삼성전자");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// code를 주면서, 크롤링 해달라고 하자.
				// 크롤링연습6.java의 naver(code) 호출
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("005930");
				textArea.setText(result);
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBackground(new Color(255, 255, 128));
		btnNewButton.setBounds(71, 32, 188, 43);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("카카오");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("035720");
				textArea.setText(result);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1.setBackground(new Color(255, 255, 128));
		btnNewButton_1.setBounds(71, 85, 188, 43);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNaver = new JButton("NAVER");
		btnNaver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("035420");
				textArea.setText(result);
			}
		});
		btnNaver.setFont(new Font("굴림", Font.BOLD, 30));
		btnNaver.setBackground(new Color(255, 255, 128));
		btnNaver.setBounds(71, 138, 188, 43);
		f.getContentPane().add(btnNaver);
		
		JButton btnNewButton_2 = new JButton("크롤링 시작");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 입력한 code를 가지고 와라!!
				// textField에 입력한 거
				String code = textField.getText();
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver(code);
				textArea.setText(result);
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 25));
		btnNewButton_2.setBounds(66, 281, 205, 43);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
