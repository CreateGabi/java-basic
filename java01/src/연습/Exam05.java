package 연습;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Exam05 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(105, 194, 71, 38);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(105, 254, 71, 38);
		f.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 20));
		textField.setBounds(185, 194, 183, 30);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(185, 258, 183, 30);
		f.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.setBackground(new Color(128, 255, 255));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(105, 334, 126, 66);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.setBackground(new Color(255, 128, 255));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(256, 334, 126, 66);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\javadev\\java-workspace\\java01\\sing.png"));
		lblNewLabel_2.setBounds(0, 0, 486, 152);
		f.getContentPane().add(lblNewLabel_2);
		f.setVisible(true);

	}
}
