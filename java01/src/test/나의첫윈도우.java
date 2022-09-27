package test;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.ImageIcon;

public class 나의첫윈도우 {
	private static JTextField textField;

	public static void main(String[] args) {
		// 1. jframe 부품을 새로 만들어주자
		JFrame f = new JFrame();
		
		// 2. 새로 만든 푸품의 크기를 결정
		f.setSize(559, 676);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 128, 128));
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 128, 192));
		f.getContentPane().add(textArea, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("D:\\javadev\\java-workspace\\java01\\sing.png"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		// 3. 새로 만든 부품 "보여주세요" 설정
		f.setVisible(true);
	}

}
