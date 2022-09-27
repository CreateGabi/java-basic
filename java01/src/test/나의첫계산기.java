package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의첫계산기 {
	private static JTextField t1;
	private static JTextField t2;

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
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBounds(185, 194, 183, 30);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBounds(185, 258, 183, 30);
		f.getContentPane().add(t2);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// plus버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");
				// 1. 두 수를 가지고 오세요(String)
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				// 2. 숫자로 변경해서 정수변수에 넣어주세요
				int n11 = Integer.parseInt(s1);
				int n22 = Integer.parseInt(s2);
				
				// 3. 결과 출력
//				JOptionPane.showMessageDialog(f, n11 + n22);
				f.setTitle("더한 결과는 " + (n11 + n22));
//				result.setText("더한 결과는 " + (n11 + n22);
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.blue);
				t1.setForeground(Color.red);
			}
		});
		plus.setBackground(new Color(128, 255, 255));
		plus.setFont(new Font("굴림", Font.BOLD, 20));
		plus.setBounds(105, 326, 95, 38);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "마이너스 버튼을 누르셨군요.");
				// 1. 두 수를 가지고 오세요(String)
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				// 2. 숫자로 변경해서 정수변수에 넣어주세요
				int n11 = Integer.parseInt(s1);
				int n22 = Integer.parseInt(s2);
				
				// 3. 결과 출력
				JOptionPane.showMessageDialog(f, n11 - n22);
			}
		});
		minus.setBackground(new Color(255, 128, 255));
		minus.setFont(new Font("굴림", Font.BOLD, 20));
		minus.setBounds(273, 326, 95, 38);
		f.getContentPane().add(minus);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\javadev\\java-workspace\\java01\\sing.png"));
		lblNewLabel_2.setBounds(0, 0, 486, 152);
		f.getContentPane().add(lblNewLabel_2);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나누기");
				// 1. 두 수를 가지고 오세요(String)
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				// 2. 숫자로 변경해서 정수변수에 넣어주세요
				int n11 = Integer.parseInt(s1);
				int n22 = Integer.parseInt(s2);
				
				// 3. 결과 출력
				JOptionPane.showMessageDialog(f, n11 / n22);
			}
		});
		div.setFont(new Font("굴림", Font.BOLD, 20));
		div.setBackground(new Color(128, 255, 255));
		div.setBounds(273, 377, 95, 38);
		f.getContentPane().add(div);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "곱하기");
				// 1. 두 수를 가지고 오세요(String)
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				// 2. 숫자로 변경해서 정수변수에 넣어주세요
				int n11 = Integer.parseInt(s1);
				int n22 = Integer.parseInt(s2);
				
				// 3. 결과 출력
				JOptionPane.showMessageDialog(f, n11 * n22);
			}
		});
		mul.setFont(new Font("굴림", Font.BOLD, 20));
		mul.setBackground(new Color(255, 128, 255));
		mul.setBounds(105, 377, 95, 38);
		f.getContentPane().add(mul);
		f.setVisible(true);

	}
}
