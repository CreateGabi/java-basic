package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Counter {
	static int count;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(300, 300);		
		f.getContentPane().setLayout(null);
		
		JLabel number = new JLabel("0");
		number.setHorizontalAlignment(SwingConstants.CENTER);
		number.setForeground(new Color(255, 0, 0));
		number.setFont(new Font("굴림", Font.BOLD, 60));
		number.setBounds(12, 83, 262, 145);
		f.getContentPane().add(number);
		
		JButton btnNewButton = new JButton("1더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++;
				number.setText(count + "");
			}
		});
		btnNewButton.setBackground(new Color(128, 255, 128));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton.setBounds(0, 10, 91, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("0으로 초기화");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText("0");
			}
		});
		btnNewButton_1.setBackground(new Color(128, 255, 255));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton_1.setBounds(87, 10, 122, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1빼기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + "");
			}
		});
		btnNewButton_2.setBackground(new Color(128, 255, 128));
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton_2.setBounds(208, 10, 76, 23);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
