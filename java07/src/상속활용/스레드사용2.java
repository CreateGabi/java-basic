package 상속활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드사용2 extends JFrame{
	JLabel star, sImage;
	별스레드 star2;
	별이미지스레드 sImage2;
	static 스레드사용2 f;
	
	public 스레드사용2() {
		getContentPane().setBackground(Color.CYAN);
		setSize(500, 300);
		star = new JLabel("별");
		sImage = new JLabel();
		Font font = new Font("궁서", Font.BOLD, 30);
		star.setFont(font);
		
		add(star, BorderLayout.WEST);
		add(sImage, BorderLayout.EAST);
		setVisible(true);
		
		star2 = new 별스레드();
		sImage2 = new 별이미지스레드();

		star2.start();
		sImage2.start();
	}
	
	public static void main(String[] args) {
		f = new 스레드사용2();
		
	}
	
	public class 별스레드 extends Thread {

		@Override
		public void run() {
			String[] list = {"★", "★★", "★★★", "★★★★", "★★★★★"};
			for (int i = 4; i >= 0; i--) {
				star.setText(list[i]);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if (i == 0) {
					JOptionPane.showMessageDialog(f, "종료합니다.");
					sImage2.stop();
				}
			}
		}
	}

	public class 별이미지스레드 extends Thread {

		@Override
		public void run() {
			String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				sImage.setIcon(icon);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

}
