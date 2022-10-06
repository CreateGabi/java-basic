package 형변환;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 신호등 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 0, 0));
		f.setSize(618, 692);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("빨강신호");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("r.png");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("노랑신호");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("y.png");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("파랑신호");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("b.png");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_2.setBackground(new Color(0, 0, 255));
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}

}
