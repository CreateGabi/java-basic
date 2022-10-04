package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(128, 255, 255));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\javadev\\java-workspace\\java04\\sing.png"));
		lblNewLabel.setBounds(40, 10, 403, 158);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(60, 191, 82, 36);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(60, 251, 111, 36);
		f.getContentPane().add(lblNewLabel_2);
		
		JButton login = new JButton("");
		login.setBackground(new Color(255, 255, 255));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = t1.getText();
				String pw = t2.getText();
				
				// id = "root", pw = "1234"
				if (id.equals("root") && pw.equals("1234")) {
					// 저 일기쓰기화면 창을 띄워라
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
				} else {
					JOptionPane.showMessageDialog(f, "입력값이 달라서 로그인 실패입니다.");
				}
							
			}
		});
		login.setIcon(new ImageIcon("D:\\javadev\\java-workspace\\java04\\login.PNG"));
		login.setFont(new Font("굴림", Font.BOLD, 20));
		login.setBounds(74, 327, 123, 85);
		f.getContentPane().add(login);
		
		JButton reset = new JButton("");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		reset.setBackground(new Color(255, 255, 255));
		reset.setIcon(new ImageIcon("D:\\javadev\\java-workspace\\java04\\reset.PNG"));
		reset.setFont(new Font("굴림", Font.BOLD, 20));
		reset.setBounds(278, 327, 131, 85);
		f.getContentPane().add(reset);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		t1.setBounds(210, 191, 213, 36);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 20));
		t2.setBounds(210, 251, 213, 36);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		f.setVisible(true);
	}
}
