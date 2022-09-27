package 연습;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exam06 {
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 255, 0));
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setBounds(38, 43, 189, 42);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는?");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1.setBounds(38, 186, 189, 42);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("국어 점수");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_2.setBounds(38, 346, 189, 42);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("수학 점수");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_3.setBounds(38, 431, 189, 42);
		f.getContentPane().add(lblNewLabel_3);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 18));
		t3.setBounds(239, 346, 198, 42);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.BOLD, 18));
		t4.setColumns(10);
		t4.setBounds(239, 431, 198, 42);
		f.getContentPane().add(t4);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 18));
		t1.setColumns(10);
		t1.setBounds(239, 43, 198, 42);
		f.getContentPane().add(t1);
		
		JButton b1 = new JButton("어디로 갈까?");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				if (s1.equals("아메리카노") || s1.equals("아이스 아메리카노") || s1.equals("홍차")) {
					JOptionPane.showMessageDialog(f, "카페 가세요.");
				} else {
					JOptionPane.showMessageDialog(f, "물이나 마셔요.");
				}
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 18));
		b1.setBounds(38, 102, 402, 42);
		f.getContentPane().add(b1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 18));
		t2.setColumns(10);
		t2.setBounds(239, 186, 198, 42);
		f.getContentPane().add(t2);
		
		JButton b1_1 = new JButton("나의 내년 나이는?");
		b1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				
				int n22 = Integer.parseInt(s2);
				
				JOptionPane.showMessageDialog(f, n22 + 1);
			}
		});
		b1_1.setFont(new Font("굴림", Font.BOLD, 18));
		b1_1.setBounds(38, 248, 402, 42);
		f.getContentPane().add(b1_1);
		
		JButton b1_2 = new JButton("두 과목 점수의 평균은?");
		b1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText();
				String s4 = t4.getText();
				
				double n33 = Double.parseDouble(s3);
				double n44 = Double.parseDouble(s4);
				double avg = (n33 + n44) / 2;
				
				JOptionPane.showMessageDialog(f, avg);
			}
		});
		b1_2.setFont(new Font("굴림", Font.BOLD, 18));
		b1_2.setBounds(35, 483, 402, 42);
		f.getContentPane().add(b1_2);
		f.setSize(500, 600);
		f.setVisible(true);
	}
}
