package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범만들기 {
	
	// 전체 영역에서 특정한 변수를 사용하려면
	// 클래스 아래에 선언해야한다.
	static int start = 2;  // 전역변수

	public static void main(String[] args) {
		// 영화제목
		String[] title = {"다만", "오케이", "짱구", "터넷", "해적"};
		
		// 포스터파일(파일이름)
		String[] img = {"다만.png", "오케이.png", "짱구.png", "테넷.png", "해적.png"};
		
		// 평점
		double[] jumsu = {99.9, 88.9, 77.9, 66.8, 55.5};
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 128));
		f.setSize(413, 420);
		
		JLabel top = new JLabel("짱구");
		top.setBackground(new Color(255, 255, 128));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		JLabel under = new JLabel("77.9");
		under.setBackground(new Color(240, 240, 240));
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(under, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// <<버튼을 클릭했을 대 처리하고 싶은 내용이 있으면,
				// actionPerformed()함수 안에 넣어주세요.
				// 제목이 표시된 라벨에 제목을 변경해야함
				if (start > 0) {
					start--;
					top.setText(title[start]);
					under.setText(jumsu[start] + "점");
					
					// 변경된 이미지 부품 다시 만들어야함
					// 가운데 라벨에 변경된 이미지 부품을 넣으세요.
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "왼쪽 끝입니다.");
				}
				
			}
		});
		btnNewButton.setBackground(new Color(255, 128, 192));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start < 4) {
					start++;
					top.setText(title[start]);
					under.setText(jumsu[start] + "점");
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "오른쪽 끝입니다.");
				}
				
			}
		});
		btnNewButton_1.setBackground(new Color(255, 128, 192));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);
	}

}
