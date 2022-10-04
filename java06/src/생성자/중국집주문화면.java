package 생성자;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.ImagingOpException;
import java.awt.event.ActionEvent;

public class 중국집주문화면 {
	static int count;  // 전역변수는 자동 초기화
	static final int PRICE = 5000;  // 상수는 final을 붙여서 변경불가능
	
	private static JTextField t1;
	static int 짬뽕count = 0;
	static int 우동count = 0;
	static int 짜장count = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame("음식점 주문 화면");
		f.getContentPane().setBackground(new Color(128, 255, 128));
		f.getContentPane().setForeground(new Color(0, 0, 0));
		f.setSize(800, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setBounds(459, 42, 58, 30);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setForeground(new Color(0, 0, 255));
		t1.setBackground(new Color(255, 255, 128));
		t1.setFont(new Font("굴림", Font.PLAIN, 18));
		t1.setBounds(514, 42, 207, 30);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel center = new JLabel("");
		ImageIcon img = new ImageIcon("짜장면.png");
		center.setIcon(img);  // 주소
		center.setBounds(45, 89, 676, 281);
		f.getContentPane().add(center);
		
		JLabel result = new JLabel("결제금액");
		result.setForeground(new Color(255, 0, 0));
		result.setFont(new Font("굴림", Font.BOLD, 24));
		result.setBounds(45, 380, 676, 54);
		f.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 주문량을 현재 카운트에 하나 플러스
				count++;
				짬뽕count++;
				// t1에 현재 주문량을 변경
				t1.setText(count + "개");
				// center라벨에 있는 이미지 변경
				ImageIcon icon = new ImageIcon("짬뽕.png");
				center.setIcon(icon);
				// result라벨에 있는 결제금액 변경
				result.setText("결제금액: " + (count * PRICE) + "원"); 
				f.setTitle("짬뽕: " + 짬뽕count + " 우동: " + 우동count + " 짜장: " + 짜장count);
			}
		});
		btnNewButton.setBackground(new Color(255, 128, 192));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton.setBounds(45, 10, 91, 62);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 주문량을 현재 카운트에 하나 플러스
				count++;
				우동count++;
				// t1에 현재 주문량을 변경
				t1.setText(count + "개");
				// center라벨에 있는 이미지 변경
				ImageIcon icon = new ImageIcon("우동.png");
				center.setIcon(icon);
				// result라벨에 있는 결제금액 변경
				result.setText("결제금액: " + (count * PRICE) + "원"); 
				f.setTitle("짬뽕: " + 짬뽕count + " 우동: " + 우동count + " 짜장: " + 짜장count);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 128, 64));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton_1.setBounds(165, 10, 91, 62);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("짜장면");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 주문량을 현재 카운트에 하나 플러스
				count++;
				짜장count++;
				// t1에 현재 주문량을 변경
				t1.setText(count + "개");
				// center라벨에 있는 이미지 변경
				ImageIcon icon = new ImageIcon("짜장면.png");
				center.setIcon(icon);
				// result라벨에 있는 결제금액 변경
				result.setText("결제금액: " + (count * PRICE) + "원"); 
				f.setTitle("짬뽕: " + 짬뽕count + " 우동: " + 우동count + " 짜장: " + 짜장count);
			}
		});
		btnNewButton_1_1.setBackground(new Color(128, 255, 255));
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton_1_1.setBounds(282, 10, 91, 62);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true);
	}
}
