package 스레드;

public class 배열스레드 extends Thread {

	@Override
	public void run() {
		String[] s = {"떡볶이", "마라샹궈", "빵", "라면", "맥주"};
		for (int i = 0; i < s.length; i++) {
			System.out.println("음식이름>> " + s[i]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
